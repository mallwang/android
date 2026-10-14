package de.iusemybrain.woistwas;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MenuActivity_Places extends Activity {

	String STADT;
	String BESCHREIBUNG;
	String BREITENGRAD;
	String LAENGENGRAD;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// Um den ganzen Bildschrim auszufüllen, ohne Titelleiste
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		//getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		//		WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		STADT = intent.getStringExtra("ort");
		BESCHREIBUNG = intent.getStringExtra("beschreibung");
		BREITENGRAD = intent.getStringExtra("breitengrad");
		LAENGENGRAD = intent.getStringExtra("laengengrad");
		setContentView(R.layout.main_places_menu);
		setPlace();
	}

	// Den aktuellen Standort auf einer Karte anzeigen
	private void showOnMap() {
		
	}

	// Den Inhalt der Seite mit Stadtnamen und Beschreibung füllen
	public void setPlace() {
		// Felder der Anzeige mit Werten füllen
		TextView tvStadtname = (TextView) findViewById(R.id.stadtname);
		tvStadtname.setText(STADT);
		tvStadtname.setTextColor(Color.rgb(0, 100, 0));
		TextView tvBeschr = (TextView) findViewById(R.id.beschreibung);
		tvBeschr.setText(BESCHREIBUNG);
		tvBeschr.setMovementMethod(new ScrollingMovementMethod());
		tvBeschr.setTextSize(13);
	}
	
	// Aufruf eines Hinweises
	public void showAlert(String message) {
		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		alert.setTitle("Hinweis!").setMessage(message).setNeutralButton("OK", null).show();
	}
}
