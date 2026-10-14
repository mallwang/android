package com.iusemybrain.apps.myannoonline;

import android.app.ActionBar;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.iusemybrain.apps.myannoonline.dialogcontent.Gebaeude;

/**
 * Created by Markus on 02.04.2015.
 */
public class FragVerbrauch extends Fragment {
    private View rootView;
    static int LAENGE_GEBAEUDEBEZEICHNUNG = 13;
    static int ANZAHL_LINES = 2;
    private Verbrauchsrechner verbrauchsrechner;
    private Dialogersteller dialogersteller;
    private Gebaeudeersteller gebaeudeersteller;
    private static boolean detailView = false;
    // Shared Preferences
    private static final String MyPREFERENCES = "population";
    private static final String bauern = "bauern";
    private static final String handwerker = "handwerker";
    private static final String kaufleute = "kaufleute";
    private static final String adlige = "adlige";
    private static final String prefDetailView = "detailView";
    private SharedPreferences sharedPreferences;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.layout_verbrauch, container, false);
        // Daten laden und falls vorhanden einfügen
        EditText txt_bauer = (EditText) rootView.findViewById(R.id.txt_bauer);
        EditText txt_handwerker = (EditText) rootView.findViewById(R.id.txt_handwerker);
        EditText txt_kaufmann = (EditText) rootView.findViewById(R.id.txt_kaufmann);
        EditText txt_adliger = (EditText) rootView.findViewById(R.id.txt_adliger);
        ToggleButton togglebtn_detailView = (ToggleButton) rootView.findViewById(R.id.togglebtn_detailView);
        // Shared Preferences laden
        sharedPreferences = getActivity().getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        if (sharedPreferences.contains(bauern))
            txt_bauer.setText(sharedPreferences.getString(bauern, ""));
        if (sharedPreferences.contains(handwerker))
            txt_handwerker.setText(sharedPreferences.getString(handwerker, ""));
        if (sharedPreferences.contains(kaufleute))
            txt_kaufmann.setText(sharedPreferences.getString(kaufleute, ""));
        if (sharedPreferences.contains(adlige))
            txt_adliger.setText(sharedPreferences.getString(adlige, ""));
        if (sharedPreferences.contains(prefDetailView))
            detailView = sharedPreferences.getBoolean(prefDetailView, false);
        togglebtn_detailView.setChecked(detailView);
        // View zurück geben
        return rootView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Daten speichern falls komplette App pausiert wird
        EditText txt_bauer = (EditText) rootView.findViewById(R.id.txt_bauer);
        EditText txt_handwerker = (EditText) rootView.findViewById(R.id.txt_handwerker);
        EditText txt_kaufmann = (EditText) rootView.findViewById(R.id.txt_kaufmann);
        EditText txt_adliger = (EditText) rootView.findViewById(R.id.txt_adliger);
        outState.putString("anzahlBauern", txt_bauer.getText().toString());
        outState.putString("anzahlHandwerker", txt_handwerker.getText().toString());
        outState.putString("anzahlKaufmann", txt_kaufmann.getText().toString());
        outState.putString("anzahlAdlige", txt_adliger.getText().toString());
        outState.putBoolean("detailView", detailView);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Alle Tabellenzeilen erhalten
        TableRow tblr_trennbalken1 = (TableRow) rootView.findViewById(R.id.tblr_trennbalken1);
        TableRow tblr_nahrung1 = (TableRow) rootView.findViewById(R.id.tblr_nahrung1);
        TableRow tblr_getraenke1 = (TableRow) rootView.findViewById(R.id.tblr_getraenke1);
        TableRow tblr_kleidung1 = (TableRow) rootView.findViewById(R.id.tblr_kleidung1);
        TableRow tblr_besitz1 = (TableRow) rootView.findViewById(R.id.tblr_besitz1);
        TableRow tblr_trennbalken2 = (TableRow) rootView.findViewById(R.id.tblr_trennbalken2);
        TableRow tblr_nahrung = (TableRow) rootView.findViewById(R.id.tblr_nahrung);
        TableRow tblr_getraenke = (TableRow) rootView.findViewById(R.id.tblr_getraenke);
        TableRow tblr_kleidung = (TableRow) rootView.findViewById(R.id.tblr_kleidung);
        TableRow tblr_besitz = (TableRow) rootView.findViewById(R.id.tblr_besitz);
        // Unsichtbar machen
        tblr_trennbalken1.setVisibility(View.GONE);
        tblr_nahrung1.setVisibility(View.GONE);
        tblr_getraenke1.setVisibility(View.GONE);
        tblr_kleidung1.setVisibility(View.GONE);
        tblr_besitz1.setVisibility(View.GONE);
        tblr_trennbalken2.setVisibility(View.GONE);
        tblr_nahrung.setVisibility(View.GONE);
        tblr_getraenke.setVisibility(View.GONE);
        tblr_kleidung.setVisibility(View.GONE);
        tblr_besitz.setVisibility(View.GONE);

        // Fokus auf Bauerninput-Feld setzen
        EditText txt_bauer = (EditText) rootView.findViewById(R.id.txt_bauer);
        EditText txt_handwerker = (EditText) rootView.findViewById(R.id.txt_handwerker);
        EditText txt_kaufmann = (EditText) rootView.findViewById(R.id.txt_kaufmann);
        EditText txt_adliger = (EditText) rootView.findViewById(R.id.txt_adliger);
        txt_bauer.requestFocus();

        // Wenn Fragment und Activity wiederhergestellt werden -> eingegebene Daten lagen
        if (savedInstanceState != null) {
            txt_bauer.setText(savedInstanceState.getString("anzahlBauern", ""));
            txt_handwerker.setText(savedInstanceState.getString("anzahlHandwerker", ""));
            txt_kaufmann.setText(savedInstanceState.getString("anzahlKaufmann", ""));
            txt_adliger.setText(savedInstanceState.getString("anzahlAdlige", ""));
            detailView = savedInstanceState.getBoolean("detailView", false);
        }

        // ToggleButton
        final ToggleButton togglebtn_detailView = (ToggleButton) rootView.findViewById(R.id.togglebtn_detailView);
        togglebtn_detailView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Alle Felder erhalten
                TableRow tblr_trennbalken1 = (TableRow) rootView.findViewById(R.id.tblr_trennbalken1);
                TableRow tblr_nahrung1 = (TableRow) rootView.findViewById(R.id.tblr_nahrung1);
                TableRow tblr_getraenke1 = (TableRow) rootView.findViewById(R.id.tblr_getraenke1);
                TableRow tblr_kleidung1 = (TableRow) rootView.findViewById(R.id.tblr_kleidung1);
                TableRow tblr_besitz1 = (TableRow) rootView.findViewById(R.id.tblr_besitz1);
                TableRow tblr_trennbalken2 = (TableRow) rootView.findViewById(R.id.tblr_trennbalken2);
                TableRow tblr_nahrung = (TableRow) rootView.findViewById(R.id.tblr_nahrung);
                TableRow tblr_getraenke = (TableRow) rootView.findViewById(R.id.tblr_getraenke);
                TableRow tblr_kleidung = (TableRow) rootView.findViewById(R.id.tblr_kleidung);
                TableRow tblr_besitz = (TableRow) rootView.findViewById(R.id.tblr_besitz);
                if (isChecked) {
                    // Variable setzen
                    detailView = true;
                    // Gesamt verstecken
                    tblr_trennbalken2.setVisibility(View.GONE);
                    tblr_nahrung.setVisibility(View.GONE);
                    tblr_getraenke.setVisibility(View.GONE);
                    tblr_kleidung.setVisibility(View.GONE);
                    tblr_besitz.setVisibility(View.GONE);
                    // Detais anzeigen
                    tblr_trennbalken1.setVisibility(View.VISIBLE);
                    tblr_nahrung1.setVisibility(View.VISIBLE);
                    tblr_getraenke1.setVisibility(View.VISIBLE);
                    tblr_kleidung1.setVisibility(View.VISIBLE);
                    tblr_besitz1.setVisibility(View.VISIBLE);
                } else {
                    // Variable setzen
                    detailView = false;
                    // Details verstecken
                    tblr_trennbalken1.setVisibility(View.GONE);
                    tblr_nahrung1.setVisibility(View.GONE);
                    tblr_getraenke1.setVisibility(View.GONE);
                    tblr_kleidung1.setVisibility(View.GONE);
                    tblr_besitz1.setVisibility(View.GONE);
                    // Gesamt anzeigen
                    tblr_trennbalken2.setVisibility(View.VISIBLE);
                    tblr_nahrung.setVisibility(View.VISIBLE);
                    tblr_getraenke.setVisibility(View.VISIBLE);
                    tblr_kleidung.setVisibility(View.VISIBLE);
                    tblr_besitz.setVisibility(View.VISIBLE);
                }
            }
        });

        // ActionListener für Textview-Folding von Nahrung
        final TextView tv_nahrung = (TextView) rootView.findViewById(R.id.tv_nahrung);
        tv_nahrung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check if visible
                final LinearLayout ll_nahrung = (LinearLayout) rootView.findViewById(R.id.ll_nahrung);
                if (ll_nahrung.getVisibility() == View.VISIBLE){
                    ll_nahrung.setVisibility(View.GONE);
                }
                else{
                    ll_nahrung.setVisibility(View.VISIBLE);
                }
            }
        });

        // ActionListener für Textview-Folding von Getraenke
        final TextView tv_getraenke = (TextView) rootView.findViewById(R.id.tv_getraenke);
        tv_getraenke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check if visible
                final LinearLayout ll_getraenke = (LinearLayout) rootView.findViewById(R.id.ll_getraenke);
                if (ll_getraenke.getVisibility() == View.VISIBLE){
                    ll_getraenke.setVisibility(View.GONE);
                }
                else{
                    ll_getraenke.setVisibility(View.VISIBLE);
                }
            }
        });

        // ActionListener für Textview-Folding von Kleidung
        final TextView tv_kleidung = (TextView) rootView.findViewById(R.id.tv_kleidung);
        tv_kleidung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check if visible
                final LinearLayout ll_kleidung = (LinearLayout) rootView.findViewById(R.id.ll_kleidung);
                if (ll_kleidung.getVisibility() == View.VISIBLE){
                    ll_kleidung.setVisibility(View.GONE);
                }
                else{
                    ll_kleidung.setVisibility(View.VISIBLE);
                }
            }
        });

        // ActionListener für Textview-Folding von Besitz
        final TextView tv_besitz = (TextView) rootView.findViewById(R.id.tv_besitz);
        tv_besitz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check if visible
                final LinearLayout ll_besitz = (LinearLayout) rootView.findViewById(R.id.ll_besitz);
                if (ll_besitz.getVisibility() == View.VISIBLE){
                    ll_besitz.setVisibility(View.GONE);
                }
                else{
                    ll_besitz.setVisibility(View.VISIBLE);
                }
            }
        });

        // ActionListener für Berechnen
        final Button btn_berechne = (Button) rootView.findViewById(R.id.btn_berechne);
        btn_berechne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Eingegebene Daten speichern
                saveInputData();

                // Tastatur verstecken
                final InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(btn_berechne.getWindowToken(), 0);

                // Alle Felder erhalten
                TableRow tblr_trennbalken1 = (TableRow) rootView.findViewById(R.id.tblr_trennbalken1);
                TableRow tblr_nahrung1 = (TableRow) rootView.findViewById(R.id.tblr_nahrung1);
                TableRow tblr_getraenke1 = (TableRow) rootView.findViewById(R.id.tblr_getraenke1);
                TableRow tblr_kleidung1 = (TableRow) rootView.findViewById(R.id.tblr_kleidung1);
                TableRow tblr_besitz1 = (TableRow) rootView.findViewById(R.id.tblr_besitz1);
                TableRow tblr_trennbalken2 = (TableRow) rootView.findViewById(R.id.tblr_trennbalken2);
                TableRow tblr_nahrung = (TableRow) rootView.findViewById(R.id.tblr_nahrung);
                TableRow tblr_getraenke = (TableRow) rootView.findViewById(R.id.tblr_getraenke);
                TableRow tblr_kleidung = (TableRow) rootView.findViewById(R.id.tblr_kleidung);
                TableRow tblr_besitz = (TableRow) rootView.findViewById(R.id.tblr_besitz);
                // Buttons abfragen
                Button btn_verbr_fisch = (Button) rootView.findViewById(R.id.btn_verbr_fisch);
                Button btn_verbr_brot = (Button) rootView.findViewById(R.id.btn_verbr_brot);
                Button btn_verbr_fleisch = (Button) rootView.findViewById(R.id.btn_verbr_fleisch);
                Button btn_verbr_milch = (Button) rootView.findViewById(R.id.btn_verbr_milch);
                Button btn_verbr_most = (Button) rootView.findViewById(R.id.btn_verbr_most);
                Button btn_verbr_bier = (Button) rootView.findViewById(R.id.btn_verbr_bier);
                Button btn_verbr_wein = (Button) rootView.findViewById(R.id.btn_verbr_wein);
                Button btn_verbr_wollgewaender = (Button) rootView.findViewById(R.id.btn_verbr_wollgewaender);
                Button btn_verbr_leinengewaender = (Button) rootView.findViewById(R.id.btn_verbr_leinengewaender);
                Button btn_verbr_lederwaemser = (Button) rootView.findViewById(R.id.btn_verbr_lederwaemser);
                Button btn_verbr_pelzmaentel = (Button) rootView.findViewById(R.id.btn_verbr_pelzmaentel);
                Button btn_verbr_brokatgewaender = (Button) rootView.findViewById(R.id.btn_verbr_brokatgewaender);
                Button btn_verbr_buecher = (Button) rootView.findViewById(R.id.btn_verbr_buecher);
                Button btn_verbr_kerzenhalter = (Button) rootView.findViewById(R.id.btn_verbr_kerzenhalter);
                Button btn_verbr_brillen = (Button) rootView.findViewById(R.id.btn_verbr_brillen);
                // Daten holen
                EditText txt_bauer = (EditText) rootView.findViewById(R.id.txt_bauer);
                EditText txt_handwerker = (EditText) rootView.findViewById(R.id.txt_handwerker);
                EditText txt_kaufmann = (EditText) rootView.findViewById(R.id.txt_kaufmann);
                EditText txt_adliger = (EditText) rootView.findViewById(R.id.txt_adliger);

                // Anzahl der Bevoelkerungsgruppen zuweisen
                int anzahl_bauer = 0;
                int anzahl_handwerker = 0;
                int anzahl_kaufmann = 0;
                int anzahl_adliger = 0;
                if (txt_bauer.getText().length() > 0)
                    anzahl_bauer = Integer.valueOf(txt_bauer.getText().toString());
                if (txt_handwerker.getText().length() > 0)
                    anzahl_handwerker = Integer.valueOf(txt_handwerker.getText().toString());
                if (txt_kaufmann.getText().length() > 0)
                    anzahl_kaufmann = Integer.valueOf(txt_kaufmann.getText().toString());
                if (txt_adliger.getText().length() > 0)
                    anzahl_adliger = Integer.valueOf(txt_adliger.getText().toString());
                int gesamtbevoelkerung = anzahl_bauer + anzahl_handwerker + anzahl_kaufmann + anzahl_adliger;
                // Wenn Gesamtbevölkerung größer 0 ist
                if (gesamtbevoelkerung > 0) {
                    // ToggleButton aktivieren
                    togglebtn_detailView.setEnabled(true);
                    // Neuer Dialogersteller
                    dialogersteller = new Dialogersteller(getActivity());
                    // Neuen Gebäudeersteller
                    gebaeudeersteller = new Gebaeudeersteller(getActivity());
                    // Alle Verbrauchsgebäude erstellen
                    gebaeudeersteller.erstelleVerbrauchsgebaeude();
                    // Berechnung durchführen
                    verbrauchsrechner = new Verbrauchsrechner(anzahl_bauer, anzahl_handwerker, anzahl_kaufmann, anzahl_adliger);
                    final int anzahl_fischer = verbrauchsrechner.getPrk_fisch();
                    final int anzahl_backstuben = verbrauchsrechner.getPrk_brot();
                    final int anzahl_metzger = verbrauchsrechner.getPrk_fleisch();
                    final int anzahl_ziegenfarmen = verbrauchsrechner.getPrk_milch();
                    final int anzahl_mosthoefe = verbrauchsrechner.getPrk_most();
                    final int anzahl_klosterbrauereien = verbrauchsrechner.getPrk_bier();
                    final int anzahl_keltereien = verbrauchsrechner.getPrk_wein();
                    final int anzahl_spinnereien = verbrauchsrechner.getPrk_wollgewaender();
                    final int anzahl_webereien = verbrauchsrechner.getPrk_leinengewaender();
                    final int anzahl_gerbereien = verbrauchsrechner.getPrk_lederwaemser();
                    final int anzahl_kuerschner = verbrauchsrechner.getPrk_pelzmaentel();
                    final int anzahl_seidenwebereien = verbrauchsrechner.getPrk_brokatgewaender();
                    final int anzahl_druckereien = verbrauchsrechner.getPrk_buecher();
                    final int anzahl_feinschmieden = verbrauchsrechner.getPrk_kerzenleuchter();
                    final int anzahl_brillenmacher = verbrauchsrechner.getPrk_brillen();

                    // Werte in View setzen
                    btn_verbr_fisch.setText(String.valueOf(anzahl_fischer));
                    btn_verbr_brot.setText(String.valueOf(anzahl_backstuben));
                    btn_verbr_fleisch.setText(String.valueOf(anzahl_metzger));
                    btn_verbr_milch.setText(String.valueOf(anzahl_ziegenfarmen));
                    btn_verbr_most.setText(String.valueOf(anzahl_mosthoefe));
                    btn_verbr_bier.setText(String.valueOf(anzahl_klosterbrauereien));
                    btn_verbr_wein.setText(String.valueOf(anzahl_keltereien));
                    btn_verbr_wollgewaender.setText(String.valueOf(anzahl_spinnereien));
                    btn_verbr_leinengewaender.setText(String.valueOf(anzahl_webereien));
                    btn_verbr_lederwaemser.setText(String.valueOf(anzahl_gerbereien));
                    btn_verbr_pelzmaentel.setText(String.valueOf(anzahl_kuerschner));
                    btn_verbr_brokatgewaender.setText(String.valueOf(anzahl_seidenwebereien));
                    btn_verbr_buecher.setText(String.valueOf(anzahl_druckereien));
                    btn_verbr_kerzenhalter.setText(String.valueOf(anzahl_feinschmieden));
                    btn_verbr_brillen.setText(String.valueOf(anzahl_brillenmacher));

                    // Daten für Detailview
                    String detailFisch = "0x " + getString(R.string.str_gb_fischer);
                    String detailWeizenBrot = "0x " + getString(R.string.str_gb_weizenfarm);
                    String detailMehl = "0x " + getString(R.string.str_gb_muehle);
                    String detailBrot = "0x " + getString(R.string.str_gb_backstube);
                    String detailHolzFleisch = "0x " + getString(R.string.str_gb_holzfaeller);
                    String detailKohleFleisch = "0x " + getString(R.string.str_gb_koehlerhuette);
                    String detailSoleFleisch = "0x " + getString(R.string.str_gb_salzstock);
                    String detailSalzFleisch = "0x " + getString(R.string.str_gb_saline);
                    String detailVieh = "0x " + getString(R.string.str_gb_rinderfarm);
                    String detailFleisch = "0x " + getString(R.string.str_gb_metzger);
                    String detailMilch = "0x " + getString(R.string.str_gb_ziegenfarm);
                    String detailAepfel = "0x " + getString(R.string.str_gb_apfelhof);
                    String detailMost = "0x " + getString(R.string.str_gb_mosthof);
                    String detailWeizenBier = "0x " + getString(R.string.str_gb_weizenfarm);
                    String detailKraeuter = "0x " + getString(R.string.str_gb_klostergarten);
                    String detailBier = "0x " + getString(R.string.str_gb_klosterbrauerei);
                    String detailHolzWein = "0x " + getString(R.string.str_gb_holzfaeller);
                    String detailKohleWein = "0x " + getString(R.string.str_gb_koehlerhuette);
                    String detailEisenerzWein = "0x " + getString(R.string.str_gb_eisenmine);
                    String detailEisenWein = "0x " + getString(R.string.str_gb_eisenschmelze);
                    String detailFaesser = "0x " + getString(R.string.str_gb_fasskueferei);
                    String detailTrauben = "0x " + getString(R.string.str_gb_weingut);
                    String detailWein = "0x " + getString(R.string.str_gb_kelterei);
                    String detailWolle = "0x " + getString(R.string.str_gb_schaffarm);
                    String detailWollgewaender = "0x " + getString(R.string.str_gb_spinnerei);
                    String detailHanfLeinengewaender = "0x " + getString(R.string.str_gb_hanfplantage);
                    String detailLeinengewaender = "0x " + getString(R.string.str_gb_webstube);
                    String detailHolzLederwaemser = "0x " + getString(R.string.str_gb_holzfaeller);
                    String detailKohleLederwaemser = "0x " + getString(R.string.str_gb_koehlerhuette);
                    String detailSoleLederwaemser = "0x " + getString(R.string.str_gb_salzstock);
                    String detailSalzLederwaemser = "0x " + getString(R.string.str_gb_saline);
                    String detailTierhaeute = "0x " + getString(R.string.str_gb_schweinefarm);
                    String detailLederwaemser = "0x " + getString(R.string.str_gb_gerberei);
                    String detailPelze = "0x " + getString(R.string.str_gb_pelztierjaeger);
                    String detailPelzmaentel = "0x " + getString(R.string.str_gb_kuerschner);
                    String detailHolzBrokatgewaender = "0x " + getString(R.string.str_gb_holzfaeller);
                    String detailKohleBrokatgewaender = "0x " + getString(R.string.str_gb_koehlerhuette);
                    String detailGolderz = "0x " + getString(R.string.str_gb_goldmine);
                    String detailGold = "0x " + getString(R.string.str_gb_goldschmelze);
                    String detailBrokatgewaender = "0x " + getString(R.string.str_gb_seidenweberei);
                    String detailHolzBuecher = "0x " + getString(R.string.str_gb_holzfaeller);
                    String detailPapier = "0x " + getString(R.string.str_gb_papiermuehle);
                    String detailBuecher = "0x " + getString(R.string.str_gb_druckerei);
                    String detailHolzKerzenleuchter = "0x " + getString(R.string.str_gb_holzfaeller);
                    String detailKohleKerzenleuchter = "0x " + getString(R.string.str_gb_koehlerhuette);
                    String detailKupfererzKerzenleuchter = "0x " + getString(R.string.str_gb_kupfermine);
                    String detailMessingKerzenleuchter = "0x " + getString(R.string.str_gb_kupferschmelze);
                    String detailHanfKerzenleuchter = "0x " + getString(R.string.str_gb_hanfplantage);
                    String detailBienenwachs = "0x " + getString(R.string.str_gb_imker);
                    String detailKerzen = "0x " + getString(R.string.str_gb_lichtzieher);
                    String detailKerzenleuchter = "0x " + getString(R.string.str_gb_feinschmiede);
                    String detailHolzBrillen = "0x " + getString(R.string.str_gb_holzfaeller);
                    String detailKohleBrillen = "0x " + getString(R.string.str_gb_kohlebergwerk);
                    String detailKupfererzBrillen = "0x " + getString(R.string.str_gb_kupfermine);
                    String detailMessingBrillen = "0x " + getString(R.string.str_gb_kupferschmelze);
                    String detailQuarz = "0x " + getString(R.string.str_gb_quarzbruch);
                    String detailBrillen = "0x " + getString(R.string.str_gb_brillenmacher);

                    // Views erhalten
                    TextView tv_details_fisch = (TextView) rootView.findViewById(R.id.tv_details_fisch);
                    TextView tv_details_weizenBrot = (TextView) rootView.findViewById(R.id.tv_details_weizenBrot);
                    TextView tv_details_mehl = (TextView) rootView.findViewById(R.id.tv_details_mehl);
                    TextView tv_details_brot = (TextView) rootView.findViewById(R.id.tv_details_brot);
                    TextView tv_details_holzFleisch = (TextView) rootView.findViewById(R.id.tv_details_holzFleisch);
                    TextView tv_details_kohleFleisch = (TextView) rootView.findViewById(R.id.tv_details_kohleFleisch);
                    TextView tv_details_soleFleisch = (TextView) rootView.findViewById(R.id.tv_details_soleFleisch);
                    TextView tv_details_salzFleisch = (TextView) rootView.findViewById(R.id.tv_details_salzFleisch);
                    TextView tv_details_vieh = (TextView) rootView.findViewById(R.id.tv_details_vieh);
                    TextView tv_details_fleisch = (TextView) rootView.findViewById(R.id.tv_details_fleisch);
                    TextView tv_details_milch = (TextView) rootView.findViewById(R.id.tv_details_milch);
                    TextView tv_details_aepfel = (TextView) rootView.findViewById(R.id.tv_details_aepfel);
                    TextView tv_details_most = (TextView) rootView.findViewById(R.id.tv_details_most);
                    TextView tv_details_weizenBier = (TextView) rootView.findViewById(R.id.tv_details_weizenBier);
                    TextView tv_details_kraeuter = (TextView) rootView.findViewById(R.id.tv_details_kraeuter);
                    TextView tv_details_bier = (TextView) rootView.findViewById(R.id.tv_details_bier);
                    TextView tv_details_holzWein = (TextView) rootView.findViewById(R.id.tv_details_holzWein);
                    TextView tv_details_kohleWein = (TextView) rootView.findViewById(R.id.tv_details_kohleWein);
                    TextView tv_details_eisenerzWein = (TextView) rootView.findViewById(R.id.tv_details_eisenerzWein);
                    TextView tv_details_eisenWein = (TextView) rootView.findViewById(R.id.tv_details_eisenWein);
                    TextView tv_details_faesser = (TextView) rootView.findViewById(R.id.tv_details_faesser);
                    TextView tv_details_trauben = (TextView) rootView.findViewById(R.id.tv_details_trauben);
                    TextView tv_details_wein = (TextView) rootView.findViewById(R.id.tv_details_wein);
                    TextView tv_details_wolle = (TextView) rootView.findViewById(R.id.tv_details_wolle);
                    TextView tv_details_wollgewaender = (TextView) rootView.findViewById(R.id.tv_details_wollgewaender);
                    TextView tv_details_hanfLeinengewaender = (TextView) rootView.findViewById(R.id.tv_details_hanfLeinengewaender);
                    TextView tv_details_leinengewaender = (TextView) rootView.findViewById(R.id.tv_details_leinengewaender);
                    TextView tv_details_holzLederwaemser = (TextView) rootView.findViewById(R.id.tv_details_holzLederwaemser);
                    TextView tv_details_kohleLederwaemser = (TextView) rootView.findViewById(R.id.tv_details_kohleLederwaemser);
                    TextView tv_details_soleLederwaemser = (TextView) rootView.findViewById(R.id.tv_details_soleLederwaemser);
                    TextView tv_details_salzLederwaemser = (TextView) rootView.findViewById(R.id.tv_details_salzLederwaemser);
                    TextView tv_details_tierhaeute = (TextView) rootView.findViewById(R.id.tv_details_tierhaeute);
                    TextView tv_details_lederwaemser = (TextView) rootView.findViewById(R.id.tv_details_lederwaemser);
                    TextView tv_details_pelze = (TextView) rootView.findViewById(R.id.tv_details_pelze);
                    TextView tv_details_pelzmaentel = (TextView) rootView.findViewById(R.id.tv_details_pelzmaentel);
                    TextView tv_details_holzBrokatgewaender = (TextView) rootView.findViewById(R.id.tv_details_holzBrokatgewaender);
                    TextView tv_details_kohleBrokatgewaender = (TextView) rootView.findViewById(R.id.tv_details_kohleBrokatgewaender);
                    TextView tv_details_golderzBrokatgewaender = (TextView) rootView.findViewById(R.id.tv_details_golderzBrokatgewaender);
                    TextView tv_details_goldBrokatgewaender = (TextView) rootView.findViewById(R.id.tv_details_goldBrokatgewaender);
                    TextView tv_details_brokatgewaender = (TextView) rootView.findViewById(R.id.tv_details_brokatgewaender);
                    TextView tv_details_holzBuecher = (TextView) rootView.findViewById(R.id.tv_details_holzBuecher);
                    TextView tv_details_papier = (TextView) rootView.findViewById(R.id.tv_details_papier);
                    TextView tv_details_buecher = (TextView) rootView.findViewById(R.id.tv_details_buecher);
                    TextView tv_details_holzKerzenleuchter = (TextView) rootView.findViewById(R.id.tv_details_holzKerzenleuchter);
                    TextView tv_details_kohleKerzenleuchter = (TextView) rootView.findViewById(R.id.tv_details_kohleKerzenleuchter);
                    TextView tv_details_kupfererzKerzenleuchter = (TextView) rootView.findViewById(R.id.tv_details_kupfererzKerzenleuchter);
                    TextView tv_details_messingKerzenleuchter = (TextView) rootView.findViewById(R.id.tv_details_messingKerzenleuchter);
                    TextView tv_details_hanfKerzenleuchter = (TextView) rootView.findViewById(R.id.tv_details_hanfKerzenleuchter);
                    TextView tv_details_bienenwachsKerzenleuchter = (TextView) rootView.findViewById(R.id.tv_details_bienenwachsKerzenleuchter);
                    TextView tv_details_kerzenKerzenleuchter = (TextView) rootView.findViewById(R.id.tv_details_kerzenKerzenleuchter);
                    TextView tv_details_kerzenleuchter = (TextView) rootView.findViewById(R.id.tv_details_kerzenleuchter);
                    TextView tv_details_holzBrillen = (TextView) rootView.findViewById(R.id.tv_details_holzBrillen);
                    TextView tv_details_kohleBrillen = (TextView) rootView.findViewById(R.id.tv_details_kohleBrillen);
                    TextView tv_details_kupfererzBrillen = (TextView) rootView.findViewById(R.id.tv_details_kupfererzBrillen);
                    TextView tv_details_messingBrillen = (TextView) rootView.findViewById(R.id.tv_details_messingBrillen);
                    TextView tv_details_quarzBrillen = (TextView) rootView.findViewById(R.id.tv_details_quarzBrillen);
                    TextView tv_details_brillen = (TextView) rootView.findViewById(R.id.tv_details_brillen);

                    LinearLayout ll_fisch = (LinearLayout) rootView.findViewById(R.id.ll_fisch);
                    LinearLayout ll_brot = (LinearLayout) rootView.findViewById(R.id.ll_brot);
                    LinearLayout ll_fleisch = (LinearLayout) rootView.findViewById(R.id.ll_fleisch);
                    LinearLayout ll_milch = (LinearLayout) rootView.findViewById(R.id.ll_milch);
                    LinearLayout ll_most = (LinearLayout) rootView.findViewById(R.id.ll_most);
                    LinearLayout ll_bier = (LinearLayout) rootView.findViewById(R.id.ll_bier);
                    LinearLayout ll_wein = (LinearLayout) rootView.findViewById(R.id.ll_wein);
                    LinearLayout ll_wollgewaender = (LinearLayout) rootView.findViewById(R.id.ll_wollgewaender);
                    LinearLayout ll_leinengewaender = (LinearLayout) rootView.findViewById(R.id.ll_leinengewaender);
                    LinearLayout ll_lederwaemser = (LinearLayout) rootView.findViewById(R.id.ll_lederwaemser);
                    LinearLayout ll_pelzmaentel = (LinearLayout) rootView.findViewById(R.id.ll_pelzmaentel);
                    LinearLayout ll_brokatgewaender = (LinearLayout) rootView.findViewById(R.id.ll_brokatgewaender);
                    LinearLayout ll_buecher = (LinearLayout) rootView.findViewById(R.id.ll_buecher);
                    LinearLayout ll_kerzenleuchter = (LinearLayout) rootView.findViewById(R.id.ll_kerzenleuchter);
                    LinearLayout ll_brillen = (LinearLayout) rootView.findViewById(R.id.ll_brillen);

                    // Alle entfernen
                    ll_fisch.setVisibility(View.GONE);
                    ll_brot.setVisibility(View.GONE);
                    ll_fleisch.setVisibility(View.GONE);
                    ll_milch.setVisibility(View.GONE);
                    ll_most.setVisibility(View.GONE);
                    ll_bier.setVisibility(View.GONE);
                    ll_wein.setVisibility(View.GONE);
                    ll_wollgewaender.setVisibility(View.GONE);
                    ll_leinengewaender.setVisibility(View.GONE);
                    ll_lederwaemser.setVisibility(View.GONE);
                    ll_pelzmaentel.setVisibility(View.GONE);
                    ll_brokatgewaender.setVisibility(View.GONE);
                    ll_buecher.setVisibility(View.GONE);
                    ll_kerzenleuchter.setVisibility(View.GONE);
                    ll_brillen.setVisibility(View.GONE);

                    // Alle Buttons disablen
                    btn_verbr_brot.setEnabled(false);
                    btn_verbr_fisch.setEnabled(false);
                    btn_verbr_brot.setEnabled(false);
                    btn_verbr_fleisch.setEnabled(false);
                    btn_verbr_milch.setEnabled(false);
                    btn_verbr_most.setEnabled(false);
                    btn_verbr_bier.setEnabled(false);
                    btn_verbr_wein.setEnabled(false);
                    btn_verbr_wollgewaender.setEnabled(false);
                    btn_verbr_leinengewaender.setEnabled(false);
                    btn_verbr_lederwaemser.setEnabled(false);
                    btn_verbr_pelzmaentel.setEnabled(false);
                    btn_verbr_brokatgewaender.setEnabled(false);
                    btn_verbr_buecher.setEnabled(false);
                    btn_verbr_kerzenhalter.setEnabled(false);
                    btn_verbr_brillen.setEnabled(false);

                    // ActionListener
                    // Fisch
                    if (anzahl_fischer > 0) {
                        btn_verbr_fisch.setEnabled(true);

                        // Einzahlcheck
                        if (anzahl_fischer > 1)
                            detailFisch = String.valueOf(anzahl_fischer) + "x " + getString(R.string.str_gb_fischer) + " (" + verbrauchsrechner.getAuslastung_fisch() + "%)";
                        else
                            detailFisch = String.valueOf(anzahl_fischer) + "x " + getString(R.string.str_gb_fischer_mehrzahl) + " (" + verbrauchsrechner.getAuslastung_fisch() + "%)";
                        // Anzahl und Auslastung berechnen
                        Gebaeude fischerFisch = gebaeudeersteller.getGebaeudeFischer();
                        fischerFisch.setAnzahlAuslastung(String.valueOf(anzahl_fischer) + "x (" + verbrauchsrechner.getAuslastung_fisch() + "%)");
                        final Gebaeude[] alleGebaeude = {fischerFisch};
                        // Listener setzen
                        btn_verbr_fisch.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                    dialogersteller.erstelleDialog(getString(R.string.str_pr_fisch), alleGebaeude);
                            }
                        });
                        ll_fisch.setVisibility(View.VISIBLE);
                    }
                    // Brot
                    if (anzahl_backstuben > 0) {
                        btn_verbr_brot.setEnabled(true);

                        // Alle Gebäude instanziieren
                        final Gebaeude weizenhofBrot = gebaeudeersteller.getGebaeudeWeizenhof();
                        final Gebaeude muehleBrot = gebaeudeersteller.getGebaeudeMuehle();
                        final Gebaeude backstubeBrot = gebaeudeersteller.getGebaeudeBackstube();

                        // Hauptprodukt
                        detailBrot = String.valueOf(anzahl_backstuben) + "x (" + verbrauchsrechner.getAuslastung_brot() + "%)";
                        backstubeBrot.setAnzahlAuslastung(detailBrot);
                        // Einzahlcheck
                        String einMehrzahlBrot = getString(R.string.str_gb_backstube);
                        if (Integer.valueOf(detailBrot.substring(0, detailBrot.indexOf("x"))) > 1)
                            einMehrzahlBrot = getString(R.string.str_gb_backstuben);
                        detailBrot = detailBrot.substring(0, detailBrot.indexOf("x")+2) + einMehrzahlBrot + detailBrot.substring(detailBrot.indexOf("x")+1);

                        // Direktes Vorprodukt
                        detailMehl = berechne(verbrauchsrechner.getVerbr_per_tick_brot(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_mehl()));
                        muehleBrot.setAnzahlAuslastung(detailMehl);
                        // Einzahlcheck
                        String einMehrzahlMehl = getString(R.string.str_gb_muehle);
                        if (Integer.valueOf(detailMehl.substring(0, detailMehl.indexOf("x"))) > 1)
                            einMehrzahlMehl = getString(R.string.str_gb_muehlen);
                        detailMehl = detailMehl.substring(0, detailMehl.indexOf("x")+2) + einMehrzahlMehl + detailMehl.substring(detailMehl.indexOf("x")+1);

                        // Indirektes Vorprodukt 1
                        double ausl_muehle = berechneAuslastung(verbrauchsrechner.getVerbr_per_tick_brot(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_mehl()));
                        final double verbr_per_tick_mehle = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_mehl()) * ausl_muehle) / 100;
                        detailWeizenBrot = berechne(verbr_per_tick_mehle, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_weizen()));
                        weizenhofBrot.setAnzahlAuslastung(detailWeizenBrot);
                        // Einzahlcheck
                        String einMehrzahlWeizen = getString(R.string.str_gb_weizenfarm);
                        if (Integer.valueOf(detailWeizenBrot.substring(0, detailWeizenBrot.indexOf("x"))) > 1)
                            einMehrzahlWeizen = getString(R.string.str_gb_weizenfarmen);
                        detailWeizenBrot = detailWeizenBrot.substring(0, detailWeizenBrot.indexOf("x")+2) + einMehrzahlWeizen + detailWeizenBrot.substring(detailWeizenBrot.indexOf("x")+1);

                        // OnClickListener
                        btn_verbr_brot.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Verbrauch erneut berechnen
                                backstubeBrot.setAnzahlAuslastung(String.valueOf(anzahl_backstuben) + "x (" + verbrauchsrechner.getAuslastung_brot() + "%)");
                                muehleBrot.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_brot(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_mehl())));
                                weizenhofBrot.setAnzahlAuslastung(berechne(verbr_per_tick_mehle, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_weizen())));
                                // Verpacken aller Gebäude
                                Gebaeude[] alleGebaeude = {weizenhofBrot, muehleBrot, backstubeBrot};
                                dialogersteller.erstelleDialog(getString(R.string.str_pr_brot), alleGebaeude);
                            }
                        });
                        ll_brot.setVisibility(View.VISIBLE);
                    }
                    // Fleisch
                    if (anzahl_metzger > 0) {
                        btn_verbr_fleisch.setEnabled(true);

                        // Alle Gebäude instanziieren
                        final Gebaeude holzfaellerFleisch = gebaeudeersteller.getGebaeudeHolzfaeller();
                        final Gebaeude koehlerhuetteFleisch = gebaeudeersteller.getGebaeudeKoehlerhuette();
                        final Gebaeude salzstockFleisch = gebaeudeersteller.getGebaeudeSalzstock();
                        final Gebaeude salineFleisch = gebaeudeersteller.getGebaeudeSaline();
                        final Gebaeude rinderfarmFleisch = gebaeudeersteller.getGebaeudeRinderfarm();
                        final Gebaeude metzgerFleisch = gebaeudeersteller.getGebaeudeMetzger();

                        // Hauptprodukt
                        detailFleisch = String.valueOf(anzahl_metzger) + "x (" + verbrauchsrechner.getAuslastung_fleisch() + "%)";
                        metzgerFleisch.setAnzahlAuslastung(detailFleisch);
                        // Einzahlcheck
                        String einMehrzahlFleisch = getString(R.string.str_gb_metzger);
                        if (Integer.valueOf(detailFleisch.substring(0, detailFleisch.indexOf("x"))) > 1)
                            einMehrzahlFleisch = getString(R.string.str_gb_metzger_mehrzahl);
                        detailFleisch = detailFleisch.substring(0, detailFleisch.indexOf("x")+2) + einMehrzahlFleisch + detailFleisch.substring(detailFleisch.indexOf("x")+1);

                        // Direktes Vorprodukt1
                        detailVieh = berechne(verbrauchsrechner.getVerbr_per_tick_fleisch(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_vieh()));
                        rinderfarmFleisch.setAnzahlAuslastung(detailVieh);
                        // Einzahlcheck
                        String einMehrzahlVieh = getString(R.string.str_gb_rinderfarm);
                        if (Integer.valueOf(detailVieh.substring(0, detailVieh.indexOf("x"))) > 1)
                            einMehrzahlVieh = getString(R.string.str_gb_rinderfarmen);
                        detailVieh = detailVieh.substring(0, detailVieh.indexOf("x")+2) + einMehrzahlVieh + detailVieh.substring(detailVieh.indexOf("x")+1);

                        // Direktes Vorprodukt2
                        detailSalzFleisch = berechne(verbrauchsrechner.getVerbr_per_tick_fleisch(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_salz()));
                        salineFleisch.setAnzahlAuslastung(detailSalzFleisch);
                        // Einzahlcheck
                        String einMehrzahlSalz = getString(R.string.str_gb_saline);
                        if (Integer.valueOf(detailSalzFleisch.substring(0, detailSalzFleisch.indexOf("x"))) > 1)
                            einMehrzahlSalz = getString(R.string.str_gb_salinen);
                        detailSalzFleisch = detailSalzFleisch.substring(0, detailSalzFleisch.indexOf("x")+2) + einMehrzahlSalz + detailSalzFleisch.substring(detailSalzFleisch.indexOf("x")+1);

                        // Indirektes Vorprodukt1 (von Salz)
                        double ausl_saline = berechneAuslastung(verbrauchsrechner.getVerbr_per_tick_fleisch(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_salz()));
                        final double verbr_per_tick_saline = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_salz()) * ausl_saline) / 100;
                        detailSoleFleisch = berechne(verbr_per_tick_saline, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_sole()));
                        salzstockFleisch.setAnzahlAuslastung(detailSoleFleisch);

                        // Einzahlcheck
                        String einMehrzahlSole = getString(R.string.str_gb_salzstock);
                        if (Integer.valueOf(detailSoleFleisch.substring(0, detailSoleFleisch.indexOf("x"))) > 1)
                            einMehrzahlSole = getString(R.string.str_gb_salzstoecke);
                        detailSoleFleisch = detailSoleFleisch.substring(0, detailSoleFleisch.indexOf("x")+2) + einMehrzahlSole + detailSoleFleisch.substring(detailSoleFleisch.indexOf("x")+1);

                        // Indirektes Vorprodukt2 (von Salz)
                        detailKohleFleisch = berechne(verbr_per_tick_saline, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()));
                        koehlerhuetteFleisch.setAnzahlAuslastung(detailKohleFleisch);
                        // Einzahlcheck
                        String einMehrzahlKohle = getString(R.string.str_gb_koehlerhuette);
                        if (Integer.valueOf(detailKohleFleisch.substring(0, detailKohleFleisch.indexOf("x"))) > 1)
                            einMehrzahlKohle = getString(R.string.str_gb_koehlerhuetten);
                        detailKohleFleisch = detailKohleFleisch.substring(0, detailKohleFleisch.indexOf("x")+2) + einMehrzahlKohle + detailKohleFleisch.substring(detailKohleFleisch.indexOf("x")+1);

                        // Indirektes Vorprodukt3 (von Kohle)
                        double ausl_koehlerhuetten = berechneAuslastung(verbr_per_tick_saline, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()));
                        final double verbr_per_tick_koehlerhuetten = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()) * ausl_koehlerhuetten) / 100;
                        detailHolzFleisch = berechne(verbr_per_tick_koehlerhuetten, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_holz()));
                        holzfaellerFleisch.setAnzahlAuslastung(detailHolzFleisch);
                        // Einzahlcheck
                        String einMehrzahlHolzFleisch = getString(R.string.str_gb_holzfaeller);
                        if (Integer.valueOf(detailHolzFleisch.substring(0, detailHolzFleisch.indexOf("x"))) > 1)
                            einMehrzahlHolzFleisch = getString(R.string.str_gb_holzfaeller_mehrzahl);
                        detailHolzFleisch = detailHolzFleisch.substring(0, detailHolzFleisch.indexOf("x")+2) + einMehrzahlHolzFleisch + detailHolzFleisch.substring(detailHolzFleisch.indexOf("x")+1);

                        // Verpacken aller Gebäude
                        final Gebaeude[] alleGebaeude = {holzfaellerFleisch, koehlerhuetteFleisch, salzstockFleisch, salineFleisch, rinderfarmFleisch, metzgerFleisch};
                        btn_verbr_fleisch.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Verbrauch erneut berechnen
                                metzgerFleisch.setAnzahlAuslastung(String.valueOf(anzahl_metzger) + "x (" + verbrauchsrechner.getAuslastung_fleisch() + "%)");
                                rinderfarmFleisch.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_fleisch(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_vieh())));
                                salineFleisch.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_fleisch(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_salz())));
                                salzstockFleisch.setAnzahlAuslastung(berechne(verbr_per_tick_saline, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_sole())));
                                koehlerhuetteFleisch.setAnzahlAuslastung(berechne(verbr_per_tick_saline, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle())));
                                holzfaellerFleisch.setAnzahlAuslastung(berechne(verbr_per_tick_koehlerhuetten, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_holz())));
                                // Verpacken aller Gebäude
                                Gebaeude[] alleGebaeude = {holzfaellerFleisch, koehlerhuetteFleisch, salzstockFleisch, salineFleisch, rinderfarmFleisch, metzgerFleisch};
                                dialogersteller.erstelleDialog(getString(R.string.str_pr_fleisch), alleGebaeude);
                            }
                        });
                        ll_fleisch.setVisibility(View.VISIBLE);
                    }
                    // Milch
                    if (anzahl_ziegenfarmen > 0) {
                        btn_verbr_milch.setEnabled(true);

                        // Anzahl und Auslastung berechnen
                        // Einzahlcheck
                        if (anzahl_ziegenfarmen > 1)
                            detailMilch = String.valueOf(anzahl_ziegenfarmen) + "x " + getString(R.string.str_gb_ziegenfarmen) + " (" + verbrauchsrechner.getAuslastung_milch() + "%)";
                        else
                            detailMilch = String.valueOf(anzahl_ziegenfarmen) + "x " + getString(R.string.str_gb_ziegenfarm) + " (" + verbrauchsrechner.getAuslastung_milch() + "%)";
                        Gebaeude ziegenfarmMilch = gebaeudeersteller.getGebaeudeZiegenfarm();
                        ziegenfarmMilch.setAnzahlAuslastung(String.valueOf(anzahl_ziegenfarmen) + "x (" + verbrauchsrechner.getAuslastung_milch() + "%)");
                        final Gebaeude[] alleGebaeude = {ziegenfarmMilch};
                        btn_verbr_milch.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                    dialogersteller.erstelleDialog(getString(R.string.str_pr_milch), alleGebaeude);
                            }
                        });
                        ll_milch.setVisibility(View.VISIBLE);
                    }
                    // Most
                    if (anzahl_mosthoefe > 0) {
                        //
                        btn_verbr_most.setEnabled(true);

                        // Alle Gebäude instanziieren
                        final Gebaeude apfelhofMost = gebaeudeersteller.getGebaeudeApfelhof();
                        final Gebaeude mosthofMost = gebaeudeersteller.getGebaeudeMosthof();

                        // Hauptprodukt
                        detailMost = String.valueOf(anzahl_mosthoefe) + "x (" + verbrauchsrechner.getAuslastung_most() + "%)";
                        mosthofMost.setAnzahlAuslastung(detailMost);
                        // Einzahlcheck
                        String einMehrzahlMost = getString(R.string.str_gb_mosthof);
                        if (Integer.valueOf(detailMost.substring(0, detailMost.indexOf("x"))) > 1)
                            einMehrzahlMost = getString(R.string.str_gb_mosthoefe);
                        detailMost = detailMost.substring(0, detailMost.indexOf("x")+2) + einMehrzahlMost + detailMost.substring(detailMost.indexOf("x")+1);

                        // Direktes Vorprodukt
                        detailAepfel = berechne(verbrauchsrechner.getVerbr_per_tick_most(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_aepfel()));
                        apfelhofMost.setAnzahlAuslastung(detailAepfel);
                        // Einzahlcheck
                        String einMehrzahlAepfel = getString(R.string.str_gb_apfelhof);
                        if (Integer.valueOf(detailAepfel.substring(0, detailAepfel.indexOf("x"))) > 1)
                            einMehrzahlAepfel = getString(R.string.str_gb_apfelhoefe);
                        detailAepfel = detailAepfel.substring(0, detailAepfel.indexOf("x")+2) + einMehrzahlAepfel + detailAepfel.substring(detailAepfel.indexOf("x")+1);

                        // OnClickListener
                        btn_verbr_most.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Verbrauch erneut berechnen
                                mosthofMost.setAnzahlAuslastung(String.valueOf(anzahl_mosthoefe) + "x (" + verbrauchsrechner.getAuslastung_most() + "%)");
                                apfelhofMost.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_most(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_aepfel())));
                                // Verpacken aller Gebäude
                                Gebaeude[] alleGebaeude = {apfelhofMost, mosthofMost};
                                dialogersteller.erstelleDialog(getString(R.string.str_pr_most), alleGebaeude);
                            }
                        });
                        ll_most.setVisibility(View.VISIBLE);
                    }
                    // Bier
                    if (anzahl_klosterbrauereien > 0) {
                        btn_verbr_bier.setEnabled(true);

                        // Alle Gebäude instanziieren
                        final Gebaeude weizenhofBier = gebaeudeersteller.getGebaeudeWeizenhof();
                        final Gebaeude klostergaertenBier = gebaeudeersteller.getGebaeudeKlostergarten();
                        final Gebaeude klosterbrauereiBier = gebaeudeersteller.getGebaeudeKlosterbrauerei();

                        // Hauptprodukt
                        detailBier = String.valueOf(anzahl_klosterbrauereien) + "x (" + verbrauchsrechner.getAuslastung_bier() + "%)";
                        klosterbrauereiBier.setAnzahlAuslastung(detailBier);
                        // Einzahlcheck
                        String einMehrzahlBier = getString(R.string.str_gb_klosterbrauerei);
                        if (Integer.valueOf(detailBier.substring(0, detailBier.indexOf("x"))) > 1)
                            einMehrzahlBier = getString(R.string.str_gb_klosterbrauereien);
                        detailBier = detailBier.substring(0, detailBier.indexOf("x")+2) + einMehrzahlBier + detailBier.substring(detailBier.indexOf("x")+1);

                        // Direktes Vorprodukt1
                        detailKraeuter = berechne(verbrauchsrechner.getVerbr_per_tick_bier(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kraeuter()));
                        klostergaertenBier.setAnzahlAuslastung(detailKraeuter);

                        // Einzahlcheck
                        String einMehrzahlKraeuter = getString(R.string.str_gb_klostergarten);
                        if (Integer.valueOf(detailKraeuter.substring(0, detailKraeuter.indexOf("x"))) > 1)
                            einMehrzahlKraeuter = getString(R.string.str_gb_klostergaerten);
                        detailKraeuter = detailKraeuter.substring(0, detailKraeuter.indexOf("x")+2) + einMehrzahlKraeuter + detailKraeuter.substring(detailKraeuter.indexOf("x")+1);

                        // Direktes Vorprodukt2
                        detailWeizenBier = berechne(verbrauchsrechner.getVerbr_per_tick_bier(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_weizen()));
                        weizenhofBier.setAnzahlAuslastung(detailWeizenBier);
                        // Einzahlcheck
                        String einMehrzahlWeizenBier = getString(R.string.str_gb_weizenfarm);
                        if (Integer.valueOf(detailWeizenBier.substring(0, detailWeizenBier.indexOf("x"))) > 1)
                            einMehrzahlWeizenBier = getString(R.string.str_gb_weizenfarmen);
                        detailWeizenBier = detailWeizenBier.substring(0, detailWeizenBier.indexOf("x")+2) + einMehrzahlWeizenBier + detailWeizenBier.substring(detailWeizenBier.indexOf("x")+1);

                        // OnClickListener
                        btn_verbr_bier.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Verbrauch erneut berechnen
                                klosterbrauereiBier.setAnzahlAuslastung(String.valueOf(anzahl_klosterbrauereien) + "x (" + verbrauchsrechner.getAuslastung_bier() + "%)");
                                klostergaertenBier.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_bier(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kraeuter())));
                                weizenhofBier.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_bier(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_weizen())));
                                // Verpacken aller Gebäude
                                Gebaeude[] alleGebaeude = {weizenhofBier, klostergaertenBier, klosterbrauereiBier};
                                // Dialog erstellen
                                dialogersteller.erstelleDialog(getString(R.string.str_pr_bier), alleGebaeude);
                            }
                        });
                        ll_bier.setVisibility(View.VISIBLE);
                    }
                    // Wein
                    if (anzahl_keltereien > 0) {
                        btn_verbr_wein.setEnabled(true);

                        // Alle Gebäude instanziieren
                        final Gebaeude holzfaellerWein = gebaeudeersteller.getGebaeudeHolzfaeller();
                        final Gebaeude koehlerhuetteWein = gebaeudeersteller.getGebaeudeKoehlerhuette();
                        final Gebaeude eisenmineWein = gebaeudeersteller.getGebaeudeEisenmine();
                        final Gebaeude eisenschmelzeWein = gebaeudeersteller.getGebaeudeEisenschmelze();
                        final Gebaeude fasskuefereiWein = gebaeudeersteller.getGebaeudeFasskueferei();
                        final Gebaeude weingutWein = gebaeudeersteller.getGebaeudeWeingut();
                        final Gebaeude keltereiWein = gebaeudeersteller.getGebaeudeKelterei();

                        // Hauptprodukt
                        detailWein = String.valueOf(anzahl_keltereien) + "x (" + verbrauchsrechner.getAuslastung_wein() + "%)";
                        keltereiWein.setAnzahlAuslastung(detailWein);

                        // Einzahlcheck
                        String einMehrzahlWein = getString(R.string.str_gb_kelterei);
                        if (anzahl_keltereien > 1)
                            einMehrzahlWein = getString(R.string.str_gb_keltereien);
                        detailWein = detailWein.substring(0, detailWein.indexOf("x")+2) + einMehrzahlWein + detailWein.substring(detailWein.indexOf("x")+1);

                        // Direktes Vorprodukt1
                        detailTrauben = berechne(verbrauchsrechner.getVerbr_per_tick_wein(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_trauben()));
                        weingutWein.setAnzahlAuslastung(detailTrauben);

                        // Einzahlcheck
                        String einMehrzahlTrauben = getString(R.string.str_gb_weingut);
                        if (Integer.valueOf(detailTrauben.substring(0, detailTrauben.indexOf("x"))) > 1)
                            einMehrzahlTrauben = getString(R.string.str_gb_weingueter);
                        detailTrauben = detailTrauben.substring(0, detailTrauben.indexOf("x")+2) + einMehrzahlTrauben + detailTrauben.substring(detailTrauben.indexOf("x")+1);

                        // Direktes Vorprodukt2
                        detailFaesser = berechne(verbrauchsrechner.getVerbr_per_tick_wein(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_faesser()));
                        fasskuefereiWein.setAnzahlAuslastung(detailFaesser);

                        // Einzahlcheck
                        String einMehrzahlFaesser = getString(R.string.str_gb_fasskueferei);
                        if (Integer.valueOf(detailFaesser.substring(0, detailFaesser.indexOf("x"))) > 1)
                            einMehrzahlFaesser = getString(R.string.str_gb_fasskuefereien);
                        detailFaesser = detailFaesser.substring(0, detailFaesser.indexOf("x")+2) + einMehrzahlFaesser + detailFaesser.substring(detailFaesser.indexOf("x")+1);

                        // Indirektes Vorprodukt1 (Eisen von Fässer)
                        double ausl_fasskueferei = berechneAuslastung(verbrauchsrechner.getVerbr_per_tick_wein(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_faesser()));
                        final double verbr_per_tick_fasskueferei = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_faesser()) * ausl_fasskueferei) / 100;
                        detailEisenWein = berechne(verbr_per_tick_fasskueferei, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_eisen()));
                        eisenschmelzeWein.setAnzahlAuslastung(detailEisenWein);

                        // Einzahlcheck
                        String einMehrzahlEisenWein = getString(R.string.str_gb_eisenschmelze);
                        if (Integer.valueOf(detailEisenWein.substring(0, detailEisenWein.indexOf("x"))) > 1)
                            einMehrzahlEisenWein = getString(R.string.str_gb_eisenschmelzen);
                        detailEisenWein = detailEisenWein.substring(0, detailEisenWein.indexOf("x")+2) + einMehrzahlEisenWein + detailEisenWein.substring(detailEisenWein.indexOf("x")+1);

                        // Indirektes Vorprodukt2 (Eisenerz von Eisen)
                        double ausl_eisenschmelzen = berechneAuslastung(verbr_per_tick_fasskueferei, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_eisen()));
                        final double verbr_per_tick_eisenschmelzen = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_eisen()) * ausl_eisenschmelzen) / 100;
                        detailEisenerzWein = berechne(verbr_per_tick_eisenschmelzen, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_eisenerz()));
                        eisenmineWein.setAnzahlAuslastung(detailEisenerzWein);

                        // Einzahlcheck
                        String einMehrzahlEisenerzWein = getString(R.string.str_gb_eisenmine);
                        if (Integer.valueOf(detailEisenerzWein.substring(0, detailEisenerzWein.indexOf("x"))) > 1)
                            einMehrzahlEisenerzWein = getString(R.string.str_gb_eisenminen);
                        detailEisenerzWein = detailEisenerzWein.substring(0, detailEisenerzWein.indexOf("x")+2) + einMehrzahlEisenerzWein + detailEisenerzWein.substring(detailEisenerzWein.indexOf("x")+1);

                        // Indirektes Vorprodukt2 (Kohle von Eisen)
                        detailKohleWein = berechne(verbr_per_tick_eisenschmelzen, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()));
                        koehlerhuetteWein.setAnzahlAuslastung(detailKohleWein);

                        // Einzahlcheck
                        String einMehrzahlKohleWein = getString(R.string.str_gb_koehlerhuette);
                        if (Integer.valueOf(detailKohleWein.substring(0, detailKohleWein.indexOf("x"))) > 1)
                            einMehrzahlKohleWein = getString(R.string.str_gb_koehlerhuetten);
                        detailKohleWein = detailKohleWein.substring(0, detailKohleWein.indexOf("x")+2) + einMehrzahlKohleWein + detailKohleWein.substring(detailKohleWein.indexOf("x")+1);

                        // Indirektes Vorprodukt3 (Holz von Kohle und Holz von Fässer)
                        double ausl_koehlerhuetten = berechneAuslastung(verbr_per_tick_eisenschmelzen, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()));
                        final double verbr_per_tick_koehlerhuette = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()) * ausl_koehlerhuetten) / 100;
                        detailHolzWein = berechne((verbr_per_tick_koehlerhuette + verbr_per_tick_fasskueferei), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()));
                        holzfaellerWein.setAnzahlAuslastung(detailHolzWein);
                        // Einzahlcheck
                        String einMehrzahlHolzWein = getString(R.string.str_gb_holzfaeller);
                        if (Integer.valueOf(detailHolzWein.substring(0, detailHolzWein.indexOf("x"))) > 1)
                            einMehrzahlHolzWein = getString(R.string.str_gb_holzfaeller_mehrzahl);
                        detailHolzWein = detailHolzWein.substring(0, detailHolzWein.indexOf("x")+2) + einMehrzahlHolzWein + detailHolzWein.substring(detailHolzWein.indexOf("x")+1);

                        // OnClickListener
                        btn_verbr_wein.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Verbrauch erneut berechnen
                                keltereiWein.setAnzahlAuslastung(String.valueOf(anzahl_keltereien) + "x (" + verbrauchsrechner.getAuslastung_wein() + "%)");
                                weingutWein.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_wein(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_trauben())));
                                fasskuefereiWein.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_wein(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_faesser())));
                                eisenschmelzeWein.setAnzahlAuslastung(berechne(verbr_per_tick_fasskueferei, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_eisen())));
                                eisenmineWein.setAnzahlAuslastung(berechne(verbr_per_tick_eisenschmelzen, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_eisenerz())));
                                koehlerhuetteWein.setAnzahlAuslastung(berechne(verbr_per_tick_eisenschmelzen, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle())));
                                holzfaellerWein.setAnzahlAuslastung(berechne((verbr_per_tick_koehlerhuette + verbr_per_tick_fasskueferei), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle())));
                                // Verpacken aller Gebäude
                                Gebaeude[] alleGebaeude = {holzfaellerWein, koehlerhuetteWein, eisenmineWein, eisenschmelzeWein, fasskuefereiWein, weingutWein, keltereiWein};
                                // Dialog erstellen
                                dialogersteller.erstelleDialog(getString(R.string.str_pr_wein), alleGebaeude);
                            }
                        });
                        ll_wein.setVisibility(View.VISIBLE);
                    }
                    // Wollgewaender
                    if (anzahl_spinnereien > 0) {
                        btn_verbr_wollgewaender.setEnabled(true);

                        // Alle Gebäude instanziieren
                        final Gebaeude schaffarmenWollgewaender = gebaeudeersteller.getGebaeudeSchaffarm();
                        final Gebaeude spinnereienWollgewaender = gebaeudeersteller.getGebaeudeSpinnerei();

                        // Hauptprodukt
                        detailWollgewaender = String.valueOf(anzahl_spinnereien) + "x (" + verbrauchsrechner.getAuslastung_wollgewaender() + "%)";
                        spinnereienWollgewaender.setAnzahlAuslastung(detailWollgewaender);

                        // Einzahlcheck
                        String einMehrzahlWollgewaender = getString(R.string.str_gb_spinnerei);
                        if (Integer.valueOf(detailWollgewaender.substring(0, detailWollgewaender.indexOf("x"))) > 1)
                            einMehrzahlWollgewaender = getString(R.string.str_gb_spinnereien);
                        detailWollgewaender = detailWollgewaender.substring(0, detailWollgewaender.indexOf("x")+2) + einMehrzahlWollgewaender + detailWollgewaender.substring(detailWollgewaender.indexOf("x")+1);

                        // Direktes Vorprodukt
                        detailWolle = berechne(verbrauchsrechner.getVerbr_per_tick_wollgewaender(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_woole()));
                        schaffarmenWollgewaender.setAnzahlAuslastung(detailWolle);
                        // Einzahlcheck
                        String einMehrzahlWolle = getString(R.string.str_gb_schaffarm);
                        if (Integer.valueOf(detailWolle.substring(0, detailWolle.indexOf("x"))) > 1)
                            einMehrzahlWolle = getString(R.string.str_gb_schaffarmen);
                        detailWolle = detailWolle.substring(0, detailWolle.indexOf("x")+2) + einMehrzahlWolle + detailWolle.substring(detailWolle.indexOf("x")+1);

                        // OnClickListener
                        btn_verbr_wollgewaender.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Verbrauch erneut berechnen
                                spinnereienWollgewaender.setAnzahlAuslastung(String.valueOf(anzahl_spinnereien) + "x (" + verbrauchsrechner.getAuslastung_wollgewaender() + "%)");
                                schaffarmenWollgewaender.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_wollgewaender(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_woole())));
                                // Verpacken aller Gebäude
                                final Gebaeude[] alleGebaeude = {schaffarmenWollgewaender, spinnereienWollgewaender};
                                // Dialog erstellen
                                dialogersteller.erstelleDialog(getString(R.string.str_pr_wollgewaender), alleGebaeude);
                            }
                        });
                        ll_wollgewaender.setVisibility(View.VISIBLE);
                    }
                    // Leinengewaender
                    if (anzahl_webereien > 0) {
                        btn_verbr_leinengewaender.setEnabled(true);

                        // Alle Gebäude instanziieren
                        final Gebaeude hanfplantagenLeinengewaender = gebaeudeersteller.getGebaeudeHanfplantage();
                        final Gebaeude webereienLeinengewaender = gebaeudeersteller.getGebaeudeWebstube();

                        // Hauptprodukt
                        detailLeinengewaender = String.valueOf(anzahl_webereien) + "x (" + verbrauchsrechner.getAuslastung_leinengewaender() + "%)";
                        webereienLeinengewaender.setAnzahlAuslastung(detailLeinengewaender);
                        // Einzahlcheck
                        String einMehrzahlLeinengewaender = getString(R.string.str_gb_webstube);
                        if (Integer.valueOf(detailLeinengewaender.substring(0, detailLeinengewaender.indexOf("x"))) > 1)
                            einMehrzahlLeinengewaender = getString(R.string.str_gb_webstuben);
                        detailLeinengewaender = detailLeinengewaender.substring(0, detailLeinengewaender.indexOf("x")+2) + einMehrzahlLeinengewaender + detailLeinengewaender.substring(detailLeinengewaender.indexOf("x")+1);

                        // Direktes Vorprodukt
                        detailHanfLeinengewaender = berechne(verbrauchsrechner.getVerbr_per_tick_leinengewander(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_hanf()));
                        hanfplantagenLeinengewaender.setAnzahlAuslastung(detailHanfLeinengewaender);
                        // Einzahlcheck
                        String einMehrzahlHanfLeinengewaender = getString(R.string.str_gb_hanfplantage);
                        if (Integer.valueOf(detailHanfLeinengewaender.substring(0, detailHanfLeinengewaender.indexOf("x"))) > 1)
                            einMehrzahlHanfLeinengewaender = getString(R.string.str_gb_hanfplantagen);
                        detailHanfLeinengewaender = detailHanfLeinengewaender.substring(0, detailHanfLeinengewaender.indexOf("x")+2) + einMehrzahlHanfLeinengewaender + detailHanfLeinengewaender.substring(detailHanfLeinengewaender.indexOf("x")+1);

                        // OnClickListener
                        btn_verbr_leinengewaender.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Verbrauch erneut berechnen
                                webereienLeinengewaender.setAnzahlAuslastung(String.valueOf(anzahl_webereien) + "x (" + verbrauchsrechner.getAuslastung_leinengewaender() + "%)");
                                hanfplantagenLeinengewaender.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_leinengewander(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_hanf())));
                                // Verpacken aller Gebäude
                                final Gebaeude[] alleGebaeude = {hanfplantagenLeinengewaender, webereienLeinengewaender};
                                // Dialog erstellen
                                dialogersteller.erstelleDialog(getString(R.string.str_pr_leinengewaender), alleGebaeude);
                            }
                        });
                        ll_leinengewaender.setVisibility(View.VISIBLE);
                    }
                    // Lederwaemser
                    if (anzahl_gerbereien > 0) {
                        btn_verbr_lederwaemser.setEnabled(true);

                        // Alle Gebäude instanziieren
                        final Gebaeude holzfaellerLederwaemser = gebaeudeersteller.getGebaeudeHolzfaeller();
                        final Gebaeude koehlerhuetteLederwaemser = gebaeudeersteller.getGebaeudeKoehlerhuette();
                        final Gebaeude salzstockLederwaemser = gebaeudeersteller.getGebaeudeSalzstock();
                        final Gebaeude salineLederwaemser = gebaeudeersteller.getGebaeudeSaline();
                        final Gebaeude schweinefarmLederwaemser = gebaeudeersteller.getGebaeudeSchweinefarm();
                        final Gebaeude gerbereiLederwaemser = gebaeudeersteller.getGebaeudeGerberei();

                        // Hauptprodukt
                        detailLederwaemser = String.valueOf(anzahl_gerbereien) + "x (" + verbrauchsrechner.getAuslastung_lederwaemser() + "%)";
                        gerbereiLederwaemser.setAnzahlAuslastung(detailLederwaemser);
                        // Einzahlcheck
                        String einMehrzahlLederwaemser = getString(R.string.str_gb_gerberei);
                        if (Integer.valueOf(detailLederwaemser.substring(0, detailLederwaemser.indexOf("x"))) > 1)
                            einMehrzahlLederwaemser = getString(R.string.str_gb_gerbereien);
                        detailLederwaemser = detailLederwaemser.substring(0, detailLederwaemser.indexOf("x")+2) + einMehrzahlLederwaemser + detailLederwaemser.substring(detailLederwaemser.indexOf("x")+1);

                        // Direktes Vorprodukt1
                        detailTierhaeute = berechne(verbrauchsrechner.getVerbr_per_tick_lederwaemser(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_tierhaeute()));
                        schweinefarmLederwaemser.setAnzahlAuslastung(detailTierhaeute);
                        // Einzahlcheck
                        String einMehrzahlTierhaeute = getString(R.string.str_gb_schweinefarm);
                        if (Integer.valueOf(detailTierhaeute.substring(0, detailTierhaeute.indexOf("x"))) > 1)
                            einMehrzahlTierhaeute = getString(R.string.str_gb_schweinefarmen);
                        detailTierhaeute = detailTierhaeute.substring(0, detailTierhaeute.indexOf("x")+2) + einMehrzahlTierhaeute + detailTierhaeute.substring(detailTierhaeute.indexOf("x")+1);

                        // Direktes Vorprodukt2
                        detailSalzLederwaemser = berechne(verbrauchsrechner.getVerbr_per_tick_lederwaemser(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_salz()));
                        salineLederwaemser.setAnzahlAuslastung(detailSalzLederwaemser);
                        // Einzahlcheck
                        String einMehrzahlSalzLederwaemser = getString(R.string.str_gb_salzstock);
                        if (Integer.valueOf(detailSalzLederwaemser.substring(0, detailSalzLederwaemser.indexOf("x"))) > 1)
                            einMehrzahlSalzLederwaemser = getString(R.string.str_gb_salzstoecke);
                        detailSalzLederwaemser = detailSalzLederwaemser.substring(0, detailSalzLederwaemser.indexOf("x")+2) + einMehrzahlSalzLederwaemser + detailSalzLederwaemser.substring(detailSalzLederwaemser.indexOf("x")+1);

                        // Indirektes Vorprodukt1 (von Salz)
                        double ausl_saline = berechneAuslastung(verbrauchsrechner.getVerbr_per_tick_lederwaemser(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_salz()));
                        final double verbr_per_tick_saline = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_salz()) * ausl_saline) / 100;
                        detailSoleLederwaemser = berechne(verbr_per_tick_saline, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_sole()));
                        salzstockLederwaemser.setAnzahlAuslastung(detailSoleLederwaemser);
                        // Einzahlcheck
                        String einMehrzahlSoleLederwaemser = getString(R.string.str_gb_saline);
                        if (Integer.valueOf(detailSoleLederwaemser.substring(0, detailSoleLederwaemser.indexOf("x"))) > 1)
                            einMehrzahlSoleLederwaemser = getString(R.string.str_gb_salinen);
                        detailSoleLederwaemser = detailSoleLederwaemser.substring(0, detailSoleLederwaemser.indexOf("x")+2) + einMehrzahlSoleLederwaemser + detailSoleLederwaemser.substring(detailSoleLederwaemser.indexOf("x")+1);

                        // Indirektes Vorprodukt2 (von Salz)
                        detailKohleLederwaemser = berechne(verbr_per_tick_saline, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()));
                        koehlerhuetteLederwaemser.setAnzahlAuslastung(detailKohleLederwaemser);
                        // Einzahlcheck
                        String einMehrzahlKohleLederwaemser = getString(R.string.str_gb_koehlerhuette);
                        if (Integer.valueOf(detailKohleLederwaemser.substring(0, detailKohleLederwaemser.indexOf("x"))) > 1)
                            einMehrzahlKohleLederwaemser = getString(R.string.str_gb_koehlerhuetten);
                        detailKohleLederwaemser = detailKohleLederwaemser.substring(0, detailKohleLederwaemser.indexOf("x")+2) + einMehrzahlKohleLederwaemser + detailKohleLederwaemser.substring(detailKohleLederwaemser.indexOf("x")+1);

                        // Indirektes Vorprodukt3 (von Kohle)
                        double ausl_koehlerhuetten = berechneAuslastung(verbr_per_tick_saline, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()));
                        final double verbr_per_tick_koehlerhuetten = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()) * ausl_koehlerhuetten) / 100;
                        detailHolzLederwaemser = berechne(verbr_per_tick_koehlerhuetten, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_holz()));
                        holzfaellerLederwaemser.setAnzahlAuslastung(detailHolzLederwaemser);
                        // Einzahlcheck
                        String einMehrzahlHolzLederwaemser = getString(R.string.str_gb_holzfaeller);
                        if (Integer.valueOf(detailHolzLederwaemser.substring(0, detailHolzLederwaemser.indexOf("x"))) > 1)
                            einMehrzahlHolzLederwaemser = getString(R.string.str_gb_holzfaeller_mehrzahl);
                        detailHolzLederwaemser = detailHolzLederwaemser.substring(0, detailHolzLederwaemser.indexOf("x")+2) + einMehrzahlHolzLederwaemser + detailHolzLederwaemser.substring(detailHolzLederwaemser.indexOf("x")+1);

                        // OnClickListener
                        btn_verbr_lederwaemser.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Verbrauch erneut berechnen
                                gerbereiLederwaemser.setAnzahlAuslastung(String.valueOf(anzahl_gerbereien) + "x (" + verbrauchsrechner.getAuslastung_lederwaemser() + "%)");
                                schweinefarmLederwaemser.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_lederwaemser(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_tierhaeute())));
                                salineLederwaemser.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_lederwaemser(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_salz())));
                                salzstockLederwaemser.setAnzahlAuslastung(berechne(verbr_per_tick_saline, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_sole())));
                                koehlerhuetteLederwaemser.setAnzahlAuslastung(berechne(verbr_per_tick_saline, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle())));
                                holzfaellerLederwaemser.setAnzahlAuslastung(berechne(verbr_per_tick_koehlerhuetten, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_holz())));
                                // Verpacken aller Gebäude
                                final Gebaeude[] alleGebaeude = {holzfaellerLederwaemser, koehlerhuetteLederwaemser, salzstockLederwaemser, salineLederwaemser, schweinefarmLederwaemser, gerbereiLederwaemser};
                                // Dialog erstellen
                                dialogersteller.erstelleDialog(getString(R.string.str_pr_lederwaemser), alleGebaeude);
                            }
                        });
                        ll_lederwaemser.setVisibility(View.VISIBLE);
                    }
                    // Pelzmaentel
                    if (anzahl_kuerschner > 0) {
                        btn_verbr_pelzmaentel.setEnabled(true);

                        // Alle Gebäude instanziieren
                        final Gebaeude pelztierjaegerPelzmaentel = gebaeudeersteller.getGebaeudePelztierjaeger();
                        final Gebaeude kuerschnerPelzmaentel = gebaeudeersteller.getGebaeudeKuerschnerei();

                        // Hauptprodukt
                        detailPelzmaentel = String.valueOf(anzahl_kuerschner) + "x (" + verbrauchsrechner.getAuslastung_pelzmaentel() + "%)";
                        kuerschnerPelzmaentel.setAnzahlAuslastung(detailPelzmaentel);
                        // Einzahlcheck
                        String einMehrzahlPelzmaentel = getString(R.string.str_gb_kuerschner);
                        if (Integer.valueOf(detailPelzmaentel.substring(0, detailPelzmaentel.indexOf("x"))) > 1)
                            einMehrzahlPelzmaentel = getString(R.string.str_gb_kuerschner_mehrzahl);
                        detailPelzmaentel = detailPelzmaentel.substring(0, detailPelzmaentel.indexOf("x")+2) + einMehrzahlPelzmaentel + detailPelzmaentel.substring(detailPelzmaentel.indexOf("x")+1);

                        // Direktes Vorprodukt
                        detailPelze = berechne(verbrauchsrechner.getVerbr_per_tick_pelzmaentel(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_pelze()));
                        pelztierjaegerPelzmaentel.setAnzahlAuslastung(detailPelze);
                        // Einzahlcheck
                        String einMehrzahlPelze = getString(R.string.str_gb_pelztierjaeger);
                        if (Integer.valueOf(detailPelze.substring(0, detailPelze.indexOf("x"))) > 1)
                            einMehrzahlPelze = getString(R.string.str_gb_pelztierjaeger_mehrzahl);
                        detailPelze = detailPelze.substring(0, detailPelze.indexOf("x")+2) + einMehrzahlPelze + detailPelze.substring(detailPelze.indexOf("x")+1);

                        // OnClickListener
                        btn_verbr_pelzmaentel.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Verbrauch erneut berechnen
                                kuerschnerPelzmaentel.setAnzahlAuslastung(String.valueOf(anzahl_kuerschner) + "x (" + verbrauchsrechner.getAuslastung_pelzmaentel() + "%)");
                                pelztierjaegerPelzmaentel.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_pelzmaentel(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_pelze())));
                                // Verpacken aller Gebäude
                                final Gebaeude[] alleGebaeude = {pelztierjaegerPelzmaentel, kuerschnerPelzmaentel};
                                // Dialog erstellen
                                dialogersteller.erstelleDialog(getString(R.string.str_pr_pelzmaentel), alleGebaeude);
                            }
                        });
                        ll_pelzmaentel.setVisibility(View.VISIBLE);
                    }
                    // Brokatgewaender
                    if (anzahl_seidenwebereien > 0) {
                        btn_verbr_brokatgewaender.setEnabled(true);

                        // Alle Gebäude instanziieren
                        final Gebaeude holzfaellerBrokatgewaender = gebaeudeersteller.getGebaeudeHolzfaeller();
                        final Gebaeude koehlerhuetteBrokatgewaender = gebaeudeersteller.getGebaeudeKoehlerhuette();
                        final Gebaeude goldmineBrokatgewaender = gebaeudeersteller.getGebaeudeGoldmine();
                        final Gebaeude goldschmelzeBrokatgewaender = gebaeudeersteller.getGebaeudeGoldschmelze();
                        final Gebaeude seideBrokatgewaender = gebaeudeersteller.getGebaeudeSeide();
                        final Gebaeude seidenwebereiBrokatgewaender = gebaeudeersteller.getGebaeudeSeidenweberei();

                        // Hauptprodukt
                        detailBrokatgewaender = String.valueOf(anzahl_seidenwebereien) + "x (" + verbrauchsrechner.getAuslastung_brokatgewaender() + "%)";
                        seidenwebereiBrokatgewaender.setAnzahlAuslastung(detailBrokatgewaender);
                        // Einzahlcheck
                        String einMehrzahlBrokatgewaender = getString(R.string.str_gb_seidenweberei);
                        if (Integer.valueOf(detailBrokatgewaender.substring(0, detailBrokatgewaender.indexOf("x"))) > 1)
                            einMehrzahlBrokatgewaender = getString(R.string.str_gb_seidenwebereien);
                        detailBrokatgewaender = detailBrokatgewaender.substring(0, detailBrokatgewaender.indexOf("x")+2) + einMehrzahlBrokatgewaender + detailBrokatgewaender.substring(detailBrokatgewaender.indexOf("x")+1);

                        // Direktes Vorprodukt1
                        seideBrokatgewaender.setAnzahlAuslastung(getString(R.string.str_nur_einkauf));

                        // Direktes Vorprodukt2
                        detailGold = berechne(verbrauchsrechner.getVerbr_per_tick_brokatgewaender(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_gold()));
                        goldschmelzeBrokatgewaender.setAnzahlAuslastung(detailGold);
                        // Einzahlcheck
                        String einMehrzahlGold = getString(R.string.str_gb_goldschmelze);
                        if (Integer.valueOf(detailGold.substring(0, detailGold.indexOf("x"))) > 1)
                            einMehrzahlGold = getString(R.string.str_gb_goldschmelzen);
                        detailGold = detailGold.substring(0, detailGold.indexOf("x")+2) + einMehrzahlGold + detailGold.substring(detailGold.indexOf("x")+1);

                        // Indirektes Vorprodukt1 (Golderz von Gold)
                        double ausl_goldschmelze = berechneAuslastung(verbrauchsrechner.getVerbr_per_tick_brokatgewaender(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_gold()));
                        final double verbr_per_tick_goldschmelze = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_gold()) * ausl_goldschmelze) / 100;
                        detailGolderz = berechne(verbr_per_tick_goldschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_golderz()));
                        goldmineBrokatgewaender.setAnzahlAuslastung(detailGolderz);
                        // Einzahlcheck
                        String einMehrzahlGolderz = getString(R.string.str_gb_goldmine);
                        if (Integer.valueOf(detailGolderz.substring(0, detailGolderz.indexOf("x"))) > 1)
                            einMehrzahlGolderz = getString(R.string.str_gb_goldminen);
                        detailGolderz = detailGolderz.substring(0, detailGolderz.indexOf("x")+2) + einMehrzahlGolderz + detailGolderz.substring(detailGolderz.indexOf("x")+1);

                        // Indirektes Vorprodukt2 (Kohle von Gold)
                        detailKohleBrokatgewaender = berechne(verbr_per_tick_goldschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()));
                        koehlerhuetteBrokatgewaender.setAnzahlAuslastung(detailKohleBrokatgewaender);
                        // Einzahlcheck
                        String einMehrzahlKohleBrokatgewaender = getString(R.string.str_gb_koehlerhuette);
                        if (Integer.valueOf(detailKohleBrokatgewaender.substring(0, detailKohleBrokatgewaender.indexOf("x"))) > 1)
                            einMehrzahlKohleBrokatgewaender = getString(R.string.str_gb_koehlerhuetten);
                        detailKohleBrokatgewaender = detailKohleBrokatgewaender.substring(0, detailKohleBrokatgewaender.indexOf("x")+2) + einMehrzahlKohleBrokatgewaender + detailKohleBrokatgewaender.substring(detailKohleBrokatgewaender.indexOf("x")+1);

                        // Indirektes Vorprodukt3 (Holz von Kohle und Gold)
                        double ausl_koehlerhuetten = berechneAuslastung(verbr_per_tick_goldschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()));
                        final double verbr_per_tick_koehlerhuetten = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()) * ausl_koehlerhuetten) / 100;
                        detailHolzBrokatgewaender = berechne(verbr_per_tick_koehlerhuetten, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_holz()));
                        holzfaellerBrokatgewaender.setAnzahlAuslastung(detailHolzBrokatgewaender);
                        // Einzahlcheck
                        String einMehrzahlHolzBrokatgewaender = getString(R.string.str_gb_holzfaeller);
                        if (Integer.valueOf(detailHolzBrokatgewaender.substring(0, detailHolzBrokatgewaender.indexOf("x"))) > 1)
                            einMehrzahlHolzBrokatgewaender = getString(R.string.str_gb_holzfaeller_mehrzahl);
                        detailHolzBrokatgewaender = detailHolzBrokatgewaender.substring(0, detailHolzBrokatgewaender.indexOf("x")+2) + einMehrzahlHolzBrokatgewaender + detailHolzBrokatgewaender.substring(detailHolzBrokatgewaender.indexOf("x")+1);

                        // OnClickListener
                        btn_verbr_brokatgewaender.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Verbrauch erneut berechnen
                                seidenwebereiBrokatgewaender.setAnzahlAuslastung(String.valueOf(anzahl_seidenwebereien) + "x (" + verbrauchsrechner.getAuslastung_brokatgewaender() + "%)");
                                goldschmelzeBrokatgewaender.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_brokatgewaender(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_gold())));
                                goldmineBrokatgewaender.setAnzahlAuslastung(berechne(verbr_per_tick_goldschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_golderz())));
                                koehlerhuetteBrokatgewaender.setAnzahlAuslastung(berechne(verbr_per_tick_goldschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle())));
                                holzfaellerBrokatgewaender.setAnzahlAuslastung(berechne(verbr_per_tick_koehlerhuetten, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_holz())));
                                // Verpacken aller Gebäude
                                final Gebaeude[] alleGebaeude = {holzfaellerBrokatgewaender, koehlerhuetteBrokatgewaender, goldmineBrokatgewaender, goldschmelzeBrokatgewaender, seideBrokatgewaender, seidenwebereiBrokatgewaender};
                                // Dialog erstellen
                                dialogersteller.erstelleDialog(getString(R.string.str_pr_brokatgewaender), alleGebaeude);
                            }
                        });
                        ll_brokatgewaender.setVisibility(View.VISIBLE);
                    }
                    // Buecher
                    if (anzahl_druckereien > 0) {
                        btn_verbr_buecher.setEnabled(true);

                        // Alle Gebäude instanziieren
                        final Gebaeude holzfaellerBuecher = gebaeudeersteller.getGebaeudeHolzfaeller();
                        final Gebaeude papiermuehleBuecher = gebaeudeersteller.getGebaeudePapiermuehle();
                        final Gebaeude indigoBuecher = gebaeudeersteller.getGebaeudeIndigo();
                        final Gebaeude druckereiBuecher = gebaeudeersteller.getGebaeudeDruckerei();

                        // Hauptprodukt
                        detailBuecher = String.valueOf(anzahl_druckereien) + "x (" + verbrauchsrechner.getAuslastung_buecher() + "%)";
                        druckereiBuecher.setAnzahlAuslastung(detailBuecher);
                        // Einzahlcheck
                        String einMehrzahlBuecher = getString(R.string.str_gb_druckerei);
                        if (Integer.valueOf(detailBuecher.substring(0, detailBuecher.indexOf("x"))) > 1)
                            einMehrzahlBuecher = getString(R.string.str_gb_druckereien);
                        detailBuecher = detailBuecher.substring(0, detailBuecher.indexOf("x")+2) + einMehrzahlBuecher + detailBuecher.substring(detailBuecher.indexOf("x")+1);

                        // Direktes Vorprodukt1
                        indigoBuecher.setAnzahlAuslastung(getString(R.string.str_nur_einkauf));

                        // Direktes Vorprodukt2
                        detailPapier = berechne(verbrauchsrechner.getVerbr_per_tick_buecher(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_papier()));
                        papiermuehleBuecher.setAnzahlAuslastung(detailPapier);
                        // Einzahlcheck
                        String einMehrzahlPapier = getString(R.string.str_gb_papiermuehle);
                        if (Integer.valueOf(detailPapier.substring(0, detailPapier.indexOf("x"))) > 1)
                            einMehrzahlPapier = getString(R.string.str_gb_papiermuehlen);
                        detailPapier = detailPapier.substring(0, detailPapier.indexOf("x")+2) + einMehrzahlPapier + detailPapier.substring(detailPapier.indexOf("x")+1);

                        // Indirektes Vorprodukt 1
                        double ausl_papiermuehle = berechneAuslastung(verbrauchsrechner.getVerbr_per_tick_buecher(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_papier()));
                        final double verbr_per_tick_papiermehle = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_papier()) * ausl_papiermuehle) / 100;
                        detailHolzBuecher = berechne(verbr_per_tick_papiermehle, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_holz()));
                        holzfaellerBuecher.setAnzahlAuslastung(detailHolzBuecher);
                        // Einzahlcheck
                        String einMehrzahlHolzBuecher = getString(R.string.str_gb_holzfaeller);
                        if (Integer.valueOf(detailHolzBuecher.substring(0, detailHolzBuecher.indexOf("x"))) > 1)
                            einMehrzahlHolzBuecher = getString(R.string.str_gb_holzfaeller_mehrzahl);
                        detailHolzBuecher = detailHolzBuecher.substring(0, detailHolzBuecher.indexOf("x")+2) + einMehrzahlHolzBuecher + detailHolzBuecher.substring(detailHolzBuecher.indexOf("x")+1);

                        // OnClickListener
                        btn_verbr_buecher.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Verbrauch erneut berechnen
                                druckereiBuecher.setAnzahlAuslastung(String.valueOf(anzahl_druckereien) + "x (" + verbrauchsrechner.getAuslastung_buecher() + "%)");
                                papiermuehleBuecher.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_buecher(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_papier())));
                                holzfaellerBuecher.setAnzahlAuslastung(berechne(verbr_per_tick_papiermehle, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_holz())));
                                // Verpacken aller Gebäude
                                final Gebaeude[] alleGebaeude = {holzfaellerBuecher, papiermuehleBuecher, indigoBuecher, druckereiBuecher};
                                // Dialog erstellen
                                dialogersteller.erstelleDialog(getString(R.string.str_pr_buecher), alleGebaeude);
                            }
                        });
                        ll_buecher.setVisibility(View.VISIBLE);
                    }
                    // Kerzenhalter
                    if (anzahl_feinschmieden > 0) {
                        btn_verbr_kerzenhalter.setEnabled(true);

                        // Alle Gebäude instanziieren
                        final Gebaeude holzfaellerKerzenhalter = gebaeudeersteller.getGebaeudeHolzfaeller();
                        final Gebaeude koehlerhuetteKerzenhalter = gebaeudeersteller.getGebaeudeKoehlerhuette();
                        final Gebaeude kupfermineKerzenhalter = gebaeudeersteller.getGebaeudeKupfermine();
                        final Gebaeude kupferschmelzeKerzenhalter = gebaeudeersteller.getGebaeudeKupferschmelze();
                        final Gebaeude hanfplantageKerzenhalter = gebaeudeersteller.getGebaeudeHanfplantage();
                        final Gebaeude imkerKerzenhalter = gebaeudeersteller.getGebaeudeImker();
                        final Gebaeude lichtzieherKerzenhalter = gebaeudeersteller.getGebaeudeLichtzieher();
                        final Gebaeude feinschmiedeKerzenhalter = gebaeudeersteller.getGebaeudeFeinschmiede();

                        // Hauptprodukt
                        detailKerzenleuchter = String.valueOf(anzahl_feinschmieden) + "x (" + verbrauchsrechner.getAuslastung_kerzenleuchter() + "%)";
                        feinschmiedeKerzenhalter.setAnzahlAuslastung(detailKerzenleuchter);
                        // Einzahlcheck
                        String einMehrzahlKerzenleuchter = getString(R.string.str_gb_feinschmiede);
                        if (Integer.valueOf(detailKerzenleuchter.substring(0, detailKerzenleuchter.indexOf("x"))) > 1)
                            einMehrzahlKerzenleuchter = getString(R.string.str_gb_feinschmieden);
                        detailKerzenleuchter = detailKerzenleuchter.substring(0, detailKerzenleuchter.indexOf("x")+2) + einMehrzahlKerzenleuchter + detailKerzenleuchter.substring(detailKerzenleuchter.indexOf("x")+1);

                        // Direktes Vorprodukt1
                        detailKerzen = berechne(verbrauchsrechner.getVerbr_per_tick_kerzenleuchter(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kerzen()));
                        lichtzieherKerzenhalter.setAnzahlAuslastung(detailKerzen);
                        // Einzahlcheck
                        String einMehrzahlKerzen = getString(R.string.str_gb_lichtzieher);
                        if (Integer.valueOf(detailKerzen.substring(0, detailKerzen.indexOf("x"))) > 1)
                            einMehrzahlKerzen = getString(R.string.str_gb_lichtzieher_mehrzahl);
                        detailKerzen = detailKerzen.substring(0, detailKerzen.indexOf("x")+2) + einMehrzahlKerzen + detailKerzen.substring(detailKerzen.indexOf("x")+1);

                        // Direktes Vorprodukt2
                        detailMessingKerzenleuchter = berechne(verbrauchsrechner.getVerbr_per_tick_kerzenleuchter(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_messing()));
                        kupferschmelzeKerzenhalter.setAnzahlAuslastung(detailMessingKerzenleuchter);
                        // Einzahlcheck
                        String einMehrzahlMessingKerzenleuchter = getString(R.string.str_gb_kupferschmelze);
                        if (Integer.valueOf(detailMessingKerzenleuchter.substring(0, detailMessingKerzenleuchter.indexOf("x"))) > 1)
                            einMehrzahlMessingKerzenleuchter = getString(R.string.str_gb_kupferschmelzen);
                        detailMessingKerzenleuchter = detailMessingKerzenleuchter.substring(0, detailMessingKerzenleuchter.indexOf("x")+2) + einMehrzahlMessingKerzenleuchter + detailMessingKerzenleuchter.substring(detailMessingKerzenleuchter.indexOf("x")+1);

                        // Indirektes Vorprodukt1 (Imker von Kerzen)
                        double ausl_lichtzieher = berechneAuslastung(verbrauchsrechner.getVerbr_per_tick_kerzenleuchter(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kerzen()));
                        final double verbr_per_tick_lichtzieher = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kerzen()) * ausl_lichtzieher) / 100;
                        detailBienenwachs = berechne(verbr_per_tick_lichtzieher, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_bienenwachs()));
                        imkerKerzenhalter.setAnzahlAuslastung(detailBienenwachs);
                        // Einzahlcheck
                        String einMehrzahlBienenwachs = getString(R.string.str_gb_imker);
                        if (Integer.valueOf(detailBienenwachs.substring(0, detailBienenwachs.indexOf("x"))) > 1)
                            einMehrzahlBienenwachs = getString(R.string.str_gb_imker_mehrzahl);
                        detailBienenwachs = detailBienenwachs.substring(0, detailBienenwachs.indexOf("x")+2) + einMehrzahlBienenwachs + detailBienenwachs.substring(detailBienenwachs.indexOf("x")+1);

                        // Indirektes Vorprodukt2 (Hanfplantage von Kerzen)
                        detailHanfKerzenleuchter = berechne(verbr_per_tick_lichtzieher, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_hanf()));
                        hanfplantageKerzenhalter.setAnzahlAuslastung(detailHanfKerzenleuchter);
                        // Einzahlcheck
                        String einMehrzahlHanfKerzenleuchter = getString(R.string.str_gb_hanfplantage);
                        if (Integer.valueOf(detailHanfKerzenleuchter.substring(0, detailHanfKerzenleuchter.indexOf("x"))) > 1)
                            einMehrzahlHanfKerzenleuchter = getString(R.string.str_gb_hanfplantagen);
                        detailHanfKerzenleuchter = detailHanfKerzenleuchter.substring(0, detailHanfKerzenleuchter.indexOf("x")+2) + einMehrzahlHanfKerzenleuchter + detailHanfKerzenleuchter.substring(detailHanfKerzenleuchter.indexOf("x")+1);

                        // Indirektes Vorprodukt3 (Kupfer von Messing)
                        double ausl_kupferschmelze = berechneAuslastung(verbrauchsrechner.getVerbr_per_tick_kerzenleuchter(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_messing()));
                        final double verbr_per_tick_kupferschmelze = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_messing()) * ausl_kupferschmelze) / 100;
                        detailKupfererzKerzenleuchter = berechne(verbr_per_tick_kupferschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kupfererz()));
                        kupfermineKerzenhalter.setAnzahlAuslastung(detailKupfererzKerzenleuchter);
                        // Einzahlcheck
                        String einMehrzahlKupfererzKerzenleuchter = getString(R.string.str_gb_kupfermine);
                        if (Integer.valueOf(detailKupfererzKerzenleuchter.substring(0, detailKupfererzKerzenleuchter.indexOf("x"))) > 1)
                            einMehrzahlKupfererzKerzenleuchter = getString(R.string.str_gb_kupferminen);
                        detailKupfererzKerzenleuchter = detailKupfererzKerzenleuchter.substring(0, detailKupfererzKerzenleuchter.indexOf("x")+2) + einMehrzahlKupfererzKerzenleuchter + detailKupfererzKerzenleuchter.substring(detailKupfererzKerzenleuchter.indexOf("x")+1);

                        // Indirektes Vorprodukt4 (Kohle von Messing)
                        detailKohleKerzenleuchter = berechne(verbr_per_tick_kupferschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()));
                        koehlerhuetteKerzenhalter.setAnzahlAuslastung(detailKohleKerzenleuchter);
                        // Einzahlcheck
                        String einMehrzahlKohleKerzenleuchter = getString(R.string.str_gb_koehlerhuette);
                        if (Integer.valueOf(detailKohleKerzenleuchter.substring(0, detailKohleKerzenleuchter.indexOf("x"))) > 1)
                            einMehrzahlKohleKerzenleuchter = getString(R.string.str_gb_koehlerhuetten);
                        detailKohleKerzenleuchter = detailKohleKerzenleuchter.substring(0, detailKohleKerzenleuchter.indexOf("x")+2) + einMehrzahlKohleKerzenleuchter + detailKohleKerzenleuchter.substring(detailKohleKerzenleuchter.indexOf("x")+1);

                        // Indirektes Vorprodukt5 (Holz von Kohle)
                        double ausl_koehlerhuetten = berechneAuslastung(verbr_per_tick_kupferschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()));
                        final double verbr_per_tick_koehlerhuetten = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()) * ausl_koehlerhuetten) / 100;
                        detailHolzKerzenleuchter = berechne(verbr_per_tick_koehlerhuetten, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_holz()));
                        holzfaellerKerzenhalter.setAnzahlAuslastung(detailHolzKerzenleuchter);
                        // Einzahlcheck
                        String einMehrzahlHolzKerzenleuchter = getString(R.string.str_gb_holzfaeller);
                        if (Integer.valueOf(detailHolzKerzenleuchter.substring(0, detailHolzKerzenleuchter.indexOf("x"))) > 1)
                            einMehrzahlHolzKerzenleuchter = getString(R.string.str_gb_holzfaeller_mehrzahl);
                        detailHolzKerzenleuchter = detailHolzKerzenleuchter.substring(0, detailHolzKerzenleuchter.indexOf("x")+2) + einMehrzahlHolzKerzenleuchter + detailHolzKerzenleuchter.substring(detailHolzKerzenleuchter.indexOf("x")+1);

                        // OnClickListener
                        btn_verbr_kerzenhalter.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Verbrauch erneut berechnen
                                feinschmiedeKerzenhalter.setAnzahlAuslastung(String.valueOf(anzahl_feinschmieden) + "x (" + verbrauchsrechner.getAuslastung_kerzenleuchter() + "%)");
                                lichtzieherKerzenhalter.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_kerzenleuchter(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kerzen())));
                                kupferschmelzeKerzenhalter.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_kerzenleuchter(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_messing())));
                                imkerKerzenhalter.setAnzahlAuslastung(berechne(verbr_per_tick_lichtzieher, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_bienenwachs())));
                                hanfplantageKerzenhalter.setAnzahlAuslastung(berechne(verbr_per_tick_lichtzieher, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_hanf())));
                                kupfermineKerzenhalter.setAnzahlAuslastung(berechne(verbr_per_tick_kupferschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kupfererz())));
                                koehlerhuetteKerzenhalter.setAnzahlAuslastung(berechne(verbr_per_tick_kupferschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle())));
                                holzfaellerKerzenhalter.setAnzahlAuslastung(berechne(verbr_per_tick_koehlerhuetten, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_holz())));
                                // Verpacken aller Gebäude
                                final Gebaeude[] alleGebaeude = {holzfaellerKerzenhalter, koehlerhuetteKerzenhalter, kupfermineKerzenhalter, kupferschmelzeKerzenhalter, hanfplantageKerzenhalter, imkerKerzenhalter, lichtzieherKerzenhalter, feinschmiedeKerzenhalter};
                                // Dialog erstellen
                                dialogersteller.erstelleDialog(getString(R.string.str_pr_kerzenhalter), alleGebaeude);
                            }
                        });
                        ll_kerzenleuchter.setVisibility(View.VISIBLE);
                    }
                    // Brillen
                    if (anzahl_brillenmacher > 0) {
                        btn_verbr_brillen.setEnabled(true);

                        // Alle Gebäude instanziieren
                        final Gebaeude holzfaellerBrillen = gebaeudeersteller.getGebaeudeHolzfaeller();
                        final Gebaeude koehlerhuetteBrillen = gebaeudeersteller.getGebaeudeKoehlerhuette();
                        final Gebaeude kupfermineBrillen = gebaeudeersteller.getGebaeudeKupfermine();
                        final Gebaeude kupferschmelzeBrillen = gebaeudeersteller.getGebaeudeKupferschmelze();
                        final Gebaeude quarzbruchBrillen = gebaeudeersteller.getGebaeudeQuarzbruch();
                        final Gebaeude brillenmacherBrillen = gebaeudeersteller.getGebaeudeBrillenmacher();

                        // Hauptprodukt
                        detailBrillen = String.valueOf(anzahl_brillenmacher) + "x (" + verbrauchsrechner.getAuslastung_brillen() + "%)";
                        brillenmacherBrillen.setAnzahlAuslastung(detailBrillen);
                        // Einzahlcheck
                        String einMehrzahlBrillen = getString(R.string.str_gb_brillenmacher);
                        detailBrillen = detailBrillen.substring(0, detailBrillen.indexOf("x")+2) + einMehrzahlBrillen + detailBrillen.substring(detailBrillen.indexOf("x")+1);

                        // Direktes Vorprodukt1
                        detailQuarz = berechne(verbrauchsrechner.getVerbr_per_tick_brillen(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_quarz()));
                        quarzbruchBrillen.setAnzahlAuslastung(detailQuarz);
                        // Einzahlcheck
                        String einMehrzahlQuarz = getString(R.string.str_gb_quarzbruch);
                        if (Integer.valueOf(detailQuarz.substring(0, detailQuarz.indexOf("x"))) > 1)
                            einMehrzahlQuarz = getString(R.string.str_gb_quarzbrueche);
                        detailQuarz = detailQuarz.substring(0, detailQuarz.indexOf("x")+2) + einMehrzahlQuarz + detailQuarz.substring(detailQuarz.indexOf("x")+1);

                        // Direktes Vorprodukt2
                        detailMessingBrillen = berechne(verbrauchsrechner.getVerbr_per_tick_brillen(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_messing()));
                        kupferschmelzeBrillen.setAnzahlAuslastung(detailMessingBrillen);
                        // Einzahlcheck
                        String einMehrzahlMessingBrillen = getString(R.string.str_gb_kupferschmelze);
                        if (Integer.valueOf(detailMessingBrillen.substring(0, detailMessingBrillen.indexOf("x"))) > 1)
                            einMehrzahlMessingBrillen = getString(R.string.str_gb_kupferschmelzen);
                        detailMessingBrillen = detailMessingBrillen.substring(0, detailMessingBrillen.indexOf("x")+2) + einMehrzahlMessingBrillen + detailMessingBrillen.substring(detailMessingBrillen.indexOf("x")+1);

                        // Indirektes Vorprodukt1 (Kupfer von Messing)
                        double ausl_kupferschmelze = berechneAuslastung(verbrauchsrechner.getVerbr_per_tick_brillen(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_messing()));
                        final double verbr_per_tick_kupferschmelze = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_messing()) * ausl_kupferschmelze) / 100;
                        detailKupfererzBrillen = berechne(verbr_per_tick_kupferschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kupfererz()));
                        kupfermineBrillen.setAnzahlAuslastung(detailKupfererzBrillen);
                        // Einzahlcheck
                        String einMehrzahlKupfererzBrillen = getString(R.string.str_gb_kupfermine);
                        if (Integer.valueOf(detailKupfererzBrillen.substring(0, detailKupfererzBrillen.indexOf("x"))) > 1)
                            einMehrzahlKupfererzBrillen = getString(R.string.str_gb_kupferminen);
                        detailKupfererzBrillen = detailKupfererzBrillen.substring(0, detailKupfererzBrillen.indexOf("x")+2) + einMehrzahlKupfererzBrillen + detailKupfererzBrillen.substring(detailKupfererzBrillen.indexOf("x")+1);

                        // Indirektes Vorprodukt2 (Kohle von Messing)
                        detailKohleBrillen = berechne(verbr_per_tick_kupferschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()));
                        koehlerhuetteBrillen.setAnzahlAuslastung(detailKohleBrillen);
                        // Einzahlcheck
                        String einMehrzahlKohleBrillen = getString(R.string.str_gb_koehlerhuette);
                        if (Integer.valueOf(detailKohleBrillen.substring(0, detailKohleBrillen.indexOf("x"))) > 1)
                            einMehrzahlKohleBrillen = getString(R.string.str_gb_koehlerhuetten);
                        detailKohleBrillen = detailKohleBrillen.substring(0, detailKohleBrillen.indexOf("x")+2) + einMehrzahlKohleBrillen + detailKohleBrillen.substring(detailKohleBrillen.indexOf("x")+1);

                        // Indirektes Vorprodukt3 (Holz von Kohle)
                        double ausl_koehlerhuetten = berechneAuslastung(verbr_per_tick_kupferschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()));
                        final double verbr_per_tick_koehlerhuetten = ((verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle()) * ausl_koehlerhuetten) / 100;
                        detailHolzBrillen = berechne(verbr_per_tick_koehlerhuetten, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_holz()));
                        holzfaellerBrillen.setAnzahlAuslastung(detailHolzBrillen);
                        // Einzahlcheck
                        String einMehrzahlHolzBrillen = getString(R.string.str_gb_holzfaeller);
                        if (Integer.valueOf(detailHolzBrillen.substring(0, detailHolzBrillen.indexOf("x"))) > 1)
                            einMehrzahlHolzBrillen = getString(R.string.str_gb_holzfaeller_mehrzahl);
                        detailHolzBrillen = detailHolzBrillen.substring(0, detailHolzBrillen.indexOf("x")+2) + einMehrzahlHolzBrillen + detailHolzBrillen.substring(detailHolzBrillen.indexOf("x")+1);

                        // OnClickListener
                        btn_verbr_brillen.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Verbrauch erneut berechnen
                                brillenmacherBrillen.setAnzahlAuslastung(String.valueOf(anzahl_brillenmacher) + "x (" + verbrauchsrechner.getAuslastung_brillen() + "%)");
                                quarzbruchBrillen.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_brillen(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_quarz())));
                                kupferschmelzeBrillen.setAnzahlAuslastung(berechne(verbrauchsrechner.getVerbr_per_tick_brillen(), (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_messing())));
                                kupfermineBrillen.setAnzahlAuslastung(berechne(verbr_per_tick_kupferschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kupfererz())));
                                koehlerhuetteBrillen.setAnzahlAuslastung(berechne(verbr_per_tick_kupferschmelze, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_kohle())));
                                holzfaellerBrillen.setAnzahlAuslastung(berechne(verbr_per_tick_koehlerhuetten, (verbrauchsrechner.getDauer_tick() / verbrauchsrechner.getProd_time_holz())));
                                // Verpacken aller Gebäude
                                Gebaeude[] alleGebaeude = {holzfaellerBrillen, koehlerhuetteBrillen, kupfermineBrillen, kupferschmelzeBrillen, quarzbruchBrillen, brillenmacherBrillen};
                                // Dialog erstellen
                                dialogersteller.erstelleDialog(getString(R.string.str_pr_brillen), alleGebaeude);
                            }
                        });
                        ll_brillen.setVisibility(View.VISIBLE);
                    }

                    // Daten in Views setzen
                    tv_details_fisch.setText(detailFisch);
                    tv_details_weizenBrot.setText(detailWeizenBrot);
                    tv_details_mehl.setText(detailMehl);
                    tv_details_brot.setText(detailBrot);
                    tv_details_holzFleisch.setText(detailHolzFleisch);
                    tv_details_kohleFleisch.setText(detailKohleFleisch);
                    tv_details_soleFleisch.setText(detailSoleFleisch);
                    tv_details_salzFleisch.setText(detailSalzFleisch);
                    tv_details_vieh.setText(detailVieh);
                    tv_details_fleisch.setText(detailFleisch);
                    tv_details_milch.setText(detailMilch);
                    tv_details_aepfel.setText(detailAepfel);
                    tv_details_most.setText(detailMost);
                    tv_details_weizenBier.setText(detailWeizenBier);
                    tv_details_kraeuter.setText(detailKraeuter);
                    tv_details_bier.setText(detailBier);
                    tv_details_holzWein.setText(detailHolzWein);
                    tv_details_kohleWein.setText(detailKohleWein);
                    tv_details_eisenerzWein.setText(detailEisenerzWein);
                    tv_details_eisenWein.setText(detailEisenWein);
                    tv_details_faesser.setText(detailFaesser);
                    tv_details_trauben.setText(detailTrauben);
                    tv_details_wein.setText(detailWein);
                    tv_details_wolle.setText(detailWolle);
                    tv_details_wollgewaender.setText(detailWollgewaender);
                    tv_details_hanfLeinengewaender.setText(detailHanfLeinengewaender);
                    tv_details_leinengewaender.setText(detailLeinengewaender);
                    tv_details_holzLederwaemser.setText(detailHolzLederwaemser);
                    tv_details_kohleLederwaemser.setText(detailKohleLederwaemser);
                    tv_details_soleLederwaemser.setText(detailSoleLederwaemser);
                    tv_details_salzLederwaemser.setText(detailSalzLederwaemser);
                    tv_details_tierhaeute.setText(detailTierhaeute);
                    tv_details_lederwaemser.setText(detailLederwaemser);
                    tv_details_pelze.setText(detailPelze);
                    tv_details_pelzmaentel.setText(detailPelzmaentel);
                    tv_details_holzBrokatgewaender.setText(detailHolzBrokatgewaender);
                    tv_details_kohleBrokatgewaender.setText(detailKohleBrokatgewaender);
                    tv_details_golderzBrokatgewaender.setText(detailGolderz);
                    tv_details_goldBrokatgewaender.setText(detailGold);
                    tv_details_brokatgewaender.setText(detailBrokatgewaender);
                    tv_details_holzBuecher.setText(detailHolzBuecher);
                    tv_details_papier.setText(detailPapier);
                    tv_details_buecher.setText(detailBuecher);
                    tv_details_holzKerzenleuchter.setText(detailHolzKerzenleuchter);
                    tv_details_kohleKerzenleuchter.setText(detailHolzKerzenleuchter);
                    tv_details_kupfererzKerzenleuchter.setText(detailKupfererzKerzenleuchter);
                    tv_details_messingKerzenleuchter.setText(detailMessingKerzenleuchter);
                    tv_details_hanfKerzenleuchter.setText(detailHanfKerzenleuchter);
                    tv_details_bienenwachsKerzenleuchter.setText(detailBienenwachs);
                    tv_details_kerzenKerzenleuchter.setText(detailKerzen);
                    tv_details_kerzenleuchter.setText(detailKerzenleuchter);
                    tv_details_holzBrillen.setText(detailHolzBrillen);
                    tv_details_kohleBrillen.setText(detailKohleBrillen);
                    tv_details_kupfererzBrillen.setText(detailKupfererzBrillen);
                    tv_details_messingBrillen.setText(detailMessingBrillen);
                    tv_details_quarzBrillen.setText(detailQuarz);
                    tv_details_brillen.setText(detailBrillen);

                    // Detailview sichtbar machen
                    if (detailView){
                        // Sichtbar machen
                        tblr_trennbalken1.setVisibility(View.VISIBLE);
                        tblr_nahrung1.setVisibility(View.VISIBLE);
                        tblr_getraenke1.setVisibility(View.VISIBLE);
                        tblr_kleidung1.setVisibility(View.VISIBLE);
                        tblr_besitz1.setVisibility(View.VISIBLE);
                    }
                    else{
                        // Sichtbar machen
                        tblr_trennbalken2.setVisibility(View.VISIBLE);
                        tblr_nahrung.setVisibility(View.VISIBLE);
                        tblr_getraenke.setVisibility(View.VISIBLE);
                        tblr_kleidung.setVisibility(View.VISIBLE);
                        tblr_besitz.setVisibility(View.VISIBLE);
                    }

                    // Keine Getraenkegebaeude
                    if (anzahl_ziegenfarmen == 0 && anzahl_mosthoefe == 0 && anzahl_klosterbrauereien == 0 && anzahl_keltereien == 0){
                        tblr_getraenke1.setVisibility(View.GONE);
                    }
                    // Keine Kleidungsgebaeude
                    if (anzahl_spinnereien == 0 && anzahl_webereien == 0 && anzahl_gerbereien == 0 && anzahl_kuerschner == 0 && anzahl_seidenwebereien == 0){
                        tblr_kleidung1.setVisibility(View.GONE);
                    }
                    // Keine Besitzgebaeude
                    if (anzahl_druckereien == 0 && anzahl_feinschmieden == 0 && anzahl_brillenmacher == 0){
                        tblr_besitz1.setVisibility(View.GONE);
                    }

                    // Fokus entfernen
                    txt_bauer.clearFocus();
                    txt_handwerker.clearFocus();
                    txt_kaufmann.clearFocus();
                    txt_adliger.clearFocus();
                } else {
                    // ToggleButton deaktivieren
                    togglebtn_detailView.setEnabled(false);
                    // Unsichtbar machen
                    tblr_trennbalken1.setVisibility(View.GONE);
                    tblr_nahrung1.setVisibility(View.GONE);
                    tblr_getraenke1.setVisibility(View.GONE);
                    tblr_kleidung1.setVisibility(View.GONE);
                    tblr_besitz1.setVisibility(View.GONE);
                    tblr_trennbalken2.setVisibility(View.GONE);
                    tblr_nahrung.setVisibility(View.GONE);
                    tblr_getraenke.setVisibility(View.GONE);
                    tblr_kleidung.setVisibility(View.GONE);
                    tblr_besitz.setVisibility(View.GONE);
                    // Buttontexte leeren
                    btn_verbr_fisch.setText("?");
                    btn_verbr_brot.setText("?");
                    btn_verbr_fleisch.setText("?");
                    btn_verbr_milch.setText("?");
                    btn_verbr_most.setText("?");
                    btn_verbr_bier.setText("?");
                    btn_verbr_wein.setText("?");
                    btn_verbr_wollgewaender.setText("?");
                    btn_verbr_leinengewaender.setText("?");
                    btn_verbr_lederwaemser.setText("?");
                    btn_verbr_pelzmaentel.setText("?");
                    btn_verbr_brokatgewaender.setText("?");
                    btn_verbr_buecher.setText("?");
                    btn_verbr_kerzenhalter.setText("?");
                    btn_verbr_brillen.setText("?");

                    // Toast anzeigen mit Fehlermeldung
                    makeShortToast(getString(R.string.str_falsche_eingabe));
                }
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        // Eingegebene Daten speichern
        saveInputData();
    }

    // Speichern der eingegebenen Daten der Textfelder für spätere Wiederverwendung
    private void saveInputData() {
        EditText txt_bauer = (EditText) rootView.findViewById(R.id.txt_bauer);
        EditText txt_handwerker = (EditText) rootView.findViewById(R.id.txt_handwerker);
        EditText txt_kaufmann = (EditText) rootView.findViewById(R.id.txt_kaufmann);
        EditText txt_adliger = (EditText) rootView.findViewById(R.id.txt_adliger);
        String anzahlBauern = txt_bauer.getText().toString();
        String anzahlHandwerker = txt_handwerker.getText().toString();
        String anzahlKaufleute = txt_kaufmann.getText().toString();
        String anzahlAdlige = txt_adliger.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(bauern, anzahlBauern);
        editor.putString(handwerker, anzahlHandwerker);
        editor.putString(kaufleute, anzahlKaufleute);
        editor.putString(adlige, anzahlAdlige);
        editor.putBoolean(prefDetailView, detailView);
        editor.apply();
    }

    // Berechnen der Auslastung eines Gebäudes im Verhältnis zu dessen übergeordnetem Gebäude (z.B. von Holz zu Kohle)
    private double berechneAuslastung(double verbr_per_tick_endgut, double prod_per_tick_vorgut) {
        // Variablen deklarieren
        return (verbr_per_tick_endgut / prod_per_tick_vorgut) * 100;
    }

    // Berechnen der Anzahl sowie Auslastung eines Geb�udes
    private String berechne(double verbr_per_tick_endgut, double prod_per_tick_vorgut) {
        // Variablen deklarieren
        String anzahl_auslastung_gb;
        int anzahl_gb;
        double auslastung_gb;
        double auslastung_pro_gb;

        // Werte berechnen
        auslastung_gb = (verbr_per_tick_endgut / prod_per_tick_vorgut) * 100;
        anzahl_gb = (int) Math.ceil(verbr_per_tick_endgut / prod_per_tick_vorgut);
        auslastung_pro_gb = auslastung_gb / anzahl_gb;
        String s = String.valueOf(auslastung_pro_gb);
        float auslastung_pro_gb_rounded = Float.parseFloat(s.substring(0, s.lastIndexOf('.') + 2));
        String s2 = String.valueOf(auslastung_pro_gb_rounded);
        if (s2.substring(s2.length() - 1).equals("0")) {
            s2 = s2.substring(0, s2.lastIndexOf('.'));
        }
        anzahl_auslastung_gb = anzahl_gb + "x (" + s2 + "%)";
        return anzahl_auslastung_gb;
    }

    // Anzeigen eines Toasts
    private void makeShortToast(String data) {
        Toast.makeText(getActivity().getApplicationContext(), data, Toast.LENGTH_SHORT).show();
    }
}
