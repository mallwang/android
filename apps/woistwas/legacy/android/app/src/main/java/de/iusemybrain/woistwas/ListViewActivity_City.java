package de.iusemybrain.woistwas;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewActivity_City extends Activity {

	private ListView mainListView;
	private ArrayAdapter<String> listAdapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// Um den ganzen Bildschrim auszuf�llen, ohne Titelleiste
		//requestWindowFeature(Window .FEATURE_NO_TITLE);
		//   getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		//                        WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);

		Intent intent = getIntent();
		ArrayList<String> staedte = intent.getStringArrayListExtra("staedte");

		setContentView(R.layout.mainlistview);

		// Find the ListView resource.
		mainListView = (ListView) findViewById(R.id.mainListView);

		// Create ArrayAdapter using the planet list.
		listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow,
				staedte);

		// Set the ArrayAdapter as the ListView's adapter.
		mainListView.setAdapter(listAdapter);

		// Onclick of the Item --> next View (menu with buttons: Sehensw�rdigkeiten, Parks, Museen, ...)
		mainListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

				String item = ((TextView) view).getText().toString();

                Toast.makeText(getApplicationContext(), item, Toast.LENGTH_SHORT).show();

                /*
				// Neue intention und aufruf einer neuen Activity
				Intent myIntent = new Intent(ListViewActivity_City.this, MenuActivity_City.class);
				myIntent.putExtra("stadt", item);
		    	startActivity(myIntent);
		    	*/
			}
		});

        mainListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //CharSequence colors[] = new CharSequence[] {"PLZ kopieren", "Ort kopieren", "Auf Karte anzeigen"};
                CharSequence colors[] = new CharSequence[] {"PLZ kopieren", "Ort kopieren"};
                final String item = ((TextView) view).getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(ListViewActivity_City.this);
                builder.setTitle("Optionen");
                builder.setItems(colors, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Gets a handle to the clipboard service.
                        android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                        android.content.ClipData clip = android.content.ClipData.newPlainText("Empty","Empty");
                        switch (which){
                            // PLZ kopieren
                            case 0:
                                String PLZ = item.substring(0, 5);
                                clip = android.content.ClipData.newPlainText("PLZ", PLZ);
                                Toast.makeText(getApplicationContext(), PLZ + " kopiert", Toast.LENGTH_SHORT).show();
                                break;
                            // Stadt kopieren
                            case 1:
                                String ort = item.substring(6, item.indexOf('(')-1);
                                clip = android.content.ClipData.newPlainText("Stadt", ort);
                                Toast.makeText(getApplicationContext(), ort + " kopiert", Toast.LENGTH_SHORT).show();
                                break;
                            // Auf Karte anzeigen
                            case 2: Toast.makeText(getApplicationContext(), "Coming soon...", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        clipboard.setPrimaryClip(clip);
                    }
                });
                builder.show();
                return true;
            }
        });
	}
}