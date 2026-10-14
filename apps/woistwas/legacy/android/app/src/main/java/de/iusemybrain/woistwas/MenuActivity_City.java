package de.iusemybrain.woistwas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;

@SuppressLint("NewApi")
public class MenuActivity_City extends Activity {

	String STADT;
	String stadt;
	String kreis;
	String bundesland;
	XMLParser parser;
	
	// XML node keys
    static final String KEY_OBJEKT = "objekt";
    static final String KEY_NAME = "name";
    static final String KEY_BESCHR = "beschreibung";
    static final String KEY_LONG = "long";
    static final String KEY_LAT = "lat";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// Um den ganzen Bildschrim auszufüllen, ohne Titelleiste
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		//getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		//		WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		STADT = intent.getStringExtra("stadt");
		setContentView(R.layout.main_city_menu);
		createCityValues();
	}

	// �bergebene Stadt in ihre Einzelteile zerlegen
	private void createCityValues() {
		// Anzahl an "(" zählen
		int anzahlZeichen = countLetter(STADT, '('); // z.B. 15232 Frankfurt (Oder) (Frankfurt (Oder), Stadt, BB) --> 3
		// Bundesland erhalten
		bundesland = STADT.substring((STADT.length() - 3), (STADT.length() - 1)); // --> "BB"
		// Erster Teil des Strings vor dem "("
		String plzStadt = STADT.substring(0, STADT.indexOf('(')); // --> "15232 Frankfurt "
		String plz = plzStadt.substring(0, plzStadt.indexOf(' ')); // --> "15232"
		String stadt_alt = plzStadt.substring(plz.length()); // --> " Frankfurt "
		stadt = stadt_alt.substring(1, stadt_alt.length() - 1); // --> "Frankfurt"

		// Kreis erhalten
		if (anzahlZeichen == 1) {
			// komplett
			kreis = STADT.substring(plzStadt.length() + 1, STADT.length() - 5);
		} else {
			kreis = STADT.substring(plzStadt.length() + 1, STADT.length() - 5); // --> "Oder) (Frankfurt (Oder), Stadt"
			// Teilen
			String kreis1 = kreis.substring(0, kreis.indexOf('(')); // --> "Oder) "
			kreis = kreis.substring(kreis1.length() + 1, kreis.length()); // --> "Frankfurt (Oder), Stadt"
		}
	}

	// Zählen von bestimmten Zeichen eines Strings
	private static int countLetter(String str, char letter) {
		int count = 0;
		for (int pos = -1; (pos = str.indexOf(letter, pos + 1)) != -1; count++)
			;
		return count;
	}

	// Alle Sehenswürdigkeiten anzeigen
	public void showAllSehensweurdigkeiten(View v) {
		try {
			getdata("sehensw");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Alle Parks anzeigen
	public void showAllParks(View v) {
		try {
			getdata("parks");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Alle Museen anzeigen
	public void showAllMuseen(View v) {
		try {
			getdata("museen");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// URL �ffnen und Daten erhalten
	private void getdata(String action) {
		try {
			// Wenn eine Internetverbindung besteht
			if (isNetworkAvailable()) {
				// Ab Android 3.0
				StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
				StrictMode.setThreadPolicy(policy);
				try {
					// Encoder f�r die Leerzeichen im String
					String query = URLEncoder.encode("getPlaces.php?action=" + action  + "&stadt=" + stadt + "&kreis=" + kreis + "&bl=" + bundesland, "utf-8");
					String domain = "http://www.i-use-my-brain.com/" + query;
					URL url = new URL(domain);
					HttpURLConnection con = (HttpURLConnection) url.openConnection();
					readStream(con.getInputStream());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			// Wenn keine Internetverbindung besteht
			else {
				showAlert("Ihre Internetverbindung ist nicht aktiv!\nBitte aktivieren und den Vorgang wiederholen.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Daten der URL einlesen
	private void readStream(InputStream in) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(in));
			String data = "";
			String line = "";
			while ((line = reader.readLine()) != null) {
				data += line;
			}
			
			// Wenn keine Stadt gefunden wurde
			if (data.equals("Keine Stadt gefunden")){
				showAlert("Es wurde keine Stadt gefunden!");
			}
			// Wenn mehrere St�dte gefunden wurden
			else if (data.equals("Mehrere Staedte gefunden")){
				showAlert("Es wurden mehrere St�dte gefunden!");
			}
			// Wenn mehrere St�dte gefunden wurden
			else if (data.equals("")){
				showAlert("Es ist ein Fehler aufgetreten!");
			}
			// Wenn kein Ojekt gefunden wurde
			else if (data.equals("Kein Objekt gefunden")){
				showAlert("Es existiert noch kein Eintrag dieser Kategorie!");
			}
			else{
				
				// XML Dokument zerlegen
				parser = new XMLParser();
				Document doc = parser.getDomElement(data); // getting DOM element
				
				NodeList nl = doc.getElementsByTagName(KEY_OBJEKT);
				
				// Arrays erstellen
				String[] name = new String[nl.getLength()];
			    String[] beschreibung = new String[nl.getLength()];
			    String[] longitude = new String[nl.getLength()];
			    String[] latitude = new String[nl.getLength()];
			    
				// looping through all item nodes <item>      
				for (int i = 0; i < nl.getLength(); i++) {
					Element e = (Element) nl.item(i);
				    name[i] = parser.getValue(e, KEY_NAME); // name
				    beschreibung[i] = parser.getValue(e, KEY_BESCHR); // beschreibung
				    longitude[i] = parser.getValue(e, KEY_LONG); // l�ngengrad
				    latitude[i] = parser.getValue(e, KEY_LAT); // breitengrad
				}
				
				// ArrayList erstellen
				ArrayList<String> namen = new ArrayList<String>();
				
				// ArrayList f�llen
				int j = 0;
			    do {
			    	namen.add(name[j]);
			    	j++;
			    } while (j < nl.getLength());			    
				
				Intent myIntent = new Intent(MenuActivity_City.this, ListViewActivity_Places.class);
				// ArrayList �bergeben
				myIntent.putExtra("ortsnamen", namen);
				// Arrays �bergeben
				myIntent.putExtra("beschreibungen", beschreibung);
				myIntent.putExtra("laengengrade", longitude);
				myIntent.putExtra("breitengrade", latitude);
		    	startActivity(myIntent);
		    	
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// Pr�fen, ob eine Internetverbindung besteht
	public boolean isNetworkAvailable() {
		ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo networkInfo = cm.getActiveNetworkInfo();
		// Wenn kein Netzwerk verf�gbar ist, ist "networkInfo" null
		// Wenn das Netzwerk aktiv ist UND eine Verbindung besteht
		if (networkInfo != null && networkInfo.isConnected()) {
			return true;
		}
		return false;
	}

	// Aufruf eines Hinweises
	public void showAlert(String message) {
		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		alert.setTitle("Hinweis!").setMessage(message).setNeutralButton("OK", null).show();
	}
}
