package de.iusemybrain.woistwas;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	final Context context = this;

	// GPSTracker class
	GPSTracker gps;
	DBAdapter mDbHelper;
	
	// Aufruf bei Start der App
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Create Class Object
		mDbHelper = new DBAdapter(MainActivity.this);
		mDbHelper.createDatabase();

        // Listener
        ImageButton btn_search_gps = (ImageButton) findViewById(R.id.btn_suche_gps);
        ImageButton btn_suche_manuell = (ImageButton) findViewById(R.id.btn_suche_manuell);

        btn_search_gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchGPS(v);
            }
        });

        btn_suche_manuell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCity(v);
            }
        });
	}


	// Aufruf durch Klick auf GPS-Button
	private void searchGPS(View v) {
		// create class object
		gps = new GPSTracker(MainActivity.this);

		// check if GPS enabled
		if (gps.canGetLocation()) {

            int anzahlErgebnisse = 0;
            Cursor testdata = null;
			double latitude = gps.getLatitude();
			double longitude = gps.getLongitude();

            if (String.valueOf(latitude).equals("0.0")){
                anzahlErgebnisse = -1;
            }
            else{
                // Datenbankhandler
                mDbHelper = new DBAdapter(MainActivity.this);
                mDbHelper.open();

                // DB Anfrage
                testdata = mDbHelper.getLoc(latitude, longitude);

                anzahlErgebnisse = testdata.getCount();
            }
			// \n is for new line
            /*
			Toast.makeText(
                    getApplicationContext(),
                    "Ihr Standort:\nBreite: " + latitude + "\nLänge: "
                            + longitude, Toast.LENGTH_LONG).show();
            */


			
			// Wenn es eine, keine oder mehrere St�dte gibt
			if (anzahlErgebnisse == 1){
				showAlert(testdata.getString(0) + " " + testdata.getString(1) + " (" + testdata.getString(2) + ", " + testdata.getString(3) + ")");
			}
			else if (anzahlErgebnisse > 1){
				
				ArrayList<String> staedte = new ArrayList<String>();
				
			    do {
			    	staedte.add(testdata.getString(0) + " " + testdata.getString(1) + " (" + testdata.getString(2) + ", " + testdata.getString(3) + ")");
			    	// use value
			    } while (testdata.moveToNext());
				
				Intent myIntent = new Intent(MainActivity.this, ListViewActivity_City.class);
				myIntent.putExtra("staedte", staedte);
		    	startActivity(myIntent);
			}
            else if (anzahlErgebnisse == -1){
                Toast.makeText(getApplicationContext(), "Keinen GPS-Standort gefunden.", Toast.LENGTH_SHORT).show();
            }
			else{
				showAlert("Leider keine Stadt in Ihrer Umgebung gefunden!");
			}
			// DB verbindung schlie�en
			mDbHelper.close();
			
		} else {
			// can't get location
			// GPS or Network is not enabled
			// Ask user to enable GPS/network in settings
			gps.showSettingsAlert();
		}
	}

	// Aufruf durch Klick auf "Manuelle Suche" Button
	public void showCity(View v) {
		// get prompts.xml view
		LayoutInflater li = LayoutInflater.from(context);
		View promptsView = li.inflate(R.layout.promts, null);

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

		// set prompts.xml to alertdialog builder
		alertDialogBuilder.setView(promptsView);

		final EditText userInput = (EditText) promptsView.findViewById(R.id.editTextDialogUserInput);

		// Datenbankhandler
		mDbHelper = new DBAdapter(MainActivity.this);
		mDbHelper.open();		
		
		alertDialogBuilder
				.setCancelable(true)
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        // Gew�hlte Stadt abfragen
                        String city = userInput.getText().toString();

                        // Pr�fen, ob Usereingabe PLZ oder Stadtname ist
                        if (city.matches("^[0-9]{5}$")) {

                            // DB Anfrage
                            Cursor testdata = mDbHelper.getPLZ(city);

                            int anzahlErgebnisse = testdata.getCount();

                            // Wenn es eine, keine oder mehrere St�dte gibt
                            if (anzahlErgebnisse == 1) {

                                String stadt = testdata.getString(0) + " " + testdata.getString(1) + " (" + testdata.getString(2) + ", " + testdata.getString(3) + ")";

                                Toast.makeText(getApplicationContext(), stadt, Toast.LENGTH_SHORT).show();
                                /*
								// Neue intention und aufruf einer neuen Activity
								Intent myIntent = new Intent(MainActivity.this, MenuActivity_City.class);
								myIntent.putExtra("stadt", stadt);
						    	startActivity(myIntent);
						    	*/
                            } else if (anzahlErgebnisse > 1) {

                                ArrayList<String> staedte = new ArrayList<String>();

                                do {
                                    staedte.add(testdata.getString(0) + " " + testdata.getString(1) + " (" + testdata.getString(2) + ", " + testdata.getString(3) + ")");
                                    // use value
                                } while (testdata.moveToNext());

                                Intent myIntent = new Intent(MainActivity.this, ListViewActivity_City.class);
                                myIntent.putExtra("staedte", staedte);
                                startActivity(myIntent);
                            } else {
                                showAlert("Leider keine Stadt gefunden!");
                            }
                            // DB verbindung schlie�en
                            mDbHelper.close();

                        } else if (city.matches("[a-zA-ZöÖäÄüÜß\\x20-]+")) {

                            // DB Anfrage
                            Cursor testdata = mDbHelper.getCity(city);

                            int anzahlErgebnisse = testdata.getCount();

                            // Wenn es eine, keine oder mehrere St�dte gibt
                            if (anzahlErgebnisse == 1) {

                                String stadt = testdata.getString(0) + " " + testdata.getString(1) + " (" + testdata.getString(2) + ", " + testdata.getString(3) + ")";

                                Toast.makeText(getApplicationContext(), stadt, Toast.LENGTH_SHORT).show();

                                /*
                                // Neue intention und aufruf einer neuen Activity
                                Intent myIntent = new Intent(MainActivity.this, MenuActivity_City.class);
                                myIntent.putExtra("stadt", stadt);
                                startActivity(myIntent);
                                */
                            } else if (anzahlErgebnisse > 1) {

                                ArrayList<String> staedte = new ArrayList<String>();

                                do {
                                    staedte.add(testdata.getString(0) + " " + testdata.getString(1) + " (" + testdata.getString(2) + ", " + testdata.getString(3) + ")");
                                    // use value
                                } while (testdata.moveToNext());

                                Intent myIntent = new Intent(MainActivity.this, ListViewActivity_City.class);
                                myIntent.putExtra("staedte", staedte);
                                startActivity(myIntent);
                            } else {
                                showAlert("Leider keine Stadt gefunden!");
                            }
                            // DB verbindung schlie�en
                            mDbHelper.close();

                        } else {
                            showAlert("fehlerhafte Eingabe");
                        }
                    }
                })
				.setNegativeButton("Abbruch",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

		// create alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();

        alertDialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

		// show it
		alertDialog.show();
	}
	
	// Methode zum Aufrut der Hilfe
	public void openHelpMain(View v){
		// get prompts.xml view
		LayoutInflater li = LayoutInflater.from(context);
		View helpView = li.inflate(R.layout.help, null);
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);

		// set prompts.xml to alertdialog builder
		alertDialogBuilder.setView(helpView);
		alertDialogBuilder.setCancelable(true);
		alertDialogBuilder.setTitle("Hilfe");
		// create alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();

		// show it
		alertDialog.show();
	}
	
	// Methode zum Aufruf einer Meldung
	public void showAlert(String message) {
		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		alert.setTitle("Hinweis!").setMessage(message)
				.setNeutralButton("OK", null).show();
	}
}
