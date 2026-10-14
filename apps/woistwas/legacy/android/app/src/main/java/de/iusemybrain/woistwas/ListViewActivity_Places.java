package de.iusemybrain.woistwas;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity_Places extends Activity {

	private ListView mainListView;
	private ArrayAdapter<String> listAdapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// Um den ganzen Bildschrim auszufüllen, ohne Titelleiste
		//requestWindowFeature(Window .FEATURE_NO_TITLE);
		//   getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		//                        WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);

		final Intent intent = getIntent();
		ArrayList<String> ortsnamen = intent.getStringArrayListExtra("ortsnamen");

		setContentView(R.layout.mainlistview);

		// Find the ListView resource.
		mainListView = (ListView) findViewById(R.id.mainListView);

		// Create ArrayAdapter
		listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, ortsnamen);

		// Set the ArrayAdapter as the ListView's adapter.
		mainListView.setAdapter(listAdapter);

		// Onclick of the Item --> next View (Name und Beschreibung)
		mainListView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				String ortsname = ((TextView) view).getText().toString();
				
				// Gewähltes Objekt zerlegen
				String beschreibung = intent.getStringArrayExtra("beschreibungen")[(int) id];
				String breitengrad = intent.getStringArrayExtra("breitengrade")[(int) id];
				String laengengrad = intent.getStringArrayExtra("laengengrade")[(int) id];
				
				// Neue intention und aufruf einer neuen Activity
				Intent myIntent = new Intent(ListViewActivity_Places.this, MenuActivity_Places.class);
				myIntent.putExtra("ort", ortsname);
				myIntent.putExtra("beschreibung", beschreibung);
				myIntent.putExtra("breitengrad", breitengrad);
				myIntent.putExtra("laengengrad", laengengrad);
		    	startActivity(myIntent);
			}
		});
	}
	
	// Aufruf eines Hinweises
	public void showAlert(String message) {
		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		alert.setTitle("Hinweis!").setMessage(message).setNeutralButton("OK", null).show();
	}
}