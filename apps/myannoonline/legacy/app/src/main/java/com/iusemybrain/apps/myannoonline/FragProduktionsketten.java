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
public class FragProduktionsketten extends Fragment {
    private View rootView;
    static int LAENGE_GEBAEUDEBEZEICHNUNG = 13;
    static int ANZAHL_LINES = 2;
    private Dialogersteller dialogersteller;
    private Gebaeudeersteller gebaeudeersteller;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.layout_produktionsketten, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        dialogersteller = new Dialogersteller(getActivity());
        gebaeudeersteller = new Gebaeudeersteller(getActivity());
        // Alle Produktionsgebäude erstellen
        gebaeudeersteller.erstelleProduktionsgebaeude();

        /* ACTIONLISTENER */
        // Holz
        ImageButton btn_prk_holz = (ImageButton) rootView.findViewById(R.id.btn_prk_holz);
        btn_prk_holz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                Gebaeude[] alleGebaeude = {holzfaeller};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_holz), alleGebaeude);
            }
        });

        // Stein
        ImageButton btn_prk_stein = (ImageButton) rootView.findViewById(R.id.btn_prk_stein);
        btn_prk_stein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude steinbruch = gebaeudeersteller.getGebaeudeSteinbruch();
                Gebaeude[] alleGebaeude = {steinbruch};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_stein), alleGebaeude);
            }
        });

        // Eisenerz
        ImageButton btn_prk_eisenerz = (ImageButton) rootView.findViewById(R.id.btn_prk_eisenerz);
        btn_prk_eisenerz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude eisenmine = gebaeudeersteller.getGebaeudeEisenmine();
                Gebaeude[] alleGebaeude = {eisenmine};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_eisenerz), alleGebaeude);
            }
        });

        // Quarz
        ImageButton btn_prk_quartz = (ImageButton) rootView.findViewById(R.id.btn_prk_quartz);
        btn_prk_quartz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude quarzbruch = gebaeudeersteller.getGebaeudeQuarzbruch();
                Gebaeude[] alleGebaeude = {quarzbruch};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_quarz), alleGebaeude);
            }
        });

        // Fisch
        ImageButton btn_prk_fisch = (ImageButton) rootView.findViewById(R.id.btn_prk_fisch);
        btn_prk_fisch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude fischer = gebaeudeersteller.getGebaeudeFischer();
                Gebaeude[] alleGebaeude = {fischer};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_fisch), alleGebaeude);
            }
        });

        // Weizen
        ImageButton btn_prk_weizen = (ImageButton) rootView.findViewById(R.id.btn_prk_weizen);
        btn_prk_weizen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude weizenfarm = gebaeudeersteller.getGebaeudeWeizenhof();
                Gebaeude[] alleGebaeude = {weizenfarm};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_weizen), alleGebaeude);
            }
        });

        // Gewürze
        ImageButton btn_prk_gewuerze = (ImageButton) rootView.findViewById(R.id.btn_prk_gewuerze);
        btn_prk_gewuerze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude gewuerze = gebaeudeersteller.getGebaeudeGewuerze();
                Gebaeude[] alleGebaeude = {gewuerze};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_gewuerze), alleGebaeude);
            }
        });

        // Vieh
        ImageButton btn_prk_vieh = (ImageButton) rootView.findViewById(R.id.btn_prk_vieh);
        btn_prk_vieh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude rinderfarm = gebaeudeersteller.getGebaeudeRinderfarm();
                Gebaeude[] alleGebaeude = {rinderfarm};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_vieh), alleGebaeude);
            }
        });

        // Sole
        ImageButton btn_prk_sole = (ImageButton) rootView.findViewById(R.id.btn_prk_sole);
        btn_prk_sole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude salzstock = gebaeudeersteller.getGebaeudeSalzstock();
                Gebaeude[] alleGebaeude = {salzstock};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_sole), alleGebaeude);
            }
        });

        // Milch
        ImageButton btn_prk_milch = (ImageButton) rootView.findViewById(R.id.btn_prk_milch);
        btn_prk_milch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude ziegenfarm = gebaeudeersteller.getGebaeudeZiegenfarm();
                Gebaeude[] alleGebaeude = {ziegenfarm};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_milch), alleGebaeude);
            }
        });

        // Äpfel
        ImageButton btn_prk_aepfel = (ImageButton) rootView.findViewById(R.id.btn_prk_aepfel);
        btn_prk_aepfel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude apfelhof = gebaeudeersteller.getGebaeudeApfelhof();
                Gebaeude[] alleGebaeude = {apfelhof};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_aepfel), alleGebaeude);
            }
        });

        // Kräuter
        ImageButton btn_prk_kraeuter = (ImageButton) rootView.findViewById(R.id.btn_prk_kraeuter);
        btn_prk_kraeuter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude klostergarten = gebaeudeersteller.getGebaeudeKlostergarten();
                Gebaeude[] alleGebaeude = {klostergarten};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_kraeuter), alleGebaeude);
            }
        });

        // Trauben
        ImageButton btn_prk_trauben = (ImageButton) rootView.findViewById(R.id.btn_prk_trauben);
        btn_prk_trauben.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude weingut = gebaeudeersteller.getGebaeudeWeingut();
                Gebaeude[] alleGebaeude = {weingut};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_trauben), alleGebaeude);
            }
        });

        // Wolle
        ImageButton btn_prk_wolle = (ImageButton) rootView.findViewById(R.id.btn_prk_wolle);
        btn_prk_wolle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude schaffarm = gebaeudeersteller.getGebaeudeSchaffarm();
                Gebaeude[] alleGebaeude = {schaffarm};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_wolle), alleGebaeude);
            }
        });

        // Hanf
        ImageButton btn_prk_hanf = (ImageButton) rootView.findViewById(R.id.btn_prk_hanf);
        btn_prk_hanf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude hanfplantage = gebaeudeersteller.getGebaeudeHanfplantage();
                Gebaeude[] alleGebaeude = {hanfplantage};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_hanf), alleGebaeude);
            }
        });

        // Tierhäute
        ImageButton btn_prk_tierhaeute = (ImageButton) rootView.findViewById(R.id.btn_prk_tierhaeute);
        btn_prk_tierhaeute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude schweinefarm = gebaeudeersteller.getGebaeudeSchweinefarm();
                Gebaeude[] alleGebaeude = {schweinefarm};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_tierhaeute), alleGebaeude);
            }
        });

        // Pelze
        ImageButton btn_prk_pelze = (ImageButton) rootView.findViewById(R.id.btn_prk_pelze);
        btn_prk_pelze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude pelztierjaeger = gebaeudeersteller.getGebaeudePelztierjaeger();
                Gebaeude[] alleGebaeude = {pelztierjaeger};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_pelze), alleGebaeude);
            }
        });

        // Golderz
        ImageButton btn_prk_golderz = (ImageButton) rootView.findViewById(R.id.btn_prk_golderz);
        btn_prk_golderz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude goldmine = gebaeudeersteller.getGebaeudeGoldmine();
                Gebaeude[] alleGebaeude = {goldmine};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_golderz), alleGebaeude);
            }
        });

        // Seide
        ImageButton btn_prk_seide = (ImageButton) rootView.findViewById(R.id.btn_prk_seide);
        btn_prk_seide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude seide = gebaeudeersteller.getGebaeudeSeide();
                Gebaeude[] alleGebaeude = {seide};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_seide), alleGebaeude);
            }
        });

        // Bienenwachs
        ImageButton btn_prk_bienenwachs = (ImageButton) rootView.findViewById(R.id.btn_prk_bienenwachs);
        btn_prk_bienenwachs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude imker = gebaeudeersteller.getGebaeudeImker();
                Gebaeude[] alleGebaeude = {imker};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_bienenwachs), alleGebaeude);
            }
        });

        // Indigo
        ImageButton btn_prk_indigo = (ImageButton) rootView.findViewById(R.id.btn_prk_indigo);
        btn_prk_indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude indigo = gebaeudeersteller.getGebaeudeIndigo();
                Gebaeude[] alleGebaeude = {indigo};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_indigo), alleGebaeude);
            }
        });

        // Kupfererz
        ImageButton btn_prk_kupfererz = (ImageButton) rootView.findViewById(R.id.btn_prk_kupfererz);
        btn_prk_kupfererz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude kupfermine = gebaeudeersteller.getGebaeudeKupfermine();
                Gebaeude[] alleGebaeude = {kupfermine};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_kupfererz), alleGebaeude);
            }
        });

        // Kohle
        ImageButton btn_prk_kohle = (ImageButton) rootView.findViewById(R.id.btn_prk_kohle);
        btn_prk_kohle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_koehlerhuette()));
                Gebaeude koehlerhuette = gebaeudeersteller.getGebaeudeKoehlerhuette();
                Gebaeude[] alleGebaeude = {holzfaeller, koehlerhuette};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_kohle), alleGebaeude);
            }
        });

        // Pottasche
        ImageButton btn_prk_pottasche = (ImageButton) rootView.findViewById(R.id.btn_prk_pottasche);
        btn_prk_pottasche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_waldglashuette()));
                Gebaeude waldglashuette = gebaeudeersteller.getGebaeudeWaldglashuette();
                Gebaeude[] alleGebaeude = {holzfaeller, waldglashuette};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_pottasche), alleGebaeude);
            }
        });

        // Mehl
        ImageButton btn_prk_mehl = (ImageButton) rootView.findViewById(R.id.btn_prk_mehl);
        btn_prk_mehl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude weizenfarm = gebaeudeersteller.getGebaeudeWeizenhof();
                weizenfarm.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_weizenfarm(), gebaeudeersteller.getProduktionsdauer_muehle()));
                Gebaeude muehle = gebaeudeersteller.getGebaeudeMuehle();
                Gebaeude[] alleGebaeude = {weizenfarm, muehle};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_mehl), alleGebaeude);
            }
        });

        // Most
        ImageButton btn_prk_most = (ImageButton) rootView.findViewById(R.id.btn_prk_most);
        btn_prk_most.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude apfelhof = gebaeudeersteller.getGebaeudeApfelhof();
                apfelhof.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_apfelhof(), gebaeudeersteller.getProduktionsdauer_mosthof()));
                Gebaeude mosthof = gebaeudeersteller.getGebaeudeMosthof();
                Gebaeude[] alleGebaeude = {apfelhof, mosthof};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_most), alleGebaeude);
            }
        });

        // Wollgewänder
        ImageButton btn_prk_wollgewaender = (ImageButton) rootView.findViewById(R.id.btn_prk_wollgewaender);
        btn_prk_wollgewaender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude schaffarm = gebaeudeersteller.getGebaeudeSchaffarm();
                schaffarm.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_schaffarm(), gebaeudeersteller.getProduktionsdauer_spinnerei()));
                Gebaeude spinnerei = gebaeudeersteller.getGebaeudeSpinnerei();
                Gebaeude[] alleGebaeude = {schaffarm, spinnerei};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_wollgewaender), alleGebaeude);
            }
        });

        // Leinenkutten
        ImageButton btn_prk_leinengewaender = (ImageButton) rootView.findViewById(R.id.btn_prk_leinengewaender);
        btn_prk_leinengewaender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude hanfplantage = gebaeudeersteller.getGebaeudeHanfplantage();
                hanfplantage.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_hanfplantage(), gebaeudeersteller.getProduktionsdauer_webstube()));
                Gebaeude webstube = gebaeudeersteller.getGebaeudeWebstube();
                Gebaeude[] alleGebaeude = {hanfplantage, webstube};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_leinengewaender), alleGebaeude);
            }
        });

        // Pelzmäntel
        ImageButton btn_prk_pelzmaentel = (ImageButton) rootView.findViewById(R.id.btn_prk_pelzmaentel);
        btn_prk_pelzmaentel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude pelztierjaeger = gebaeudeersteller.getGebaeudePelztierjaeger();
                pelztierjaeger.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_pelztierjaeger(), gebaeudeersteller.getProduktionsdauer_kuerschnerei()));
                Gebaeude kuerschnerei = gebaeudeersteller.getGebaeudeKuerschnerei();
                Gebaeude[] alleGebaeude = {pelztierjaeger, kuerschnerei};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_pelzmaentel), alleGebaeude);
            }
        });

        // Papier
        ImageButton btn_prk_papier = (ImageButton) rootView.findViewById(R.id.btn_prk_papier);
        btn_prk_papier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_papiermuehle()));
                Gebaeude papiermuehle = gebaeudeersteller.getGebaeudePapiermuehle();
                Gebaeude[] alleGebaeude = {holzfaeller, papiermuehle};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_papier), alleGebaeude);
            }
        });

        // Brot
        ImageButton btn_prk_brot = (ImageButton) rootView.findViewById(R.id.btn_prk_brot);
        btn_prk_brot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude weizenfarm = gebaeudeersteller.getGebaeudeWeizenhof();
                weizenfarm.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_weizenfarm(), gebaeudeersteller.getProduktionsdauer_backstube()));
                Gebaeude muehle = gebaeudeersteller.getGebaeudeMuehle();
                muehle.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_muehle(), gebaeudeersteller.getProduktionsdauer_backstube()));
                Gebaeude backstube = gebaeudeersteller.getGebaeudeBackstube();
                Gebaeude[] alleGebaeude = {weizenfarm, muehle, backstube};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_brot), alleGebaeude);
            }
        });

        // Bier
        ImageButton btn_prk_bier = (ImageButton) rootView.findViewById(R.id.btn_prk_bier);
        btn_prk_bier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude weizenfarm = gebaeudeersteller.getGebaeudeWeizenhof();
                weizenfarm.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_weizenfarm(), gebaeudeersteller.getProduktionsdauer_klosterbrauerei()));
                Gebaeude klostergarten = gebaeudeersteller.getGebaeudeKlostergarten();
                klostergarten.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_klostergarten(), gebaeudeersteller.getProduktionsdauer_klosterbrauerei()));
                Gebaeude klosterbrauerei = gebaeudeersteller.getGebaeudeKlosterbrauerei();
                Gebaeude[] alleGebaeude = {weizenfarm, klostergarten, klosterbrauerei};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_bier), alleGebaeude);
            }
        });

        // Kerzen
        ImageButton btn_prk_kerzen = (ImageButton) rootView.findViewById(R.id.btn_prk_kerzen);
        btn_prk_kerzen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude hanfplantage = gebaeudeersteller.getGebaeudeHanfplantage();
                hanfplantage.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_hanfplantage(), gebaeudeersteller.getProduktionsdauer_lichtzieher()));
                Gebaeude imker = gebaeudeersteller.getGebaeudeImker();
                imker.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_imker(), gebaeudeersteller.getProduktionsdauer_lichtzieher()));
                Gebaeude lichtzieher = gebaeudeersteller.getGebaeudeLichtzieher();
                Gebaeude[] alleGebaeude = {hanfplantage, imker, lichtzieher};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_kerzen), alleGebaeude);
            }
        });

        // Eisen
        ImageButton btn_prk_eisen = (ImageButton) rootView.findViewById(R.id.btn_prk_eisen);
        btn_prk_eisen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_eisenschmelze()));
                Gebaeude koehlerhuette = gebaeudeersteller.getGebaeudeKoehlerhuette();
                koehlerhuette.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_koehlerhuette(), gebaeudeersteller.getProduktionsdauer_eisenschmelze()));
                Gebaeude eisenmine = gebaeudeersteller.getGebaeudeEisenmine();
                eisenmine.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_eisenmine(), gebaeudeersteller.getProduktionsdauer_eisenschmelze()));
                Gebaeude eisenschmelze = gebaeudeersteller.getGebaeudeEisenschmelze();
                Gebaeude[] alleGebaeude = {holzfaeller, koehlerhuette, eisenmine, eisenschmelze};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_eisen), alleGebaeude);
            }
        });

        // Glas
        ImageButton btn_prk_glas = (ImageButton) rootView.findViewById(R.id.btn_prk_glas);
        btn_prk_glas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_glasschmelze()));
                Gebaeude waldglashuette = gebaeudeersteller.getGebaeudeWaldglashuette();
                waldglashuette.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_waldglashuette(), gebaeudeersteller.getProduktionsdauer_glasschmelze()));
                Gebaeude quarzbruch = gebaeudeersteller.getGebaeudeQuarzbruch();
                quarzbruch.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_quarzbruch(), gebaeudeersteller.getProduktionsdauer_glasschmelze()));
                Gebaeude glasschmelze = gebaeudeersteller.getGebaeudeGlasschmelze();
                Gebaeude[] alleGebaeude = {holzfaeller, waldglashuette, quarzbruch, glasschmelze};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_glas), alleGebaeude);
            }
        });

        // Salz
        ImageButton btn_prk_salz = (ImageButton) rootView.findViewById(R.id.btn_prk_salz);
        btn_prk_salz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_saline()));
                Gebaeude koehlerhuette = gebaeudeersteller.getGebaeudeKoehlerhuette();
                koehlerhuette.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_koehlerhuette(), gebaeudeersteller.getProduktionsdauer_saline()));
                Gebaeude salzstock = gebaeudeersteller.getGebaeudeSalzstock();
                salzstock.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_salzstock(), gebaeudeersteller.getProduktionsdauer_saline()));
                Gebaeude saline = gebaeudeersteller.getGebaeudeSaline();
                Gebaeude[] alleGebaeude = {holzfaeller, koehlerhuette, salzstock, saline};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_salz), alleGebaeude);
            }
        });

        // Gold
        ImageButton btn_prk_gold = (ImageButton) rootView.findViewById(R.id.btn_prk_gold);
        btn_prk_gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_goldschmelze()));
                Gebaeude koehlerhuette = gebaeudeersteller.getGebaeudeKoehlerhuette();
                koehlerhuette.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_koehlerhuette(), gebaeudeersteller.getProduktionsdauer_goldschmelze()));
                Gebaeude goldmine = gebaeudeersteller.getGebaeudeGoldmine();
                goldmine.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_goldmine(), gebaeudeersteller.getProduktionsdauer_goldschmelze()));
                Gebaeude goldschmelze = gebaeudeersteller.getGebaeudeGoldschmelze();
                Gebaeude[] alleGebaeude = {holzfaeller, koehlerhuette, goldmine, goldschmelze};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_gold), alleGebaeude);
            }
        });

        // Bücher
        ImageButton btn_prk_buecher = (ImageButton) rootView.findViewById(R.id.btn_prk_buecher);
        btn_prk_buecher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_druckerei()));
                Gebaeude papiermuehle = gebaeudeersteller.getGebaeudePapiermuehle();
                papiermuehle.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_papiermuehle(), gebaeudeersteller.getProduktionsdauer_druckerei()));
                Gebaeude indigo = gebaeudeersteller.getGebaeudeIndigo();
                Gebaeude druckerei = gebaeudeersteller.getGebaeudeDruckerei();
                Gebaeude[] alleGebaeude = {holzfaeller, papiermuehle, indigo, druckerei};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_buecher), alleGebaeude);
            }
        });

        // Messing
        ImageButton btn_prk_messing = (ImageButton) rootView.findViewById(R.id.btn_prk_messing);
        btn_prk_messing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_kupferschmelze()));
                Gebaeude koehlerhuette = gebaeudeersteller.getGebaeudeKoehlerhuette();
                koehlerhuette.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_koehlerhuette(), gebaeudeersteller.getProduktionsdauer_kupferschmelze()));
                Gebaeude kupfermine = gebaeudeersteller.getGebaeudeKupfermine();
                kupfermine.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_kupfermine(), gebaeudeersteller.getProduktionsdauer_kupferschmelze()));
                Gebaeude kupferschmelze = gebaeudeersteller.getGebaeudeKupferschmelze();
                Gebaeude[] alleGebaeude = {holzfaeller, koehlerhuette, kupfermine, kupferschmelze};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_messing), alleGebaeude);
            }
        });

        // Werkzeug
        ImageButton btn_prk_werkzeug = (ImageButton) rootView.findViewById(R.id.btn_prk_werkzeug);
        btn_prk_werkzeug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_werkzeugmacher()));
                Gebaeude koehlerhuette = gebaeudeersteller.getGebaeudeKoehlerhuette();
                koehlerhuette.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_koehlerhuette(), gebaeudeersteller.getProduktionsdauer_werkzeugmacher()));
                Gebaeude eisenmine = gebaeudeersteller.getGebaeudeEisenmine();
                eisenmine.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_eisenmine(), gebaeudeersteller.getProduktionsdauer_werkzeugmacher()));
                Gebaeude eisenschmelze = gebaeudeersteller.getGebaeudeEisenschmelze();
                eisenschmelze.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_eisenschmelze(), gebaeudeersteller.getProduktionsdauer_werkzeugmacher()));
                Gebaeude werkzeugmacher = gebaeudeersteller.getGebaeudeWerkzeugmacher();
                Gebaeude[] alleGebaeude = {holzfaeller, koehlerhuette, eisenmine, eisenschmelze, werkzeugmacher};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_werkzeug), alleGebaeude);
            }
        });

        // Fässer
        ImageButton btn_prk_faesser = (ImageButton) rootView.findViewById(R.id.btn_prk_faesser);
        btn_prk_faesser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_fasskueferei()));
                Gebaeude koehlerhuette = gebaeudeersteller.getGebaeudeKoehlerhuette();
                koehlerhuette.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_koehlerhuette(), gebaeudeersteller.getProduktionsdauer_fasskueferei()));
                Gebaeude eisenmine = gebaeudeersteller.getGebaeudeEisenmine();
                eisenmine.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_eisenmine(), gebaeudeersteller.getProduktionsdauer_fasskueferei()));
                Gebaeude eisenschmelze = gebaeudeersteller.getGebaeudeEisenschmelze();
                eisenschmelze.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_eisenschmelze(), gebaeudeersteller.getProduktionsdauer_fasskueferei()));
                Gebaeude fasskueferei = gebaeudeersteller.getGebaeudeFasskueferei();
                Gebaeude[] alleGebaeude = {holzfaeller, koehlerhuette, eisenmine, eisenschmelze, fasskueferei};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_faesser), alleGebaeude);
            }
        });

        // Fleisch
        ImageButton btn_prk_fleisch = (ImageButton) rootView.findViewById(R.id.btn_prk_fleisch);
        btn_prk_fleisch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_metzger()));
                Gebaeude koehlerhuette = gebaeudeersteller.getGebaeudeKoehlerhuette();
                koehlerhuette.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_koehlerhuette(), gebaeudeersteller.getProduktionsdauer_metzger()));
                Gebaeude salzstock = gebaeudeersteller.getGebaeudeSalzstock();
                salzstock.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_salzstock(), gebaeudeersteller.getProduktionsdauer_metzger()));
                Gebaeude saline = gebaeudeersteller.getGebaeudeSaline();
                saline.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_saline(), gebaeudeersteller.getProduktionsdauer_metzger()));
                Gebaeude rinderfarm = gebaeudeersteller.getGebaeudeRinderfarm();
                rinderfarm.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_rinderfarm(), gebaeudeersteller.getProduktionsdauer_metzger()));
                Gebaeude metzger = gebaeudeersteller.getGebaeudeMetzger();
                Gebaeude[] alleGebaeude = {holzfaeller, koehlerhuette, salzstock, saline, rinderfarm, metzger};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_fleisch), alleGebaeude);
            }
        });

        // Lederwämser
        ImageButton btn_prk_lederwaemser = (ImageButton) rootView.findViewById(R.id.btn_prk_lederwaemser);
        btn_prk_lederwaemser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_gerberei()));
                Gebaeude koehlerhuette = gebaeudeersteller.getGebaeudeKoehlerhuette();
                koehlerhuette.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_koehlerhuette(), gebaeudeersteller.getProduktionsdauer_gerberei()));
                Gebaeude salzstock = gebaeudeersteller.getGebaeudeSalzstock();
                salzstock.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_salzstock(), gebaeudeersteller.getProduktionsdauer_gerberei()));
                Gebaeude saline = gebaeudeersteller.getGebaeudeSaline();
                saline.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_saline(), gebaeudeersteller.getProduktionsdauer_gerberei()));
                Gebaeude schweinefarm = gebaeudeersteller.getGebaeudeSchweinefarm();
                schweinefarm.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_schweinefarm(), gebaeudeersteller.getProduktionsdauer_gerberei()));
                Gebaeude gerberei = gebaeudeersteller.getGebaeudeGerberei();
                Gebaeude[] alleGebaeude = {holzfaeller, koehlerhuette, salzstock, saline, schweinefarm, gerberei};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_lederwaemser), alleGebaeude);
            }
        });

        // Brokatgewänder
        ImageButton btn_prk_brokatgewaender = (ImageButton) rootView.findViewById(R.id.btn_prk_brokatgewaender);
        btn_prk_brokatgewaender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_seidenweberei()));
                Gebaeude koehlerhuette = gebaeudeersteller.getGebaeudeKoehlerhuette();
                koehlerhuette.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_koehlerhuette(), gebaeudeersteller.getProduktionsdauer_seidenweberei()));
                Gebaeude goldmine = gebaeudeersteller.getGebaeudeGoldmine();
                goldmine.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_goldmine(), gebaeudeersteller.getProduktionsdauer_seidenweberei()));
                Gebaeude goldschmelze = gebaeudeersteller.getGebaeudeGoldschmelze();
                goldschmelze.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_goldschmelze(), gebaeudeersteller.getProduktionsdauer_seidenweberei()));
                Gebaeude seide = gebaeudeersteller.getGebaeudeSeide();
                Gebaeude seidenweberei = gebaeudeersteller.getGebaeudeSeidenweberei();
                Gebaeude[] alleGebaeude = {holzfaeller, koehlerhuette, goldmine, goldschmelze, seide, seidenweberei};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_brokatgewaender), alleGebaeude);
            }
        });

        // Brillen
        ImageButton btn_prk_brillen = (ImageButton) rootView.findViewById(R.id.btn_prk_brillen);
        btn_prk_brillen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_brillenmacher()));
                Gebaeude koehlerhuette = gebaeudeersteller.getGebaeudeKoehlerhuette();
                koehlerhuette.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_koehlerhuette(), gebaeudeersteller.getProduktionsdauer_brillenmacher()));
                Gebaeude kupfermine = gebaeudeersteller.getGebaeudeKupfermine();
                kupfermine.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_kupfermine(), gebaeudeersteller.getProduktionsdauer_brillenmacher()));
                Gebaeude kupferschmelze = gebaeudeersteller.getGebaeudeKupferschmelze();
                kupferschmelze.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_kupferschmelze(), gebaeudeersteller.getProduktionsdauer_brillenmacher()));
                Gebaeude quarzbruch = gebaeudeersteller.getGebaeudeQuarzbruch();
                quarzbruch.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_quarzbruch(), gebaeudeersteller.getProduktionsdauer_brillenmacher()));
                Gebaeude brillenmacher = gebaeudeersteller.getGebaeudeBrillenmacher();
                Gebaeude[] alleGebaeude = {holzfaeller, koehlerhuette, kupfermine, kupferschmelze, quarzbruch, brillenmacher};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_brillen), alleGebaeude);
            }
        });

        // Wein
        ImageButton btn_prk_wein = (ImageButton) rootView.findViewById(R.id.btn_prk_wein);
        btn_prk_wein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_kelterei()));
                Gebaeude koehlerhuette = gebaeudeersteller.getGebaeudeKoehlerhuette();
                koehlerhuette.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_koehlerhuette(), gebaeudeersteller.getProduktionsdauer_kelterei()));
                Gebaeude eisenmine = gebaeudeersteller.getGebaeudeEisenmine();
                eisenmine.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_eisenmine(), gebaeudeersteller.getProduktionsdauer_kelterei()));
                Gebaeude eisenschmelze = gebaeudeersteller.getGebaeudeEisenschmelze();
                eisenschmelze.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_eisenschmelze(), gebaeudeersteller.getProduktionsdauer_kelterei()));
                Gebaeude fasskueferei = gebaeudeersteller.getGebaeudeFasskueferei();
                fasskueferei.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_fasskueferei(), gebaeudeersteller.getProduktionsdauer_kelterei()));
                Gebaeude weingut = gebaeudeersteller.getGebaeudeWeingut();
                weingut.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_weingut(), gebaeudeersteller.getProduktionsdauer_kelterei()));
                Gebaeude kelterei = gebaeudeersteller.getGebaeudeKelterei();
                Gebaeude[] alleGebaeude = {holzfaeller, koehlerhuette, eisenmine, eisenschmelze, fasskueferei, weingut, kelterei};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_wein), alleGebaeude);
            }
        });

        // Kerzenleuchter
        ImageButton btn_prk_kerzenleuchter = (ImageButton) rootView.findViewById(R.id.btn_prk_kerzenleuchter);
        btn_prk_kerzenleuchter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gebaeude holzfaeller = gebaeudeersteller.getGebaeudeHolzfaeller();
                holzfaeller.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_holzfaeller(), gebaeudeersteller.getProduktionsdauer_feinschmiede()));
                Gebaeude koehlerhuette = gebaeudeersteller.getGebaeudeKoehlerhuette();
                koehlerhuette.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_koehlerhuette(), gebaeudeersteller.getProduktionsdauer_feinschmiede()));
                Gebaeude kupfermine = gebaeudeersteller.getGebaeudeKupfermine();
                kupfermine.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_kupfermine(), gebaeudeersteller.getProduktionsdauer_feinschmiede()));
                Gebaeude kupferschmelze = gebaeudeersteller.getGebaeudeKupferschmelze();
                kupferschmelze.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_kupferschmelze(), gebaeudeersteller.getProduktionsdauer_feinschmiede()));
                Gebaeude hanfplantage = gebaeudeersteller.getGebaeudeHanfplantage();
                hanfplantage.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_hanfplantage(), gebaeudeersteller.getProduktionsdauer_feinschmiede()));
                Gebaeude imker = gebaeudeersteller.getGebaeudeImker();
                imker.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_imker(), gebaeudeersteller.getProduktionsdauer_feinschmiede()));
                Gebaeude lichtzieher = gebaeudeersteller.getGebaeudeLichtzieher();
                lichtzieher.setAnzahlAuslastung(berechneAuslastung(gebaeudeersteller.getProduktionsdauer_lichtzieher(), gebaeudeersteller.getProduktionsdauer_feinschmiede()));
                Gebaeude feinschmiede = gebaeudeersteller.getGebaeudeFeinschmiede();
                Gebaeude[] alleGebaeude = {holzfaeller, koehlerhuette, kupfermine, kupferschmelze, hanfplantage, imker, lichtzieher, feinschmiede};
                dialogersteller.erstelleDialog(getString(R.string.str_pr_kerzenhalter), alleGebaeude);
            }
        });
    }

    // Berechnen der Auslastung eines Gebäudes im Verhältnis zu dessen übergeordnetem Gebäude (z.B. von Holz zu Kohle)
    private String berechneAuslastung(int produktionsdauer_geb1, int produktionsdauer_geb2) {
        // Variablen deklarieren
        String anzahl_auslastung_gb;
        int anzahl_gb;
        float auslastung_gb;
        float produktionsdauer_gb1 = Float.valueOf(produktionsdauer_geb1);
        float produktionsdauer_gb2 = Float.valueOf(produktionsdauer_geb2);
        float auslastung_pro_gb;

        // Werte berechnen
        auslastung_gb = (produktionsdauer_gb1/produktionsdauer_gb2)*100;
        anzahl_gb = (int) Math.ceil(produktionsdauer_gb1/produktionsdauer_gb2);
        auslastung_pro_gb = auslastung_gb/anzahl_gb;
        String s = String.valueOf(auslastung_pro_gb);
        float auslastung_pro_gb_rounded = Float.parseFloat(s.substring(0,s.lastIndexOf('.')+2));
        String s2 = String.valueOf(auslastung_pro_gb_rounded);
        if (s2.substring(s2.length()-1).equals("0")){
            s2 = s2.substring(0, s2.lastIndexOf('.'));
        }
        else{
            s2 = s2.replace('.', ',');
        }
        anzahl_auslastung_gb = anzahl_gb + "x (" + s2 + "%)";
        return anzahl_auslastung_gb;
    }
}
