package com.iusemybrain.apps.myannoonline;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.iusemybrain.apps.myannoonline.dialogcontent.Gebaeude;

/**
 * Created by Markus on 02.04.2015.
 */
public class FragGebaeude extends Fragment {
    private View rootView;
    static int LAENGE_GEBAEUDEBEZEICHNUNG = 13;
    static int ANZAHL_LINES = 2;
    private Dialogersteller dialogersteller;
    private Gebaeudeersteller gebaeudeersteller;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.layout_gebaeude, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Neuen Dialogersteller
        dialogersteller = new Dialogersteller(getActivity());
        // Neuer Geb�udeersteller
        gebaeudeersteller = new Gebaeudeersteller(getActivity());
        // Alle Gebäude erstellen
        gebaeudeersteller.erstelleAlleGebaeude();

        /* INFRASTRUKTUR */
        // Kontor
        ImageButton btn_gb_kontor = (ImageButton) rootView.findViewById(R.id.btn_gb_kontor);
        btn_gb_kontor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude kontorLvl1 = gebaeudeersteller.getGebaeudeKontorLvl1();
            	Gebaeude kontorLvl2 = gebaeudeersteller.getGebaeudeKontorLvl2();
            	Gebaeude kontorLvl3 = gebaeudeersteller.getGebaeudeKontorLvl3();
            	Gebaeude kontorLvl4 = gebaeudeersteller.getGebaeudeKontorLvl4();
            	Gebaeude[] alleGebaeude = {kontorLvl1, kontorLvl2, kontorLvl3, kontorLvl4};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_kontor), alleGebaeude);
            }
        });

        // Lagerhaus
        ImageButton btn_gb_lagerhaus = (ImageButton) rootView.findViewById(R.id.btn_gb_lagerhaus);
        btn_gb_lagerhaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude lagerhausLvl1 = gebaeudeersteller.getGebaeudeLagerhausLvl1();
            	Gebaeude lagerhausLvl2 = gebaeudeersteller.getGebaeudeLagerhausLvl2();
            	Gebaeude lagerhausLvl3 = gebaeudeersteller.getGebaeudeLagerhausLvl3();
            	Gebaeude lagerhausLvl4 = gebaeudeersteller.getGebaeudeLagerhausLvl4();
            	Gebaeude lagerhausLvl5 = gebaeudeersteller.getGebaeudeLagerhausLvl5();
            	Gebaeude lagerhausLvl6 = gebaeudeersteller.getGebaeudeLagerhausLvl6();
            	Gebaeude lagerhausLvl7 = gebaeudeersteller.getGebaeudeLagerhausLvl7();
            	Gebaeude lagerhausLvl8 = gebaeudeersteller.getGebaeudeLagerhausLvl8();
            	Gebaeude lagerhausLvl9 = gebaeudeersteller.getGebaeudeLagerhausLvl9();
            	Gebaeude[] alleGebaeude = {lagerhausLvl1, lagerhausLvl2, lagerhausLvl3, lagerhausLvl4, lagerhausLvl5, lagerhausLvl6, lagerhausLvl7, lagerhausLvl8, lagerhausLvl9};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_lagerhaus), alleGebaeude);
            }
        });

        // Leuchtturm
        ImageButton btn_gb_leuchtturm = (ImageButton) rootView.findViewById(R.id.btn_gb_leuchtturm);
        btn_gb_leuchtturm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude leuchtturmLvl1 = gebaeudeersteller.getGebaeudeLeuchtturmLvl1();
            	Gebaeude leuchtturmLvl2 = gebaeudeersteller.getGebaeudeLeuchtturmLvl2();
            	Gebaeude leuchtturmLvl3 = gebaeudeersteller.getGebaeudeLeuchtturmLvl3();
            	Gebaeude leuchtturmLvl4 = gebaeudeersteller.getGebaeudeLeuchtturmLvl4();
            	Gebaeude leuchtturmLvl5 = gebaeudeersteller.getGebaeudeLeuchtturmLvl5();
            	Gebaeude leuchtturmLvl6 = gebaeudeersteller.getGebaeudeLeuchtturmLvl6();
            	Gebaeude leuchtturmLvl7 = gebaeudeersteller.getGebaeudeLeuchtturmLvl7();
            	Gebaeude leuchtturmLvl8 = gebaeudeersteller.getGebaeudeLeuchtturmLvl8();
            	Gebaeude leuchtturmLvl9 = gebaeudeersteller.getGebaeudeLeuchtturmLvl9();
            	Gebaeude[] alleGebaeude = {leuchtturmLvl1, leuchtturmLvl2, leuchtturmLvl3, leuchtturmLvl4, leuchtturmLvl5, leuchtturmLvl6, leuchtturmLvl7, leuchtturmLvl8, leuchtturmLvl9};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_leuchtturm), alleGebaeude);
            }
        });

        // Schatzkammer
        ImageButton btn_gb_schatzkammer = (ImageButton) rootView.findViewById(R.id.btn_gb_schatzkammer);
        btn_gb_schatzkammer.setOnClickListener(new View.OnClickListener() {
            @Override
            // 14: Schatzk1-2   15: Schatzk3-6   16: Schatzk7-10
            public void onClick(View v) {
            	Gebaeude schatzkammerLvl1 = gebaeudeersteller.getGebaeudeSchatzkammerLvl1();
            	Gebaeude schatzkammerLvl2 = gebaeudeersteller.getGebaeudeSchatzkammerLvl2();
            	Gebaeude schatzkammerLvl3 = gebaeudeersteller.getGebaeudeSchatzkammerLvl3();
            	Gebaeude schatzkammerLvl4 = gebaeudeersteller.getGebaeudeSchatzkammerLvl4();
            	Gebaeude schatzkammerLvl5 = gebaeudeersteller.getGebaeudeSchatzkammerLvl5();
            	Gebaeude schatzkammerLvl6 = gebaeudeersteller.getGebaeudeSchatzkammerLvl6();
            	Gebaeude schatzkammerLvl7 = gebaeudeersteller.getGebaeudeSchatzkammerLvl7();
            	Gebaeude schatzkammerLvl8 = gebaeudeersteller.getGebaeudeSchatzkammerLvl8();
            	Gebaeude schatzkammerLvl9 = gebaeudeersteller.getGebaeudeSchatzkammerLvl9();
            	Gebaeude schatzkammerLvl10 = gebaeudeersteller.getGebaeudeSchatzkammerLvl10();
            	Gebaeude[] alleGebaeude = {schatzkammerLvl1, schatzkammerLvl2, schatzkammerLvl3, schatzkammerLvl4, schatzkammerLvl5, schatzkammerLvl6, schatzkammerLvl7, schatzkammerLvl8, schatzkammerLvl9, schatzkammerLvl10};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_leuchtturm), alleGebaeude);
            }
        });

        // Bauernhaus
        ImageButton btn_gb_bauernhaus = (ImageButton) rootView.findViewById(R.id.btn_gb_bauernhaus);
        btn_gb_bauernhaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeBauernhaus()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_bauernhaus), alleGebaeude);
            }
        });

        // Handwerkerkate
        ImageButton btn_gb_buergerhaus = (ImageButton) rootView.findViewById(R.id.btn_gb_buergerhaus);
        btn_gb_buergerhaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeHandwerkerkate()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_handwerkerkate), alleGebaeude);
            }
        });

        // Kaufmannshaus
        ImageButton btn_gb_patrizierhaus = (ImageButton) rootView.findViewById(R.id.btn_gb_patrizierhaus);
        btn_gb_patrizierhaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeKaufmannshaus()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_kaufmannshaus), alleGebaeude);
            }
        });

        // Adligenhaus
        ImageButton btn_gb_adligenhaus = (ImageButton) rootView.findViewById(R.id.btn_gb_adligenhaus);
        btn_gb_adligenhaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeAdligenhaus()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_adligenhaus), alleGebaeude);
            }
        });

        // Feldweg
        ImageButton btn_gb_weg = (ImageButton) rootView.findViewById(R.id.btn_gb_weg);
        btn_gb_weg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeFeldweg()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_feldweg), alleGebaeude);
            }
        });

        // Steinstraße
        ImageButton btn_gb_strasse = (ImageButton) rootView.findViewById(R.id.btn_gb_strasse);
        btn_gb_strasse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeSteinstrasse()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_steinstrasse), alleGebaeude);
            }
        });

        // Marktplatz
        ImageButton btn_gb_marktplatz = (ImageButton) rootView.findViewById(R.id.btn_gb_marktplatz);
        btn_gb_marktplatz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude marktplatzLvl1 = gebaeudeersteller.getGebaeudeMarktplatzKlein();
            	Gebaeude marktplatzLvl2 = gebaeudeersteller.getGebaeudeMarktplatzMittelgross();
            	Gebaeude marktplatzLvl3 = gebaeudeersteller.getGebaeudeMarktplatzGross();
            	Gebaeude marktplatzLvl4 = gebaeudeersteller.getGebaeudeMarktplatzRiesig();
            	Gebaeude[] alleGebaeude = {marktplatzLvl1, marktplatzLvl2, marktplatzLvl3, marktplatzLvl4};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_marktplatz), alleGebaeude);
            }
        });

        // Markthaus
        ImageButton btn_gb_markthaus = (ImageButton) rootView.findViewById(R.id.btn_gb_markthaus);
        btn_gb_markthaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude markthausLvl1 = gebaeudeersteller.getGebaeudeMarkthausLvl1();
            	Gebaeude markthausLvl2 = gebaeudeersteller.getGebaeudeMarkthausLvl2();
            	Gebaeude markthausLvl3 = gebaeudeersteller.getGebaeudeMarkthausLvl3();
            	Gebaeude markthausLvl4 = gebaeudeersteller.getGebaeudeMarkthausLvl4();
            	Gebaeude[] alleGebaeude = {markthausLvl1, markthausLvl2, markthausLvl3, markthausLvl4};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_markthaus), alleGebaeude);
            }
        });

        // Werft
        ImageButton btn_gb_werft = (ImageButton) rootView.findViewById(R.id.btn_gb_werft);
        btn_gb_werft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeWerft()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_werft), alleGebaeude);
            }
        });

        // Schiffsbauer
        ImageButton btn_gb_schiffsbauer = (ImageButton) rootView.findViewById(R.id.btn_gb_schiffsbauer);
        btn_gb_schiffsbauer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeSchiffsbauer()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_schiffsbauer), alleGebaeude);
            }
        });

        // Proviantmagazin
        ImageButton btn_gb_proviantmagazin = (ImageButton) rootView.findViewById(R.id.btn_gb_proviantmagazin);
        btn_gb_proviantmagazin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeProviantmagazin()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_proviantmagazin), alleGebaeude);
            }
        });

        // Dock
        ImageButton btn_gb_dock = (ImageButton) rootView.findViewById(R.id.btn_gb_dock);
        btn_gb_dock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeDock()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_dock), alleGebaeude);
            }
        });

        // Gildenhalle
        ImageButton btn_gb_gildenhalle = (ImageButton) rootView.findViewById(R.id.btn_gb_gildenhalle);
        btn_gb_gildenhalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeGildenhalle()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_gildenhalle), alleGebaeude);
            }
        });

        // Pier
        ImageButton btn_gb_pier = (ImageButton) rootView.findViewById(R.id.btn_gb_pier);
        btn_gb_pier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude pierLvl1 = gebaeudeersteller.getGebaeudePierLvl1();
            	Gebaeude pierLvl2 = gebaeudeersteller.getGebaeudePierLvl2();
            	Gebaeude pierLvl3 = gebaeudeersteller.getGebaeudePierLvl3();
            	Gebaeude[] alleGebaeude = {pierLvl1, pierLvl2, pierLvl3};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_pier), alleGebaeude);
            }
        });

        // Handelsspeicher
        ImageButton btn_gb_handelsspeicher = (ImageButton) rootView.findViewById(R.id.btn_gb_handelsspeicher);
        btn_gb_handelsspeicher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeHandelsspeicher()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_handelsspeicher), alleGebaeude);
            }
        });

        /* ATTRAKTIONEN */
        // Brunnen
        ImageButton btn_gb_brunnen = (ImageButton) rootView.findViewById(R.id.btn_gb_brunnen);
        btn_gb_brunnen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeBrunnen()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_brunnen), alleGebaeude);
            }
        });

        // Zimmermann
        ImageButton btn_gb_zimmermann = (ImageButton) rootView.findViewById(R.id.btn_gb_zimmermann);
        btn_gb_zimmermann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeZimmermann()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_zimmermann), alleGebaeude);
            }
        });

        // Kapelle
        ImageButton btn_gb_kapelle = (ImageButton) rootView.findViewById(R.id.btn_gb_kapelle);
        btn_gb_kapelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeKapelle()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_kapelle), alleGebaeude);
            }
        });

        // Barbier
        ImageButton btn_gb_barbier = (ImageButton) rootView.findViewById(R.id.btn_gb_barbier);
        btn_gb_barbier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeBarbier()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_barbier), alleGebaeude);
            }
        });

        // Taverne
        ImageButton btn_gb_taverne = (ImageButton) rootView.findViewById(R.id.btn_gb_taverne);
        btn_gb_taverne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeTaverne()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_taverne), alleGebaeude);
            }
        });

        // Feuerwache
        ImageButton btn_gb_feuerwache = (ImageButton) rootView.findViewById(R.id.btn_gb_feuerwache);
        btn_gb_feuerwache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeFeuerwache()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_feuerwache), alleGebaeude);
            }
        });

        // Turnierplatz
        ImageButton btn_gb_turnierplatz = (ImageButton) rootView.findViewById(R.id.btn_gb_turnierplatz);
        btn_gb_turnierplatz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeTurnierplatz()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_turnierplatz), alleGebaeude);
            }
        });

        // Schuldturm
        ImageButton btn_gb_schuldturm = (ImageButton) rootView.findViewById(R.id.btn_gb_schuldturm);
        btn_gb_schuldturm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeSchuldturm()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_schuldturm), alleGebaeude);
            }
        });

        // Kirche
        ImageButton btn_gb_kirche = (ImageButton) rootView.findViewById(R.id.btn_gb_kirche);
        btn_gb_kirche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeKirche()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_kirche), alleGebaeude);
            }
        });

        // Medikus
        ImageButton btn_gb_medikus = (ImageButton) rootView.findViewById(R.id.btn_gb_medikus);
        btn_gb_medikus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeMedikus()};
            	dialogersteller.erstelleDialog(getString(R.string.str_gb_medikus), alleGebaeude);
            }
        });

        /* BAUMATERIAL */
        // Holzfällerhütte
        ImageButton btn_gb_holzfaeller = (ImageButton) rootView.findViewById(R.id.btn_gb_holzfaeller);
        btn_gb_holzfaeller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeHolzfaeller()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_holzfaeller), alleGebaeude);
            }
        });

        // Steinmetz
        ImageButton btn_gb_steinbruch = (ImageButton) rootView.findViewById(R.id.btn_gb_steinbruch);
        btn_gb_steinbruch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeSteinbruch()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_steinbruch), alleGebaeude);
            }
        });

        // Eisenmine
        ImageButton btn_gb_eisenmine = (ImageButton) rootView.findViewById(R.id.btn_gb_eisenmine);
        btn_gb_eisenmine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeEisenmine()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_eisenmine), alleGebaeude);
            }
        });

        // Köhlerhütte
        ImageButton btn_gb_koehlerhuette = (ImageButton) rootView.findViewById(R.id.btn_gb_koehlerhuette);
        btn_gb_koehlerhuette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeKoehlerhuette()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_koehlerhuette), alleGebaeude);
            }
        });

        // Kohlebergwerk
        ImageButton btn_gb_kohlebergwerk = (ImageButton) rootView.findViewById(R.id.btn_gb_kohlebergwerk);
        btn_gb_kohlebergwerk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeKohlebergwerk()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_kohlebergwerk), alleGebaeude);
            }
        });

        // Eisenschmelze
        ImageButton btn_gb_eisenschmelze = (ImageButton) rootView.findViewById(R.id.btn_gb_eisenschmelze);
        btn_gb_eisenschmelze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeEisenschmelze()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_eisenschmelze), alleGebaeude);
            }
        });

        // Werkzeugmacher
        ImageButton btn_gb_werkzeugmacher = (ImageButton) rootView.findViewById(R.id.btn_gb_werkzeugmacher);
        btn_gb_werkzeugmacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeWerkzeugmacher()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_werkzeugmacher), alleGebaeude);
            }
        });

        // Waldglashütte
        ImageButton btn_gb_waldglashuette = (ImageButton) rootView.findViewById(R.id.btn_gb_waldglashuette);
        btn_gb_waldglashuette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeWaldglashuette()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_waldglashuette), alleGebaeude);
            }
        });

        // Quarzbruch
        ImageButton btn_gb_quarzbruch = (ImageButton) rootView.findViewById(R.id.btn_gb_quarzbruch);
        btn_gb_quarzbruch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeQuarzbruch()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_quarzbruch), alleGebaeude);
            }
        });

        // Glasschmelze
        ImageButton btn_gb_glasschmelze = (ImageButton) rootView.findViewById(R.id.btn_gb_glasschmelze);
        btn_gb_glasschmelze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeGlasschmelze()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_glasschmelze), alleGebaeude);
            }
        });

        /* NAHRUNG */
        // Fischerhütte
        ImageButton btn_gb_fischerhuette = (ImageButton) rootView.findViewById(R.id.btn_gb_fischerhuette);
        btn_gb_fischerhuette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeFischer()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_fischer), alleGebaeude);
            }
        });

        // Weizenfarm
        ImageButton btn_gb_weizenfarm = (ImageButton) rootView.findViewById(R.id.btn_gb_weizenfarm);
        btn_gb_weizenfarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeWeizenhof()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_weizenfarm), alleGebaeude);
            }
        });

        // Mühle
        ImageButton btn_gb_muehle = (ImageButton) rootView.findViewById(R.id.btn_gb_muehle);
        btn_gb_muehle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeMuehle()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_muehle), alleGebaeude);
            }
        });

        // Bäckerei
        ImageButton btn_gb_baeckerei = (ImageButton) rootView.findViewById(R.id.btn_gb_baeckerei);
        btn_gb_baeckerei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeBackstube()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_backstube), alleGebaeude);
            }
        });

        // Rinderfarm
        ImageButton btn_gb_rinderfarm = (ImageButton) rootView.findViewById(R.id.btn_gb_rinderfarm);
        btn_gb_rinderfarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeRinderfarm()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_rinderfarm), alleGebaeude);
            }
        });

        // Salzstock
        ImageButton btn_gb_salzstock = (ImageButton) rootView.findViewById(R.id.btn_gb_salzstock);
        btn_gb_salzstock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeSalzstock()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_salzstock), alleGebaeude);
            }
        });

        // Saline
        ImageButton btn_gb_saline = (ImageButton) rootView.findViewById(R.id.btn_gb_saline);
        btn_gb_saline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeSaline()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_saline), alleGebaeude);
            }
        });

        // Metzgerei
        ImageButton btn_gb_metzgerei = (ImageButton) rootView.findViewById(R.id.btn_gb_metzgerei);
        btn_gb_metzgerei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeMetzger()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_glasschmelze), alleGebaeude);
            }
        });

        /* GETRÄNKE */
        // Ziegenfarm
        ImageButton btn_gb_ziegenfarm = (ImageButton) rootView.findViewById(R.id.btn_gb_ziegenfarm);
        btn_gb_ziegenfarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeZiegenfarm()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_ziegenfarm), alleGebaeude);
            }
        });

        // Apfelhof
        ImageButton btn_gb_apfelhof = (ImageButton) rootView.findViewById(R.id.btn_gb_apfelhof);
        btn_gb_apfelhof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeApfelhof()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_apfelhof), alleGebaeude);
            }
        });

        // Mosthof
        ImageButton btn_gb_mosthof = (ImageButton) rootView.findViewById(R.id.btn_gb_mosthof);
        btn_gb_mosthof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeMosthof()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_mosthof), alleGebaeude);
            }
        });

        // Klostergarten
        ImageButton btn_gb_klostergarten = (ImageButton) rootView.findViewById(R.id.btn_gb_klostergarten);
        btn_gb_klostergarten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeKlostergarten()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_klostergarten), alleGebaeude);
            }
        });

        // Klosterbrauerei
        ImageButton btn_gb_klosterbrauerei = (ImageButton) rootView.findViewById(R.id.btn_gb_klosterbrauerei);
        btn_gb_klosterbrauerei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeKlosterbrauerei()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_klosterbrauerei), alleGebaeude);
            }
        });

        // Weingut
        ImageButton btn_gb_weingut = (ImageButton) rootView.findViewById(R.id.btn_gb_weingut);
        btn_gb_weingut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeWeingut()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_weingut), alleGebaeude);
            }
        });

        // Fassküferei
        ImageButton btn_gb_fasskueferei = (ImageButton) rootView.findViewById(R.id.btn_gb_fasskueferei);
        btn_gb_fasskueferei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeFasskueferei()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_fasskueferei), alleGebaeude);
            }
        });

        // Kelterei
        ImageButton btn_gb_kelterei = (ImageButton) rootView.findViewById(R.id.btn_gb_kelterei);
        btn_gb_kelterei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeKelterei()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_kelterei), alleGebaeude);
            }
        });

        // Schaffarm
        ImageButton btn_gb_schaffarm = (ImageButton) rootView.findViewById(R.id.btn_gb_schaffarm);
        btn_gb_schaffarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeSchaffarm()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_schaffarm), alleGebaeude);
            }
        });

        // Spinnerei
        ImageButton btn_gb_spinnerei = (ImageButton) rootView.findViewById(R.id.btn_gb_spinnerei);
        btn_gb_spinnerei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeSpinnerei()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_spinnerei), alleGebaeude);
            }
        });

        // Hanfplantage
        ImageButton btn_gb_hanfplantage = (ImageButton) rootView.findViewById(R.id.btn_gb_hanfplantage);
        btn_gb_hanfplantage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeHanfplantage()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_hanfplantage), alleGebaeude);
            }
        });

        // Webstube
        ImageButton btn_gb_webstube = (ImageButton) rootView.findViewById(R.id.btn_gb_webstube);
        btn_gb_webstube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeWebstube()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_webstube), alleGebaeude);
            }
        });

        // Schweinefarm
        ImageButton btn_gb_schweinefarm = (ImageButton) rootView.findViewById(R.id.btn_gb_schweinefarm);
        btn_gb_schweinefarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeSchweinefarm()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_schweinefarm), alleGebaeude);
            }
        });

        // Gerberei
        ImageButton btn_gb_gerberei = (ImageButton) rootView.findViewById(R.id.btn_gb_gerberei);
        btn_gb_gerberei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeGerberei()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_gerberei), alleGebaeude);
            }
        });

        // Pelztierjäger
        ImageButton btn_gb_pelztierjaeger = (ImageButton) rootView.findViewById(R.id.btn_gb_pelztierjaeger);
        btn_gb_pelztierjaeger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudePelztierjaeger()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_pelztierjaeger), alleGebaeude);
            }
        });

        // Kürschner
        ImageButton btn_gb_kuerschner = (ImageButton) rootView.findViewById(R.id.btn_gb_kuerschner);
        btn_gb_kuerschner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeKuerschnerei()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_kuerschner), alleGebaeude);
            }
        });

        // Goldmine
        ImageButton btn_gb_goldmine = (ImageButton) rootView.findViewById(R.id.btn_gb_goldmine);
        btn_gb_goldmine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeGoldmine()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_goldmine), alleGebaeude);
            }
        });

        // Goldschmelze
        ImageButton btn_gb_goldschmelze = (ImageButton) rootView.findViewById(R.id.btn_gb_goldschmelze);
        btn_gb_goldschmelze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeGoldschmelze()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_goldschmelze), alleGebaeude);
            }
        });

        // Seidenweberei
        ImageButton btn_gb_seidenweberei = (ImageButton) rootView.findViewById(R.id.btn_gb_seidenweberei);
        btn_gb_seidenweberei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeSeidenweberei()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_seidenweberei), alleGebaeude);
            }
        });

        // Papiermühle
        ImageButton btn_gb_papiermuehle = (ImageButton) rootView.findViewById(R.id.btn_gb_papiermuehle);
        btn_gb_papiermuehle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudePapiermuehle()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_papiermuehle), alleGebaeude);
            }
        });

        // Druckerei
        ImageButton btn_gb_druckerei = (ImageButton) rootView.findViewById(R.id.btn_gb_druckerei);
        btn_gb_druckerei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeDruckerei()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_druckerei), alleGebaeude);
            }
        });

        // Imkerei
        ImageButton btn_gb_imkerei = (ImageButton) rootView.findViewById(R.id.btn_gb_imkerei);
        btn_gb_imkerei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeImker()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_seidenweberei), alleGebaeude);
            }
        });

        // Lichtzieher
        ImageButton btn_gb_lichtzieher = (ImageButton) rootView.findViewById(R.id.btn_gb_lichtzieher);
        btn_gb_lichtzieher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeLichtzieher()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_lichtzieher), alleGebaeude);
            }
        });

        // Feinschmiede
        ImageButton btn_gb_feinschmiede = (ImageButton) rootView.findViewById(R.id.btn_gb_feinschmiede);
        btn_gb_feinschmiede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeFeinschmiede()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_feinschmiede), alleGebaeude);
            }
        });

        // Kupfermine
        ImageButton btn_gb_kupfermine = (ImageButton) rootView.findViewById(R.id.btn_gb_kupfermine);
        btn_gb_kupfermine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeKupfermine()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_kupfermine), alleGebaeude);
            }
        });

        // Kupferschmelze
        ImageButton btn_gb_kupferschmelze = (ImageButton) rootView.findViewById(R.id.btn_gb_kupferschmelze);
        btn_gb_kupferschmelze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeKupferschmelze()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_kupferschmelze), alleGebaeude);
            }
        });

        // Brillenmacher
        ImageButton btn_gb_brillenmacher = (ImageButton) rootView.findViewById(R.id.btn_gb_brillenmacher);
        btn_gb_brillenmacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeBrillenmacher()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_brillenmacher), alleGebaeude);
            }
        });

        /* SHOP */
        // Tiefer Steinmetz
        ImageButton btn_gb_tiefer_steinmetz = (ImageButton) rootView.findViewById(R.id.btn_gb_tiefer_steinmetz);
        btn_gb_tiefer_steinmetz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeTieferSteinmetz()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_tiefer_steinmetz), alleGebaeude);
            }
        });

        // Tiefe Eisenmine
        ImageButton btn_gb_tiefe_eisenmine = (ImageButton) rootView.findViewById(R.id.btn_gb_tiefe_eisenmine);
        btn_gb_tiefe_eisenmine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeTiefeEisenmine()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_tiefe_eisenmine), alleGebaeude);
            }
        });

        // Tiefer Quarzbruch
        ImageButton btn_gb_tiefer_quarzbruch = (ImageButton) rootView.findViewById(R.id.btn_gb_tiefer_quarzbruch);
        btn_gb_tiefer_quarzbruch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeTieferQuarzbruch()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_tiefer_quarzbruch), alleGebaeude);
            }
        });

        // Tiefes Kohlebergwerk
        ImageButton btn_gb_tiefes_kohlebergwerk = (ImageButton) rootView.findViewById(R.id.btn_gb_tiefes_kohlebergwerk);
        btn_gb_tiefes_kohlebergwerk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeTiefesKohlebergwerk()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_tiefes_kohlebergwerk), alleGebaeude);
            }
        });

        // Tiefer Salzstock
        ImageButton btn_gb_tiefer_salzstock = (ImageButton) rootView.findViewById(R.id.btn_gb_tiefer_salzstock);
        btn_gb_tiefer_salzstock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeTieferSalzstock()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_tiefer_salzstock), alleGebaeude);
            }
        });

        // Tiefer Pelztierjäger
        ImageButton btn_gb_tiefer_pelztierjaeger = (ImageButton) rootView.findViewById(R.id.btn_gb_tiefer_pelztierjaeger);
        btn_gb_tiefer_pelztierjaeger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeTieferPelztierjaeger()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_tiefer_pelztierjäger), alleGebaeude);
            }
        });

        // Tiefe Goldmine
        ImageButton btn_gb_tiefe_goldmine = (ImageButton) rootView.findViewById(R.id.btn_gb_tiefe_goldmine);
        btn_gb_tiefe_goldmine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeTiefeGoldmine()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_tiefe_goldmine), alleGebaeude);
            }
        });

        // Tiefe Kupfermine
        ImageButton btn_gb_tiefe_kupfermine = (ImageButton) rootView.findViewById(R.id.btn_gb_tiefe_kupfermine);
        btn_gb_tiefe_kupfermine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeTiefeKupfermine()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_tiefe_kupfermine), alleGebaeude);
            }
        });

        // Verb. Weizenhof
        ImageButton btn_gb_verb_weizenhof = (ImageButton) rootView.findViewById(R.id.btn_gb_verb_weizenhof);
        btn_gb_verb_weizenhof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeVerbessertenWeizenhof()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_verbesserter_weizenhof), alleGebaeude);
            }
        });

        // Verwun. Mühle
        ImageButton btn_gb_verwun_muehle = (ImageButton) rootView.findViewById(R.id.btn_gb_verwun_muehle);
        btn_gb_verwun_muehle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeVerbesserteMuehle()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_verwunschene_muehle), alleGebaeude);
            }
        });

        // Verwun. Papiermühle
        ImageButton btn_gb_verwun_papiermuehle = (ImageButton) rootView.findViewById(R.id.btn_gb_verwun_papiermuehle);
        btn_gb_verwun_papiermuehle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeVerbessertePapiermuehle()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_verwunschene_papiermuehle), alleGebaeude);
            }
        });

        // Verb. Bäckerei
        ImageButton btn_gb_verb_baeckerei = (ImageButton) rootView.findViewById(R.id.btn_gb_verb_baeckerei);
        btn_gb_verb_baeckerei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeVerbesserteBaeckerei()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_verbesserte_baeckerei), alleGebaeude);
            }
        });

        // Gewürzbasar
        ImageButton btn_gb_gewuerzbasar = (ImageButton) rootView.findViewById(R.id.btn_gb_gewuerzbasar);
        btn_gb_gewuerzbasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeGewuerzbasar()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_gewuerzbasar), alleGebaeude);
            }
        });

        // Scheune
        ImageButton btn_gb_scheune = (ImageButton) rootView.findViewById(R.id.btn_gb_scheune);
        btn_gb_scheune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeScheune()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_scheune), alleGebaeude);
            }
        });

        // Silo
        ImageButton btn_gb_silo = (ImageButton) rootView.findViewById(R.id.btn_gb_silo);
        btn_gb_silo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeSilo()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_silo), alleGebaeude);
            }
        });

        // Museum
        ImageButton btn_gb_museum = (ImageButton) rootView.findViewById(R.id.btn_gb_museum);
        btn_gb_museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeMuseum()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_museum), alleGebaeude);
            }
        });

        // Stadtarchiv
        ImageButton btn_gb_stadtarchiv = (ImageButton) rootView.findViewById(R.id.btn_gb_stadtarchiv);
        btn_gb_stadtarchiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeStadtarchiv()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_stadtarchiv), alleGebaeude);
            }
        });

        // Verb. Marktplatz
        ImageButton btn_gb_verb_marktplatz = (ImageButton) rootView.findViewById(R.id.btn_gb_verb_marktplatz);
        btn_gb_verb_marktplatz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude[] alleGebaeude = {gebaeudeersteller.getGebaeudeVerbesserterMarktplatz()};
                dialogersteller.erstelleDialog(getString(R.string.str_gb_verbesserter_marktplatz), alleGebaeude);
            }
        });
    }
}