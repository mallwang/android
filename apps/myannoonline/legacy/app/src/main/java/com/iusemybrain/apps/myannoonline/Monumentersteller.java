package com.iusemybrain.apps.myannoonline;

import android.app.Activity;

import com.iusemybrain.apps.myannoonline.dialogcontent.Monument;

import java.util.zip.Adler32;

/**
 * Created by Markus on 11.04.2015.
 */
class Monumentersteller {

    private Dialogersteller dialogersteller;
    private Activity activity;

    // IDs der Bevölkerungsgruppen
    private static final int GB_BEV_KEINE = 200;
    private static final int GB_BEV_BAUER = 201;
    private static final int GB_BEV_HANDWERKER = 202;
    private static final int GB_BEV_KAUFMANN = 203;
    private static final int GB_BEV_ADLIGER = 204;

    // IDs für Monumente
    private static final int MON_BIBLIOTHEK_GESAMT = 1;
    private static final int MON_BIBLIOTHEK_PHASE1 = 2;
    private static final int MON_BIBLIOTHEK_PHASE2 = 3;
    private static final int MON_KAISERDOM_GESAMT = 4;
    private static final int MON_KAISERDOM_PHASE1 = 5;
    private static final int MON_KAISERDOM_PHASE2 = 6;
    private static final int MON_KAISERDOM_PHASE3 = 7;
    private static final int MON_AMPHITHEATER_GESAMT = 8;
    private static final int MON_AMPHITHEATER_PHASE1 = 9;
    private static final int MON_AMPHITHEATER_PHASE2 = 10;
    private static final int MON_AMPHITHEATER_PHASE3 = 11;
    private static final int MON_FESTUNG_GESAMT = 12;
    private static final int MON_FESTUNG_PHASE1 = 13;
    private static final int MON_FESTUNG_PHASE2 = 14;
    private static final int MON_FESTUNG_PHASE3 = 15;
    private static final int MON_APFELGARTEN_GESAMT = 16;
    private static final int MON_APFELGARTEN_PHASE1 = 17;
    private static final int MON_APFELGARTEN_PHASE2 = 18;
    private static final int MON_WEIZENGARTEN_GESAMT = 19;
    private static final int MON_WEIZENGARTEN_PHASE1 = 20;
    private static final int MON_WEIZENGARTEN_PHASE2 = 21;
    private static final int MON_HANFGARTEN_GESAMT = 22;
    private static final int MON_HANFGARTEN_PHASE1 = 23;
    private static final int MON_HANFGARTEN_PHASE2 = 24;
    private static final int MON_KRAEUTERGARTEN_GESAMT = 25;
    private static final int MON_KRAEUTERGARTEN_PHASE1 = 26;
    private static final int MON_KRAEUTERGARTEN_PHASE2 = 27;
    private static final int MON_TRAUBENGARTEN_GESAMT = 28;
    private static final int MON_TRAUBENGARTEN_PHASE1 = 29;
    private static final int MON_TRAUBENGARTEN_PHASE2 = 30;
    private static final int MON_BIENENWACHSGARTEN_GESAMT = 31;
    private static final int MON_BIENENWACHSGARTEN_PHASE1 = 32;
    private static final int MON_BIENENWACHSGARTEN_PHASE2 = 33;

    /* IDs FÜR PRODUKTE */
    private static final int PRODUKT_KEIN = 0;
    // Baustoffe
    private static final int PRODUKT_HOLZ = 1;
    private static final int PRODUKT_STEIN = 2;
    private static final int PRODUKT_EISENERZ = 3;
    private static final int PRODUKT_KOHLE = 4;
    private static final int PRODUKT_EISEN = 5;
    private static final int PRODUKT_WERKZEUG = 6;
    private static final int PRODUKT_POTTASCHE = 7;
    private static final int PRODUKT_QUARZ = 8;
    private static final int PRODUKT_GLAS = 9;
    // Nahrung
    private static final int PRODUKT_FISCH = 10;
    private static final int PRODUKT_WEIZEN = 11;
    private static final int PRODUKT_MEHL = 12;
    private static final int PRODUKT_BROT = 13;
    private static final int PRODUKT_VIEH = 14;
    private static final int PRODUKT_FLEISCH = 15;
    private static final int PRODUKT_GEWUERZE = 16;
    // Getränke
    private static final int PRODUKT_MILCH = 17;
    private static final int PRODUKT_AEPFEL = 18;
    private static final int PRODUKT_MOST = 19;
    private static final int PRODUKT_KRAEUTER = 20;
    private static final int PRODUKT_BIER = 21;
    private static final int PRODUKT_WEINTRAUBEN = 22;
    private static final int PRODUKT_FAESSER = 23;
    private static final int PRODUKT_WEIN = 24;
    // Kleidung
    private static final int PRODUKT_WOLLE = 25;
    private static final int PRODUKT_WOLLGEWAENDER = 26;
    private static final int PRODUKT_HANF = 27;
    private static final int PRODUKT_LEINENGEWAENDER = 28;
    private static final int PRODUKT_TIERHAEUTE = 29;
    private static final int PRODUKT_SOLE = 30;
    private static final int PRODUKT_SALZ = 31;
    private static final int PRODUKT_LEDERWAEMSER = 32;
    private static final int PRODUKT_PELZE = 33;
    private static final int PRODUKT_PELZMAENTEL = 34;
    private static final int PRODUKT_GOLDERZ = 35;
    private static final int PRODUKT_GOLD = 36;
    private static final int PRODUKT_BROKATGEWAENDER = 37;
    private static final int PRODUKT_SEIDE = 38;
    // Besitz
    private static final int PRODUKT_PAPIER = 39;
    private static final int PRODUKT_BUECHER = 40;
    private static final int PRODUKT_KUPFERERZ = 41;
    private static final int PRODUKT_MESSING = 42;
    private static final int PRODUKT_BIENENWACHS = 43;
    private static final int PRODUKT_KERZEN = 44;
    private static final int PRODUKT_KERZENLEUCHTER = 45;
    private static final int PRODUKT_BRILLEN = 46;
    private static final int PRODUKT_INDIGO = 47;

    /* MONUMENTE */
    // Bibliothek Gesamt
    private static final int art_monument_bibliothek_gesamt = MON_BIBLIOTHEK_GESAMT;
    private static final int art_bev_bibliothek_gesamt = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_bibliothek_gesamt = 500;
    private static final int unterhalt_bibliothek_gesamt = 60;
    private static final int radius_bibliothek_gesamt = 0;
    private static final String groesse_bibliothek_gesamt = "6x6";
    private static final int wissen_bibliothek_gesamt = 150;
    private static final String dauer_bibliothek_gesamt = "1 Tag";
    private static final int konstruktionsteile_bibliothek_gesamt = 3;
    private static final int einwohner_plus_bibliothek_gesamt = 0;
    private static final int[] art_bibliothek_gesamt = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_FISCH, PRODUKT_GEWUERZE, PRODUKT_MOST, PRODUKT_WOLLGEWAENDER, PRODUKT_AEPFEL, PRODUKT_BROT, PRODUKT_MILCH, PRODUKT_LEINENGEWAENDER};
    private static final int[] menge_bibliothek_gesamt = {1800, 1800, 1600, 1100, 200, 700, 400, 200, 400, 900, 1200};
    private static final String text_bibliothek_gesamt = "";
    // Bibliothek Phase 1
    private static final int art_monument_bibliothek_phase1 = MON_BIBLIOTHEK_PHASE1;
    private static final int art_bev_bibliothek_phase1 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_bibliothek_phase1 = 500;
    private static final int unterhalt_bibliothek_phase1 = 0;
    private static final int radius_bibliothek_phase1 = 0;
    private static final String groesse_bibliothek_phase1 = "6x6";
    private static final int wissen_bibliothek_phase1 = 50;
    private static final String dauer_bibliothek_phase1 = "0.3 Tage";
    private static final int konstruktionsteile_bibliothek_phase1 = 0;
    private static final int einwohner_plus_bibliothek_phase1 = 0;
    private static final int[] art_bibliothek_phase1 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_FISCH, PRODUKT_GEWUERZE, PRODUKT_MOST, PRODUKT_WOLLGEWAENDER, PRODUKT_AEPFEL};
    private static final int[] menge_bibliothek_phase1 = {600, 600, 400, 300, 200, 400, 400, 200};
    private static final String text_bibliothek_phase1 = "";
    // Bibliothek Phase 2
    private static final int art_monument_bibliothek_phase2 = MON_BIBLIOTHEK_PHASE2;
    private static final int art_bev_bibliothek_phase2 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_bibliothek_phase2 = 500;
    private static final int unterhalt_bibliothek_phase2 = 0;
    private static final int radius_bibliothek_phase2 = 0;
    private static final String groesse_bibliothek_phase2 = "6x6";
    private static final int wissen_bibliothek_phase2 = 100;
    private static final String dauer_bibliothek_phase2 = "0.7 Tag";
    private static final int konstruktionsteile_bibliothek_phase2 = 3;
    private static final int einwohner_plus_bibliothek_phase2 = 0;
    private static final int[] art_bibliothek_phase2 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_FISCH, PRODUKT_BROT, PRODUKT_MILCH, PRODUKT_MOST, PRODUKT_LEINENGEWAENDER};
    private static final int[] menge_bibliothek_phase2 = {1200, 1200, 1200, 800, 400, 900, 300, 1200};
    private static final String text_bibliothek_phase2 = "";
    // Kaiserdom Gesamt
    private static final int art_monument_kaiserdom_gesamt = MON_KAISERDOM_GESAMT;
    private static final int art_bev_kaiserdom_gesamt = GB_BEV_ADLIGER;
    private static final int anzahl_bev_kaiserdom_gesamt = 3500;
    private static final int unterhalt_kaiserdom_gesamt = 480;
    private static final int radius_kaiserdom_gesamt = 38;
    private static final String groesse_kaiserdom_gesamt = "11x18";
    private static final int wissen_kaiserdom_gesamt = 7800;
    private static final String dauer_kaiserdom_gesamt = "20";
    private static final int konstruktionsteile_kaiserdom_gesamt = 12;
    private static final int einwohner_plus_kaiserdom_gesamt = 6;
    private static final int[] art_kaiserdom_gesamt = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_BROT, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_WEIN, PRODUKT_LEDERWAEMSER, PRODUKT_GLAS, PRODUKT_MOST, PRODUKT_VIEH, PRODUKT_BUECHER, PRODUKT_GOLD, PRODUKT_SEIDE};
    private static final int[] menge_kaiserdom_gesamt = {900, 19800, 21800, 5900, 13500, 8100, 1300, 6500, 4100, 5300, 3200, 2400, 1600, 3200};
    private static final String text_kaiserdom_gesamt = "";
    // Kaiserdom Phase1
    private static final int art_monument_kaiserdom_phase1 = MON_KAISERDOM_PHASE1;
    private static final int art_bev_kaiserdom_phase1 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_kaiserdom_phase1 = 3500;
    private static final int unterhalt_kaiserdom_phase1 = 0;
    private static final int radius_kaiserdom_phase1 = 38;
    private static final String groesse_kaiserdom_phase1 = "11x18";
    private static final int wissen_kaiserdom_phase1 = 2000;
    private static final String dauer_kaiserdom_phase1 = "5";
    private static final int konstruktionsteile_kaiserdom_phase1 = 3;
    private static final int einwohner_plus_kaiserdom_phase1 = 0;
    private static final int[] art_kaiserdom_phase1 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_BROT, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_WEIN, PRODUKT_LEDERWAEMSER};
    private static final int[] menge_kaiserdom_phase1 = {900, 6400, 5500, 5900, 2000, 2600, 1300, 4900};
    private static final String text_kaiserdom_phase1 = "";
    // Kaiserdom Phase2
    private static final int art_monument_kaiserdom_phase2 = MON_KAISERDOM_PHASE2;
    private static final int art_bev_kaiserdom_phase2 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_kaiserdom_phase2 = 3500;
    private static final int unterhalt_kaiserdom_phase2 = 0;
    private static final int radius_kaiserdom_phase2 = 38;
    private static final String groesse_kaiserdom_phase2 = "11x18";
    private static final int wissen_kaiserdom_phase2 = 2700;
    private static final String dauer_kaiserdom_phase2 = "7";
    private static final int konstruktionsteile_kaiserdom_phase2 = 4;
    private static final int einwohner_plus_kaiserdom_phase2 = 0;
    private static final int[] art_kaiserdom_phase2 = {PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_GLAS, PRODUKT_FLEISCH, PRODUKT_MOST, PRODUKT_BIER, PRODUKT_LEDERWAEMSER, PRODUKT_VIEH};
    private static final int[] menge_kaiserdom_phase2 = {8700, 6900, 1700, 7900, 5300, 2600, 1600, 3200};
    private static final String text_kaiserdom_phase2 = "";
    // Kaiserdom Phase3
    private static final int art_monument_kaiserdom_phase3 = MON_KAISERDOM_PHASE3;
    private static final int art_bev_kaiserdom_phase3 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_kaiserdom_phase3 = 3500;
    private static final int unterhalt_kaiserdom_phase3 = 0;
    private static final int radius_kaiserdom_phase3 = 38;
    private static final String groesse_kaiserdom_phase3 = "11x18";
    private static final int wissen_kaiserdom_phase3 = 3100;
    private static final String dauer_kaiserdom_phase3 = "8";
    private static final int konstruktionsteile_kaiserdom_phase3 = 5;
    private static final int einwohner_plus_kaiserdom_phase3 = 0;
    private static final int[] art_kaiserdom_phase3 = {PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_GLAS, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_BUECHER, PRODUKT_GOLD, PRODUKT_SEIDE};
    private static final int[] menge_kaiserdom_phase3 = {4700, 9400, 2400, 3600, 2900, 2400, 1600, 3200};
    private static final String text_kaiserdom_phase3 = "";
    // Amphitheater Gesamt
    private static final int art_monument_amphitheater_gesamt = MON_AMPHITHEATER_GESAMT;
    private static final int art_bev_amphitheater_gesamt = GB_BEV_ADLIGER;
    private static final int anzahl_bev_amphitheater_gesamt = 1;
    private static final int unterhalt_amphitheater_gesamt = 400;
    private static final int radius_amphitheater_gesamt = 34;
    private static final String groesse_amphitheater_gesamt = "10x10";
    private static final int wissen_amphitheater_gesamt = 4800;
    private static final String dauer_amphitheater_gesamt = "12";
    private static final int konstruktionsteile_amphitheater_gesamt = 12;
    private static final int einwohner_plus_amphitheater_gesamt = 6;
    private static final int[] art_amphitheater_gesamt = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_BROT, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_WEIN, PRODUKT_LEDERWAEMSER, PRODUKT_FISCH, PRODUKT_MOST, PRODUKT_EISEN, PRODUKT_GLAS, PRODUKT_TIERHAEUTE};
    private static final int[] menge_amphitheater_gesamt = {1100, 11900, 12100, 3400, 8600, 6800, 800, 10200, 5300, 5300, 8300, 1500, 2600};
    private static final String text_amphitheater_gesamt = "";
    // Amphitheater Phase1
    private static final int art_monument_amphitheater_phase1 = MON_AMPHITHEATER_PHASE1;
    private static final int art_bev_amphitheater_phase1 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_amphitheater_phase1 = 1;
    private static final int unterhalt_amphitheater_phase1 = 0;
    private static final int radius_amphitheater_phase1 = 34;
    private static final String groesse_amphitheater_phase1 = "10x10";
    private static final int wissen_amphitheater_phase1 = 1200;
    private static final String dauer_amphitheater_phase1 = "3";
    private static final int konstruktionsteile_amphitheater_phase1 = 3;
    private static final int einwohner_plus_amphitheater_phase1 = 0;
    private static final int[] art_amphitheater_phase1 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_BROT, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_WEIN, PRODUKT_LEDERWAEMSER};
    private static final int[] menge_amphitheater_phase1 = {1100, 3400, 2300, 3400, 1100, 1500, 800, 2800};
    private static final String text_amphitheater_phase1 = "";
    // Amphitheater Phase2
    private static final int art_monument_amphitheater_phase2 = MON_AMPHITHEATER_PHASE2;
    private static final int art_bev_amphitheater_phase2 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_amphitheater_phase2 = 1;
    private static final int unterhalt_amphitheater_phase2 = 0;
    private static final int radius_amphitheater_phase2 = 34;
    private static final String groesse_amphitheater_phase2 = "10x10";
    private static final int wissen_amphitheater_phase2 = 1700;
    private static final String dauer_amphitheater_phase2 = "4.3";
    private static final int konstruktionsteile_amphitheater_phase2 = 4;
    private static final int einwohner_plus_amphitheater_phase2 = 0;
    private static final int[] art_amphitheater_phase2 = {PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_FISCH, PRODUKT_FLEISCH, PRODUKT_MOST, PRODUKT_BIER, PRODUKT_LEDERWAEMSER, PRODUKT_EISEN};
    private static final int[] menge_amphitheater_phase2 = {5600, 3900, 5300, 3600, 5300, 2700, 4800, 3200};
    private static final String text_amphitheater_phase2 = "";
    // Amphitheater Phase3
    private static final int art_monument_amphitheater_phase3 = MON_AMPHITHEATER_PHASE3;
    private static final int art_bev_amphitheater_phase3 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_amphitheater_phase3 = 1;
    private static final int unterhalt_amphitheater_phase3 = 0;
    private static final int radius_amphitheater_phase3 = 34;
    private static final String groesse_amphitheater_phase3 = "10x10";
    private static final int wissen_amphitheater_phase3 = 1900;
    private static final String dauer_amphitheater_phase3 = "4.7";
    private static final int konstruktionsteile_amphitheater_phase3 = 5;
    private static final int einwohner_plus_amphitheater_phase3 = 0;
    private static final int[] art_amphitheater_phase3 = {PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_GLAS, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_TIERHAEUTE, PRODUKT_LEDERWAEMSER, PRODUKT_EISEN};
    private static final int[] menge_amphitheater_phase3 = {2900, 5900, 1500, 3900, 2600, 2600, 2600, 5100};
    private static final String text_amphitheater_phase3 = "";
    // Festung Gesamt
    private static final int art_monument_festung_gesamt = MON_FESTUNG_GESAMT;
    private static final int art_bev_festung_gesamt = GB_BEV_ADLIGER;
    private static final int anzahl_bev_festung_gesamt = 1000;
    private static final int unterhalt_festung_gesamt = 440;
    private static final int radius_festung_gesamt = 36;
    private static final String groesse_festung_gesamt = "9x9";
    private static final int wissen_festung_gesamt = 5900;
    private static final String dauer_festung_gesamt = "15";
    private static final int konstruktionsteile_festung_gesamt = 12;
    private static final int einwohner_plus_festung_gesamt = 6;
    private static final int[] art_festung_gesamt = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_LEDERWAEMSER, PRODUKT_TIERHAEUTE, PRODUKT_EISEN, PRODUKT_FISCH, PRODUKT_VIEH, PRODUKT_KOHLE, PRODUKT_KERZEN, PRODUKT_GEWUERZE, PRODUKT_WEIN};
    private static final int[] menge_festung_gesamt = {2500, 14000, 15100, 9000, 9300, 1300, 2500, 6800, 3800, 9100, 7700, 2100, 3900, 2900};
    private static final String text_festung_gesamt = "";
    // Festung Phase1
    private static final int art_monument_festung_phase1 = MON_FESTUNG_PHASE1;
    private static final int art_bev_festung_phase1 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_festung_phase1 = 1000;
    private static final int unterhalt_festung_phase1 = 0;
    private static final int radius_festung_phase1 = 36;
    private static final String groesse_festung_phase1 = "9x9";
    private static final int wissen_festung_phase1 = 1500;
    private static final String dauer_festung_phase1 = "3.8";
    private static final int konstruktionsteile_festung_phase1 = 3;
    private static final int einwohner_plus_festung_phase1 = 0;
    private static final int[] art_festung_phase1 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_LEDERWAEMSER, PRODUKT_TIERHAEUTE, PRODUKT_EISEN};
    private static final int[] menge_festung_phase1 = {2500, 3400, 1700, 4500, 3000, 1300, 2500, 1500};
    private static final String text_festung_phase1 = "";
    // Festung Phase2
    private static final int art_monument_festung_phase2 = MON_FESTUNG_PHASE2;
    private static final int art_bev_festung_phase2 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_festung_phase2 = 1000;
    private static final int unterhalt_festung_phase2 = 0;
    private static final int radius_festung_phase2 = 36;
    private static final String groesse_festung_phase2 = "9x9";
    private static final int wissen_festung_phase2 = 2100;
    private static final String dauer_festung_phase2 = "5.2";
    private static final int konstruktionsteile_festung_phase2 = 4;
    private static final int einwohner_plus_festung_phase2 = 0;
    private static final int[] art_festung_phase2 = {PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_FISCH, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_VIEH, PRODUKT_KOHLE, PRODUKT_KERZEN};
    private static final int[] menge_festung_phase2 = {2800, 6600, 3800, 2500, 6300, 4700, 4200, 2100};
    private static final String text_festung_phase2 = "";
    // Festung Phase3
    private static final int art_monument_festung_phase3 = MON_FESTUNG_PHASE3;
    private static final int art_bev_festung_phase3 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_festung_phase3 = 1000;
    private static final int unterhalt_festung_phase3 = 0;
    private static final int radius_festung_phase3 = 36;
    private static final String groesse_festung_phase3 = "9x9";
    private static final int wissen_festung_phase3 = 2300;
    private static final String dauer_festung_phase3 = "6";
    private static final int konstruktionsteile_festung_phase3 = 5;
    private static final int einwohner_plus_festung_phase3 = 0;
    private static final int[] art_festung_phase3 = {PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_GEWUERZE, PRODUKT_FLEISCH, PRODUKT_WEIN, PRODUKT_VIEH, PRODUKT_KOHLE, PRODUKT_EISEN};
    private static final int[] menge_festung_phase3 = {7800, 6800, 3900, 2000, 2900, 4400, 3500, 5300};
    private static final String text_festung_phase3 = "";
    // Apfelgarten Gesamt
    private static final int art_monument_apfelgarten_gesamt = MON_APFELGARTEN_GESAMT;
    private static final int art_bev_apfelgarten_gesamt = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_apfelgarten_gesamt = 500;
    private static final int unterhalt_apfelgarten_gesamt = 150;
    private static final int radius_apfelgarten_gesamt = 13;
    private static final String groesse_apfelgarten_gesamt = "8x8";
    private static final int wissen_apfelgarten_gesamt = 2000;
    private static final String dauer_apfelgarten_gesamt = "5";
    private static final int konstruktionsteile_apfelgarten_gesamt = 5;
    private static final int einwohner_plus_apfelgarten_gesamt = 0;
    private static final int[] art_apfelgarten_gesamt = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_FISCH, PRODUKT_BROT, PRODUKT_MOST, PRODUKT_LEINENGEWAENDER, PRODUKT_VIEH, PRODUKT_GEWUERZE, PRODUKT_BIER, PRODUKT_LEDERWAEMSER, PRODUKT_AEPFEL};
    private static final int[] menge_apfelgarten_gesamt = {4700, 4100, 2400, 1000, 2000, 1400, 1300, 900, 800, 2300, 1200, 700};
    private static final String text_apfelgarten_gesamt = "";
    // Apfelgarten Phase1
    private static final int art_monument_apfelgarten_phase1 = MON_APFELGARTEN_PHASE1;
    private static final int art_bev_apfelgarten_phase1 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_apfelgarten_phase1 = 500;
    private static final int unterhalt_apfelgarten_phase1 = 0;
    private static final int radius_apfelgarten_phase1 = 13;
    private static final String groesse_apfelgarten_phase1 = "8x8";
    private static final int wissen_apfelgarten_phase1 = 800;
    private static final String dauer_apfelgarten_phase1 = "2";
    private static final int konstruktionsteile_apfelgarten_phase1 = 2;
    private static final int einwohner_plus_apfelgarten_phase1 = 0;
    private static final int[] art_apfelgarten_phase1 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_FISCH, PRODUKT_BROT, PRODUKT_MOST, PRODUKT_LEINENGEWAENDER, PRODUKT_VIEH};
    private static final int[] menge_apfelgarten_phase1 = {1800, 1900, 600, 1000, 400, 1400, 1300, 900};
    private static final String text_apfelgarten_phase1 = "";
    // Apfelgarten Phase2
    private static final int art_monument_apfelgarten_phase2 = MON_APFELGARTEN_PHASE2;
    private static final int art_bev_apfelgarten_phase2 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_apfelgarten_phase2 = 500;
    private static final int unterhalt_apfelgarten_phase2 = 0;
    private static final int radius_apfelgarten_phase2 = 13;
    private static final String groesse_apfelgarten_phase2 = "8x8";
    private static final int wissen_apfelgarten_phase2 = 1200;
    private static final String dauer_apfelgarten_phase2 = "3";
    private static final int konstruktionsteile_apfelgarten_phase2 = 3;
    private static final int einwohner_plus_apfelgarten_phase2 = 0;
    private static final int[] art_apfelgarten_phase2 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_BROT, PRODUKT_GEWUERZE, PRODUKT_BIER, PRODUKT_LEDERWAEMSER, PRODUKT_AEPFEL};
    private static final int[] menge_apfelgarten_phase2 = {2900, 2200, 1800, 1600, 800, 2300, 1200, 700};
    private static final String text_apfelgarten_phase2 = "";
    // Weizengarten Gesamt
    private static final int art_monument_weizengarten_gesamt = MON_WEIZENGARTEN_GESAMT;
    private static final int art_bev_weizengarten_gesamt = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_weizengarten_gesamt = 500;
    private static final int unterhalt_weizengarten_gesamt = 150;
    private static final int radius_weizengarten_gesamt = 14;
    private static final String groesse_weizengarten_gesamt = "8x8";
    private static final int wissen_weizengarten_gesamt = 2000;
    private static final String dauer_weizengarten_gesamt = "5";
    private static final int konstruktionsteile_weizengarten_gesamt = 5;
    private static final int einwohner_plus_weizengarten_gesamt = 0;
    private static final int[] art_weizengarten_gesamt = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_BROT, PRODUKT_GEWUERZE, PRODUKT_BIER, PRODUKT_LEINENGEWAENDER, PRODUKT_VIEH, PRODUKT_LEDERWAEMSER, PRODUKT_WEIZEN};
    private static final int[] menge_weizengarten_gesamt = {4800, 4500, 3000, 3200, 1400, 3500, 1500, 400, 1500, 1300};
    private static final String text_weizengarten_gesamt = "";
    // Weizengarten Phase1
    private static final int art_monument_weizengarten_phase1 = MON_WEIZENGARTEN_PHASE1;
    private static final int art_bev_weizengarten_phase1 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_weizengarten_phase1 = 500;
    private static final int unterhalt_weizengarten_phase1 = 0;
    private static final int radius_weizengarten_phase1 = 14;
    private static final String groesse_weizengarten_phase1 = "8x8";
    private static final int wissen_weizengarten_phase1 = 800;
    private static final String dauer_weizengarten_phase1 = "2";
    private static final int konstruktionsteile_weizengarten_phase1 = 2;
    private static final int einwohner_plus_weizengarten_phase1 = 0;
    private static final int[] art_weizengarten_phase1 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_BROT, PRODUKT_GEWUERZE, PRODUKT_BIER, PRODUKT_LEINENGEWAENDER, PRODUKT_VIEH};
    private static final int[] menge_weizengarten_phase1 = {1600, 2100, 1100, 1200, 800, 1000, 1500, 400};
    private static final String text_weizengarten_phase1 = "";
    // Weizengarten Phase2
    private static final int art_monument_weizengarten_phase2 = MON_WEIZENGARTEN_PHASE2;
    private static final int art_bev_weizengarten_phase2 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_weizengarten_phase2 = 500;
    private static final int unterhalt_weizengarten_phase2 = 0;
    private static final int radius_weizengarten_phase2 = 14;
    private static final String groesse_weizengarten_phase2 = "8x8";
    private static final int wissen_weizengarten_phase2 = 1200;
    private static final String dauer_weizengarten_phase2 = "3";
    private static final int konstruktionsteile_weizengarten_phase2 = 3;
    private static final int einwohner_plus_weizengarten_phase2 = 0;
    private static final int[] art_weizengarten_phase2 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_BROT, PRODUKT_GEWUERZE, PRODUKT_BIER, PRODUKT_LEDERWAEMSER, PRODUKT_WEIZEN};
    private static final int[] menge_weizengarten_phase2 = {};
    private static final String text_weizengarten_phase2 = "";
    // Hanfgarten Gesamt
    private static final int art_monument_hanfgarten_gesamt = MON_HANFGARTEN_GESAMT;
    private static final int art_bev_hanfgarten_gesamt = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_hanfgarten_gesamt = 500;
    private static final int unterhalt_hanfgarten_gesamt = 150;
    private static final int radius_hanfgarten_gesamt = 13;
    private static final String groesse_hanfgarten_gesamt = "8x8";
    private static final int wissen_hanfgarten_gesamt = 2800;
    private static final String dauer_hanfgarten_gesamt = "7";
    private static final int konstruktionsteile_hanfgarten_gesamt = 5;
    private static final int einwohner_plus_hanfgarten_gesamt = 0;
    private static final int[] art_hanfgarten_gesamt = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_GEWUERZE, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_LEDERWAEMSER, PRODUKT_VIEH, PRODUKT_GLAS, PRODUKT_HANF};
    private static final int[] menge_hanfgarten_gesamt = {5300, 6500, 300, 2000, 1200, 3600, 3500, 600, 300, 3300};
    private static final String text_hanfgarten_gesamt = "";
    // Hanfgarten Phase1
    private static final int art_monument_hanfgarten_phase1 = MON_HANFGARTEN_PHASE1;
    private static final int art_bev_hanfgarten_phase1 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_hanfgarten_phase1 = 500;
    private static final int unterhalt_hanfgarten_phase1 = 0;
    private static final int radius_hanfgarten_phase1 = 13;
    private static final String groesse_hanfgarten_phase1 = "8x8";
    private static final int wissen_hanfgarten_phase1 = 1100;
    private static final String dauer_hanfgarten_phase1 = "3";
    private static final int konstruktionsteile_hanfgarten_phase1 = 2;
    private static final int einwohner_plus_hanfgarten_phase1 = 0;
    private static final int[] art_hanfgarten_phase1 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_GEWUERZE, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_LEDERWAEMSER, PRODUKT_VIEH};
    private static final int[] menge_hanfgarten_phase1 = {1100, 2300, 300, 400, 600, 1400, 900, 600};
    private static final String text_hanfgarten_phase1 = "";
    // Hanfgarten Phase2
    private static final int art_monument_hanfgarten_phase2 = MON_HANFGARTEN_PHASE2;
    private static final int art_bev_hanfgarten_phase2 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_hanfgarten_phase2 = 500;
    private static final int unterhalt_hanfgarten_phase2 = 0;
    private static final int radius_hanfgarten_phase2 = 13;
    private static final String groesse_hanfgarten_phase2 = "8x8";
    private static final int wissen_hanfgarten_phase2 = 1700;
    private static final String dauer_hanfgarten_phase2 = "4";
    private static final int konstruktionsteile_hanfgarten_phase2 = 3;
    private static final int einwohner_plus_hanfgarten_phase2 = 0;
    private static final int[] art_hanfgarten_phase2 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_GLAS, PRODUKT_GEWUERZE, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_LEDERWAEMSER, PRODUKT_HANF};
    private static final int[] menge_hanfgarten_phase2 = {4200, 4200, 300, 1600, 600, 2200, 2600, 3300};
    private static final String text_hanfgarten_phase2 = "";
    // Kraeutergarten Gesamt
    private static final int art_monument_kraeutergarten_gesamt = MON_KRAEUTERGARTEN_GESAMT;
    private static final int art_bev_kraeutergarten_gesamt = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_kraeutergarten_gesamt = 500;
    private static final int unterhalt_kraeutergarten_gesamt = 150;
    private static final int radius_kraeutergarten_gesamt = 13;
    private static final String groesse_kraeutergarten_gesamt = "8x8";
    private static final int wissen_kraeutergarten_gesamt = 2700;
    private static final String dauer_kraeutergarten_gesamt = "7";
    private static final int konstruktionsteile_kraeutergarten_gesamt = 5;
    private static final int einwohner_plus_kraeutergarten_gesamt = 0;
    private static final int[] art_kraeutergarten_gesamt = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_GEWUERZE, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_LEINENGEWAENDER, PRODUKT_VIEH, PRODUKT_GLAS, PRODUKT_BROT, PRODUKT_LEDERWAEMSER, PRODUKT_KRAEUTER};
    private static final int[] menge_kraeutergarten_gesamt = {6200, 6600, 1100, 1600, 900, 4600, 1500, 600, 1200, 2100, 1600, 1600};
    private static final String text_kraeutergarten_gesamt = "";
    // Kraeutergarten Phase1
    private static final int art_monument_kraeutergarten_phase1 = MON_KRAEUTERGARTEN_PHASE1;
    private static final int art_bev_kraeutergarten_phase1 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_kraeutergarten_phase1 = 500;
    private static final int unterhalt_kraeutergarten_phase1 = 0;
    private static final int radius_kraeutergarten_phase1 = 13;
    private static final String groesse_kraeutergarten_phase1 = "8x8";
    private static final int wissen_kraeutergarten_phase1 = 1100;
    private static final String dauer_kraeutergarten_phase1 = "3";
    private static final int konstruktionsteile_kraeutergarten_phase1 = 2;
    private static final int einwohner_plus_kraeutergarten_phase1 = 0;
    private static final int[] art_kraeutergarten_phase1 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_WERKZEUG, PRODUKT_GEWUERZE, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_LEINENGEWAENDER, PRODUKT_VIEH};
    private static final int[] menge_kraeutergarten_phase1 = {1500, 3000, 1100, 500, 900, 1400, 1500, 600};
    private static final String text_kraeutergarten_phase1 = "";
    // Kraeutergarten Phase2
    private static final int art_monument_kraeutergarten_phase2 = MON_KRAEUTERGARTEN_PHASE2;
    private static final int art_bev_kraeutergarten_phase2 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_kraeutergarten_phase2 = 500;
    private static final int unterhalt_kraeutergarten_phase2 = 0;
    private static final int radius_kraeutergarten_phase2 = 13;
    private static final String groesse_kraeutergarten_phase2 = "8x8";
    private static final int wissen_kraeutergarten_phase2 = 1600;
    private static final String dauer_kraeutergarten_phase2 = "4";
    private static final int konstruktionsteile_kraeutergarten_phase2 = 3;
    private static final int einwohner_plus_kraeutergarten_phase2 = 0;
    private static final int[] art_kraeutergarten_phase2 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_GLAS, PRODUKT_BROT, PRODUKT_GEWUERZE, PRODUKT_BIER, PRODUKT_LEDERWAEMSER, PRODUKT_KRAEUTER};
    private static final int[] menge_kraeutergarten_phase2 = {4700, 3600, 1200, 2100, 1100, 3200, 1600, 1600};
    private static final String text_kraeutergarten_phase2 = "";
    // Traubengarten Gesamt
    private static final int art_monument_traubengarten_gesamt = MON_TRAUBENGARTEN_GESAMT;
    private static final int art_bev_traubengarten_gesamt = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_traubengarten_gesamt = 500;
    private static final int unterhalt_traubengarten_gesamt = 150;
    private static final int radius_traubengarten_gesamt = 16;
    private static final String groesse_traubengarten_gesamt = "8x8";
    private static final int wissen_traubengarten_gesamt = 3400;
    private static final String dauer_traubengarten_gesamt = "9";
    private static final int konstruktionsteile_traubengarten_gesamt = 5;
    private static final int einwohner_plus_traubengarten_gesamt = 0;
    private static final int[] art_traubengarten_gesamt = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_GLAS, PRODUKT_GEWUERZE, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_LEINENGEWAENDER, PRODUKT_VIEH, PRODUKT_BROT, PRODUKT_LEDERWAEMSER, PRODUKT_WEINTRAUBEN};
    private static final int[] menge_traubengarten_gesamt = {8600, 9100, 1900, 2000, 1400, 4300, 2400, 1000, 2000, 2600, 1900};
    private static final String text_traubengarten_gesamt = "";
    // Traubengarten Phase1
    private static final int art_monument_traubengarten_phase1 = MON_TRAUBENGARTEN_PHASE1;
    private static final int art_bev_traubengarten_phase1 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_traubengarten_phase1 = 500;
    private static final int unterhalt_traubengarten_phase1 = 0;
    private static final int radius_traubengarten_phase1 = 16;
    private static final String groesse_traubengarten_phase1 = "8x8";
    private static final int wissen_traubengarten_phase1 = 1500;
    private static final String dauer_traubengarten_phase1 = "4";
    private static final int konstruktionsteile_traubengarten_phase1 = 2;
    private static final int einwohner_plus_traubengarten_phase1 = 0;
    private static final int[] art_traubengarten_phase1 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_GLAS, PRODUKT_GEWUERZE, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_LEINENGEWAENDER, PRODUKT_VIEH};
    private static final int[] menge_traubengarten_phase1 = {2200, 4300, 300, 800, 1400, 2700, 2400, 1000};
    private static final String text_traubengarten_phase1 = "";
    // Traubengarten Phase1
    private static final int art_monument_traubengarten_phase2 = MON_TRAUBENGARTEN_PHASE2;
    private static final int art_bev_traubengarten_phase2 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_traubengarten_phase2 = 500;
    private static final int unterhalt_traubengarten_phase2 = 0;
    private static final int radius_traubengarten_phase2 = 16;
    private static final String groesse_traubengarten_phase2 = "8x8";
    private static final int wissen_traubengarten_phase2 = 1900;
    private static final String dauer_traubengarten_phase2 = "5";
    private static final int konstruktionsteile_traubengarten_phase2 = 3;
    private static final int einwohner_plus_traubengarten_phase2 = 0;
    private static final int[] art_traubengarten_phase2 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_GLAS, PRODUKT_BROT, PRODUKT_GEWUERZE, PRODUKT_BIER, PRODUKT_LEDERWAEMSER, PRODUKT_WEINTRAUBEN};
    private static final int[] menge_traubengarten_phase2 = {};
    private static final String text_traubengarten_phase2 = "";
    // Bienenwachsgarten Gesamt
    private static final int art_monument_bienenwachsgarten_gesamt = MON_BIENENWACHSGARTEN_GESAMT;
    private static final int art_bev_bienenwachsgarten_gesamt = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_bienenwachsgarten_gesamt = 500;
    private static final int unterhalt_bienenwachsgarten_gesamt = 150;
    private static final int radius_bienenwachsgarten_gesamt = 11;
    private static final String groesse_bienenwachsgarten_gesamt = "8x8";
    private static final int wissen_bienenwachsgarten_gesamt = 3100;
    private static final String dauer_bienenwachsgarten_gesamt = "9";
    private static final int konstruktionsteile_bienenwachsgarten_gesamt = 5;
    private static final int einwohner_plus_bienenwachsgarten_gesamt = 0;
    private static final int[] art_bienenwachsgarten_gesamt = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_GLAS, PRODUKT_GEWUERZE, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_LEINENGEWAENDER, PRODUKT_VIEH, PRODUKT_BROT, PRODUKT_WEIN, PRODUKT_LEDERWAEMSER, PRODUKT_BIENENWACHS};
    private static final int[] menge_bienenwachsgarten_gesamt = {8800, 9200, 2300, 1800, 900, 1300, 1200, 800, 2800, 1700, 2100, 1300};
    private static final String text_bienenwachsgarten_gesamt = "";
    // Bienenwachsgarten Phase1
    private static final int art_monument_bienenwachsgarten_phase1 = MON_BIENENWACHSGARTEN_PHASE1;
    private static final int art_bev_bienenwachsgarten_phase1 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_bienenwachsgarten_phase1 = 500;
    private static final int unterhalt_bienenwachsgarten_phase1 = 0;
    private static final int radius_bienenwachsgarten_phase1 = 11;
    private static final String groesse_bienenwachsgarten_phase1 = "8x8";
    private static final int wissen_bienenwachsgarten_phase1 = 1500;
    private static final String dauer_bienenwachsgarten_phase1 = "4";
    private static final int konstruktionsteile_bienenwachsgarten_phase1 = 2;
    private static final int einwohner_plus_bienenwachsgarten_phase1 = 0;
    private static final int[] art_bienenwachsgarten_phase1 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_GLAS, PRODUKT_GEWUERZE, PRODUKT_FLEISCH, PRODUKT_BIER, PRODUKT_LEINENGEWAENDER, PRODUKT_VIEH};
    private static final int[] menge_bienenwachsgarten_phase1 = {2300, 4400, 1000, 400, 900, 1300, 1200, 800};
    private static final String text_bienenwachsgarten_phase1 = "";
    // Bienenwachsgarten Phase2
    private static final int art_monument_bienenwachsgarten_phase2 = MON_BIENENWACHSGARTEN_PHASE2;
    private static final int art_bev_bienenwachsgarten_phase2 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_bienenwachsgarten_phase2 = 500;
    private static final int unterhalt_bienenwachsgarten_phase2 = 0;
    private static final int radius_bienenwachsgarten_phase2 = 11;
    private static final String groesse_bienenwachsgarten_phase2 = "8x8";
    private static final int wissen_bienenwachsgarten_phase2 = 1600;
    private static final String dauer_bienenwachsgarten_phase2 = "5";
    private static final int konstruktionsteile_bienenwachsgarten_phase2 = 3;
    private static final int einwohner_plus_bienenwachsgarten_phase2 = 0;
    private static final int[] art_bienenwachsgarten_phase2 = {PRODUKT_HOLZ, PRODUKT_STEIN, PRODUKT_GLAS, PRODUKT_BROT, PRODUKT_GEWUERZE, PRODUKT_WEIN, PRODUKT_LEDERWAEMSER, PRODUKT_BIENENWACHS};
    private static final int[] menge_bienenwachsgarten_phase2 = {6500, 4800, 1300, 2800, 1400, 1700, 2100, 1300};
    private static final String text_bienenwachsgarten_phase2 = "";

    // MONUMENTE
    private Monument monumentBibliothekGesamt;
    private Monument monumentBibliothekPhase1;
    private Monument monumentBibliothekPhase2;
    private Monument monumentKaiserdomGesamt;
    private Monument monumentKaiserdomPhase1;
    private Monument monumentKaiserdomPhase2;
    private Monument monumentKaiserdomPhase3;
    private Monument monumentAmphitheaterGesamt;
    private Monument monumentAmphitheaterPhase1;
    private Monument monumentAmphitheaterPhase2;
    private Monument monumentAmphitheaterPhase3;
    private Monument monumentFestungGesamt;
    private Monument monumentFestungPhase1;
    private Monument monumentFestungPhase2;
    private Monument monumentFestungPhase3;
    private Monument monumentApfelgartenGesamt;
    private Monument monumentApfelgartenPhase1;
    private Monument monumentApfelgartenPhase2;
    private Monument monumentWeizengartenGesamt;
    private Monument monumentWeizengartenPhase1;
    private Monument monumentWeizengartenPhase2;
    private Monument monumentHanfgartenGesamt;
    private Monument monumentHanfgartenPhase1;
    private Monument monumentHanfgartenPhase2;
    private Monument monumentKraeutergartenGesamt;
    private Monument monumentKraeutergartenPhase1;
    private Monument monumentKraeutergartenPhase2;
    private Monument monumentTraubengartenGesamt;
    private Monument monumentTraubengartenPhase1;
    private Monument monumentTraubengartenPhase2;
    private Monument monumentBienenwachsgartenGesamt;
    private Monument monumentBienenwachsgartenPhase1;
    private Monument monumentBienenwachsgartenPhase2;

    // Konstruktor
    public Monumentersteller(Activity activity){
        this.activity = activity;
    }

    // Alle Monumente erstellen
    public void erstelleMonumente(){
        erstelleBibliothek();
        erstelleKaiserdom();
        erstelleAmphitheater();
        erstelleFestung();
        erstelleApfelgarten();
        erstelleWeizengarten();
        erstelleHanfgarten();
        erstelleKraeutergarten();
        erstelleTraubengarten();
        erstelleBienenwachsgarten();
    }

    // Bibliothek erstellen
    public void erstelleBibliothek(){
        erstelleBibliothekGesamt();
        erstelleBibliothekPhase1();
        erstelleBibliothekPhase2();
    }

    public void erstelleKaiserdom(){
        erstelleKaiserdomGesamt();
        erstelleKaiserdomPhase1();
        erstelleKaiserdomPhase2();
        erstelleKaiserdomPhase3();
    }

    public void erstelleAmphitheater(){
        erstelleAmphitheaterGesamt();
        erstelleAmphitheaterPhase1();
        erstelleAmphitheaterPhase2();
        erstelleAmphitheaterPhase3();
    }

    public void erstelleFestung(){
        erstelleFestungGesamt();
        erstelleFestungPhase1();
        erstelleFestungPhase2();
        erstelleFestungPhase3();
    }

    public void erstelleApfelgarten(){
        erstelleApfelgartenGesamt();
        erstelleApfelgartenPhase1();
        erstelleApfelgartenPhase2();
    }

    public void erstelleWeizengarten(){
        erstelleWeizengartenGesamt();
        erstelleWeizengartenPhase1();
        erstelleWeizengartenPhase2();
    }

    public void erstelleHanfgarten(){
        erstelleHanfgartenGesamt();
        erstelleHanfgartenPhase1();
        erstelleHanfgartenPhase2();
    }

    public void erstelleKraeutergarten(){
        erstelleKraeutergartenGesamt();
        erstelleKraeutergartenPhase1();
        erstelleKraeutergartenPhase2();
    }

    public void erstelleTraubengarten(){
        erstelleTraubengartenGesamt();
        erstelleTraubengartenPhase1();
        erstelleTraubengartenPhase2();
    }

    public void erstelleBienenwachsgarten(){
        erstelleBienenwachsgartenGesamt();
        erstelleBienenwachsgartenPhase1();
        erstelleBienenwachsgartenPhase2();
    }

    // Aufbau der Arrays
    // [0] = int einwohnerArt
    // [1] = int anzahlEinwohner
    // [2] = int unterhalt
    // [3] = int radius
    // [4] = String platzbedarf
    // [5] = int wissen
    // [6] = int dauer
    // [7] = int konstruktionsteile
    // [8] = int einwohnerPlus
    // [9] = int[] artProdukte
    // [10] = int[] mengeProdukte
    // [11] = String text

    /* MONUMENTE */
    private void erstelleBibliothekGesamt(){
        monumentBibliothekGesamt = new Monument(art_monument_bibliothek_gesamt, art_bev_bibliothek_gesamt, anzahl_bev_bibliothek_gesamt, unterhalt_bibliothek_gesamt, radius_bibliothek_gesamt,
                groesse_bibliothek_gesamt, wissen_bibliothek_gesamt, dauer_bibliothek_gesamt, konstruktionsteile_bibliothek_gesamt, einwohner_plus_bibliothek_gesamt,
                art_bibliothek_gesamt, menge_bibliothek_gesamt, text_bibliothek_gesamt);
    }
    private void erstelleBibliothekPhase1(){
        monumentBibliothekPhase1 = new Monument(art_monument_bibliothek_phase1, art_bev_bibliothek_phase1, anzahl_bev_bibliothek_phase1, unterhalt_bibliothek_phase1, radius_bibliothek_phase1,
                groesse_bibliothek_phase1, wissen_bibliothek_phase1, dauer_bibliothek_phase1, konstruktionsteile_bibliothek_phase1, einwohner_plus_bibliothek_phase1,
                art_bibliothek_phase1, menge_bibliothek_phase1, text_bibliothek_phase1);
    }
    private void erstelleBibliothekPhase2(){
        monumentBibliothekPhase2 = new Monument(art_monument_bibliothek_phase2, art_bev_bibliothek_phase2, anzahl_bev_bibliothek_phase2, unterhalt_bibliothek_phase2, radius_bibliothek_phase2,
                groesse_bibliothek_phase2, wissen_bibliothek_phase2, dauer_bibliothek_phase2, konstruktionsteile_bibliothek_phase2, einwohner_plus_bibliothek_phase2,
                art_bibliothek_phase2, menge_bibliothek_phase2, text_bibliothek_phase2);
    }
    private void erstelleKaiserdomGesamt(){
        monumentKaiserdomGesamt = new Monument(art_monument_kaiserdom_gesamt, art_bev_kaiserdom_gesamt, anzahl_bev_kaiserdom_gesamt, unterhalt_kaiserdom_gesamt, radius_kaiserdom_gesamt,
                groesse_kaiserdom_gesamt, wissen_kaiserdom_gesamt, dauer_kaiserdom_gesamt, konstruktionsteile_kaiserdom_gesamt, einwohner_plus_kaiserdom_gesamt,
                art_kaiserdom_gesamt, menge_kaiserdom_gesamt, text_kaiserdom_gesamt);
    }
    private void erstelleKaiserdomPhase1(){
        monumentKaiserdomPhase1 = new Monument(art_monument_kaiserdom_phase1, art_bev_kaiserdom_phase1, anzahl_bev_kaiserdom_phase1, unterhalt_kaiserdom_phase1, radius_kaiserdom_phase1,
                groesse_kaiserdom_phase1, wissen_kaiserdom_phase1, dauer_kaiserdom_phase1, konstruktionsteile_kaiserdom_phase1, einwohner_plus_kaiserdom_phase1,
                art_kaiserdom_phase1, menge_kaiserdom_phase1, text_kaiserdom_phase1);
    }
    private void erstelleKaiserdomPhase2(){
        monumentKaiserdomPhase2 = new Monument(art_monument_kaiserdom_phase2, art_bev_kaiserdom_phase2, anzahl_bev_kaiserdom_phase2, unterhalt_kaiserdom_phase2, radius_kaiserdom_phase2,
                groesse_kaiserdom_phase2, wissen_kaiserdom_phase2, dauer_kaiserdom_phase2, konstruktionsteile_kaiserdom_phase2, einwohner_plus_kaiserdom_phase2,
                art_kaiserdom_phase2, menge_kaiserdom_phase2, text_kaiserdom_phase2);
    }
    private void erstelleKaiserdomPhase3(){
        monumentKaiserdomPhase3 = new Monument(art_monument_kaiserdom_phase3, art_bev_kaiserdom_phase3, anzahl_bev_kaiserdom_phase3, unterhalt_kaiserdom_phase3, radius_kaiserdom_phase3,
                groesse_kaiserdom_phase3, wissen_kaiserdom_phase3, dauer_kaiserdom_phase3, konstruktionsteile_kaiserdom_phase3, einwohner_plus_kaiserdom_phase3,
                art_kaiserdom_phase3, menge_kaiserdom_phase3, text_kaiserdom_phase3);
    }
    private void erstelleAmphitheaterGesamt(){
        monumentAmphitheaterGesamt = new Monument(art_monument_amphitheater_gesamt, art_bev_amphitheater_gesamt, anzahl_bev_amphitheater_gesamt, unterhalt_amphitheater_gesamt, radius_amphitheater_gesamt,
                groesse_amphitheater_gesamt, wissen_amphitheater_gesamt, dauer_amphitheater_gesamt, konstruktionsteile_amphitheater_gesamt, einwohner_plus_amphitheater_gesamt,
                art_amphitheater_gesamt, menge_amphitheater_gesamt, text_amphitheater_gesamt);
    }
    private void erstelleAmphitheaterPhase1(){
        monumentAmphitheaterPhase1 = new Monument(art_monument_amphitheater_phase1, art_bev_amphitheater_phase1, anzahl_bev_amphitheater_phase1, unterhalt_amphitheater_phase1, radius_amphitheater_phase1,
                groesse_amphitheater_phase1, wissen_amphitheater_phase1, dauer_amphitheater_phase1, konstruktionsteile_amphitheater_phase1, einwohner_plus_amphitheater_phase1,
                art_amphitheater_phase1, menge_amphitheater_phase1, text_amphitheater_phase1);
    }
    private void erstelleAmphitheaterPhase2(){
        monumentAmphitheaterPhase2 = new Monument(art_monument_amphitheater_phase2, art_bev_amphitheater_phase2, anzahl_bev_amphitheater_phase2, unterhalt_amphitheater_phase2, radius_amphitheater_phase2,
                groesse_amphitheater_phase2, wissen_amphitheater_phase2, dauer_amphitheater_phase2, konstruktionsteile_amphitheater_phase2, einwohner_plus_amphitheater_phase2,
                art_amphitheater_phase2, menge_amphitheater_phase2, text_amphitheater_phase2);
    }
    private void erstelleAmphitheaterPhase3(){
        monumentAmphitheaterPhase3 = new Monument(art_monument_amphitheater_phase3, art_bev_amphitheater_phase3, anzahl_bev_amphitheater_phase3, unterhalt_amphitheater_phase3, radius_amphitheater_phase3,
                groesse_amphitheater_phase3, wissen_amphitheater_phase3, dauer_amphitheater_phase3, konstruktionsteile_amphitheater_phase3, einwohner_plus_amphitheater_phase3,
                art_amphitheater_phase3, menge_amphitheater_phase3, text_amphitheater_phase3);
    }
    private void erstelleFestungGesamt(){
        monumentFestungGesamt = new Monument(art_monument_festung_gesamt, art_bev_festung_gesamt, anzahl_bev_festung_gesamt, unterhalt_festung_gesamt, radius_festung_gesamt,
                groesse_festung_gesamt, wissen_festung_gesamt, dauer_festung_gesamt, konstruktionsteile_festung_gesamt, einwohner_plus_festung_gesamt,
                art_festung_gesamt, menge_festung_gesamt, text_festung_gesamt);
    }
    private void erstelleFestungPhase1(){
        monumentFestungPhase1 = new Monument(art_monument_festung_phase1, art_bev_festung_phase1, anzahl_bev_festung_phase1, unterhalt_festung_phase1, radius_festung_phase1,
                groesse_festung_phase1, wissen_festung_phase1, dauer_festung_phase1, konstruktionsteile_festung_phase1, einwohner_plus_festung_phase1,
                art_festung_phase1, menge_festung_phase1, text_festung_phase1);
    }
    private void erstelleFestungPhase2(){
        monumentFestungPhase2 = new Monument(art_monument_festung_phase2, art_bev_festung_phase2, anzahl_bev_festung_phase2, unterhalt_festung_phase2, radius_festung_phase2,
                groesse_festung_phase2, wissen_festung_phase2, dauer_festung_phase2, konstruktionsteile_festung_phase2, einwohner_plus_festung_phase2,
                art_festung_phase2, menge_festung_phase2, text_festung_phase2);
    }
    private void erstelleFestungPhase3(){
        monumentFestungPhase3 = new Monument(art_monument_festung_phase3, art_bev_festung_phase3, anzahl_bev_festung_phase3, unterhalt_festung_phase3, radius_festung_phase3,
                groesse_festung_phase3, wissen_festung_phase3, dauer_festung_phase3, konstruktionsteile_festung_phase3, einwohner_plus_festung_phase3,
                art_festung_phase3, menge_festung_phase3, text_festung_phase3);
    }
    private void erstelleApfelgartenGesamt(){
        monumentApfelgartenGesamt = new Monument(art_monument_apfelgarten_gesamt, art_bev_apfelgarten_gesamt, anzahl_bev_apfelgarten_gesamt, unterhalt_apfelgarten_gesamt, radius_apfelgarten_gesamt,
                groesse_apfelgarten_gesamt, wissen_apfelgarten_gesamt, dauer_apfelgarten_gesamt, konstruktionsteile_apfelgarten_gesamt, einwohner_plus_apfelgarten_gesamt,
                art_apfelgarten_gesamt, menge_apfelgarten_gesamt, text_apfelgarten_gesamt);
    }
    private void erstelleApfelgartenPhase1(){
        monumentApfelgartenPhase1 = new Monument(art_monument_apfelgarten_phase1, art_bev_apfelgarten_phase1, anzahl_bev_apfelgarten_phase1, unterhalt_apfelgarten_phase1, radius_apfelgarten_phase1,
                groesse_apfelgarten_phase1, wissen_apfelgarten_phase1, dauer_apfelgarten_phase1, konstruktionsteile_apfelgarten_phase1, einwohner_plus_apfelgarten_phase1,
                art_apfelgarten_phase1, menge_apfelgarten_phase1, text_apfelgarten_phase1);
    }
    private void erstelleApfelgartenPhase2(){
        monumentApfelgartenPhase2 = new Monument(art_monument_apfelgarten_phase2, art_bev_apfelgarten_phase2, anzahl_bev_apfelgarten_phase2, unterhalt_apfelgarten_phase2, radius_apfelgarten_phase2,
                groesse_apfelgarten_phase2, wissen_apfelgarten_phase2, dauer_apfelgarten_phase2, konstruktionsteile_apfelgarten_phase2, einwohner_plus_apfelgarten_phase2,
                art_apfelgarten_phase2, menge_apfelgarten_phase2, text_apfelgarten_phase2);
    }
    private void erstelleWeizengartenGesamt(){
        monumentWeizengartenGesamt = new Monument(art_monument_weizengarten_gesamt, art_bev_weizengarten_gesamt, anzahl_bev_weizengarten_gesamt, unterhalt_weizengarten_gesamt, radius_weizengarten_gesamt,
                groesse_weizengarten_gesamt, wissen_weizengarten_gesamt, dauer_weizengarten_gesamt, konstruktionsteile_weizengarten_gesamt, einwohner_plus_weizengarten_gesamt,
                art_weizengarten_gesamt, menge_weizengarten_gesamt, text_weizengarten_gesamt);
    }
    private void erstelleWeizengartenPhase1(){
        monumentWeizengartenPhase1 = new Monument(art_monument_weizengarten_phase1, art_bev_weizengarten_phase1, anzahl_bev_weizengarten_phase1, unterhalt_weizengarten_phase1, radius_weizengarten_phase1,
                groesse_weizengarten_phase1, wissen_weizengarten_phase1, dauer_weizengarten_phase1, konstruktionsteile_weizengarten_phase1, einwohner_plus_weizengarten_phase1,
                art_weizengarten_phase1, menge_weizengarten_phase1, text_weizengarten_phase1);
    }
    private void erstelleWeizengartenPhase2(){
        monumentWeizengartenPhase2 = new Monument(art_monument_weizengarten_phase2, art_bev_weizengarten_phase2, anzahl_bev_weizengarten_phase2, unterhalt_weizengarten_phase2, radius_weizengarten_phase2,
                groesse_weizengarten_phase2, wissen_weizengarten_phase2, dauer_weizengarten_phase2, konstruktionsteile_weizengarten_phase2, einwohner_plus_weizengarten_phase2,
                art_weizengarten_phase2, menge_weizengarten_phase2, text_weizengarten_phase2);
    }
    private void erstelleHanfgartenGesamt(){
        monumentHanfgartenGesamt = new Monument(art_monument_hanfgarten_gesamt, art_bev_hanfgarten_gesamt, anzahl_bev_hanfgarten_gesamt, unterhalt_hanfgarten_gesamt, radius_hanfgarten_gesamt,
                groesse_hanfgarten_gesamt, wissen_hanfgarten_gesamt, dauer_hanfgarten_gesamt, konstruktionsteile_hanfgarten_gesamt, einwohner_plus_hanfgarten_gesamt,
                art_hanfgarten_gesamt, menge_hanfgarten_gesamt, text_hanfgarten_gesamt);
    }
    private void erstelleHanfgartenPhase1(){
        monumentHanfgartenPhase1 = new Monument(art_monument_hanfgarten_phase1, art_bev_hanfgarten_phase1, anzahl_bev_hanfgarten_phase1, unterhalt_hanfgarten_phase1, radius_hanfgarten_phase1,
                groesse_hanfgarten_phase1, wissen_hanfgarten_phase1, dauer_hanfgarten_phase1, konstruktionsteile_hanfgarten_phase1, einwohner_plus_hanfgarten_phase1,
                art_hanfgarten_phase1, menge_hanfgarten_phase1, text_hanfgarten_phase1);
    }
    private void erstelleHanfgartenPhase2(){
        monumentHanfgartenPhase2 = new Monument(art_monument_hanfgarten_phase2, art_bev_hanfgarten_phase2, anzahl_bev_hanfgarten_phase2, unterhalt_hanfgarten_phase2, radius_hanfgarten_phase2,
                groesse_hanfgarten_phase2, wissen_hanfgarten_phase2, dauer_hanfgarten_phase2, konstruktionsteile_hanfgarten_phase2, einwohner_plus_hanfgarten_phase2,
                art_hanfgarten_phase2, menge_hanfgarten_phase2, text_hanfgarten_phase2);
    }
    private void erstelleKraeutergartenGesamt(){
        monumentKraeutergartenGesamt = new Monument(art_monument_kraeutergarten_gesamt, art_bev_kraeutergarten_gesamt, anzahl_bev_kraeutergarten_gesamt, unterhalt_kraeutergarten_gesamt, radius_kraeutergarten_gesamt,
                groesse_kraeutergarten_gesamt, wissen_kraeutergarten_gesamt, dauer_kraeutergarten_gesamt, konstruktionsteile_kraeutergarten_gesamt, einwohner_plus_kraeutergarten_gesamt,
                art_kraeutergarten_gesamt, menge_kraeutergarten_gesamt, text_kraeutergarten_gesamt);
    }
    private void erstelleKraeutergartenPhase1(){
        monumentKraeutergartenPhase1 = new Monument(art_monument_kraeutergarten_phase1, art_bev_kraeutergarten_phase1, anzahl_bev_kraeutergarten_phase1, unterhalt_kraeutergarten_phase1, radius_kraeutergarten_phase1,
                groesse_kraeutergarten_phase1, wissen_kraeutergarten_phase1, dauer_kraeutergarten_phase1, konstruktionsteile_kraeutergarten_phase1, einwohner_plus_kraeutergarten_phase1,
                art_kraeutergarten_phase1, menge_kraeutergarten_phase1, text_kraeutergarten_phase1);
    }
    private void erstelleKraeutergartenPhase2(){
        monumentKraeutergartenPhase2 = new Monument(art_monument_kraeutergarten_phase2, art_bev_kraeutergarten_phase2, anzahl_bev_kraeutergarten_phase2, unterhalt_kraeutergarten_phase2, radius_kraeutergarten_phase2,
                groesse_kraeutergarten_phase2, wissen_kraeutergarten_phase2, dauer_kraeutergarten_phase2, konstruktionsteile_kraeutergarten_phase2, einwohner_plus_kraeutergarten_phase2,
                art_kraeutergarten_phase2, menge_kraeutergarten_phase2, text_kraeutergarten_phase2);
    }
    private void erstelleTraubengartenGesamt(){
        monumentTraubengartenGesamt = new Monument(art_monument_traubengarten_gesamt, art_bev_traubengarten_gesamt, anzahl_bev_traubengarten_gesamt, unterhalt_traubengarten_gesamt, radius_traubengarten_gesamt,
                groesse_traubengarten_gesamt, wissen_traubengarten_gesamt, dauer_traubengarten_gesamt, konstruktionsteile_traubengarten_gesamt, einwohner_plus_traubengarten_gesamt,
                art_traubengarten_gesamt, menge_traubengarten_gesamt, text_traubengarten_gesamt);
    }
    private void erstelleTraubengartenPhase1(){
        monumentTraubengartenPhase1 = new Monument(art_monument_traubengarten_phase1, art_bev_traubengarten_phase1, anzahl_bev_traubengarten_phase1, unterhalt_traubengarten_phase1, radius_traubengarten_phase1,
                groesse_traubengarten_phase1, wissen_traubengarten_phase1, dauer_traubengarten_phase1, konstruktionsteile_traubengarten_phase1, einwohner_plus_traubengarten_phase1,
                art_traubengarten_phase1, menge_traubengarten_phase1, text_traubengarten_phase1);
    }
    private void erstelleTraubengartenPhase2(){
        monumentTraubengartenPhase2 = new Monument(art_monument_traubengarten_phase2, art_bev_traubengarten_phase2, anzahl_bev_traubengarten_phase2, unterhalt_traubengarten_phase2, radius_traubengarten_phase2,
                groesse_traubengarten_phase2, wissen_traubengarten_phase2, dauer_traubengarten_phase2, konstruktionsteile_traubengarten_phase2, einwohner_plus_traubengarten_phase2,
                art_traubengarten_phase2, menge_traubengarten_phase2, text_traubengarten_phase2);
    }
    private void erstelleBienenwachsgartenGesamt(){
        monumentBienenwachsgartenGesamt = new Monument(art_monument_bienenwachsgarten_gesamt, art_bev_bienenwachsgarten_gesamt, anzahl_bev_bienenwachsgarten_gesamt, unterhalt_bienenwachsgarten_gesamt, radius_bienenwachsgarten_gesamt,
                groesse_bienenwachsgarten_gesamt, wissen_bienenwachsgarten_gesamt, dauer_bienenwachsgarten_gesamt, konstruktionsteile_bienenwachsgarten_gesamt, einwohner_plus_bienenwachsgarten_gesamt,
                art_bienenwachsgarten_gesamt, menge_bienenwachsgarten_gesamt, text_bienenwachsgarten_gesamt);
    }
    private void erstelleBienenwachsgartenPhase1(){
        monumentBienenwachsgartenPhase1 = new Monument(art_monument_bienenwachsgarten_phase1, art_bev_bienenwachsgarten_phase1, anzahl_bev_bienenwachsgarten_phase1, unterhalt_bienenwachsgarten_phase1, radius_bienenwachsgarten_phase1,
                groesse_bienenwachsgarten_phase1, wissen_bienenwachsgarten_phase1, dauer_bienenwachsgarten_phase1, konstruktionsteile_bienenwachsgarten_phase1, einwohner_plus_bienenwachsgarten_phase1,
                art_bienenwachsgarten_phase1, menge_bienenwachsgarten_phase1, text_bienenwachsgarten_phase1);
    }
    private void erstelleBienenwachsgartenPhase2(){
        monumentBienenwachsgartenPhase2 = new Monument(art_monument_bienenwachsgarten_phase2, art_bev_bienenwachsgarten_phase2, anzahl_bev_bienenwachsgarten_phase2, unterhalt_bienenwachsgarten_phase2, radius_bienenwachsgarten_phase2,
                groesse_bienenwachsgarten_phase2, wissen_bienenwachsgarten_phase2, dauer_bienenwachsgarten_phase2, konstruktionsteile_bienenwachsgarten_phase2, einwohner_plus_bienenwachsgarten_phase2,
                art_bienenwachsgarten_phase2, menge_bienenwachsgarten_phase2, text_bienenwachsgarten_phase2);
    }

    /* GETTER */
    public Monument getMonumentBibliothekGesamt() {
        return monumentBibliothekGesamt;
    }

    public Monument getMonumentBibliothekPhase1() {
        return monumentBibliothekPhase1;
    }

    public Monument getMonumentBibliothekPhase2() {
        return monumentBibliothekPhase2;
    }

    public Monument getMonumentKaiserdomGesamt() {
        return monumentKaiserdomGesamt;
    }

    public Monument getMonumentKaiserdomPhase1() {
        return monumentKaiserdomPhase1;
    }

    public Monument getMonumentKaiserdomPhase2() {
        return monumentKaiserdomPhase2;
    }

    public Monument getMonumentKaiserdomPhase3() {
        return monumentKaiserdomPhase3;
    }

    public Monument getMonumentAmphitheaterGesamt() {
        return monumentAmphitheaterGesamt;
    }

    public Monument getMonumentAmphitheaterPhase1() {
        return monumentAmphitheaterPhase1;
    }

    public Monument getMonumentAmphitheaterPhase2() {
        return monumentAmphitheaterPhase2;
    }

    public Monument getMonumentAmphitheaterPhase3() {
        return monumentAmphitheaterPhase3;
    }

    public Monument getMonumentFestungGesamt() {
        return monumentFestungGesamt;
    }

    public Monument getMonumentFestungPhase1() {
        return monumentFestungPhase1;
    }

    public Monument getMonumentFestungPhase2() {
        return monumentFestungPhase2;
    }

    public Monument getMonumentFestungPhase3() {
        return monumentFestungPhase3;
    }

    public Monument getMonumentApfelgartenGesamt() {
        return monumentApfelgartenGesamt;
    }

    public Monument getMonumentApfelgartenPhase1() {
        return monumentApfelgartenPhase1;
    }

    public Monument getMonumentApfelgartenPhase2() {
        return monumentApfelgartenPhase2;
    }

    public Monument getMonumentWeizengartenGesamt() {
        return monumentWeizengartenGesamt;
    }

    public Monument getMonumentWeizengartenPhase1() {
        return monumentWeizengartenPhase1;
    }

    public Monument getMonumentWeizengartenPhase2() {
        return monumentWeizengartenPhase2;
    }

    public Monument getMonumentHanfgartenGesamt() {
        return monumentHanfgartenGesamt;
    }

    public Monument getMonumentHanfgartenPhase1() {
        return monumentHanfgartenPhase1;
    }

    public Monument getMonumentHanfgartenPhase2() {
        return monumentHanfgartenPhase2;
    }

    public Monument getMonumentKraeutergartenGesamt() {
        return monumentKraeutergartenGesamt;
    }

    public Monument getMonumentKraeutergartenPhase1() {
        return monumentKraeutergartenPhase1;
    }

    public Monument getMonumentKraeutergartenPhase2() {
        return monumentKraeutergartenPhase2;
    }

    public Monument getMonumentTraubengartenGesamt() {
        return monumentTraubengartenGesamt;
    }

    public Monument getMonumentTraubengartenPhase1() {
        return monumentTraubengartenPhase1;
    }

    public Monument getMonumentTraubengartenPhase2() {
        return monumentTraubengartenPhase2;
    }

    public Monument getMonumentBienenwachsgartenGesamt() {
        return monumentBienenwachsgartenGesamt;
    }

    public Monument getMonumentBienenwachsgartenPhase1() {
        return monumentBienenwachsgartenPhase1;
    }

    public Monument getMonumentBienenwachsgartenPhase2() {
        return monumentBienenwachsgartenPhase2;
    }
}
