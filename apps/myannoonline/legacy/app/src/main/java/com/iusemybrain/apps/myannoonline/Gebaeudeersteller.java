package com.iusemybrain.apps.myannoonline;

import android.app.Activity;

import com.iusemybrain.apps.myannoonline.dialogcontent.Gebaeude;

/**
 * Created by Markus on 11.04.2015.
 */
class Gebaeudeersteller {

    private Dialogersteller dialogersteller;
    private final Activity activity;

    // IDs der Bev�lkerungsgruppen
    private static final int GB_BEV_KEINE = 200;
    private static final int GB_BEV_BAUER = 201;
    private static final int GB_BEV_HANDWERKER = 202;
    private static final int GB_BEV_KAUFMANN = 203;
    private static final int GB_BEV_ADLIGER = 204;
    
    /* PRODUKTIONSGEB�UDE */
    
    // Holzf�ller
    private static final int art_bev_holzfaeller = GB_BEV_BAUER;
    private static final int anzahl_bev_holzfaeller = 2;
    private static final int anzahl_sonder_holzfaeller = 50;
    private static final int unterhalt_holzfaeller = 2;
    private static final int radius_holzfaeller = 9;
    private static final String groesse_holzfaeller = "3x3";
    private static final String anzahl_auslastung_holzfaeller = "1x (100%)";
    private static int produktionsdauer_holzfaeller = 105;
    private static final String baukosten_holzfaeller = "950";
    private static final int[] ressourcen_holzfaeller = {0, 0, 0, 0};

    // Steinbruch
    private static final int art_bev_steinbruch = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_steinbruch = 1;
    private static final int anzahl_sonder_steinbruch = 1;
    private static final int unterhalt_steinbruch = 6;
    private static final int radius_steinbruch = 0;
    private static final String groesse_steinbruch = "3x3";
    private static final String anzahl_auslastung_steinbruch = "1x (100%)";
    private static int produktionsdauer_steinbruch = 180;
    private static final String baukosten_steinbruch = "10.2k";
    private static final int[] ressourcen_steinbruch = {45, 0, 0, 0};

    // Eisenmine
    private static final int art_bev_eisenmine = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_eisenmine = 1;
    private static final int anzahl_sonder_eisenmine = 1;
    private static final int unterhalt_eisenmine = 12;
    private static final int radius_eisenmine = 0;
    private static final String groesse_eisenmine = "3x3";
    private static final String anzahl_auslastung_eisenmine = "1x (100%)";
    private static int produktionsdauer_eisenmine = 210;
    private static final String baukosten_eisenmine = "135k";
    private static final int[] ressourcen_eisenmine = {320, 70, 0, 0};

    // K�hlerh�tte
    private static final int art_bev_koehlerhuette = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_koehlerhuette = 1500;
    private static final int anzahl_sonder_koehlerhuette = 0;
    private static final int unterhalt_koehlerhuette = 14;
    private static final int radius_koehlerhuette = 13;
    private static final String groesse_koehlerhuette = "3x3";
    private static final String anzahl_auslastung_koehlerhuette = "1x (100%)";
    private static int produktionsdauer_koehlerhuette = 210;
    private static final String baukosten_koehlerhuette = "55k";
    private static final int[] ressourcen_koehlerhuette = {150, 50, 0, 0};

    // Kohlemine
    private static final int art_bev_kohlemine = GB_BEV_ADLIGER;
    private static final int anzahl_bev_kohlemine = 1;
    private static final int anzahl_sonder_kohlemine = 1;
    private static final int unterhalt_kohlemine = 30;
    private static final int radius_kohlemine = 0;
    private static final String groesse_kohlemine = "3x3";
    private static final String anzahl_auslastung_kohlemine = "1x (100%)";
    private static int produktionsdauer_kohlemine = 105;
    private static final String baukosten_kohlemine = "950k";
    private static final int[] ressourcen_kohlemine = {470, 120, 130, 0};

    // Eisenschmelze
    private static final int art_bev_eisenschmelze = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_eisenschmelze = 1;
    private static final int anzahl_sonder_eisenschmelze = 0;
    private static final int unterhalt_eisenschmelze = 22;
    private static final int radius_eisenschmelze = 15;
    private static final String groesse_eisenschmelze = "3x3";
    private static final String anzahl_auslastung_eisenschmelze = "1x (100%)";
    private static int produktionsdauer_eisenschmelze = 315;
    private static final String baukosten_eisenschmelze = "95k";
    private static final int[] ressourcen_eisenschmelze = {95, 210, 0, 0};

    // Werkzeugmacher
    private static final int art_bev_werkzeugmacher = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_werkzeugmacher = 1;
    private static final int anzahl_sonder_werkzeugmacher = 0;
    private static final int unterhalt_werkzeugmacher = 20;
    private static final int radius_werkzeugmacher = 15;
    private static final String groesse_werkzeugmacher = "3x3";
    private static final String anzahl_auslastung_werkzeugmacher = "1x (100%)";
    private static int produktionsdauer_werkzeugmacher = 420;
    private static final String baukosten_werkzeugmacher = "85k";
    private static final int[] ressourcen_werkzeugmacher = {120, 185, 0, 0};

    // Waldglashütte
    private static final int art_bev_waldglashuette = GB_BEV_ADLIGER;
    private static final int anzahl_bev_waldglashuette = 1;
    private static final int anzahl_sonder_waldglashuette = 0;
    private static final int unterhalt_waldglashuette = 35;
    private static final int radius_waldglashuette = 15;
    private static final String groesse_waldglashuette = "4x4";
    private static final String anzahl_auslastung_waldglashuette = "1x (100%)";
    private static int produktionsdauer_waldglashuette = 840;
    private static final String baukosten_waldglashuette = "950k";
    private static final int[] ressourcen_waldglashuette = {405, 345, 570, 0};

    // Quarzbruch
    private static final int art_bev_quarzbruch = GB_BEV_ADLIGER;
    private static final int anzahl_bev_quarzbruch = 1;
    private static final int anzahl_sonder_quarzbruch = 1;
    private static final int unterhalt_quarzbruch = 37;
    private static final int radius_quarzbruch = 0;
    private static final String groesse_quarzbruch = "3x3";
    private static final String anzahl_auslastung_quarzbruch = "1x (100%)";
    private static int produktionsdauer_quarzbruch = 1260;
    private static final String baukosten_quarzbruch = "850k";
    private static final int[] ressourcen_quarzbruch = {290, 205, 680, 0};

    // Glasschmelze
    private static final int art_bev_glasschmelze = GB_BEV_ADLIGER;
    private static final int anzahl_bev_glasschmelze = 1;
    private static final int anzahl_sonder_glasschmelze = 0;
    private static final int unterhalt_glasschmelze = 65;
    private static final int radius_glasschmelze = 15;
    private static final String groesse_glasschmelze = "3x3";
    private static final String anzahl_auslastung_glasschmelze = "1x (100%)";
    private static int produktionsdauer_glasschmelze = 1260;
    private static final String baukosten_glasschmelze = "1.2M";
    private static final int[] ressourcen_glasschmelze = {365, 360, 640, 0};

    
    // Fischer
    private static final int art_bev_fischer = GB_BEV_BAUER;
    private static final int anzahl_bev_fischer = 1;
    private static final int anzahl_sonder_fischer = 4;
    private static final int unterhalt_fischer = 2;
    private static final int radius_fischer = 12;
    private static final String groesse_fischer = "4x3";
    private static final String anzahl_auslastung_fischer = "1x (100%)";
    private static int produktionsdauer_fischer = 110;
    private static final String baukosten_fischer = "1250";
    private static final int[] ressourcen_fischer = {8, 0, 0, 0};

    // Weizenfarm
    private static final int art_bev_weizenfarm = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_weizenfarm = 100;
    private static final int anzahl_sonder_weizenfarm = 2;
    private static final int unterhalt_weizenfarm = 4;
    private static final int radius_weizenfarm = 8;
    private static final String groesse_weizenfarm = "3x3";
    private static final String anzahl_auslastung_weizenfarm = "1x (100%)";
    private static int produktionsdauer_weizenfarm = 440;
    private static final String baukosten_weizenfarm = "9.5k";
    private static final int[] ressourcen_weizenfarm = {50, 25, 0, 0};

    // Mühle
    private static final int art_bev_muehle = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_muehle = 100;
    private static final int anzahl_sonder_muehle = 0;
    private static final int unterhalt_muehle = 5;
    private static final int radius_muehle = 15;
    private static final String groesse_muehle = "3x3";
    private static final String anzahl_auslastung_muehle = "1x (100%)";
    private static int produktionsdauer_muehle = 220;
    private static final String baukosten_muehle = "15k";
    private static final int[] ressourcen_muehle = {35, 45, 0, 0};

    // Backstube
    private static final int art_bev_backstube = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_backstube = 100;
    private static final int anzahl_sonder_backstube = 0;
    private static final int unterhalt_backstube = 7;
    private static final int radius_backstube = 15;
    private static final String groesse_backstube = "3x3";
    private static final String anzahl_auslastung_backstube = "1x (100%)";
    private static int produktionsdauer_backstube = 220;
    private static final String baukosten_backstube = "12.5k";
    private static final int[] ressourcen_backstube = {20, 60, 0, 0};

    // Gewürze
    private static final int art_bev_gewuerze = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_gewuerze = 250;
    private static final int anzahl_sonder_gewuerze = 0;
    private static final int unterhalt_gewuerze = 0;
    private static final int radius_gewuerze = 0;
    private static final String groesse_gewuerze = "3x3";
    private static final String anzahl_auslastung_gewuerze = "";
    private static int produktionsdauer_gewuerze = 0;
    private static final String baukosten_gewuerze = "~300";
    private static final int[] ressourcen_gewuerze = {0, 0, 0, 0};

    // Rinderfarm
    private static final int art_bev_rinderfarm = GB_BEV_ADLIGER;
    private static final int anzahl_bev_rinderfarm = 1;
    private static final int anzahl_sonder_rinderfarm = 2;
    private static final int unterhalt_rinderfarm = 34;
    private static final int radius_rinderfarm = 8;
    private static final String groesse_rinderfarm = "3x3";
    private static final String anzahl_auslastung_rinderfarm = "1x (100%)";
    private static int produktionsdauer_rinderfarm = 840;
    private static final String baukosten_rinderfarm = "375k";
    private static final int[] ressourcen_rinderfarm = {155, 115, 140, 15};

    // Metzger
    private static final int art_bev_metzger = GB_BEV_ADLIGER;
    private static final int anzahl_bev_metzger = 1;
    private static final int anzahl_sonder_metzger = 0;
    private static final int unterhalt_metzger = 30;
    private static final int radius_metzger = 8;
    private static final String groesse_metzger = "3x3";
    private static final String anzahl_auslastung_metzger = "1x (100%)";
    private static int produktionsdauer_metzger = 630;
    private static final String baukosten_metzger = "625k";
    private static final int[] ressourcen_metzger = {105, 185, 115, 160};

    
    // Ziegenfarm
    private static final int art_bev_ziegenfarm = GB_BEV_BAUER;
    private static final int anzahl_bev_ziegenfarm = 25;
    private static final int anzahl_sonder_ziegenfarm = 1;
    private static final int unterhalt_ziegenfarm = 2;
    private static final int radius_ziegenfarm = 6;
    private static final String groesse_ziegenfarm = "3x3";
    private static final String anzahl_auslastung_ziegenfarm = "1x (100%)";
    private static int produktionsdauer_ziegenfarm = 235;
    private static final String baukosten_ziegenfarm = "1350";
    private static final int[] ressourcen_ziegenfarm = {11, 0, 0, 0};

    // Apfelhof
    private static final int art_bev_apfelhof = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_apfelhof = 500;
    private static final int anzahl_sonder_apfelhof = 4;
    private static final int unterhalt_apfelhof = 9;
    private static final int radius_apfelhof = 7;
    private static final String groesse_apfelhof = "3x3";
    private static final String anzahl_auslastung_apfelhof = "1x (100%)";
    private static int produktionsdauer_apfelhof = 380;
    private static final String baukosten_apfelhof = "32k";
    private static final int[] ressourcen_apfelhof = {65, 40, 0, 0};

    // Mosthof
    private static final int art_bev_mosthof = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_mosthof = 500;
    private static final int anzahl_sonder_mosthof = 0;
    private static final int unterhalt_mosthof = 6;
    private static final int radius_mosthof = 15;
    private static final String groesse_mosthof = "3x3";
    private static final String anzahl_auslastung_mosthof = "1x (100%)";
    private static int produktionsdauer_mosthof = 190;
    private static final String baukosten_mosthof = "25k";
    private static final int[] ressourcen_mosthof = {45, 75, 0, 0};

    // Klostergarten
    private static final int art_bev_klostergarten = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_klostergarten = 250;
    private static final int anzahl_sonder_klostergarten = 6;
    private static final int unterhalt_klostergarten = 23;
    private static final int radius_klostergarten = 8;
    private static final String groesse_klostergarten = "3x3";
    private static final String anzahl_auslastung_klostergarten = "1x (100%)";
    private static int produktionsdauer_klostergarten = 660;
    private static final String baukosten_klostergarten = "140k";
    private static final int[] ressourcen_klostergarten = {45, 45, 65, 0};

    // Klosterbrauerei
    private static final int art_bev_klosterbrauerei = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_klosterbrauerei = 250;
    private static final int anzahl_sonder_klosterbrauerei = 0;
    private static final int unterhalt_klosterbrauerei = 25;
    private static final int radius_klosterbrauerei = 15;
    private static final String groesse_klosterbrauerei = "3x3";
    private static final String anzahl_auslastung_klosterbrauerei = "1x (100%)";
    private static int produktionsdauer_klosterbrauerei = 330;
    private static final String baukosten_klosterbrauerei = "185k";
    private static final int[] ressourcen_klosterbrauerei = {35, 55, 90, 0};

    // Weingut
    private static final int art_bev_weingut = GB_BEV_ADLIGER;
    private static final int anzahl_bev_weingut = 500;
    private static final int anzahl_sonder_weingut = 4;
    private static final int unterhalt_weingut = 32;
    private static final int radius_weingut = 8;
    private static final String groesse_weingut = "3x3";
    private static final String anzahl_auslastung_weingut = "1x (100%)";
    private static int produktionsdauer_weingut = 2205;
    private static final String baukosten_weingut = "675k";
    private static final int[] ressourcen_weingut = {145, 90, 68, 25};

    // Fassk�ferei
    private static final int art_bev_fasskueferei = GB_BEV_ADLIGER;
    private static final int anzahl_bev_fasskueferei = 500;
    private static final int anzahl_sonder_fasskueferei = 0;
    private static final int unterhalt_fasskueferei = 24;
    private static final int radius_fasskueferei = 15;
    private static final String groesse_fasskueferei = "3x3";
    private static final String anzahl_auslastung_fasskueferei = "1x (100%)";
    private static int produktionsdauer_fasskueferei = 945;
    private static final String baukosten_fasskueferei = "775k";
    private static final int[] ressourcen_fasskueferei = {105, 95, 115, 75};

    // Kelterei
    private static final int art_bev_kelterei = GB_BEV_ADLIGER;
    private static final int anzahl_bev_kelterei = 500;
    private static final int anzahl_sonder_kelterei = 0;
    private static final int unterhalt_kelterei = 43;
    private static final int radius_kelterei = 15;
    private static final String groesse_kelterei = "3x3";
    private static final String anzahl_auslastung_kelterei = "1x (100%)";
    private static int produktionsdauer_kelterei = 1260;
    private static final String baukosten_kelterei = "875k";
    private static final int[] ressourcen_kelterei = {115, 130, 60, 135};

    
    // Schaffarm
    private static final int art_bev_schaffarm = GB_BEV_BAUER;
    private static final int anzahl_bev_schaffarm = 250;
    private static final int anzahl_sonder_schaffarm = 2;
    private static final int unterhalt_schaffarm = 2;
    private static final int radius_schaffarm = 8;
    private static final String groesse_schaffarm = "3x3";
    private static final String anzahl_auslastung_schaffarm = "1x (100%)";
    private static int produktionsdauer_schaffarm = 200;
    private static final String baukosten_schaffarm = "1950";
    private static final int[] ressourcen_schaffarm = {12, 0, 0, 0};

    // Spinnerei
    private static final int art_bev_spinnerei = GB_BEV_BAUER;
    private static final int anzahl_bev_spinnerei = 250;
    private static final int anzahl_sonder_spinnerei = 0;
    private static final int unterhalt_spinnerei = 2;
    private static final int radius_spinnerei = 15;
    private static final String groesse_spinnerei = "3x3";
    private static final String anzahl_auslastung_spinnerei = "1x (100%)";
    private static int produktionsdauer_spinnerei = 200;
    private static final String baukosten_spinnerei = "2700";
    private static final int[] ressourcen_spinnerei = {9, 0, 0, 0};

    // Hanfplantage
    private static final int art_bev_hanfplantage = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_hanfplantage = 1500;
    private static final int anzahl_sonder_hanfplantage = 5;
    private static final int unterhalt_hanfplantage = 14;
    private static final int radius_hanfplantage = 8;
    private static final String groesse_hanfplantage = "3x3";
    private static final String anzahl_auslastung_hanfplantage = "1x (100%)";
    private static int produktionsdauer_hanfplantage = 630;
    private static final String baukosten_hanfplantage = "42k";
    private static final int[] ressourcen_hanfplantage = {55, 60, 0, 0};

    // Webstube
    private static final int art_bev_webstube = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_webstube = 1500;
    private static final int anzahl_sonder_webstube = 0;
    private static final int unterhalt_webstube = 15;
    private static final int radius_webstube = 15;
    private static final String groesse_webstube = "3x3";
    private static final String anzahl_auslastung_webstube = "1x (100%)";
    private static int produktionsdauer_webstube = 210;
    private static final String baukosten_webstube = "45k";
    private static final int[] ressourcen_webstube = {50, 70, 0, 0};

    // Schweinefarm
    private static final int art_bev_schweinefarm = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_schweinefarm = 2000;
    private static final int anzahl_sonder_schweinefarm = 3;
    private static final int unterhalt_schweinefarm = 17;
    private static final int radius_schweinefarm = 8;
    private static final String groesse_schweinefarm = "3x3";
    private static final String anzahl_auslastung_schweinefarm = "1x (100%)";
    private static int produktionsdauer_schweinefarm = 840;
    private static final String baukosten_schweinefarm = "315k";
    private static final int[] ressourcen_schweinefarm = {320, 280, 285, 0};

    // Salzstock
    private static final int art_bev_salzstock = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_salzstock = 2000;
    private static final int anzahl_sonder_salzstock = 1;
    private static final int unterhalt_salzstock = 37;
    private static final int radius_salzstock = 0;
    private static final String groesse_salzstock = "3x3";
    private static final String anzahl_auslastung_salzstock = "1x (100%)";
    private static int produktionsdauer_salzstock = 140;
    private static final String baukosten_salzstock = "850k";
    private static final int[] ressourcen_salzstock = {435, 95, 375, 0};

    // Saline
    private static final int art_bev_saline = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_saline = 2000;
    private static final int anzahl_sonder_saline = 0;
    private static final int unterhalt_saline = 18;
    private static final int radius_saline = 15;
    private static final String groesse_saline = "3x3";
    private static final String anzahl_auslastung_saline = "1x (100%)";
    private static int produktionsdauer_saline = 210;
    private static final String baukosten_saline = "430k";
    private static final int[] ressourcen_saline = {195, 420, 235, 0};

    // Gerberei
    private static final int art_bev_gerberei = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_gerberei = 2000;
    private static final int anzahl_sonder_gerberei = 0;
    private static final int unterhalt_gerberei = 20;
    private static final int radius_gerberei = 15;
    private static final String groesse_gerberei = "3x3";
    private static final String anzahl_auslastung_gerberei = "1x (100%)";
    private static int produktionsdauer_gerberei = 420;
    private static final String baukosten_gerberei = "425k";
    private static final int[] ressourcen_gerberei = {235, 340, 375, 0};

    // Pelztierj�ger
    private static final int art_bev_pelztierjaeger = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_pelztierjaeger = 3000;
    private static final int anzahl_sonder_pelztierjaeger = 1;
    private static final int unterhalt_pelztierjaeger = 11;
    private static final int radius_pelztierjaeger = 0;
    private static final String groesse_pelztierjaeger = "3x3";
    private static final String anzahl_auslastung_pelztierjaeger = "1x (100%)";
    private static int produktionsdauer_pelztierjaeger = 600;
    private static final String baukosten_pelztierjaeger = "230k";
    private static final int[] ressourcen_pelztierjaeger = {260, 170, 590, 0};

    // K�rschner
    private static final int art_bev_kuerschnerei = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_kuerschnerei = 3000;
    private static final int anzahl_sonder_kuerschnerei = 1;
    private static final int unterhalt_kuerschnerei = 65;
    private static final int radius_kuerschnerei = 15;
    private static final String groesse_kuerschnerei = "6x3";
    private static final String anzahl_auslastung_kuerschnerei = "1x (100%)";
    private static int produktionsdauer_kuerschnerei = 600;
    private static final String baukosten_kuerschnerei = "485k";
    private static final int[] ressourcen_kuerschnerei = {590, 570, 510, 0};

    // Goldmine
    private static final int art_bev_goldmine = GB_BEV_ADLIGER;
    private static final int anzahl_bev_goldmine = 4000;
    private static final int anzahl_sonder_goldmine = 1;
    private static final int unterhalt_goldmine = 40;
    private static final int radius_goldmine = 0;
    private static final String groesse_goldmine = "3x3";
    private static final String anzahl_auslastung_goldmine = "1x (100%)";
    private static int produktionsdauer_goldmine = 1260;
    private static final String baukosten_goldmine = "4.33M";
    private static final int[] ressourcen_goldmine = {480, 175, 330, 30};

    // Goldschmelze
    private static final int art_bev_goldschmelze = GB_BEV_ADLIGER;
    private static final int anzahl_bev_goldschmelze = 4000;
    private static final int anzahl_sonder_goldschmelze = 0;
    private static final int unterhalt_goldschmelze = 65;
    private static final int radius_goldschmelze = 15;
    private static final String groesse_goldschmelze = "3x3";
    private static final String anzahl_auslastung_goldschmelze = "1x (100%)";
    private static int produktionsdauer_goldschmelze = 1050;
    private static final String baukosten_goldschmelze = "3.65M";
    private static final int[] ressourcen_goldschmelze = {175, 360, 240, 300};

    // Seide
    private static final int art_bev_seide = GB_BEV_ADLIGER;
    private static final int anzahl_bev_seide = 4000;
    private static final int anzahl_sonder_seide = 0;
    private static final int unterhalt_seide = 0;
    private static final int radius_seide = 0;
    private static final String groesse_seide = "3x3";
    private static final String anzahl_auslastung_seide = "";
    private static int produktionsdauer_seide = 0;
    private static final String baukosten_seide = "~3500";
    private static final int[] ressourcen_seide = {0, 0, 0, 0};

    // Seidenweberei
    private static final int art_bev_seidenweberei = GB_BEV_ADLIGER;
    private static final int anzahl_bev_seidenweberei = 4000;
    private static final int anzahl_sonder_seidenweberei = 0;
    private static final int unterhalt_seidenweberei = 50;
    private static final int radius_seidenweberei = 15;
    private static final String groesse_seidenweberei = "3x3";
    private static final String anzahl_auslastung_seidenweberei = "1x (100%)";
    private static int produktionsdauer_seidenweberei = 3150;
    private static final String baukosten_seidenweberei = "3.18M";
    private static final int[] ressourcen_seidenweberei = {190, 280, 195, 565};

    
    // Papierm�hle
    private static final int art_bev_papiermuehle = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_papiermuehle = 1000;
    private static final int anzahl_sonder_papiermuehle = 1;
    private static final int unterhalt_papiermuehle = 18;
    private static final int radius_papiermuehle = 15;
    private static final String groesse_papiermuehle = "6x3";
    private static final String anzahl_auslastung_papiermuehle = "1x (100%)";
    private static int produktionsdauer_papiermuehle = 210;
    private static final String baukosten_papiermuehle = "290k";
    private static final int[] ressourcen_papiermuehle = {320, 210, 370, 0};

    // Indigo
    private static final int art_bev_indigo = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_indigo = 1000;
    private static final int anzahl_sonder_indigo = 0;
    private static final int unterhalt_indigo = 0;
    private static final int radius_indigo = 0;
    private static final String groesse_indigo = "3x3";
    private static final String anzahl_auslastung_indigo = "";
    private static int produktionsdauer_indigo = 0;
    private static final String baukosten_indigo = "~150";
    private static final int[] ressourcen_indigo = {0, 0, 0, 0};

    // Druckerei
    private static final int art_bev_druckerei = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_druckerei = 1000;
    private static final int anzahl_sonder_druckerei = 0;
    private static final int unterhalt_druckerei = 16;
    private static final int radius_druckerei = 15;
    private static final String groesse_druckerei = "3x3";
    private static final String anzahl_auslastung_druckerei = "1x (100%)";
    private static int produktionsdauer_druckerei = 630;
    private static final String baukosten_druckerei = "435k";
    private static final int[] ressourcen_druckerei = {230, 260, 280, 0};

    // Imker
    private static final int art_bev_imker = GB_BEV_ADLIGER;
    private static final int anzahl_bev_imker = 1000;
    private static final int anzahl_sonder_imker = 3;
    private static final int unterhalt_imker = 33;
    private static final int radius_imker = 8;
    private static final String groesse_imker = "3x3";
    private static final String anzahl_auslastung_imker = "1x (100%)";
    private static int produktionsdauer_imker = 840;
    private static final String baukosten_imker = "425k";
    private static final int[] ressourcen_imker = {140, 60, 75, 30};

    // Lichtzieher
    private static final int art_bev_lichtzieher = GB_BEV_ADLIGER;
    private static final int anzahl_bev_lichtzieher = 1000;
    private static final int anzahl_sonder_lichtzieher = 0;
    private static final int unterhalt_lichtzieher = 28;
    private static final int radius_lichtzieher = 15;
    private static final String groesse_lichtzieher = "3x3";
    private static final String anzahl_auslastung_lichtzieher = "1x (100%)";
    private static int produktionsdauer_lichtzieher = 1260;
    private static final String baukosten_lichtzieher = "975k";
    private static final int[] ressourcen_lichtzieher = {145, 160, 100, 105};

    // Feinschmiede
    private static final int art_bev_feinschmiede = GB_BEV_ADLIGER;
    private static final int anzahl_bev_feinschmiede = 1000;
    private static final int anzahl_sonder_feinschmiede = 0;
    private static final int unterhalt_feinschmiede = 38;
    private static final int radius_feinschmiede = 15;
    private static final String groesse_feinschmiede = "3x3";
    private static final String anzahl_auslastung_feinschmiede = "1x (100%)";
    private static int produktionsdauer_feinschmiede = 840;
    private static final String baukosten_feinschmiede = "1.38M";
    private static final int[] ressourcen_feinschmiede = {130, 205, 295, 140};

    // Kupfermine
    private static final int art_bev_kupfermine = GB_BEV_ADLIGER;
    private static final int anzahl_bev_kupfermine = 1000;
    private static final int anzahl_sonder_kupfermine = 1;
    private static final int unterhalt_kupfermine = 34;
    private static final int radius_kupfermine = 0;
    private static final String groesse_kupfermine = "3x3";
    private static final String anzahl_auslastung_kupfermine = "1x (100%)";
    private static int produktionsdauer_kupfermine = 280;
    private static final String baukosten_kupfermine = "2.18M";
    private static final int[] ressourcen_kupfermine = {225, 45, 215, 20};

    // Kupferschmelze
    private static final int art_bev_kupferschmelze = GB_BEV_ADLIGER;
    private static final int anzahl_bev_kupferschmelze = 1000;
    private static final int anzahl_sonder_kupferschmelze = 0;
    private static final int unterhalt_kupferschmelze = 48;
    private static final int radius_kupferschmelze = 15;
    private static final String groesse_kupferschmelze = "3x3";
    private static final String anzahl_auslastung_kupferschmelze = "1x (100%)";
    private static int produktionsdauer_kupferschmelze = 420;
    private static final String baukosten_kupferschmelze = "1.48M";
    private static final int[] ressourcen_kupferschmelze = {110, 240, 175, 85};

    // Brillenmacher
    private static final int art_bev_brillenmacher = GB_BEV_ADLIGER;
    private static final int anzahl_bev_brillenmacher = 2500;
    private static final int anzahl_sonder_brillenmacher = 0;
    private static final int unterhalt_brillenmacher = 48;
    private static final int radius_brillenmacher = 15;
    private static final String groesse_brillenmacher = "3x3";
    private static final String anzahl_auslastung_brillenmacher = "1x (100%)";
    private static int produktionsdauer_brillenmacher = 1260;
    private static final String baukosten_brillenmacher = "2.48M";
    private static final int[] ressourcen_brillenmacher = {310, 340, 270, 225};

    
    /* SHOP-PRODUKTIONSGEB�UDE */
    // Tiefer Steinmetz
    private static final int art_bev_tiefer_steinmetz = GB_BEV_KEINE;
    private static final int anzahl_bev_tiefer_steinmetz = 0;
    private static final int anzahl_sonder_tiefer_steinmetz = 1;
    private static final int unterhalt_tiefer_steinmetz = 6;
    private static final int radius_tiefer_steinmetz = 0;
    private static final String groesse_tiefer_steinmetz = "3x3";
    private static final String anzahl_auslastung_tiefer_steinmetz = "1x (100%)";
    private static final int produktionsdauer_tiefer_steinmetz = 180;
    private static final String baukosten_tiefer_steinmetz = "890";
    private static final int[] ressourcen_tiefer_steinmetz = {0, 0, 0, 0};

    // Tiefe Eisenmine
    private static final int art_bev_tiefe_eisenmine = GB_BEV_KEINE;
    private static final int anzahl_bev_tiefe_eisenmine = 0;
    private static final int anzahl_sonder_tiefe_eisenmine = 1;
    private static final int unterhalt_tiefe_eisenmine = 12;
    private static final int radius_tiefe_eisenmine = 0;
    private static final String groesse_tiefe_eisenmine = "3x3";
    private static final String anzahl_auslastung_tiefe_eisenmine = "1x (100%)";
    private static final int produktionsdauer_tiefe_eisenmine = 210;
    private static final String baukosten_tiefe_eisenmine = "1950";
    private static final int[] ressourcen_tiefe_eisenmine = {0, 0, 0, 0};

    // Tiefer Quarzbruch
    private static final int art_bev_tiefer_quarzbruch = GB_BEV_KEINE;
    private static final int anzahl_bev_tiefer_quarzbruch = 0;
    private static final int anzahl_sonder_tiefer_quarzbruch = 1;
    private static final int unterhalt_tiefer_quarzbruch = 37;
    private static final int radius_tiefer_quarzbruch = 0;
    private static final String groesse_tiefer_quarzbruch = "3x3";
    private static final String anzahl_auslastung_tiefer_quarzbruch = "1x (100%)";
    private static final int produktionsdauer_tiefer_quarzbruch = 1260;
    private static final String baukosten_tiefer_quarzbruch = "2950";
    private static final int[] ressourcen_tiefer_quarzbruch = {0, 0, 0, 0};

    // Tiefes Kohlebergwerk
    private static final int art_bev_tiefes_kohlebergwerk = GB_BEV_KEINE;
    private static final int anzahl_bev_tiefes_kohlebergwerk = 0;
    private static final int anzahl_sonder_tiefes_kohlebergwerk = 1;
    private static final int unterhalt_tiefes_kohlebergwerk = 30;
    private static final int radius_tiefes_kohlebergwerk = 0;
    private static final String groesse_tiefes_kohlebergwerk = "3x3";
    private static final String anzahl_auslastung_tiefes_kohlebergwerk = "1x (100%)";
    private static final int produktionsdauer_tiefes_kohlebergwerk = 105;
    private static final String baukosten_tiefes_kohlebergwerk = "2950";
    private static final int[] ressourcen_tiefes_kohlebergwerk = {0, 0, 0, 0};

    // Tiefer Salzstock
    private static final int art_bev_tiefer_salzstock = GB_BEV_KEINE;
    private static final int anzahl_bev_tiefer_salzstock = 0;
    private static final int anzahl_sonder_tiefer_salzstock = 1;
    private static final int unterhalt_tiefer_salzstock = 37;
    private static final int radius_tiefer_salzstock = 0;
    private static final String groesse_tiefer_salzstock = "3x3";
    private static final String anzahl_auslastung_tiefer_salzstock = "1x (100%)";
    private static final int produktionsdauer_tiefer_salzstock = 140;
    private static final String baukosten_tiefer_salzstock = "2450";
    private static final int[] ressourcen_tiefer_salzstock = {0, 0, 0, 0};

    // Tiefer Pelztierj�ger
    private static final int art_bev_tiefer_pelztierjaeger = GB_BEV_KEINE;
    private static final int anzahl_bev_tiefer_pelztierjaeger = 0;
    private static final int anzahl_sonder_tiefer_pelztierjaeger = 1;
    private static final int unterhalt_tiefer_pelztierjaeger = 11;
    private static final int radius_tiefer_pelztierjaeger = 0;
    private static final String groesse_tiefer_pelztierjaeger = "3x3";
    private static final String anzahl_auslastung_tiefer_pelztierjaeger = "1x (100%)";
    private static final int produktionsdauer_tiefer_pelztierjaeger = 600;
    private static final String baukosten_tiefer_pelztierjaeger = "2450";
    private static final int[] ressourcen_tiefer_pelztierjaeger = {0, 0, 0, 0};

    // Tiefe Goldmine
    private static final int art_bev_tiefe_goldmine = GB_BEV_KEINE;
    private static final int anzahl_bev_tiefe_goldmine = 0;
    private static final int anzahl_sonder_tiefe_goldmine = 1;
    private static final int unterhalt_tiefe_goldmine = 40;
    private static final int radius_tiefe_goldmine = 0;
    private static final String groesse_tiefe_goldmine = "3x3";
    private static final String anzahl_auslastung_tiefe_goldmine = "1x (100%)";
    private static final int produktionsdauer_tiefe_goldmine = 1260;
    private static final String baukosten_tiefe_goldmine = "4950";
    private static final int[] ressourcen_tiefe_goldmine = {0, 0, 0, 0};

    // Tiefe Kupfermine
    private static final int art_bev_tiefe_kupfermine = GB_BEV_KEINE;
    private static final int anzahl_bev_tiefe_kupfermine = 0;
    private static final int anzahl_sonder_tiefe_kupfermine = 1;
    private static final int unterhalt_tiefe_kupfermine = 34;
    private static final int radius_tiefe_kupfermine = 0;
    private static final String groesse_tiefe_kupfermine = "3x3";
    private static final String anzahl_auslastung_tiefe_kupfermine = "1x (100%)";
    private static final int produktionsdauer_tiefe_kupfermine = 280;
    private static final String baukosten_tiefe_kupfermine = "3950";
    private static final int[] ressourcen_tiefe_kupfermine = {0, 0, 0, 0};

    // Verbesserter Weizenhof
    private static final int art_bev_verb_weizenhof = GB_BEV_KEINE;
    private static final int anzahl_bev_verb_weizenhof = 0;
    private static final int anzahl_sonder_verb_weizenhof = 1;
    private static final int unterhalt_verb_weizenhof = 4;
    private static final int radius_verb_weizenhof = 8;
    private static final String groesse_verb_weizenhof = "3x3";
    private static final String anzahl_auslastung_verb_weizenhof = "1x (100%)";
    private static final int produktionsdauer_verb_weizenhof = 440;
    private static final String baukosten_verb_weizenhof = "2990";
    private static final int[] ressourcen_verb_weizenhof = {0, 0, 0, 0};

    // Verwunschene Papierm�hle
    private static final int art_bev_verb_papiermuehle = GB_BEV_KEINE;
    private static final int anzahl_bev_verb_papiermuehle = 0;
    private static final int anzahl_sonder_verb_papiermuehle = 1;
    private static final int unterhalt_verb_papiermuehle = 27;
    private static final int radius_verb_papiermuehle = 15;
    private static final String groesse_verb_papiermuehle = "3x6";
    private static final String anzahl_auslastung_verb_papiermuehle = "1x (100%)";
    private static final int produktionsdauer_verb_papiermuehle = 105;
    private static final String baukosten_verb_papiermuehle = "4450";
    private static final int[] ressourcen_verb_papiermuehle = {0, 0, 0, 0};

    // Verwunschene M�hle
    private static final int art_bev_verb_muehle = GB_BEV_KEINE;
    private static final int anzahl_bev_verb_muehle = 0;
    private static final int anzahl_sonder_verb_muehle = 0;
    private static final int unterhalt_verb_muehle = 5;
    private static final int radius_verb_muehle = 15;
    private static final String groesse_verb_muehle = "3x3";
    private static final String anzahl_auslastung_verb_muehle = "1x (100%)";
    private static final int produktionsdauer_verb_muehle = 154;
    private static final String baukosten_verb_muehle = "3450";
    private static final int[] ressourcen_verb_muehle = {0, 0, 0, 0};

    // Verbesserte B�ckerei
    private static final int art_bev_verb_baeckerei = GB_BEV_KEINE;
    private static final int anzahl_bev_verb_baeckerei = 0;
    private static final int anzahl_sonder_verb_baeckerei = 0;
    private static final int unterhalt_verb_baeckerei = 7;
    private static final int radius_verb_baeckerei = 15;
    private static final String groesse_verb_baeckerei = "3x3";
    private static final String anzahl_auslastung_verb_baeckerei = "1x (100%)";
    private static final int produktionsdauer_verb_baeckerei = 150;
    private static final String baukosten_verb_baeckerei = "3450";
    private static final int[] ressourcen_verb_baeckerei = {0, 0, 0, 0};

    /* SHOP-STADTGEB�UDE */
    // Gewürzbasar
    private static final int art_bev_gewuerzbasar = GB_BEV_KEINE;
    private static final int anzahl_bev_gewuerzbasar = 0;
    private static final int anzahl_sonder_gewuerzbasar = 0;
    private static final int unterhalt_gewuerzbasar = 0;
    private static final int radius_gewuerzbasar = 000;
    private static final String groesse_gewuerzbasar = "4x4";
    private static final String anzahl_auslastung_gewuerzbasar = "";
    private static final int produktionsdauer_gewuerzbasar = 0;
    private static final String baukosten_gewuerzbasar = "4950";
    private static final int[] ressourcen_gewuerzbasar = {0, 0, 0, 0};

    // Scheune
    private static final int art_bev_scheune = GB_BEV_KEINE;
    private static final int anzahl_bev_scheune = 0;
    private static final int anzahl_sonder_scheune = 0;
    private static final int unterhalt_scheune = 8;
    private static final int radius_scheune = 7;
    private static final String groesse_scheune = "3x3";
    private static final String anzahl_auslastung_scheune = "";
    private static final int produktionsdauer_scheune = 0;
    private static final String baukosten_scheune = "1490";
    private static final int[] ressourcen_scheune = {0, 0, 0, 0};

    // Silo
    private static final int art_bev_silo = GB_BEV_KEINE;
    private static final int anzahl_bev_silo = 0;
    private static final int anzahl_sonder_silo = 0;
    private static final int unterhalt_silo = 8;
    private static final int radius_silo = 7;
    private static final String groesse_silo = "3x3";
    private static final String anzahl_auslastung_silo = "";
    private static final int produktionsdauer_silo = 0;
    private static final String baukosten_silo = "1690";
    private static final int[] ressourcen_silo = {0, 0, 0, 0};

    // Museum
    private static final int art_bev_museum = GB_BEV_KEINE;
    private static final int anzahl_bev_museum = 0;
    private static final int anzahl_sonder_museum = 5;
    private static final int unterhalt_museum = 0;
    private static final int radius_museum = 25;
    private static final String groesse_museum = "5x8";
    private static final String anzahl_auslastung_museum = "";
    private static final int produktionsdauer_museum = 0;
    private static final String baukosten_museum = "4950";
    private static final int[] ressourcen_museum = {0, 0, 0, 0};

    // Stadtarchiv
    private static final int art_bev_stadtarchiv = GB_BEV_KEINE;
    private static final int anzahl_bev_stadtarchiv = 0;
    private static final int anzahl_sonder_stadtarchiv = 5;
    private static final int unterhalt_stadtarchiv = 0;
    private static final int radius_stadtarchiv = 15;
    private static final String groesse_stadtarchiv = "4x5";
    private static final String anzahl_auslastung_stadtarchiv = "";
    private static final int produktionsdauer_stadtarchiv = 0;
    private static final String baukosten_stadtarchiv = "2950";
    private static final int[] ressourcen_stadtarchiv = {0, 0, 0, 0};

    // Verbesserter Marktplatz
    private static final int art_bev_verb_marktplatz = GB_BEV_KEINE;
    private static final int anzahl_bev_verb_marktplatz = 0;
    private static final int anzahl_sonder_verb_marktplatz = 0;
    private static final int unterhalt_verb_marktplatz = 7;
    private static final int radius_verb_marktplatz = 22;
    private static final String groesse_verb_marktplatz = "5x5";
    private static final String anzahl_auslastung_verb_marktplatz = "";
    private static final int produktionsdauer_verb_marktplatz = 0;
    private static final String baukosten_verb_marktplatz = "4990";
    private static final int[] ressourcen_verb_marktplatz = {0, 0, 0, 0};

    // Kontor Level 1
    private static final int art_bev_kontor_lvl1 = GB_BEV_BAUER;
    private static final int anzahl_bev_kontor_lvl1 = 0;
    private static final int anzahl_sonder_kontor_lvl1 = 0;
    private static final int unterhalt_kontor_lvl1 = 0;
    private static final int radius_kontor_lvl1 = 0;
    private static final String groesse_kontor_lvl1 = "4x8";
    private static final String anzahl_auslastung_kontor_lvl1 = "Level 1";
    private static final int produktionsdauer_kontor_lvl1 = 0;
    private static final String baukosten_kontor_lvl1 = "0";
    private static final int[] ressourcen_kontor_lvl1 = {0, 0, 0, 0};

    // Kontor Level 2
    private static final int art_bev_kontor_lvl2 = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_kontor_lvl2 = 900;
    private static final int anzahl_sonder_kontor_lvl2 = 1;
    private static final int unterhalt_kontor_lvl2 = 0;
    private static final int radius_kontor_lvl2 = 0;
    private static final String groesse_kontor_lvl2 = "4x8";
    private static final String anzahl_auslastung_kontor_lvl2 = "Level 2";
    private static final int produktionsdauer_kontor_lvl2 = 0;
    private static final String baukosten_kontor_lvl2 = "50k";
    private static final int[] ressourcen_kontor_lvl2 = {80, 50, 0, 0};

    // Kontor Level 3
    private static final int art_bev_kontor_lvl3 = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_kontor_lvl3 = 1500;
    private static final int anzahl_sonder_kontor_lvl3 = 1;
    private static final int unterhalt_kontor_lvl3 = 0;
    private static final int radius_kontor_lvl3 = 0;
    private static final String groesse_kontor_lvl3 = "4x8";
    private static final String anzahl_auslastung_kontor_lvl3 = "Level 3";
    private static final int produktionsdauer_kontor_lvl3 = 0;
    private static final String baukosten_kontor_lvl3 = "125k";
    private static final int[] ressourcen_kontor_lvl3 = {175, 225, 0, 0};

    // Kontor Level 4
    private static final int art_bev_kontor_lvl4 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_kontor_lvl4 = 500;
    private static final int anzahl_sonder_kontor_lvl4 = 1;
    private static final int unterhalt_kontor_lvl4 = 0;
    private static final int radius_kontor_lvl4 = 0;
    private static final String groesse_kontor_lvl4 = "4x8";
    private static final String anzahl_auslastung_kontor_lvl4 = "Level 4";
    private static final int produktionsdauer_kontor_lvl4 = 0;
    private static final String baukosten_kontor_lvl4 = "1.8M";
    private static final int[] ressourcen_kontor_lvl4 = {1800, 1100, 575, 325};

    // Lagerhaus Level 1
    private static final int art_bev_lagerhaus_lvl1 = GB_BEV_BAUER;
    private static final int anzahl_bev_lagerhaus_lvl1 = 25;
    private static final int anzahl_sonder_lagerhaus_lvl1 = 300;
    private static final int unterhalt_lagerhaus_lvl1 = 4;
    private static final int radius_lagerhaus_lvl1 = 0;
    private static final String groesse_lagerhaus_lvl1 = "4x5";
    private static final String anzahl_auslastung_lagerhaus_lvl1 = "Level 1";
    private static final int produktionsdauer_lagerhaus_lvl1 = 0;
    private static final String baukosten_lagerhaus_lvl1 = "2000";
    private static final int[] ressourcen_lagerhaus_lvl1 = {50, 0, 0, 0};

    // Lagerhaus Level 2
    private static final int art_bev_lagerhaus_lvl2 = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_lagerhaus_lvl2 = 100;
    private static final int anzahl_sonder_lagerhaus_lvl2 = 400;
    private static final int unterhalt_lagerhaus_lvl2 = 4;
    private static final int radius_lagerhaus_lvl2 = 0;
    private static final String groesse_lagerhaus_lvl2 = "4x5";
    private static final String anzahl_auslastung_lagerhaus_lvl2 = "Level 2";
    private static final int produktionsdauer_lagerhaus_lvl2 = 0;
    private static final String baukosten_lagerhaus_lvl2 = "10k";
    private static final int[] ressourcen_lagerhaus_lvl2 = {150, 50, 0, 0};

    // Lagerhaus Level 3
    private static final int art_bev_lagerhaus_lvl3 = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_lagerhaus_lvl3 = 900;
    private static final int anzahl_sonder_lagerhaus_lvl3 = 550;
    private static final int unterhalt_lagerhaus_lvl3 = 4;
    private static final int radius_lagerhaus_lvl3 = 0;
    private static final String groesse_lagerhaus_lvl3 = "4x5";
    private static final String anzahl_auslastung_lagerhaus_lvl3 = "Level 3";
    private static final int produktionsdauer_lagerhaus_lvl3 = 0;
    private static final String baukosten_lagerhaus_lvl3 = "50k";
    private static final int[] ressourcen_lagerhaus_lvl3 = {300, 100, 0, 0};

    // Lagerhaus Level 4
    private static final int art_bev_lagerhaus_lvl4 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_lagerhaus_lvl4 = 250;
    private static final int anzahl_sonder_lagerhaus_lvl4 = 750;
    private static final int unterhalt_lagerhaus_lvl4 = 4;
    private static final int radius_lagerhaus_lvl4 = 0;
    private static final String groesse_lagerhaus_lvl4 = "4x5";
    private static final String anzahl_auslastung_lagerhaus_lvl4 = "Level 4";
    private static final int produktionsdauer_lagerhaus_lvl4 = 0;
    private static final String baukosten_lagerhaus_lvl4 = "200k";
    private static final int[] ressourcen_lagerhaus_lvl4 = {500, 200, 100, 0};

    // Lagerhaus Level 5
    private static final int art_bev_lagerhaus_lvl5 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_lagerhaus_lvl5 = 1500;
    private static final int anzahl_sonder_lagerhaus_lvl5 = 1000;
    private static final int unterhalt_lagerhaus_lvl5 = 4;
    private static final int radius_lagerhaus_lvl5 = 0;
    private static final String groesse_lagerhaus_lvl5 = "4x5";
    private static final String anzahl_auslastung_lagerhaus_lvl5 = "Level 5";
    private static final int produktionsdauer_lagerhaus_lvl5 = 0;
    private static final String baukosten_lagerhaus_lvl5 = "500k";
    private static final int[] ressourcen_lagerhaus_lvl5 = {650, 400, 200, 0};

    // Lagerhaus Level 6
    private static final int art_bev_lagerhaus_lvl6 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_lagerhaus_lvl6 = 3000;
    private static final int anzahl_sonder_lagerhaus_lvl6 = 1400;
    private static final int unterhalt_lagerhaus_lvl6 = 4;
    private static final int radius_lagerhaus_lvl6 = 0;
    private static final String groesse_lagerhaus_lvl6 = "4x5";
    private static final String anzahl_auslastung_lagerhaus_lvl6 = "Level 6";
    private static final int produktionsdauer_lagerhaus_lvl6 = 0;
    private static final String baukosten_lagerhaus_lvl6 = "800k";
    private static final int[] ressourcen_lagerhaus_lvl6 = {800, 600, 400, 0};

    // Lagerhaus Level 7
    private static final int art_bev_lagerhaus_lvl7 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_lagerhaus_lvl7 = 500;
    private static final int anzahl_sonder_lagerhaus_lvl7 = 2000;
    private static final int unterhalt_lagerhaus_lvl7 = 4;
    private static final int radius_lagerhaus_lvl7 = 0;
    private static final String groesse_lagerhaus_lvl7 = "4x5";
    private static final String anzahl_auslastung_lagerhaus_lvl7 = "Level 7";
    private static final int produktionsdauer_lagerhaus_lvl7 = 0;
    private static final String baukosten_lagerhaus_lvl7 = "2M";
    private static final int[] ressourcen_lagerhaus_lvl7 = {1000, 1000, 600, 200};

    // Lagerhaus Level 8
    private static final int art_bev_lagerhaus_lvl8 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_lagerhaus_lvl8 = 2500;
    private static final int anzahl_sonder_lagerhaus_lvl8 = 3000;
    private static final int unterhalt_lagerhaus_lvl8 = 4;
    private static final int radius_lagerhaus_lvl8 = 0;
    private static final String groesse_lagerhaus_lvl8 = "4x5";
    private static final String anzahl_auslastung_lagerhaus_lvl8 = "Level 8";
    private static final int produktionsdauer_lagerhaus_lvl8 = 0;
    private static final String baukosten_lagerhaus_lvl8 = "3M";
    private static final int[] ressourcen_lagerhaus_lvl8 = {1250, 1250, 800, 500};

    // Lagerhaus Level 9
    private static final int art_bev_lagerhaus_lvl9 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_lagerhaus_lvl9 = 4000;
    private static final int anzahl_sonder_lagerhaus_lvl9 = 5000;
    private static final int unterhalt_lagerhaus_lvl9 = 4;
    private static final int radius_lagerhaus_lvl9 = 0;
    private static final String groesse_lagerhaus_lvl9 = "4x5";
    private static final String anzahl_auslastung_lagerhaus_lvl9 = "Level 9";
    private static final int produktionsdauer_lagerhaus_lvl9 = 0;
    private static final String baukosten_lagerhaus_lvl9 = "8M";
    private static final int[] ressourcen_lagerhaus_lvl9 = {1500, 1500, 1000, 1000};

    // Leuchtturm Level 1
    private static final int art_bev_leuchtturm_lvl1 = GB_BEV_BAUER;
    private static final int anzahl_bev_leuchtturm_lvl1 = 0;
    private static final int anzahl_sonder_leuchtturm_lvl1 = 5;
    private static final int unterhalt_leuchtturm_lvl1 = 0;
    private static final int radius_leuchtturm_lvl1 = 0;
    private static final String groesse_leuchtturm_lvl1 = "3x3";
    private static final String anzahl_auslastung_leuchtturm_lvl1 = "Level 1";
    private static final int produktionsdauer_leuchtturm_lvl1 = 0;
    private static final String baukosten_leuchtturm_lvl1 = "0";
    private static final int[] ressourcen_leuchtturm_lvl1 = {0, 0, 0, 0};

    // Leuchtturm Level 2
    private static final int art_bev_leuchtturm_lvl2 = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_leuchtturm_lvl2 = 300;
    private static final int anzahl_sonder_leuchtturm_lvl2 = 6;
    private static final int unterhalt_leuchtturm_lvl2 = 6;
    private static final int radius_leuchtturm_lvl2 = 0;
    private static final String groesse_leuchtturm_lvl2 = "3x3";
    private static final String anzahl_auslastung_leuchtturm_lvl2 = "Level 2";
    private static final int produktionsdauer_leuchtturm_lvl2 = 0;
    private static final String baukosten_leuchtturm_lvl2 = "50k";
    private static final int[] ressourcen_leuchtturm_lvl2 = {150, 50, 0, 0};

    // Leuchtturm Level 3
    private static final int art_bev_leuchtturm_lvl3 = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_leuchtturm_lvl3 = 1500;
    private static final int anzahl_sonder_leuchtturm_lvl3 = 9;
    private static final int unterhalt_leuchtturm_lvl3 = 9;
    private static final int radius_leuchtturm_lvl3 = 0;
    private static final String groesse_leuchtturm_lvl3 = "3x3";
    private static final String anzahl_auslastung_leuchtturm_lvl3 = "Level 3";
    private static final int produktionsdauer_leuchtturm_lvl3 = 0;
    private static final String baukosten_leuchtturm_lvl3 = "80k";
    private static final int[] ressourcen_leuchtturm_lvl3 = {250, 100, 0, 0};

    // Leuchtturm Level 4
    private static final int art_bev_leuchtturm_lvl4 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_leuchtturm_lvl4 = 250;
    private static final int anzahl_sonder_leuchtturm_lvl4 = 13;
    private static final int unterhalt_leuchtturm_lvl4 = 13;
    private static final int radius_leuchtturm_lvl4 = 0;
    private static final String groesse_leuchtturm_lvl4 = "3x3";
    private static final String anzahl_auslastung_leuchtturm_lvl4 = "Level 4";
    private static final int produktionsdauer_leuchtturm_lvl4 = 0;
    private static final String baukosten_leuchtturm_lvl4 = "160k";
    private static final int[] ressourcen_leuchtturm_lvl4 = {400, 250, 0, 0};

    // Leuchtturm Level 5
    private static final int art_bev_leuchtturm_lvl5 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_leuchtturm_lvl5 = 1000;
    private static final int anzahl_sonder_leuchtturm_lvl5 = 18;
    private static final int unterhalt_leuchtturm_lvl5 = 18;
    private static final int radius_leuchtturm_lvl5 = 0;
    private static final String groesse_leuchtturm_lvl5 = "3x3";
    private static final String anzahl_auslastung_leuchtturm_lvl5 = "Level 5";
    private static final int produktionsdauer_leuchtturm_lvl5 = 0;
    private static final String baukosten_leuchtturm_lvl5 = "300k";
    private static final int[] ressourcen_leuchtturm_lvl5 = {600, 400, 50, 0};

    // Leuchtturm Level 6
    private static final int art_bev_leuchtturm_lvl6 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_leuchtturm_lvl6 = 2000;
    private static final int anzahl_sonder_leuchtturm_lvl6 = 24;
    private static final int unterhalt_leuchtturm_lvl6 = 24;
    private static final int radius_leuchtturm_lvl6 = 0;
    private static final String groesse_leuchtturm_lvl6 = "3x3";
    private static final String anzahl_auslastung_leuchtturm_lvl6 = "Level 6";
    private static final int produktionsdauer_leuchtturm_lvl6 = 0;
    private static final String baukosten_leuchtturm_lvl6 = "600k";
    private static final int[] ressourcen_leuchtturm_lvl6 = {800, 600, 125, 0};

    // Leuchtturm Level 7
    private static final int art_bev_leuchtturm_lvl7 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_leuchtturm_lvl7 = 1;
    private static final int anzahl_sonder_leuchtturm_lvl7 = 31;
    private static final int unterhalt_leuchtturm_lvl7 = 31;
    private static final int radius_leuchtturm_lvl7 = 0;
    private static final String groesse_leuchtturm_lvl7 = "3x3";
    private static final String anzahl_auslastung_leuchtturm_lvl7 = "Level 7";
    private static final int produktionsdauer_leuchtturm_lvl7 = 0;
    private static final String baukosten_leuchtturm_lvl7 = "1M";
    private static final int[] ressourcen_leuchtturm_lvl7 = {1200, 800, 400, 50};

    // Leuchtturm Level 8
    private static final int art_bev_leuchtturm_lvl8 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_leuchtturm_lvl8 = 1500;
    private static final int anzahl_sonder_leuchtturm_lvl8 = 39;
    private static final int unterhalt_leuchtturm_lvl8 = 39;
    private static final int radius_leuchtturm_lvl8 = 0;
    private static final String groesse_leuchtturm_lvl8 = "3x3";
    private static final String anzahl_auslastung_leuchtturm_lvl8 = "Level 8";
    private static final int produktionsdauer_leuchtturm_lvl8 = 0;
    private static final String baukosten_leuchtturm_lvl8 = "2.2M";
    private static final int[] ressourcen_leuchtturm_lvl8 = {1200, 1200, 600, 300};

    // Leuchtturm Level 9
    private static final int art_bev_leuchtturm_lvl9 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_leuchtturm_lvl9 = 4000;
    private static final int anzahl_sonder_leuchtturm_lvl9 = 48;
    private static final int unterhalt_leuchtturm_lvl9 = 48;
    private static final int radius_leuchtturm_lvl9 = 0;
    private static final String groesse_leuchtturm_lvl9 = "3x3";
    private static final String anzahl_auslastung_leuchtturm_lvl9 = "Level 9";
    private static final int produktionsdauer_leuchtturm_lvl9 = 0;
    private static final String baukosten_leuchtturm_lvl9 = "10M";
    private static final int[] ressourcen_leuchtturm_lvl9 = {2500, 2000, 1500, 1000};

    // Schatzkammer Level 1
    private static final int art_bev_schatzkammer_lvl1 = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_schatzkammer_lvl1 = 300;
    private static final int anzahl_sonder_schatzkammer_lvl1 = 150000;
    private static final int unterhalt_schatzkammer_lvl1 = 5;
    private static final int radius_schatzkammer_lvl1 = 0;
    private static final String groesse_schatzkammer_lvl1 = "4x4";
    private static final String anzahl_auslastung_schatzkammer_lvl1 = "Level 1";
    private static final int produktionsdauer_schatzkammer_lvl1 = 0;
    private static final String baukosten_schatzkammer_lvl1 = "40k";
    private static final int[] ressourcen_schatzkammer_lvl1 = {75, 25, 0, 0};

    // Schatzkammer Level 2
    private static final int art_bev_schatzkammer_lvl2 = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_schatzkammer_lvl2 = 900;
    private static final int anzahl_sonder_schatzkammer_lvl2 = 250000;
    private static final int unterhalt_schatzkammer_lvl2 = 10;
    private static final int radius_schatzkammer_lvl2 = 0;
    private static final String groesse_schatzkammer_lvl2 = "4x4";
    private static final String anzahl_auslastung_schatzkammer_lvl2 = "Level 2";
    private static final int produktionsdauer_schatzkammer_lvl2 = 0;
    private static final String baukosten_schatzkammer_lvl2 = "80k";
    private static final int[] ressourcen_schatzkammer_lvl2 = {150, 75, 0, 0};

    // Schatzkammer Level 3
    private static final int art_bev_schatzkammer_lvl3 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_schatzkammer_lvl3 = 1;
    private static final int anzahl_sonder_schatzkammer_lvl3 = 500000;
    private static final int unterhalt_schatzkammer_lvl3 = 15;
    private static final int radius_schatzkammer_lvl3 = 0;
    private static final String groesse_schatzkammer_lvl3 = "4x4";
    private static final String anzahl_auslastung_schatzkammer_lvl3 = "Level 3";
    private static final int produktionsdauer_schatzkammer_lvl3 = 0;
    private static final String baukosten_schatzkammer_lvl3 = "150k";
    private static final int[] ressourcen_schatzkammer_lvl3 = {300, 150, 0, 0};

    // Schatzkammer Level 4
    private static final int art_bev_schatzkammer_lvl4 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_schatzkammer_lvl4 = 500;
    private static final int anzahl_sonder_schatzkammer_lvl4 = 1000000;
    private static final int unterhalt_schatzkammer_lvl4 = 20;
    private static final int radius_schatzkammer_lvl4 = 0;
    private static final String groesse_schatzkammer_lvl4 = "4x4";
    private static final String anzahl_auslastung_schatzkammer_lvl4 = "Level 4";
    private static final int produktionsdauer_schatzkammer_lvl4 = 0;
    private static final String baukosten_schatzkammer_lvl4 = "300k";
    private static final int[] ressourcen_schatzkammer_lvl4 = {500, 300, 25, 0};

    // Schatzkammer Level 5
    private static final int art_bev_schatzkammer_lvl5 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_schatzkammer_lvl5 = 1500;
    private static final int anzahl_sonder_schatzkammer_lvl5 = 1500000;
    private static final int unterhalt_schatzkammer_lvl5 = 25;
    private static final int radius_schatzkammer_lvl5 = 0;
    private static final String groesse_schatzkammer_lvl5 = "4x4";
    private static final String anzahl_auslastung_schatzkammer_lvl5 = "Level 5";
    private static final int produktionsdauer_schatzkammer_lvl5 = 0;
    private static final String baukosten_schatzkammer_lvl5 = "500k";
    private static final int[] ressourcen_schatzkammer_lvl5 = {700, 500, 75, 0};

    // Schatzkammer Level 6
    private static final int art_bev_schatzkammer_lvl6 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_schatzkammer_lvl6 = 2500;
    private static final int anzahl_sonder_schatzkammer_lvl6 = 2500000;
    private static final int unterhalt_schatzkammer_lvl6 = 30;
    private static final int radius_schatzkammer_lvl6 = 0;
    private static final String groesse_schatzkammer_lvl6 = "4x4";
    private static final String anzahl_auslastung_schatzkammer_lvl6 = "Level 6";
    private static final int produktionsdauer_schatzkammer_lvl6 = 0;
    private static final String baukosten_schatzkammer_lvl6 = "750k";
    private static final int[] ressourcen_schatzkammer_lvl6 = {900, 750, 150, 0};

    // Schatzkammer Level 7
    private static final int art_bev_schatzkammer_lvl7 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_schatzkammer_lvl7 = 1;
    private static final int anzahl_sonder_schatzkammer_lvl7 = 4000000;
    private static final int unterhalt_schatzkammer_lvl7 = 35;
    private static final int radius_schatzkammer_lvl7 = 0;
    private static final String groesse_schatzkammer_lvl7 = "4x4";
    private static final String anzahl_auslastung_schatzkammer_lvl7 = "Level 7";
    private static final int produktionsdauer_schatzkammer_lvl7 = 0;
    private static final String baukosten_schatzkammer_lvl7 = "1.25M";
    private static final int[] ressourcen_schatzkammer_lvl7 = {1100, 900, 300, 100};

    // Schatzkammer Level 8
    private static final int art_bev_schatzkammer_lvl8 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_schatzkammer_lvl8 = 1000;
    private static final int anzahl_sonder_schatzkammer_lvl8 = 6500000;
    private static final int unterhalt_schatzkammer_lvl8 = 40;
    private static final int radius_schatzkammer_lvl8 = 0;
    private static final String groesse_schatzkammer_lvl8 = "4x4";
    private static final String anzahl_auslastung_schatzkammer_lvl8 = "Level 8";
    private static final int produktionsdauer_schatzkammer_lvl8 = 0;
    private static final String baukosten_schatzkammer_lvl8 = "2M";
    private static final int[] ressourcen_schatzkammer_lvl8 = {1250, 1100, 500, 200};

    // Schatzkammer Level 9
    private static final int art_bev_schatzkammer_lvl9 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_schatzkammer_lvl9 = 2500;
    private static final int anzahl_sonder_schatzkammer_lvl9 = 10000000;
    private static final int unterhalt_schatzkammer_lvl9 = 45;
    private static final int radius_schatzkammer_lvl9 = 0;
    private static final String groesse_schatzkammer_lvl9 = "4x4";
    private static final String anzahl_auslastung_schatzkammer_lvl9 = "Level 9";
    private static final int produktionsdauer_schatzkammer_lvl9 = 0;
    private static final String baukosten_schatzkammer_lvl9 = "3M";
    private static final int[] ressourcen_schatzkammer_lvl9 = {1400, 1250, 750, 400};

    // Schatzkammer Level 10
    private static final int art_bev_schatzkammer_lvl10 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_schatzkammer_lvl10 = 4000;
    private static final int anzahl_sonder_schatzkammer_lvl10 = 15000000;
    private static final int unterhalt_schatzkammer_lvl10 = 60;
    private static final int radius_schatzkammer_lvl10 = 50;
    private static final String groesse_schatzkammer_lvl10 = "4x4";
    private static final String anzahl_auslastung_schatzkammer_lvl10 = "Level 10";
    private static final int produktionsdauer_schatzkammer_lvl10 = 0;
    private static final String baukosten_schatzkammer_lvl10 = "5M";
    private static final int[] ressourcen_schatzkammer_lvl10 = {1500, 1400, 1250, 800};

    // Bauernhaus
    private static final int art_bev_bauernhaus = GB_BEV_BAUER;
    private static final int anzahl_bev_bauernhaus = 0;
    private static final int anzahl_sonder_bauernhaus = 0;
    private static final int unterhalt_bauernhaus = 0;
    private static final int radius_bauernhaus = 0;
    private static final String groesse_bauernhaus = "3x3";
    private static final String anzahl_auslastung_bauernhaus = "";
    private static final int produktionsdauer_bauernhaus = 0;
    private static final String baukosten_bauernhaus = "0";
    private static final int[] ressourcen_bauernhaus = {10, 0, 0, 0};

    // Handwerkerkate
    private static final int art_bev_handwerkerkate = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_handwerkerkate = 1;
    private static final int anzahl_sonder_handwerkerkate = 0;
    private static final int unterhalt_handwerkerkate = 0;
    private static final int radius_handwerkerkate = 0;
    private static final String groesse_handwerkerkate = "3x3";
    private static final String anzahl_auslastung_handwerkerkate = "";
    private static final int produktionsdauer_handwerkerkate = 0;
    private static final String baukosten_handwerkerkate = "5000";
    private static final int[] ressourcen_handwerkerkate = {30, 0, 0, 0};

    // Kaufmannshaus
    private static final int art_bev_kaufmannshaus = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_kaufmannshaus = 1;
    private static final int anzahl_sonder_kaufmannshaus = 0;
    private static final int unterhalt_kaufmannshaus = 0;
    private static final int radius_kaufmannshaus = 0;
    private static final String groesse_kaufmannshaus = "3x3";
    private static final String anzahl_auslastung_kaufmannshaus = "";
    private static final int produktionsdauer_kaufmannshaus = 0;
    private static final String baukosten_kaufmannshaus = "15k";
    private static final int[] ressourcen_kaufmannshaus = {0, 100, 0, 0};

    // Adligenhaus
    private static final int art_bev_adligenhaus = GB_BEV_ADLIGER;
    private static final int anzahl_bev_adligenhaus = 1;
    private static final int anzahl_sonder_adligenhaus = 0;
    private static final int unterhalt_adligenhaus = 0;
    private static final int radius_adligenhaus = 0;
    private static final String groesse_adligenhaus = "3x3";
    private static final String anzahl_auslastung_adligenhaus = "";
    private static final int produktionsdauer_adligenhaus = 0;
    private static final String baukosten_adligenhaus = "100k";
    private static final int[] ressourcen_adligenhaus = {0, 0, 500, 0};

    // Feldweg
    private static final int art_bev_feldweg = GB_BEV_BAUER;
    private static final int anzahl_bev_feldweg = 0;
    private static final int anzahl_sonder_feldweg = 0;
    private static final int unterhalt_feldweg = 0;
    private static final int radius_feldweg = 0;
    private static final String groesse_feldweg = "1x1";
    private static final String anzahl_auslastung_feldweg = "";
    private static final int produktionsdauer_feldweg = 0;
    private static final String baukosten_feldweg = "0";
    private static final int[] ressourcen_feldweg = {0, 0, 0, 0};

    // Steinstra�e
    private static final int art_bev_steinstrasse = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_steinstrasse = 1;
    private static final int anzahl_sonder_steinstrasse = 0;
    private static final int unterhalt_steinstrasse = 0;
    private static final int radius_steinstrasse = 0;
    private static final String groesse_steinstrasse = "1x1";
    private static final String anzahl_auslastung_steinstrasse = "";
    private static final int produktionsdauer_steinstrasse = 0;
    private static final String baukosten_steinstrasse = "250";
    private static final int[] ressourcen_steinstrasse = {0, 5, 0, 0};

    // Marktplatz klein
    private static final int art_bev_marktplatz_klein = GB_BEV_BAUER;
    private static final int anzahl_bev_marktplatz_klein = 0;
    private static final int anzahl_sonder_marktplatz_klein = 0;
    private static final int unterhalt_marktplatz_klein = 2;
    private static final int radius_marktplatz_klein = 9;
    private static final String groesse_marktplatz_klein = "2x2";
    private static final String anzahl_auslastung_marktplatz_klein = "";
    private static final int produktionsdauer_marktplatz_klein = 0;
    private static final String baukosten_marktplatz_klein = "1700";
    private static final int[] ressourcen_marktplatz_klein = {15, 0, 0, 0};

    // Marktplatz mittelgro�
    private static final int art_bev_marktplatz_mittelgross = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_marktplatz_mittelgross = 1;
    private static final int anzahl_sonder_marktplatz_mittelgross = 0;
    private static final int unterhalt_marktplatz_mittelgross = 7;
    private static final int radius_marktplatz_mittelgross = 16;
    private static final String groesse_marktplatz_mittelgross = "4x5";
    private static final String anzahl_auslastung_marktplatz_mittelgross = "";
    private static final int produktionsdauer_marktplatz_mittelgross = 0;
    private static final String baukosten_marktplatz_mittelgross = "13.5k";
    private static final int[] ressourcen_marktplatz_mittelgross = {35, 50, 0, 0};

    // Marktplatz gro�
    private static final int art_bev_marktplatz_gross = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_marktplatz_gross = 1;
    private static final int anzahl_sonder_marktplatz_gross = 0;
    private static final int unterhalt_marktplatz_gross = 20;
    private static final int radius_marktplatz_gross = 26;
    private static final String groesse_marktplatz_gross = "8x8";
    private static final String anzahl_auslastung_marktplatz_gross = "";
    private static final int produktionsdauer_marktplatz_gross = 0;
    private static final String baukosten_marktplatz_gross = "95k";
    private static final int[] ressourcen_marktplatz_gross = {80, 160, 75, 0};

    // Marktplatz riesig
    private static final int art_bev_marktplatz_riesig = GB_BEV_ADLIGER;
    private static final int anzahl_bev_marktplatz_riesig = 1;
    private static final int anzahl_sonder_marktplatz_riesig = 0;
    private static final int unterhalt_marktplatz_riesig = 60;
    private static final int radius_marktplatz_riesig = 34;
    private static final String groesse_marktplatz_riesig = "10x13";
    private static final String anzahl_auslastung_marktplatz_riesig = "";
    private static final int produktionsdauer_marktplatz_riesig = 0;
    private static final String baukosten_marktplatz_riesig = "1.05M";
    private static final int[] ressourcen_marktplatz_riesig = {180, 340, 160, 185};

    // Markthaus Level 1
    private static final int art_bev_markthaus_lvl1 = GB_BEV_BAUER;
    private static final int anzahl_bev_markthaus_lvl1 = 25;
    private static final int anzahl_sonder_markthaus_lvl1 = 0;
    private static final int unterhalt_markthaus_lvl1 = 2;
    private static final int radius_markthaus_lvl1 = 0;
    private static final String groesse_markthaus_lvl1 = "4x4";
    private static final String anzahl_auslastung_markthaus_lvl1 = "";
    private static final int produktionsdauer_markthaus_lvl1 = 0;
    private static final String baukosten_markthaus_lvl1 = "2150";
    private static final int[] ressourcen_markthaus_lvl1 = {20, 0, 0, 0};

    // Markthaus Level 2
    private static final int art_bev_markthaus_lvl2 = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_markthaus_lvl2 = 1500;
    private static final int anzahl_sonder_markthaus_lvl2 = 1;
    private static final int unterhalt_markthaus_lvl2 = 2;
    private static final int radius_markthaus_lvl2 = 0;
    private static final String groesse_markthaus_lvl2 = "4x4";
    private static final String anzahl_auslastung_markthaus_lvl2 = "";
    private static final int produktionsdauer_markthaus_lvl2 = 0;
    private static final String baukosten_markthaus_lvl2 = "125k";
    private static final int[] ressourcen_markthaus_lvl2 = {175, 225, 0, 0};

    // Markthaus Level 3
    private static final int art_bev_markthaus_lvl3 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_markthaus_lvl3 = 2000;
    private static final int anzahl_sonder_markthaus_lvl3 = 2;
    private static final int unterhalt_markthaus_lvl3 = 2;
    private static final int radius_markthaus_lvl3 = 0;
    private static final String groesse_markthaus_lvl3 = "4x4";
    private static final String anzahl_auslastung_markthaus_lvl3 = "";
    private static final int produktionsdauer_markthaus_lvl3 = 0;
    private static final String baukosten_markthaus_lvl3 = "300k";
    private static final int[] ressourcen_markthaus_lvl3 = {400, 250, 175, 0};

    // Markthaus Level 4
    private static final int art_bev_markthaus_lvl4 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_markthaus_lvl4 = 500;
    private static final int anzahl_sonder_markthaus_lvl4 = 3;
    private static final int unterhalt_markthaus_lvl4 = 2;
    private static final int radius_markthaus_lvl4 = 0;
    private static final String groesse_markthaus_lvl4 = "4x4";
    private static final String anzahl_auslastung_markthaus_lvl4 = "";
    private static final int produktionsdauer_markthaus_lvl4 = 0;
    private static final String baukosten_markthaus_lvl4 = "800k";
    private static final int[] ressourcen_markthaus_lvl4 = {800, 500, 250, 175};

    // Werft
    private static final int art_bev_werft = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_werft = 1;
    private static final int anzahl_sonder_werft = 0;
    private static final int unterhalt_werft = 0;
    private static final int radius_werft = 0;
    private static final String groesse_werft = "5x5";
    private static final String anzahl_auslastung_werft = "";
    private static final int produktionsdauer_werft = 0;
    private static final String baukosten_werft = "39k";
    private static final int[] ressourcen_werft = {60, 30, 0, 0};

    // Schiffsbauer
    private static final int art_bev_schiffsbauer = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_schiffsbauer = 1;
    private static final int anzahl_sonder_schiffsbauer = 0;
    private static final int unterhalt_schiffsbauer = 0;
    private static final int radius_schiffsbauer = 0;
    private static final String groesse_schiffsbauer = "5x6";
    private static final String anzahl_auslastung_schiffsbauer = "";
    private static final int produktionsdauer_schiffsbauer = 0;
    private static final String baukosten_schiffsbauer = "45k";
    private static final int[] ressourcen_schiffsbauer = {60, 50, 0, 0};

    // Proviantmagazin
    private static final int art_bev_proviantmagazin = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_proviantmagazin = 300;
    private static final int anzahl_sonder_proviantmagazin = 0;
    private static final int unterhalt_proviantmagazin = 0;
    private static final int radius_proviantmagazin = 0;
    private static final String groesse_proviantmagazin = "4x5";
    private static final String anzahl_auslastung_proviantmagazin = "";
    private static final int produktionsdauer_proviantmagazin = 0;
    private static final String baukosten_proviantmagazin = "34k";
    private static final int[] ressourcen_proviantmagazin = {50, 80, 0, 0};

    // Dock
    private static final int art_bev_dock = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_dock = 1500;
    private static final int anzahl_sonder_dock = 0;
    private static final int unterhalt_dock = 0;
    private static final int radius_dock = 0;
    private static final String groesse_dock = "2x6";
    private static final String anzahl_auslastung_dock = "";
    private static final int produktionsdauer_dock = 0;
    private static final String baukosten_dock = "65k";
    private static final int[] ressourcen_dock = {190, 110, 0, 0};

    // Gildenhalle
    private static final int art_bev_gildenhalle = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_gildenhalle = 1;
    private static final int anzahl_sonder_gildenhalle = 0;
    private static final int unterhalt_gildenhalle = 0;
    private static final int radius_gildenhalle = 0;
    private static final String groesse_gildenhalle = "9x9";
    private static final String anzahl_auslastung_gildenhalle = "";
    private static final int produktionsdauer_gildenhalle = 0;
    private static final String baukosten_gildenhalle = "75k";
    private static final int[] ressourcen_gildenhalle = {300, 300, 0, 0};

    // Pier Level 1
    private static final int art_bev_pier_lvl1 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_pier_lvl1 = 250;
    private static final int anzahl_sonder_pier_lvl1 = 0;
    private static final int unterhalt_pier_lvl1 = 8;
    private static final int radius_pier_lvl1 = 0;
    private static final String groesse_pier_lvl1 = "4x8";
    private static final String anzahl_auslastung_pier_lvl1 = "";
    private static final int produktionsdauer_pier_lvl1 = 0;
    private static final String baukosten_pier_lvl1 = "275k";
    private static final int[] ressourcen_pier_lvl1 = {250, 400, 75, 0};

    // Pier Level 2
    private static final int art_bev_pier_lvl2 = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_pier_lvl2 = 2000;
    private static final int anzahl_sonder_pier_lvl2 = 1;
    private static final int unterhalt_pier_lvl2 = 16;
    private static final int radius_pier_lvl2 = 0;
    private static final String groesse_pier_lvl2 = "4x8";
    private static final String anzahl_auslastung_pier_lvl2 = "";
    private static final int produktionsdauer_pier_lvl2 = 0;
    private static final String baukosten_pier_lvl2 = "400k";
    private static final int[] ressourcen_pier_lvl2 = {500, 350, 250, 0};

    // Pier Level 3
    private static final int art_bev_pier_lvl3 = GB_BEV_ADLIGER;
    private static final int anzahl_bev_pier_lvl3 = 500;
    private static final int anzahl_sonder_pier_lvl3 = 1;
    private static final int unterhalt_pier_lvl3 = 32;
    private static final int radius_pier_lvl3 = 0;
    private static final String groesse_pier_lvl3 = "4x8";
    private static final String anzahl_auslastung_pier_lvl3 = "";
    private static final int produktionsdauer_pier_lvl3 = 0;
    private static final String baukosten_pier_lvl3 = "1M";
    private static final int[] ressourcen_pier_lvl3 = {1000, 600, 325, 250};

    // Handelsspeicher
    private static final int art_bev_handelsspeicher = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_handelsspeicher = 250;
    private static final int anzahl_sonder_handelsspeicher = 0;
    private static final int unterhalt_handelsspeicher = 16;
    private static final int radius_handelsspeicher = 0;
    private static final String groesse_handelsspeicher = "2x6";
    private static final String anzahl_auslastung_handelsspeicher = "";
    private static final int produktionsdauer_handelsspeicher = 0;
    private static final String baukosten_handelsspeicher = "85k";
    private static final int[] ressourcen_handelsspeicher = {170, 160, 90, 0};

    // Brunnen
    private static final int art_bev_brunnen = GB_BEV_BAUER;
    private static final int anzahl_bev_brunnen = 2;
    private static final int anzahl_sonder_brunnen = 2;
    private static final int unterhalt_brunnen = 2;
    private static final int radius_brunnen = 10;
    private static final String groesse_brunnen = "3x3";
    private static final String anzahl_auslastung_brunnen = "";
    private static final int produktionsdauer_brunnen = 0;
    private static final String baukosten_brunnen = "1800";
    private static final int[] ressourcen_brunnen = {25, 0, 0, 0};

    // Zimmermann
    private static final int art_bev_zimmermann = GB_BEV_BAUER;
    private static final int anzahl_bev_zimmermann = 60;
    private static final int anzahl_sonder_zimmermann = 2;
    private static final int unterhalt_zimmermann = 3;
    private static final int radius_zimmermann = 18;
    private static final String groesse_zimmermann = "3x3";
    private static final String anzahl_auslastung_zimmermann = "";
    private static final int produktionsdauer_zimmermann = 0;
    private static final String baukosten_zimmermann = "2700";
    private static final int[] ressourcen_zimmermann = {35, 0, 0, 0};

    // Kapelle
    private static final int art_bev_kapelle = GB_BEV_BAUER;
    private static final int anzahl_bev_kapelle = 120;
    private static final int anzahl_sonder_kapelle = 2;
    private static final int unterhalt_kapelle = 4;
    private static final int radius_kapelle = 21;
    private static final String groesse_kapelle = "3x5";
    private static final String anzahl_auslastung_kapelle = "";
    private static final int produktionsdauer_kapelle = 0;
    private static final String baukosten_kapelle = "3100";
    private static final int[] ressourcen_kapelle = {45, 0, 0, 0};

    // Barbier
    private static final int art_bev_barbier = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_barbier = 1;
    private static final int anzahl_sonder_barbier = 3;
    private static final int unterhalt_barbier = 8;
    private static final int radius_barbier = 15;
    private static final String groesse_barbier = "3x4";
    private static final String anzahl_auslastung_barbier = "";
    private static final int produktionsdauer_barbier = 0;
    private static final String baukosten_barbier = "12k";
    private static final int[] ressourcen_barbier = {35, 30, 0, 0};

    // Taverne
    private static final int art_bev_taverne = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_taverne = 300;
    private static final int anzahl_sonder_taverne = 3;
    private static final int unterhalt_taverne = 12;
    private static final int radius_taverne = 21;
    private static final String groesse_taverne = "3x4";
    private static final String anzahl_auslastung_taverne = "";
    private static final int produktionsdauer_taverne = 0;
    private static final String baukosten_taverne = "29.5k";
    private static final int[] ressourcen_taverne = {40, 70, 0, 0};

    // Feuerwache
    private static final int art_bev_feuerwache = GB_BEV_HANDWERKER;
    private static final int anzahl_bev_feuerwache = 900;
    private static final int anzahl_sonder_feuerwache = 3;
    private static final int unterhalt_feuerwache = 15;
    private static final int radius_feuerwache = 26;
    private static final String groesse_feuerwache = "3x4";
    private static final String anzahl_auslastung_feuerwache = "";
    private static final int produktionsdauer_feuerwache = 0;
    private static final String baukosten_feuerwache = "52k";
    private static final int[] ressourcen_feuerwache = {70, 95, 0, 0};

    // Turnierplatz
    private static final int art_bev_turnierplatz = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_turnierplatz = 500;
    private static final int anzahl_sonder_turnierplatz = 4;
    private static final int unterhalt_turnierplatz = 35;
    private static final int radius_turnierplatz = 30;
    private static final String groesse_turnierplatz = "5x7";
    private static final String anzahl_auslastung_turnierplatz = "";
    private static final int produktionsdauer_turnierplatz = 0;
    private static final String baukosten_turnierplatz = "325k";
    private static final int[] ressourcen_turnierplatz = {140, 160, 125, 0};

    // Schuldturm
    private static final int art_bev_schuldturm = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_schuldturm = 1500;
    private static final int anzahl_sonder_schuldturm = 4;
    private static final int unterhalt_schuldturm = 40;
    private static final int radius_schuldturm = 24;
    private static final String groesse_schuldturm = "4x5";
    private static final String anzahl_auslastung_schuldturm = "";
    private static final int produktionsdauer_schuldturm = 0;
    private static final String baukosten_schuldturm = "530k";
    private static final int[] ressourcen_schultdturm = {225, 385, 425, 0};

    // Kirche
    private static final int art_bev_kirche = GB_BEV_KAUFMANN;
    private static final int anzahl_bev_kirche = 2500;
    private static final int anzahl_sonder_kirche = 4;
    private static final int unterhalt_kirche = 70;
    private static final int radius_kirche = 25;
    private static final String groesse_kirche = "6x8";
    private static final String anzahl_auslastung_kirche = "";
    private static final int produktionsdauer_kirche = 0;
    private static final String baukosten_kirche = "780k";
    private static final int[] ressourcen_kirche = {620, 850, 570, 0};

    // Medikus
    private static final int art_bev_medikus = GB_BEV_ADLIGER;
    private static final int anzahl_bev_medikus = 1500;
    private static final int anzahl_sonder_medikus = 5;
    private static final int unterhalt_medikus = 280;
    private static final int radius_medikus = 25;
    private static final String groesse_medikus = "3x3";
    private static final String anzahl_auslastung_medikus = "";
    private static final int produktionsdauer_medikus = 0;
    private static final String baukosten_medikus = "4.15M";
    private static final int[] ressourcen_medikus = {350, 550, 470, 380};

    // Gebäude
    private Gebaeude gebaeudeHolzfaeller;
    private Gebaeude gebaeudeSteinbruch;
    private Gebaeude gebaeudeEisenmine;
    private Gebaeude gebaeudeKoehlerhuette;
    private Gebaeude gebaeudeKohlebergwerk;
    private Gebaeude gebaeudeEisenschmelze;
    private Gebaeude gebaeudeWerkzeugmacher;
    private Gebaeude gebaeudeWaldglashuette;
    private Gebaeude gebaeudeQuarzbruch;
    private Gebaeude gebaeudeGlasschmelze;
    private Gebaeude gebaeudeFischer;
    private Gebaeude gebaeudeWeizenhof;
    private Gebaeude gebaeudeMuehle;
    private Gebaeude gebaeudeBackstube;
    private Gebaeude gebaeudeGewuerze;
    private Gebaeude gebaeudeRinderfarm;
    private Gebaeude gebaeudeMetzger;
    private Gebaeude gebaeudeZiegenfarm;
    private Gebaeude gebaeudeApfelhof;
    private Gebaeude gebaeudeMosthof;
    private Gebaeude gebaeudeKlostergarten;
    private Gebaeude gebaeudeKlosterbrauerei;
    private Gebaeude gebaeudeWeingut;
    private Gebaeude gebaeudeFasskueferei;
    private Gebaeude gebaeudeKelterei;
    private Gebaeude gebaeudeSchaffarm;
    private Gebaeude gebaeudeSpinnerei;
    private Gebaeude gebaeudeHanfplantage;
    private Gebaeude gebaeudeWebstube;
    private Gebaeude gebaeudeSchweinefarm;
    private Gebaeude gebaeudeSalzstock;
    private Gebaeude gebaeudeSaline;
    private Gebaeude gebaeudeGerberei;
    private Gebaeude gebaeudePelztierjaeger;
    private Gebaeude gebaeudeKuerschnerei;
    private Gebaeude gebaeudeGoldmine;
    private Gebaeude gebaeudeGoldschmelze;
    private Gebaeude gebaeudeSeide;
    private Gebaeude gebaeudeSeidenweberei;
    private Gebaeude gebaeudePapiermuehle;
    private Gebaeude gebaeudeIndigo;
    private Gebaeude gebaeudeDruckerei;
    private Gebaeude gebaeudeImker;
    private Gebaeude gebaeudeLichtzieher;
    private Gebaeude gebaeudeFeinschmiede;
    private Gebaeude gebaeudeKupfermine;
    private Gebaeude gebaeudeKupferschmelze;
    private Gebaeude gebaeudeBrillenmacher;
    private Gebaeude gebaeudeTieferSteinmetz;
    private Gebaeude gebaeudeTiefeEisenmine;
    private Gebaeude gebaeudeTieferQuarzbruch;
    private Gebaeude gebaeudeTiefesKohlebergwerk;
    private Gebaeude gebaeudeTieferSalzstock;
    private Gebaeude gebaeudeTieferPelztierjaeger;
    private Gebaeude gebaeudeTiefeGoldmine;
    private Gebaeude gebaeudeTiefeKupfermine;
    private Gebaeude gebaeudeVerbessertenWeizenhof;
    private Gebaeude gebaeudeVerbesserteMuehle;
    private Gebaeude gebaeudeVerbesserteBaeckerei;
    private Gebaeude gebaeudeVerbessertePapiermuehle;
    private Gebaeude gebaeudeGewuerzbasar;
    private Gebaeude gebaeudeScheune;
    private Gebaeude gebaeudeSilo;
    private Gebaeude gebaeudeMuseum;
    private Gebaeude gebaeudeStadtarchiv;
    private Gebaeude gebaeudeVerbesserterMarktplatz;
    private Gebaeude gebaeudeKontorLvl1;
    private Gebaeude gebaeudeKontorLvl2;
    private Gebaeude gebaeudeKontorLvl3;
    private Gebaeude gebaeudeKontorLvl4;
    private Gebaeude gebaeudeLagerhausLvl1;
    private Gebaeude gebaeudeLagerhausLvl2;
    private Gebaeude gebaeudeLagerhausLvl3;
    private Gebaeude gebaeudeLagerhausLvl4;
    private Gebaeude gebaeudeLagerhausLvl5;
    private Gebaeude gebaeudeLagerhausLvl6;
    private Gebaeude gebaeudeLagerhausLvl7;
    private Gebaeude gebaeudeLagerhausLvl8;
    private Gebaeude gebaeudeLagerhausLvl9;
    private Gebaeude gebaeudeLeuchtturmLvl1;
    private Gebaeude gebaeudeLeuchtturmLvl2;
    private Gebaeude gebaeudeLeuchtturmLvl3;
    private Gebaeude gebaeudeLeuchtturmLvl4;
    private Gebaeude gebaeudeLeuchtturmLvl5;
    private Gebaeude gebaeudeLeuchtturmLvl6;
    private Gebaeude gebaeudeLeuchtturmLvl7;
    private Gebaeude gebaeudeLeuchtturmLvl8;
    private Gebaeude gebaeudeLeuchtturmLvl9;
    private Gebaeude gebaeudeSchatzkammerLvl1;
    private Gebaeude gebaeudeSchatzkammerLvl2;
    private Gebaeude gebaeudeSchatzkammerLvl3;
    private Gebaeude gebaeudeSchatzkammerLvl4;
    private Gebaeude gebaeudeSchatzkammerLvl5;
    private Gebaeude gebaeudeSchatzkammerLvl6;
    private Gebaeude gebaeudeSchatzkammerLvl7;
    private Gebaeude gebaeudeSchatzkammerLvl8;
    private Gebaeude gebaeudeSchatzkammerLvl9;
    private Gebaeude gebaeudeSchatzkammerLvl10;
    private Gebaeude gebaeudeBauernhaus;
    private Gebaeude gebaeudeHandwerkerkate;
    private Gebaeude gebaeudeKaufmannshaus;
    private Gebaeude gebaeudeAdligenhaus;
    private Gebaeude gebaeudeFeldweg;
    private Gebaeude gebaeudeSteinstrasse;
    private Gebaeude gebaeudeMarktplatzKlein;
    private Gebaeude gebaeudeMarktplatzMittelgross;
    private Gebaeude gebaeudeMarktplatzGross;
    private Gebaeude gebaeudeMarktplatzRiesig;
    private Gebaeude gebaeudeMarkthausLvl1;
    private Gebaeude gebaeudeMarkthausLvl2;
    private Gebaeude gebaeudeMarkthausLvl3;
    private Gebaeude gebaeudeMarkthausLvl4;
    private Gebaeude gebaeudeWerft;
    private Gebaeude gebaeudeSchiffsbauer;
    private Gebaeude gebaeudeProviantmagazin;
    private Gebaeude gebaeudeDock;
    private Gebaeude gebaeudeGildenhalle;
    private Gebaeude gebaeudePierLvl1;
    private Gebaeude gebaeudePierLvl2;
    private Gebaeude gebaeudePierLvl3;
    private Gebaeude gebaeudeHandelsspeicher;
    private Gebaeude gebaeudeBrunnen;
    private Gebaeude gebaeudeZimmermann;
    private Gebaeude gebaeudeKapelle;
    private Gebaeude gebaeudeBarbier;
    private Gebaeude gebaeudeTaverne;
    private Gebaeude gebaeudeFeuerwache;
    private Gebaeude gebaeudeTurnierplatz;
    private Gebaeude gebaeudeSchuldturm;
    private Gebaeude gebaeudeKirche;
    private Gebaeude gebaeudeMedikus;

    // Konstruktor
    public Gebaeudeersteller(Activity activity){
        this.activity = activity;
    }

    // Alle Gebäude erstellen (für FragGebäude)
    public void erstelleAlleGebaeude(){
    	// Produktionsgebäude
    	erstelleProduktionsgebaeude();
    	// Alle Shopgebäude
    	erstelleShopgebaeude();
    	// Alle Infrastrukturgebäude
    	erstelleInfrastrukturgebaeude();
    	// Alle Attraktionen
    	erstelleAttraktionen();
    }

    // Alle Produktionsgebäude erstellen (für FragProduktionsketten)
    public void erstelleProduktionsgebaeude(){
    	erstelleHolzfaeller();
    	erstelleSteinbruch();
        erstelleEisenmine();
        erstelleKoehlerhuette();
        erstelleKohlebergwerk();
        erstelleEisenschmelze();
        erstelleWerkzeugmacher();
        erstelleWaldglashuette();
        erstelleQuarzbruch();
        erstelleGlasschmelze();
        erstelleFischer();
        erstelleWeizenfarm();
        erstelleMuehle();
        erstelleBackstube();
        erstelleGewuerze();
        erstelleRinderfarm();
        erstelleMetzger();
        erstelleZiegenfarm();
        erstelleApfelhof();
        erstelleMosthof();
        erstelleKlostergarten();
        erstelleKlosterbrauerei();
        erstelleWeingut();
        erstelleFasskueferei();
        erstelleKelterei();
        erstelleSchaffarm();
        erstelleSpinnerei();
        erstelleHanfplantage();
        erstelleWebstube();
        erstelleSchweinefarm();
        erstelleSalzstock();
        erstelleSaline();
        erstelleGerberei();
        erstellePelztierjaeger();
        erstelleKuerschnerei();
        erstelleGoldmine();
        erstelleGoldschmelze();
        erstelleSeide();
        erstelleSeidenweberei();
        erstellePapiermuehle();
        erstelleIndigo();
        erstelleDruckerei();
        erstelleImker();
        erstelleLichtzieher();
        erstelleFeinschmiede();
        erstelleKupfermine();
        erstelleKupferschmelze();
        erstelleBrillenmacher();
    }

    // Alle Verbrauchsgebäude erstellen (für FragVerbrauch)
    public void erstelleVerbrauchsgebaeude(){
        erstelleHolzfaeller();
        erstelleEisenmine();
        erstelleKoehlerhuette();
        erstelleEisenschmelze();
        erstelleQuarzbruch();
        erstelleFischer();
        erstelleWeizenfarm();
        erstelleMuehle();
        erstelleBackstube();
        erstelleRinderfarm();
        erstelleMetzger();
        erstelleZiegenfarm();
        erstelleApfelhof();
        erstelleMosthof();
        erstelleKlostergarten();
        erstelleKlosterbrauerei();
        erstelleWeingut();
        erstelleFasskueferei();
        erstelleKelterei();
        erstelleSchaffarm();
        erstelleSpinnerei();
        erstelleHanfplantage();
        erstelleWebstube();
        erstelleSchweinefarm();
        erstelleSalzstock();
        erstelleSaline();
        erstelleGerberei();
        erstellePelztierjaeger();
        erstelleKuerschnerei();
        erstelleGoldmine();
        erstelleGoldschmelze();
        erstelleSeide();
        erstelleSeidenweberei();
        erstellePapiermuehle();
        erstelleIndigo();
        erstelleDruckerei();
        erstelleImker();
        erstelleLichtzieher();
        erstelleFeinschmiede();
        erstelleKupfermine();
        erstelleKupferschmelze();
        erstelleBrillenmacher();
    }
    
    // Alle Shopgebäude erstellen
    private void erstelleShopgebaeude(){
    	erstelleTieferSteinmetz();
    	erstelleTiefeEisenmine();
    	erstelleTieferQuarzbruch();
    	erstelleTiefesKohlebergwerk();
    	erstelleTieferSalzstock();
    	erstelleTieferPelztierjaeger();
    	erstelleTiefeGoldmine();
    	erstelleTiefeKupfermine();
    	erstelleVerbessertenWeizenhof();
    	erstelleVerbesserteMuehle();
    	erstelleVerbesserteBaeckerei();
    	erstelleVerbessertePapiermuehle();
    	erstelleGewuerzbasar();
    	erstelleScheune();
    	erstelleSilo();
    	erstelleMuseum();
    	erstelleStadtarchiv();
    	erstelleVerbesserterMarktplatz();
    }
    
    // Alle Infrastrukturgebäude erstellen
    private void erstelleInfrastrukturgebaeude(){
    	erstelleKontorLvl1();
    	erstelleKontorLvl2();
    	erstelleKontorLvl3();
    	erstelleKontorLvl4();
    	erstelleLagerhausLvl1();
    	erstelleLagerhausLvl2();
    	erstelleLagerhausLvl3();
    	erstelleLagerhausLvl4();
    	erstelleLagerhausLvl5();
    	erstelleLagerhausLvl6();
    	erstelleLagerhausLvl7();
    	erstelleLagerhausLvl8();
    	erstelleLagerhausLvl9();
    	erstelleLeuchtturmLvl1();
    	erstelleLeuchtturmLvl2();
    	erstelleLeuchtturmLvl3();
    	erstelleLeuchtturmLvl4();
    	erstelleLeuchtturmLvl5();
    	erstelleLeuchtturmLvl6();
    	erstelleLeuchtturmLvl7();
    	erstelleLeuchtturmLvl8();
    	erstelleLeuchtturmLvl9();
    	erstelleSchatzkammerLvl1();
    	erstelleSchatzkammerLvl2();
    	erstelleSchatzkammerLvl3();
    	erstelleSchatzkammerLvl4();
    	erstelleSchatzkammerLvl5();
    	erstelleSchatzkammerLvl6();
    	erstelleSchatzkammerLvl7();
    	erstelleSchatzkammerLvl8();
    	erstelleSchatzkammerLvl9();
    	erstelleSchatzkammerLvl10();
    	erstelleBauernhaus();
    	erstelleHandwerkerkate();
    	erstelleKaufmannshaus();
    	erstelleAdligenhaus();
    	erstelleFeldweg();
    	erstelleSteinstrasse();
    	erstelleMarktplatzKlein();
    	erstelleMarktplatzMittelgross();
    	erstelleMarktplatzGross();
    	erstelleMarktplatzRiesig();
    	erstelleMarkthausLvl1();
    	erstelleMarkthausLvl2();
    	erstelleMarkthausLvl3();
    	erstelleMarkthausLvl4();
    	erstelleWerft();
    	erstelleSchiffsbauer();
    	erstelleProviantmagazin();
    	erstelleDock();
    	erstelleGildenhalle();
    	erstellePierLvl1();
    	erstellePierLvl2();
    	erstellePierLvl3();
    	erstelleHandelsspeicher();
    }
    
    // Alle Attraktionen erstellen
    private void erstelleAttraktionen(){
    	erstelleBrunnen();
    	erstelleZimmermann();
    	erstelleKapelle();
    	erstelleBarbier();
    	erstelleTaverne();
    	erstelleFeuerwache();
    	erstelleTurnierplatz();
    	erstelleSchuldturm();
    	erstelleKirche();
    	erstelleMedikus();
    }
    
    // Aufbau der Arrays
    // [0] = int einwohnerArt
    // [1] = int anzahlEinwohner
    // [2] = int anzahlSonder
    // [3] = int unterhalt
    // [4] = int radius
    // [5] = String platzbedarf
    // [6] = int gebaeudeArt
    // [7] = String gebaeudeBez
    // [8] = String gebaeudeLevel
    // [9] = String baukosten
    // [10] = int holz
    // [11] = int stein
    // [12] = int werkzeug
    // [13] = int glas

    /* INFRASTRUKTUR */
    private void erstelleKontorLvl1(){
        gebaeudeKontorLvl1 = new Gebaeude(dialogersteller.GB_KONTOR_STUFE1, art_bev_kontor_lvl1, anzahl_bev_kontor_lvl1, anzahl_sonder_kontor_lvl1, unterhalt_kontor_lvl1, radius_kontor_lvl1, groesse_kontor_lvl1, activity.getString(R.string.str_level) + " 1", produktionsdauer_kontor_lvl1 + " " + activity.getString(R.string.str_sek), baukosten_kontor_lvl1, ressourcen_holzfaeller);
    }
    private void erstelleKontorLvl2(){
        gebaeudeKontorLvl2 = new Gebaeude(dialogersteller.GB_KONTOR_STUFE2, art_bev_kontor_lvl2, anzahl_bev_kontor_lvl2, anzahl_sonder_kontor_lvl2, unterhalt_kontor_lvl2, radius_kontor_lvl2, groesse_kontor_lvl2, activity.getString(R.string.str_level) + " 2", produktionsdauer_kontor_lvl2 + " " + activity.getString(R.string.str_sek), baukosten_kontor_lvl2, ressourcen_kontor_lvl2);
    }
    private void erstelleKontorLvl3(){
        gebaeudeKontorLvl3 = new Gebaeude(dialogersteller.GB_KONTOR_STUFE3, art_bev_kontor_lvl3, anzahl_bev_kontor_lvl3, anzahl_sonder_kontor_lvl3, unterhalt_kontor_lvl3, radius_kontor_lvl3, groesse_kontor_lvl3, activity.getString(R.string.str_level) + " 3", produktionsdauer_kontor_lvl3 + " " + activity.getString(R.string.str_sek), baukosten_kontor_lvl3, ressourcen_kontor_lvl3);
    }
    private void erstelleKontorLvl4(){
        gebaeudeKontorLvl4 = new Gebaeude(dialogersteller.GB_KONTOR_STUFE4, art_bev_kontor_lvl4, anzahl_bev_kontor_lvl4, anzahl_sonder_kontor_lvl4, unterhalt_kontor_lvl4, radius_kontor_lvl4, groesse_kontor_lvl4, activity.getString(R.string.str_level) + " 4", produktionsdauer_kontor_lvl4 + " " + activity.getString(R.string.str_sek), baukosten_kontor_lvl4, ressourcen_kontor_lvl4);
    }
    private void erstelleLagerhausLvl1(){
        gebaeudeLagerhausLvl1 = new Gebaeude(dialogersteller.GB_LAGERHAUS_STUFE1, art_bev_lagerhaus_lvl1, anzahl_bev_lagerhaus_lvl1, anzahl_sonder_lagerhaus_lvl1, unterhalt_lagerhaus_lvl1, radius_lagerhaus_lvl1, groesse_lagerhaus_lvl1, activity.getString(R.string.str_level) + " 1", produktionsdauer_lagerhaus_lvl1 + " " + activity.getString(R.string.str_sek), baukosten_lagerhaus_lvl1, ressourcen_lagerhaus_lvl1);
    }
    private void erstelleLagerhausLvl2(){
        gebaeudeLagerhausLvl2 = new Gebaeude(dialogersteller.GB_LAGERHAUS_STUFE2, art_bev_lagerhaus_lvl2, anzahl_bev_lagerhaus_lvl2, anzahl_sonder_lagerhaus_lvl2, unterhalt_lagerhaus_lvl2, radius_lagerhaus_lvl2, groesse_lagerhaus_lvl2, activity.getString(R.string.str_level) + " 2", produktionsdauer_lagerhaus_lvl2 + " " + activity.getString(R.string.str_sek), baukosten_lagerhaus_lvl2, ressourcen_lagerhaus_lvl2);
    }
    private void erstelleLagerhausLvl3(){
        gebaeudeLagerhausLvl3 = new Gebaeude(dialogersteller.GB_LAGERHAUS_STUFE2, art_bev_lagerhaus_lvl3, anzahl_bev_lagerhaus_lvl3, anzahl_sonder_lagerhaus_lvl3, unterhalt_lagerhaus_lvl3, radius_lagerhaus_lvl3, groesse_lagerhaus_lvl3, activity.getString(R.string.str_level) + " 3", produktionsdauer_lagerhaus_lvl3 + " " + activity.getString(R.string.str_sek), baukosten_lagerhaus_lvl3, ressourcen_lagerhaus_lvl3);
    }
    private void erstelleLagerhausLvl4(){
        gebaeudeLagerhausLvl4 = new Gebaeude(dialogersteller.GB_LAGERHAUS_STUFE3, art_bev_lagerhaus_lvl4, anzahl_bev_lagerhaus_lvl4, anzahl_sonder_lagerhaus_lvl4, unterhalt_lagerhaus_lvl4, radius_lagerhaus_lvl4, groesse_lagerhaus_lvl4, activity.getString(R.string.str_level) + " 4", produktionsdauer_lagerhaus_lvl4 + " " + activity.getString(R.string.str_sek), baukosten_lagerhaus_lvl4, ressourcen_lagerhaus_lvl4);
    }
    private void erstelleLagerhausLvl5(){
        gebaeudeLagerhausLvl5 = new Gebaeude(dialogersteller.GB_LAGERHAUS_STUFE3, art_bev_lagerhaus_lvl5, anzahl_bev_lagerhaus_lvl5, anzahl_sonder_lagerhaus_lvl5, unterhalt_lagerhaus_lvl5, radius_lagerhaus_lvl5, groesse_lagerhaus_lvl5, activity.getString(R.string.str_level) + " 5", produktionsdauer_lagerhaus_lvl5 + " " + activity.getString(R.string.str_sek), baukosten_lagerhaus_lvl5, ressourcen_lagerhaus_lvl5);
    }
    private void erstelleLagerhausLvl6(){
        gebaeudeLagerhausLvl6 = new Gebaeude(dialogersteller.GB_LAGERHAUS_STUFE3, art_bev_lagerhaus_lvl6, anzahl_bev_lagerhaus_lvl6, anzahl_sonder_lagerhaus_lvl6, unterhalt_lagerhaus_lvl6, radius_lagerhaus_lvl6, groesse_lagerhaus_lvl6, activity.getString(R.string.str_level) + " 6", produktionsdauer_lagerhaus_lvl6 + " " + activity.getString(R.string.str_sek), baukosten_lagerhaus_lvl6, ressourcen_lagerhaus_lvl6);
    }
    private void erstelleLagerhausLvl7(){
        gebaeudeLagerhausLvl7 = new Gebaeude(dialogersteller.GB_LAGERHAUS_STUFE4, art_bev_lagerhaus_lvl7, anzahl_bev_lagerhaus_lvl7, anzahl_sonder_lagerhaus_lvl7, unterhalt_lagerhaus_lvl7, radius_lagerhaus_lvl7, groesse_lagerhaus_lvl7, activity.getString(R.string.str_level) + " 7", produktionsdauer_lagerhaus_lvl7 + " " + activity.getString(R.string.str_sek), baukosten_lagerhaus_lvl7, ressourcen_lagerhaus_lvl7);
    }
    private void erstelleLagerhausLvl8(){
        gebaeudeLagerhausLvl8 = new Gebaeude(dialogersteller.GB_LAGERHAUS_STUFE4, art_bev_lagerhaus_lvl8, anzahl_bev_lagerhaus_lvl8, anzahl_sonder_lagerhaus_lvl8, unterhalt_lagerhaus_lvl8, radius_lagerhaus_lvl8, groesse_lagerhaus_lvl8, activity.getString(R.string.str_level) + " 8", produktionsdauer_lagerhaus_lvl8 + " " + activity.getString(R.string.str_sek), baukosten_lagerhaus_lvl8, ressourcen_lagerhaus_lvl8);
    }
    private void erstelleLagerhausLvl9(){
        gebaeudeLagerhausLvl9 = new Gebaeude(dialogersteller.GB_LAGERHAUS_STUFE5, art_bev_lagerhaus_lvl9, anzahl_bev_lagerhaus_lvl9, anzahl_sonder_lagerhaus_lvl9, unterhalt_lagerhaus_lvl9, radius_lagerhaus_lvl9, groesse_lagerhaus_lvl9, activity.getString(R.string.str_level) + " 9", produktionsdauer_lagerhaus_lvl9 + " " + activity.getString(R.string.str_sek), baukosten_lagerhaus_lvl9, ressourcen_lagerhaus_lvl9);
    }
    private void erstelleLeuchtturmLvl1(){
        gebaeudeLeuchtturmLvl1 = new Gebaeude(dialogersteller.GB_LEUCHTTURM_STUFE1, art_bev_leuchtturm_lvl1, anzahl_bev_leuchtturm_lvl1, anzahl_sonder_leuchtturm_lvl1, unterhalt_leuchtturm_lvl1, radius_leuchtturm_lvl1, groesse_leuchtturm_lvl1, activity.getString(R.string.str_level) + " 1", produktionsdauer_leuchtturm_lvl1 + " " + activity.getString(R.string.str_sek), baukosten_leuchtturm_lvl1, ressourcen_leuchtturm_lvl1);
    }
    private void erstelleLeuchtturmLvl2(){
        gebaeudeLeuchtturmLvl2 = new Gebaeude(dialogersteller.GB_LEUCHTTURM_STUFE1, art_bev_leuchtturm_lvl2, anzahl_bev_leuchtturm_lvl2, anzahl_sonder_leuchtturm_lvl2, unterhalt_leuchtturm_lvl2, radius_leuchtturm_lvl2, groesse_leuchtturm_lvl2, activity.getString(R.string.str_level) + " 2", produktionsdauer_leuchtturm_lvl2 + " " + activity.getString(R.string.str_sek), baukosten_leuchtturm_lvl2, ressourcen_leuchtturm_lvl2);
    }
    private void erstelleLeuchtturmLvl3(){
        gebaeudeLeuchtturmLvl3 = new Gebaeude(dialogersteller.GB_LEUCHTTURM_STUFE1, art_bev_leuchtturm_lvl3, anzahl_bev_leuchtturm_lvl3, anzahl_sonder_leuchtturm_lvl3, unterhalt_leuchtturm_lvl3, radius_leuchtturm_lvl3, groesse_leuchtturm_lvl3, activity.getString(R.string.str_level) + " 3", produktionsdauer_leuchtturm_lvl3 + " " + activity.getString(R.string.str_sek), baukosten_leuchtturm_lvl3, ressourcen_leuchtturm_lvl3);
    }
    private void erstelleLeuchtturmLvl4(){
        gebaeudeLeuchtturmLvl4 = new Gebaeude(dialogersteller.GB_LEUCHTTURM_STUFE2, art_bev_leuchtturm_lvl4, anzahl_bev_leuchtturm_lvl4, anzahl_sonder_leuchtturm_lvl4, unterhalt_leuchtturm_lvl4, radius_leuchtturm_lvl4, groesse_leuchtturm_lvl4, activity.getString(R.string.str_level) + " 4", produktionsdauer_leuchtturm_lvl4 + " " + activity.getString(R.string.str_sek), baukosten_leuchtturm_lvl4, ressourcen_leuchtturm_lvl4);
    }
    private void erstelleLeuchtturmLvl5(){
        gebaeudeLeuchtturmLvl5 = new Gebaeude(dialogersteller.GB_LEUCHTTURM_STUFE2, art_bev_leuchtturm_lvl5, anzahl_bev_leuchtturm_lvl5, anzahl_sonder_leuchtturm_lvl5, unterhalt_leuchtturm_lvl5, radius_leuchtturm_lvl5, groesse_leuchtturm_lvl5, activity.getString(R.string.str_level) + " 5", produktionsdauer_leuchtturm_lvl5 + " " + activity.getString(R.string.str_sek), baukosten_leuchtturm_lvl5, ressourcen_leuchtturm_lvl5);
    }
    private void erstelleLeuchtturmLvl6(){
        gebaeudeLeuchtturmLvl6 = new Gebaeude(dialogersteller.GB_LEUCHTTURM_STUFE2, art_bev_leuchtturm_lvl6, anzahl_bev_leuchtturm_lvl6, anzahl_sonder_leuchtturm_lvl6, unterhalt_leuchtturm_lvl6, radius_leuchtturm_lvl6, groesse_leuchtturm_lvl6, activity.getString(R.string.str_level) + " 6", produktionsdauer_leuchtturm_lvl6 + " " + activity.getString(R.string.str_sek), baukosten_leuchtturm_lvl6, ressourcen_leuchtturm_lvl6);
    }
    private void erstelleLeuchtturmLvl7(){
        gebaeudeLeuchtturmLvl7 = new Gebaeude(dialogersteller.GB_LEUCHTTURM_STUFE3, art_bev_leuchtturm_lvl7, anzahl_bev_leuchtturm_lvl7, anzahl_sonder_leuchtturm_lvl7, unterhalt_leuchtturm_lvl7, radius_leuchtturm_lvl7, groesse_leuchtturm_lvl7, activity.getString(R.string.str_level) + " 7", produktionsdauer_leuchtturm_lvl7 + " " + activity.getString(R.string.str_sek), baukosten_leuchtturm_lvl7, ressourcen_leuchtturm_lvl7);
    }
    private void erstelleLeuchtturmLvl8(){
        gebaeudeLeuchtturmLvl8 = new Gebaeude(dialogersteller.GB_LEUCHTTURM_STUFE3, art_bev_leuchtturm_lvl8, anzahl_bev_leuchtturm_lvl8, anzahl_sonder_leuchtturm_lvl8, unterhalt_leuchtturm_lvl8, radius_leuchtturm_lvl8, groesse_leuchtturm_lvl8, activity.getString(R.string.str_level) + " 8", produktionsdauer_leuchtturm_lvl8 + " " + activity.getString(R.string.str_sek), baukosten_leuchtturm_lvl8, ressourcen_leuchtturm_lvl8);
    }
    private void erstelleLeuchtturmLvl9(){
        gebaeudeLeuchtturmLvl9 = new Gebaeude(dialogersteller.GB_LEUCHTTURM_STUFE4, art_bev_leuchtturm_lvl9, anzahl_bev_leuchtturm_lvl9, anzahl_sonder_leuchtturm_lvl9, unterhalt_leuchtturm_lvl9, radius_leuchtturm_lvl9, groesse_leuchtturm_lvl9, activity.getString(R.string.str_level) + " 9", produktionsdauer_leuchtturm_lvl9 + " " + activity.getString(R.string.str_sek), baukosten_leuchtturm_lvl9, ressourcen_leuchtturm_lvl9);
    }
    private void erstelleSchatzkammerLvl1(){
        gebaeudeSchatzkammerLvl1 = new Gebaeude(dialogersteller.GB_SCHATZKAMMER_STUFE1, art_bev_schatzkammer_lvl1, anzahl_bev_schatzkammer_lvl1, anzahl_sonder_schatzkammer_lvl1, unterhalt_schatzkammer_lvl1, radius_schatzkammer_lvl1, groesse_schatzkammer_lvl1, activity.getString(R.string.str_level) + " 1", produktionsdauer_schatzkammer_lvl1 + " " + activity.getString(R.string.str_sek), baukosten_schatzkammer_lvl1, ressourcen_schatzkammer_lvl1);
    }
    private void erstelleSchatzkammerLvl2(){
        gebaeudeSchatzkammerLvl2 = new Gebaeude(dialogersteller.GB_SCHATZKAMMER_STUFE1, art_bev_schatzkammer_lvl2, anzahl_bev_schatzkammer_lvl2, anzahl_sonder_schatzkammer_lvl2, unterhalt_schatzkammer_lvl2, radius_schatzkammer_lvl2, groesse_schatzkammer_lvl2, activity.getString(R.string.str_level) + " 2", produktionsdauer_schatzkammer_lvl2 + " " + activity.getString(R.string.str_sek), baukosten_schatzkammer_lvl2, ressourcen_schatzkammer_lvl2);
    }
    private void erstelleSchatzkammerLvl3(){
        gebaeudeSchatzkammerLvl3 = new Gebaeude(dialogersteller.GB_SCHATZKAMMER_STUFE2, art_bev_schatzkammer_lvl3, anzahl_bev_schatzkammer_lvl3, anzahl_sonder_schatzkammer_lvl3, unterhalt_schatzkammer_lvl3, radius_schatzkammer_lvl3, groesse_schatzkammer_lvl3, activity.getString(R.string.str_level) + " 3", produktionsdauer_schatzkammer_lvl3 + " " + activity.getString(R.string.str_sek), baukosten_schatzkammer_lvl3, ressourcen_schatzkammer_lvl3);
    }
    private void erstelleSchatzkammerLvl4(){
        gebaeudeSchatzkammerLvl4 = new Gebaeude(dialogersteller.GB_SCHATZKAMMER_STUFE2, art_bev_schatzkammer_lvl4, anzahl_bev_schatzkammer_lvl4, anzahl_sonder_schatzkammer_lvl4, unterhalt_schatzkammer_lvl4, radius_schatzkammer_lvl4, groesse_schatzkammer_lvl4, activity.getString(R.string.str_level) + " 4", produktionsdauer_schatzkammer_lvl4 + " " + activity.getString(R.string.str_sek), baukosten_schatzkammer_lvl4, ressourcen_schatzkammer_lvl4);
    }
    private void erstelleSchatzkammerLvl5(){
        gebaeudeSchatzkammerLvl5 = new Gebaeude(dialogersteller.GB_SCHATZKAMMER_STUFE2, art_bev_schatzkammer_lvl5, anzahl_bev_schatzkammer_lvl5, anzahl_sonder_schatzkammer_lvl5, unterhalt_schatzkammer_lvl5, radius_schatzkammer_lvl5, groesse_schatzkammer_lvl5, activity.getString(R.string.str_level) + " 5", produktionsdauer_schatzkammer_lvl5 + " " + activity.getString(R.string.str_sek), baukosten_schatzkammer_lvl5, ressourcen_schatzkammer_lvl5);
    }
    private void erstelleSchatzkammerLvl6(){
        gebaeudeSchatzkammerLvl6 = new Gebaeude(dialogersteller.GB_SCHATZKAMMER_STUFE2, art_bev_schatzkammer_lvl6, anzahl_bev_schatzkammer_lvl6, anzahl_sonder_schatzkammer_lvl6, unterhalt_schatzkammer_lvl6, radius_schatzkammer_lvl6, groesse_schatzkammer_lvl6, activity.getString(R.string.str_level) + " 6", produktionsdauer_schatzkammer_lvl6 + " " + activity.getString(R.string.str_sek), baukosten_schatzkammer_lvl6, ressourcen_schatzkammer_lvl6);
    }
    private void erstelleSchatzkammerLvl7(){
        gebaeudeSchatzkammerLvl7 = new Gebaeude(dialogersteller.GB_SCHATZKAMMER_STUFE3, art_bev_schatzkammer_lvl7, anzahl_bev_schatzkammer_lvl7, anzahl_sonder_schatzkammer_lvl7, unterhalt_schatzkammer_lvl7, radius_schatzkammer_lvl7, groesse_schatzkammer_lvl7, activity.getString(R.string.str_level) + " 7", produktionsdauer_schatzkammer_lvl7 + " " + activity.getString(R.string.str_sek), baukosten_schatzkammer_lvl7, ressourcen_schatzkammer_lvl7);
    }
    private void erstelleSchatzkammerLvl8(){
        gebaeudeSchatzkammerLvl8 = new Gebaeude(dialogersteller.GB_SCHATZKAMMER_STUFE3, art_bev_schatzkammer_lvl8, anzahl_bev_schatzkammer_lvl8, anzahl_sonder_schatzkammer_lvl8, unterhalt_schatzkammer_lvl8, radius_schatzkammer_lvl8, groesse_schatzkammer_lvl8, activity.getString(R.string.str_level) + " 8", produktionsdauer_schatzkammer_lvl8 + " " + activity.getString(R.string.str_sek), baukosten_schatzkammer_lvl8, ressourcen_schatzkammer_lvl8);
    }
    private void erstelleSchatzkammerLvl9(){
        gebaeudeSchatzkammerLvl9 = new Gebaeude(dialogersteller.GB_SCHATZKAMMER_STUFE3, art_bev_schatzkammer_lvl9, anzahl_bev_schatzkammer_lvl9, anzahl_sonder_schatzkammer_lvl9, unterhalt_schatzkammer_lvl9, radius_schatzkammer_lvl9, groesse_schatzkammer_lvl9, activity.getString(R.string.str_level) + " 9", produktionsdauer_schatzkammer_lvl9 + " " + activity.getString(R.string.str_sek), baukosten_schatzkammer_lvl9, ressourcen_schatzkammer_lvl9);
    }
    private void erstelleSchatzkammerLvl10(){
        gebaeudeSchatzkammerLvl10 = new Gebaeude(dialogersteller.GB_SCHATZKAMMER_STUFE3, art_bev_schatzkammer_lvl10, anzahl_bev_schatzkammer_lvl10, anzahl_sonder_schatzkammer_lvl10, unterhalt_schatzkammer_lvl10, radius_schatzkammer_lvl10, groesse_schatzkammer_lvl10, activity.getString(R.string.str_level) + " 10", produktionsdauer_schatzkammer_lvl10 + " " + activity.getString(R.string.str_sek), baukosten_schatzkammer_lvl10, ressourcen_schatzkammer_lvl10);
    }
    private void erstelleBauernhaus(){
        gebaeudeBauernhaus = new Gebaeude(dialogersteller.GB_BAUERNHAUS, art_bev_bauernhaus, anzahl_bev_bauernhaus, anzahl_sonder_bauernhaus, unterhalt_bauernhaus, radius_bauernhaus, groesse_bauernhaus, anzahl_auslastung_bauernhaus, produktionsdauer_bauernhaus + " " + activity.getString(R.string.str_sek), baukosten_bauernhaus, ressourcen_bauernhaus);
    }
    private void erstelleHandwerkerkate(){
        gebaeudeHandwerkerkate = new Gebaeude(dialogersteller.GB_HANDWERKERKATE, art_bev_handwerkerkate, anzahl_bev_handwerkerkate, anzahl_sonder_handwerkerkate, unterhalt_handwerkerkate, radius_handwerkerkate, groesse_handwerkerkate, anzahl_auslastung_handwerkerkate, produktionsdauer_handwerkerkate + " " + activity.getString(R.string.str_sek), baukosten_handwerkerkate, ressourcen_handwerkerkate);
    }
    private void erstelleKaufmannshaus(){
        gebaeudeKaufmannshaus = new Gebaeude(dialogersteller.GB_KAUFMANNSHAUS, art_bev_kaufmannshaus, anzahl_bev_kaufmannshaus, anzahl_sonder_kaufmannshaus, unterhalt_kaufmannshaus, radius_kaufmannshaus, groesse_kaufmannshaus, anzahl_auslastung_kaufmannshaus, produktionsdauer_kaufmannshaus + " " + activity.getString(R.string.str_sek), baukosten_kaufmannshaus, ressourcen_kaufmannshaus);
    }
    private void erstelleAdligenhaus(){
       gebaeudeAdligenhaus = new Gebaeude(dialogersteller.GB_ADLIGENHAUS, art_bev_adligenhaus, anzahl_bev_adligenhaus, anzahl_sonder_adligenhaus, unterhalt_adligenhaus, radius_adligenhaus, groesse_adligenhaus, anzahl_auslastung_adligenhaus, produktionsdauer_adligenhaus + " " + activity.getString(R.string.str_sek), baukosten_adligenhaus, ressourcen_adligenhaus);
    }
    private void erstelleFeldweg(){
        gebaeudeFeldweg = new Gebaeude(dialogersteller.GB_FELDWEG, art_bev_feldweg, anzahl_bev_feldweg, anzahl_sonder_feldweg, unterhalt_feldweg, radius_feldweg, groesse_feldweg, anzahl_auslastung_feldweg, produktionsdauer_feldweg + " " + activity.getString(R.string.str_sek), baukosten_feldweg, ressourcen_feldweg);
    }
    private void erstelleSteinstrasse(){
        gebaeudeSteinstrasse = new Gebaeude(dialogersteller.GB_STEINSTRASSE, art_bev_steinstrasse, anzahl_bev_steinstrasse, anzahl_sonder_steinstrasse, unterhalt_steinstrasse, radius_steinstrasse, groesse_steinstrasse, anzahl_auslastung_steinstrasse, produktionsdauer_steinstrasse + " " + activity.getString(R.string.str_sek), baukosten_steinstrasse, ressourcen_steinstrasse);
    }
    private void erstelleMarktplatzKlein(){
        gebaeudeMarktplatzKlein = new Gebaeude(dialogersteller.GB_MARKTPLATZ_STUFE1, art_bev_marktplatz_klein, anzahl_bev_marktplatz_klein, anzahl_sonder_marktplatz_klein, unterhalt_marktplatz_klein, radius_marktplatz_klein, groesse_marktplatz_klein, anzahl_auslastung_marktplatz_klein, produktionsdauer_marktplatz_klein + " " + activity.getString(R.string.str_sek), baukosten_marktplatz_klein, ressourcen_marktplatz_klein);
    }
    private void erstelleMarktplatzMittelgross(){
        gebaeudeMarktplatzMittelgross = new Gebaeude(dialogersteller.GB_MARKTPLATZ_STUFE2, art_bev_marktplatz_mittelgross, anzahl_bev_marktplatz_mittelgross, anzahl_sonder_marktplatz_mittelgross, unterhalt_marktplatz_mittelgross, radius_marktplatz_mittelgross, groesse_marktplatz_mittelgross, anzahl_auslastung_marktplatz_mittelgross, produktionsdauer_marktplatz_mittelgross + " " + activity.getString(R.string.str_sek), baukosten_marktplatz_mittelgross, ressourcen_marktplatz_mittelgross);
    }
    private void erstelleMarktplatzGross(){
        gebaeudeMarktplatzGross = new Gebaeude(dialogersteller.GB_MARKTPLATZ_STUFE3, art_bev_marktplatz_gross, anzahl_bev_marktplatz_gross, anzahl_sonder_marktplatz_gross, unterhalt_marktplatz_gross, radius_marktplatz_gross, groesse_marktplatz_gross, anzahl_auslastung_marktplatz_gross, produktionsdauer_marktplatz_gross + " " + activity.getString(R.string.str_sek), baukosten_marktplatz_gross, ressourcen_marktplatz_gross);
    }
    private void erstelleMarktplatzRiesig(){
        gebaeudeMarktplatzRiesig = new Gebaeude(dialogersteller.GB_MARKTPLATZ_STUFE4, art_bev_marktplatz_riesig, anzahl_bev_marktplatz_riesig, anzahl_sonder_marktplatz_riesig, unterhalt_marktplatz_riesig, radius_marktplatz_riesig, groesse_marktplatz_riesig, anzahl_auslastung_marktplatz_riesig, produktionsdauer_marktplatz_riesig + " " + activity.getString(R.string.str_sek), baukosten_marktplatz_riesig, ressourcen_marktplatz_riesig);
    }
    private void erstelleMarkthausLvl1(){
        gebaeudeMarkthausLvl1 = new Gebaeude(dialogersteller.GB_MARKTHAUS_STUFE1, art_bev_markthaus_lvl1, anzahl_bev_markthaus_lvl1, anzahl_sonder_markthaus_lvl1, unterhalt_markthaus_lvl1, radius_markthaus_lvl1, groesse_markthaus_lvl1, activity.getString(R.string.str_level) + " 1", produktionsdauer_markthaus_lvl1 + " " + activity.getString(R.string.str_sek), baukosten_markthaus_lvl1, ressourcen_markthaus_lvl1);
    }
    private void erstelleMarkthausLvl2(){
        gebaeudeMarkthausLvl2 = new Gebaeude(dialogersteller.GB_MARKTHAUS_STUFE2, art_bev_markthaus_lvl2, anzahl_bev_markthaus_lvl2, anzahl_sonder_markthaus_lvl2, unterhalt_markthaus_lvl2, radius_markthaus_lvl2, groesse_markthaus_lvl2, activity.getString(R.string.str_level) + " 2", produktionsdauer_markthaus_lvl2 + " " + activity.getString(R.string.str_sek), baukosten_markthaus_lvl2, ressourcen_markthaus_lvl2);
    }
    private void erstelleMarkthausLvl3(){
        gebaeudeMarkthausLvl3 = new Gebaeude(dialogersteller.GB_MARKTHAUS_STUFE3, art_bev_markthaus_lvl3, anzahl_bev_markthaus_lvl3, anzahl_sonder_markthaus_lvl3, unterhalt_markthaus_lvl3, radius_markthaus_lvl3, groesse_markthaus_lvl3, activity.getString(R.string.str_level) + " 3", produktionsdauer_markthaus_lvl3 + " " + activity.getString(R.string.str_sek), baukosten_markthaus_lvl3, ressourcen_markthaus_lvl3);
    }
    private void erstelleMarkthausLvl4(){
        gebaeudeMarkthausLvl4 = new Gebaeude(dialogersteller.GB_MARKTHAUS_STUFE4, art_bev_markthaus_lvl4, anzahl_bev_markthaus_lvl4, anzahl_sonder_markthaus_lvl4, unterhalt_markthaus_lvl4, radius_markthaus_lvl4, groesse_markthaus_lvl4, activity.getString(R.string.str_level) + " 4", produktionsdauer_markthaus_lvl4 + " " + activity.getString(R.string.str_sek), baukosten_markthaus_lvl4, ressourcen_markthaus_lvl4);
    }
    private void erstelleWerft(){
        gebaeudeWerft = new Gebaeude(dialogersteller.GB_WERFT, art_bev_werft, anzahl_bev_werft, anzahl_sonder_werft, unterhalt_werft, radius_werft, groesse_werft, anzahl_auslastung_werft, produktionsdauer_werft + " " + activity.getString(R.string.str_sek), baukosten_werft, ressourcen_werft);
    }
    private void erstelleSchiffsbauer(){
        gebaeudeSchiffsbauer = new Gebaeude(dialogersteller.GB_SCHIFFSBAUER, art_bev_schiffsbauer, anzahl_bev_schiffsbauer, anzahl_sonder_schiffsbauer, unterhalt_schiffsbauer, radius_schiffsbauer, groesse_schiffsbauer, anzahl_auslastung_schiffsbauer, produktionsdauer_schiffsbauer + " " + activity.getString(R.string.str_sek), baukosten_schiffsbauer, ressourcen_schiffsbauer);
    }
    private void erstelleProviantmagazin(){
        gebaeudeProviantmagazin = new Gebaeude(dialogersteller.GB_PROVIANTMAGAZIN, art_bev_proviantmagazin, anzahl_bev_proviantmagazin, anzahl_sonder_proviantmagazin, unterhalt_proviantmagazin, radius_proviantmagazin, groesse_proviantmagazin, anzahl_auslastung_proviantmagazin, produktionsdauer_proviantmagazin + " " + activity.getString(R.string.str_sek), baukosten_proviantmagazin, ressourcen_proviantmagazin);
    }
    private void erstelleDock(){
        gebaeudeDock = new Gebaeude(dialogersteller.GB_DOCK, art_bev_dock, anzahl_bev_dock, anzahl_sonder_dock, unterhalt_dock, radius_dock, groesse_dock, anzahl_auslastung_dock, produktionsdauer_dock + " " + activity.getString(R.string.str_sek), baukosten_dock, ressourcen_dock);
    }
    private void erstelleGildenhalle(){
        gebaeudeGildenhalle = new Gebaeude(dialogersteller.GB_GILDENHALLE, art_bev_gildenhalle, anzahl_bev_gildenhalle, anzahl_sonder_gildenhalle, unterhalt_gildenhalle, radius_gildenhalle, groesse_gildenhalle, anzahl_auslastung_gildenhalle, produktionsdauer_gildenhalle + " " + activity.getString(R.string.str_sek), baukosten_gildenhalle, ressourcen_gildenhalle);
    }
    private void erstellePierLvl1(){
        gebaeudePierLvl1 = new Gebaeude(dialogersteller.GB_PIER_STUFE1, art_bev_pier_lvl1, anzahl_bev_pier_lvl1, anzahl_sonder_pier_lvl1, unterhalt_pier_lvl1, radius_pier_lvl1, groesse_pier_lvl1, activity.getString(R.string.str_level) + " 1", produktionsdauer_pier_lvl1 + " " + activity.getString(R.string.str_sek), baukosten_pier_lvl1, ressourcen_pier_lvl1);
    }
    private void erstellePierLvl2(){
        gebaeudePierLvl2 = new Gebaeude(dialogersteller.GB_PIER_STUFE2, art_bev_pier_lvl2, anzahl_bev_pier_lvl2, anzahl_sonder_pier_lvl2, unterhalt_pier_lvl2, radius_pier_lvl2, groesse_pier_lvl2, activity.getString(R.string.str_level) + " 2", produktionsdauer_pier_lvl2 + " " + activity.getString(R.string.str_sek), baukosten_pier_lvl2, ressourcen_pier_lvl2);
    }
    private void erstellePierLvl3(){
        gebaeudePierLvl3 = new Gebaeude(dialogersteller.GB_PIER_STUFE3, art_bev_pier_lvl3, anzahl_bev_pier_lvl3, anzahl_sonder_pier_lvl3, unterhalt_pier_lvl3, radius_pier_lvl3, groesse_pier_lvl3, activity.getString(R.string.str_level) + " 3", produktionsdauer_pier_lvl3 + " " + activity.getString(R.string.str_sek), baukosten_pier_lvl3, ressourcen_pier_lvl3);
    }
    private void erstelleHandelsspeicher(){
        gebaeudeHandelsspeicher = new Gebaeude(dialogersteller.GB_HANDELSSPEICHER, art_bev_handelsspeicher, anzahl_bev_handelsspeicher, anzahl_sonder_handelsspeicher, unterhalt_handelsspeicher, radius_handelsspeicher, groesse_handelsspeicher, anzahl_auslastung_handelsspeicher, produktionsdauer_handelsspeicher + " " + activity.getString(R.string.str_sek), baukosten_handelsspeicher, ressourcen_handelsspeicher);
    }
    
    /* ATTRAKTIONEN */
    private void erstelleBrunnen(){
        gebaeudeBrunnen = new Gebaeude(dialogersteller.GB_BRUNNEN, art_bev_brunnen, anzahl_bev_brunnen, anzahl_sonder_brunnen, unterhalt_brunnen, radius_brunnen, groesse_brunnen, anzahl_auslastung_brunnen, produktionsdauer_brunnen + " " + activity.getString(R.string.str_sek), baukosten_brunnen, ressourcen_brunnen);
    }
    private void erstelleZimmermann(){
        gebaeudeZimmermann = new Gebaeude(dialogersteller.GB_ZIMMERMANN, art_bev_zimmermann, anzahl_bev_zimmermann, anzahl_sonder_zimmermann, unterhalt_zimmermann, radius_zimmermann, groesse_zimmermann, anzahl_auslastung_zimmermann, produktionsdauer_zimmermann + " " + activity.getString(R.string.str_sek), baukosten_zimmermann, ressourcen_zimmermann);
    }
    private void erstelleKapelle(){
        gebaeudeKapelle = new Gebaeude(dialogersteller.GB_KAPELLE, art_bev_kapelle, anzahl_bev_kapelle, anzahl_sonder_kapelle, unterhalt_kapelle, radius_kapelle, groesse_kapelle, anzahl_auslastung_kapelle, produktionsdauer_kapelle + " " + activity.getString(R.string.str_sek), baukosten_kapelle, ressourcen_kapelle);
    }
    private void erstelleBarbier(){
        gebaeudeBarbier = new Gebaeude(dialogersteller.GB_BARBIER, art_bev_barbier, anzahl_bev_barbier, anzahl_sonder_barbier, unterhalt_barbier, radius_barbier, groesse_barbier, anzahl_auslastung_barbier, produktionsdauer_barbier + " " + activity.getString(R.string.str_sek), baukosten_barbier, ressourcen_barbier);
    }
    private void erstelleTaverne(){
        gebaeudeTaverne = new Gebaeude(dialogersteller.GB_TAVERNE, art_bev_taverne, anzahl_bev_taverne, anzahl_sonder_taverne, unterhalt_taverne, radius_taverne, groesse_taverne, anzahl_auslastung_taverne, produktionsdauer_taverne + " " + activity.getString(R.string.str_sek), baukosten_taverne, ressourcen_taverne);
    }
    private void erstelleFeuerwache(){
        gebaeudeFeuerwache = new Gebaeude(dialogersteller.GB_FEUERWACHE, art_bev_feuerwache, anzahl_bev_feuerwache, anzahl_sonder_feuerwache, unterhalt_feuerwache, radius_feuerwache, groesse_feuerwache, anzahl_auslastung_feuerwache, produktionsdauer_feuerwache + " " + activity.getString(R.string.str_sek), baukosten_feuerwache, ressourcen_feuerwache);
    }
    private void erstelleTurnierplatz(){
        gebaeudeTurnierplatz = new Gebaeude(dialogersteller.GB_TURNIERPLATZ, art_bev_turnierplatz, anzahl_bev_turnierplatz, anzahl_sonder_turnierplatz, unterhalt_turnierplatz, radius_turnierplatz, groesse_turnierplatz, anzahl_auslastung_turnierplatz, produktionsdauer_turnierplatz + " " + activity.getString(R.string.str_sek), baukosten_turnierplatz, ressourcen_turnierplatz);
    }
    private void erstelleSchuldturm(){
        gebaeudeSchuldturm = new Gebaeude(dialogersteller.GB_SCHULDTURM, art_bev_schuldturm, anzahl_bev_schuldturm, anzahl_sonder_schuldturm, unterhalt_schuldturm, radius_schuldturm, groesse_schuldturm, anzahl_auslastung_schuldturm, produktionsdauer_schuldturm + " " + activity.getString(R.string.str_sek), baukosten_schuldturm, ressourcen_schultdturm);
    }
    private void erstelleKirche(){
        gebaeudeKirche = new Gebaeude(dialogersteller.GB_KIRCHE, art_bev_kirche, anzahl_bev_kirche, anzahl_sonder_kirche, unterhalt_kirche, radius_kirche, groesse_kirche, anzahl_auslastung_kirche, produktionsdauer_kirche + " " + activity.getString(R.string.str_sek), baukosten_kirche, ressourcen_kirche);
    }
    private void erstelleMedikus(){
        gebaeudeMedikus = new Gebaeude(dialogersteller.GB_MEDIKUS, art_bev_medikus, anzahl_bev_medikus, anzahl_sonder_medikus, unterhalt_medikus, radius_medikus, groesse_medikus, anzahl_auslastung_medikus, produktionsdauer_medikus + " " + activity.getString(R.string.str_sek), baukosten_medikus, ressourcen_medikus);
    }
    
    
    /* PRODUKTIONSGEBÄUDE */
    private void erstelleHolzfaeller(){
        gebaeudeHolzfaeller = new Gebaeude(dialogersteller.GB_HOLZFAELLER, art_bev_holzfaeller, anzahl_bev_holzfaeller, anzahl_sonder_holzfaeller, unterhalt_holzfaeller, radius_holzfaeller, groesse_holzfaeller, anzahl_auslastung_holzfaeller, produktionsdauer_holzfaeller + " " + activity.getString(R.string.str_sek), baukosten_holzfaeller, ressourcen_holzfaeller);    }
    private void erstelleSteinbruch(){
        gebaeudeSteinbruch = new Gebaeude(dialogersteller.GB_STEINBRUCH, art_bev_steinbruch, anzahl_bev_steinbruch, anzahl_sonder_steinbruch, unterhalt_steinbruch, radius_steinbruch, groesse_steinbruch, anzahl_auslastung_steinbruch, produktionsdauer_steinbruch + " " + activity.getString(R.string.str_sek), baukosten_steinbruch, ressourcen_steinbruch);
    }
    private void erstelleEisenmine(){
        gebaeudeEisenmine = new Gebaeude(dialogersteller.GB_EISENMINE, art_bev_eisenmine, anzahl_bev_eisenmine, anzahl_sonder_eisenmine, unterhalt_eisenmine, radius_eisenmine, groesse_eisenmine, anzahl_auslastung_eisenmine, produktionsdauer_eisenmine + " " + activity.getString(R.string.str_sek), baukosten_eisenmine, ressourcen_eisenmine);
    }
    private void erstelleKoehlerhuette(){
        gebaeudeKoehlerhuette = new Gebaeude(dialogersteller.GB_KOEHLERHUETTE, art_bev_koehlerhuette, anzahl_bev_koehlerhuette, anzahl_sonder_koehlerhuette, unterhalt_koehlerhuette, radius_koehlerhuette, groesse_koehlerhuette, anzahl_auslastung_koehlerhuette, produktionsdauer_koehlerhuette + " " + activity.getString(R.string.str_sek), baukosten_koehlerhuette, ressourcen_koehlerhuette);
    }
    private void erstelleKohlebergwerk(){
        gebaeudeKohlebergwerk = new Gebaeude(dialogersteller.GB_KOHLEBERGWERK, art_bev_kohlemine, anzahl_bev_kohlemine, anzahl_sonder_kohlemine, unterhalt_kohlemine, radius_kohlemine, groesse_kohlemine, anzahl_auslastung_kohlemine, produktionsdauer_kohlemine + " " + activity.getString(R.string.str_sek), baukosten_kohlemine, ressourcen_kohlemine);
    }
    private void erstelleEisenschmelze(){
        gebaeudeEisenschmelze = new Gebaeude(dialogersteller.GB_EISENSCHMELZE, art_bev_eisenschmelze, anzahl_bev_eisenschmelze, anzahl_sonder_eisenschmelze, unterhalt_eisenschmelze, radius_eisenschmelze, groesse_eisenschmelze, anzahl_auslastung_eisenschmelze, produktionsdauer_eisenschmelze + " " + activity.getString(R.string.str_sek), baukosten_eisenschmelze, ressourcen_eisenschmelze);
    }
    private void erstelleWerkzeugmacher(){
        gebaeudeWerkzeugmacher = new Gebaeude(dialogersteller.GB_WERKZEUGMACHER, art_bev_werkzeugmacher, anzahl_bev_werkzeugmacher, anzahl_sonder_werkzeugmacher, unterhalt_werkzeugmacher, radius_werkzeugmacher, groesse_werkzeugmacher, anzahl_auslastung_werkzeugmacher, produktionsdauer_werkzeugmacher + " " + activity.getString(R.string.str_sek), baukosten_werkzeugmacher, ressourcen_werkzeugmacher);
    }
    private void erstelleWaldglashuette(){
        gebaeudeWaldglashuette = new Gebaeude(dialogersteller.GB_WALDGLASHUETTE, art_bev_waldglashuette, anzahl_bev_waldglashuette, anzahl_sonder_waldglashuette, unterhalt_waldglashuette, radius_waldglashuette, groesse_waldglashuette, anzahl_auslastung_waldglashuette, produktionsdauer_waldglashuette + " " + activity.getString(R.string.str_sek), baukosten_waldglashuette, ressourcen_waldglashuette);
    }
    private void erstelleQuarzbruch(){
        gebaeudeQuarzbruch = new Gebaeude(dialogersteller.GB_QUARZBRUCH, art_bev_quarzbruch, anzahl_bev_quarzbruch, anzahl_sonder_quarzbruch, unterhalt_quarzbruch, radius_quarzbruch, groesse_quarzbruch, anzahl_auslastung_quarzbruch, produktionsdauer_quarzbruch + " " + activity.getString(R.string.str_sek), baukosten_quarzbruch, ressourcen_quarzbruch);
    }
    private void erstelleGlasschmelze(){
        gebaeudeGlasschmelze = new Gebaeude(dialogersteller.GB_GLASSCHMELZE, art_bev_glasschmelze, anzahl_bev_glasschmelze, anzahl_sonder_glasschmelze, unterhalt_glasschmelze, radius_glasschmelze, groesse_glasschmelze, anzahl_auslastung_glasschmelze, produktionsdauer_glasschmelze + " " + activity.getString(R.string.str_sek), baukosten_glasschmelze, ressourcen_glasschmelze);
    }
    private void erstelleFischer(){
        gebaeudeFischer = new Gebaeude(dialogersteller.GB_FISCHER, art_bev_fischer, anzahl_bev_fischer, anzahl_sonder_fischer, unterhalt_fischer, radius_fischer, groesse_fischer, anzahl_auslastung_fischer, produktionsdauer_fischer + " " + activity.getString(R.string.str_sek), baukosten_fischer, ressourcen_fischer);
    }
    private void erstelleWeizenfarm(){
        gebaeudeWeizenhof = new Gebaeude(dialogersteller.GB_WEIZENHOF, art_bev_weizenfarm, anzahl_bev_weizenfarm, anzahl_sonder_weizenfarm, unterhalt_weizenfarm, radius_weizenfarm, groesse_weizenfarm, anzahl_auslastung_weizenfarm, produktionsdauer_weizenfarm + " " + activity.getString(R.string.str_sek), baukosten_weizenfarm, ressourcen_weizenfarm);
    }
    private void erstelleMuehle(){
        gebaeudeMuehle = new Gebaeude(dialogersteller.GB_MUEHLE, art_bev_muehle, anzahl_bev_muehle, anzahl_sonder_muehle, unterhalt_muehle, radius_muehle, groesse_muehle, anzahl_auslastung_muehle, produktionsdauer_muehle + " " + activity.getString(R.string.str_sek), baukosten_muehle, ressourcen_muehle);
    }
    private void erstelleBackstube(){
        gebaeudeBackstube = new Gebaeude(dialogersteller.GB_BACKSTUBE, art_bev_backstube, anzahl_bev_backstube, anzahl_sonder_backstube, unterhalt_backstube, radius_backstube, groesse_backstube, anzahl_auslastung_backstube, produktionsdauer_backstube + " " + activity.getString(R.string.str_sek), baukosten_backstube, ressourcen_backstube);
    }
    private void erstelleGewuerze(){
        gebaeudeGewuerze = new Gebaeude(dialogersteller.GB_GEWUERZE, art_bev_gewuerze, anzahl_bev_gewuerze, anzahl_sonder_gewuerze, unterhalt_gewuerze, radius_gewuerze, groesse_gewuerze, activity.getString(R.string.str_nur_einkauf), produktionsdauer_gewuerze + " " + activity.getString(R.string.str_sek), baukosten_gewuerze, ressourcen_gewuerze);
    }
    private void erstelleRinderfarm(){
        gebaeudeRinderfarm = new Gebaeude(dialogersteller.GB_RINDERFARM, art_bev_rinderfarm, anzahl_bev_rinderfarm, anzahl_sonder_rinderfarm, unterhalt_rinderfarm, radius_rinderfarm, groesse_rinderfarm, anzahl_auslastung_rinderfarm, produktionsdauer_rinderfarm + " " + activity.getString(R.string.str_sek), baukosten_rinderfarm, ressourcen_rinderfarm);
    }
    private void erstelleMetzger(){
        gebaeudeMetzger = new Gebaeude(dialogersteller.GB_METZGER, art_bev_metzger, anzahl_bev_metzger, anzahl_sonder_metzger, unterhalt_metzger, radius_metzger, groesse_metzger, anzahl_auslastung_metzger, produktionsdauer_metzger + " " + activity.getString(R.string.str_sek), baukosten_metzger, ressourcen_metzger);
    }
    private void erstelleZiegenfarm(){
        gebaeudeZiegenfarm = new Gebaeude(dialogersteller.GB_ZIEGENFARM, art_bev_ziegenfarm, anzahl_bev_ziegenfarm, anzahl_sonder_ziegenfarm, unterhalt_ziegenfarm, radius_ziegenfarm, groesse_ziegenfarm, anzahl_auslastung_ziegenfarm, produktionsdauer_ziegenfarm + " " + activity.getString(R.string.str_sek), baukosten_ziegenfarm, ressourcen_ziegenfarm);
    }
    private void erstelleApfelhof(){
        gebaeudeApfelhof = new Gebaeude(dialogersteller.GB_APFELHOF, art_bev_apfelhof, anzahl_bev_apfelhof, anzahl_sonder_apfelhof, unterhalt_apfelhof, radius_apfelhof, groesse_apfelhof, anzahl_auslastung_apfelhof, produktionsdauer_apfelhof + " " + activity.getString(R.string.str_sek), baukosten_apfelhof, ressourcen_apfelhof);
    }
    private void erstelleMosthof(){
        gebaeudeMosthof = new Gebaeude(dialogersteller.GB_MOSTHOF, art_bev_mosthof, anzahl_bev_mosthof, anzahl_sonder_mosthof, unterhalt_mosthof, radius_mosthof, groesse_mosthof, anzahl_auslastung_mosthof, produktionsdauer_mosthof + " " + activity.getString(R.string.str_sek), baukosten_mosthof, ressourcen_mosthof);
    }
    private void erstelleKlostergarten(){
        gebaeudeKlostergarten = new Gebaeude(dialogersteller.GB_KLOSTERGARTEN, art_bev_klostergarten, anzahl_bev_klostergarten, anzahl_sonder_klostergarten, unterhalt_klostergarten, radius_klostergarten, groesse_klostergarten, anzahl_auslastung_klostergarten, produktionsdauer_klostergarten + " " + activity.getString(R.string.str_sek), baukosten_klostergarten, ressourcen_klostergarten);
    }
    private void erstelleKlosterbrauerei(){
        gebaeudeKlosterbrauerei = new Gebaeude(dialogersteller.GB_KLOSTERBRAUEREI, art_bev_klosterbrauerei, anzahl_bev_klosterbrauerei, anzahl_sonder_klosterbrauerei, unterhalt_klosterbrauerei, radius_klosterbrauerei, groesse_klosterbrauerei, anzahl_auslastung_klosterbrauerei, produktionsdauer_klosterbrauerei + " " + activity.getString(R.string.str_sek), baukosten_klosterbrauerei, ressourcen_klosterbrauerei);
    }
    private void erstelleWeingut(){
        gebaeudeWeingut = new Gebaeude(dialogersteller.GB_WEINGUT, art_bev_weingut, anzahl_bev_weingut, anzahl_sonder_weingut, unterhalt_weingut, radius_weingut, groesse_weingut, anzahl_auslastung_weingut, produktionsdauer_weingut + " " + activity.getString(R.string.str_sek), baukosten_weingut, ressourcen_weingut);
    }
    private void erstelleFasskueferei(){
        gebaeudeFasskueferei = new Gebaeude(dialogersteller.GB_FASSKUEFEREI, art_bev_fasskueferei, anzahl_bev_fasskueferei, anzahl_sonder_fasskueferei, unterhalt_fasskueferei, radius_fasskueferei, groesse_fasskueferei, anzahl_auslastung_fasskueferei, produktionsdauer_fasskueferei + " " + activity.getString(R.string.str_sek), baukosten_fasskueferei, ressourcen_fasskueferei);
    }
    private void erstelleKelterei(){
        gebaeudeKelterei = new Gebaeude(dialogersteller.GB_KELTEREI, art_bev_kelterei, anzahl_bev_kelterei, anzahl_sonder_kelterei, unterhalt_kelterei, radius_kelterei, groesse_kelterei, anzahl_auslastung_kelterei, produktionsdauer_kelterei + " " + activity.getString(R.string.str_sek), baukosten_kelterei, ressourcen_kelterei);
    }
    private void erstelleSchaffarm(){
        gebaeudeSchaffarm = new Gebaeude(dialogersteller.GB_SCHAFFARM, art_bev_schaffarm, anzahl_bev_schaffarm, anzahl_sonder_schaffarm, unterhalt_schaffarm, radius_schaffarm, groesse_schaffarm, anzahl_auslastung_schaffarm, produktionsdauer_schaffarm + " " + activity.getString(R.string.str_sek), baukosten_schaffarm, ressourcen_schaffarm);
    }
    private void erstelleSpinnerei(){
        gebaeudeSpinnerei = new Gebaeude(dialogersteller.GB_SPINNEREI, art_bev_spinnerei, anzahl_bev_spinnerei, anzahl_sonder_spinnerei, unterhalt_spinnerei, radius_spinnerei, groesse_spinnerei, anzahl_auslastung_spinnerei, produktionsdauer_spinnerei + " " + activity.getString(R.string.str_sek), baukosten_spinnerei, ressourcen_spinnerei);
    }
    private void erstelleHanfplantage(){
        gebaeudeHanfplantage = new Gebaeude(dialogersteller.GB_HANFHOF, art_bev_hanfplantage, anzahl_bev_hanfplantage, anzahl_sonder_hanfplantage, unterhalt_hanfplantage, radius_hanfplantage, groesse_hanfplantage, anzahl_auslastung_hanfplantage, produktionsdauer_hanfplantage + " " + activity.getString(R.string.str_sek), baukosten_hanfplantage, ressourcen_hanfplantage);
    }
    private void erstelleWebstube(){
        gebaeudeWebstube = new Gebaeude(dialogersteller.GB_WEBSTUBE, art_bev_webstube, anzahl_bev_webstube, anzahl_sonder_webstube, unterhalt_webstube, radius_webstube, groesse_webstube, anzahl_auslastung_webstube, produktionsdauer_webstube + " " + activity.getString(R.string.str_sek), baukosten_webstube, ressourcen_webstube);
    }
    private void erstelleSchweinefarm(){
        gebaeudeSchweinefarm = new Gebaeude(dialogersteller.GB_SCHWEINEFARM, art_bev_schweinefarm, anzahl_bev_schweinefarm, anzahl_sonder_schweinefarm, unterhalt_schweinefarm, radius_schweinefarm, groesse_schweinefarm, anzahl_auslastung_schweinefarm, produktionsdauer_schweinefarm + " " + activity.getString(R.string.str_sek), baukosten_schweinefarm, ressourcen_schweinefarm);
    }
    private void erstelleSalzstock(){
        gebaeudeSalzstock = new Gebaeude(dialogersteller.GB_SALZSTOCK, art_bev_salzstock, anzahl_bev_salzstock, anzahl_sonder_salzstock, unterhalt_salzstock, radius_salzstock, groesse_salzstock, anzahl_auslastung_salzstock, produktionsdauer_salzstock + " " + activity.getString(R.string.str_sek), baukosten_salzstock, ressourcen_salzstock);
    }
    private void erstelleSaline(){
        gebaeudeSaline = new Gebaeude(dialogersteller.GB_SALINE, art_bev_saline, anzahl_bev_saline, anzahl_sonder_saline, unterhalt_saline, radius_saline, groesse_saline, anzahl_auslastung_saline, produktionsdauer_saline + " " + activity.getString(R.string.str_sek), baukosten_saline, ressourcen_saline);
    }
    private void erstelleGerberei(){
        gebaeudeGerberei = new Gebaeude(dialogersteller.GB_GERBEREI, art_bev_gerberei, anzahl_bev_gerberei, anzahl_sonder_gerberei, unterhalt_gerberei, radius_gerberei, groesse_gerberei, anzahl_auslastung_gerberei, produktionsdauer_gerberei + " " + activity.getString(R.string.str_sek), baukosten_gerberei, ressourcen_gerberei);
    }
    private void erstellePelztierjaeger(){
        gebaeudePelztierjaeger = new Gebaeude(dialogersteller.GB_PELZTIERJAEGER, art_bev_pelztierjaeger, anzahl_bev_pelztierjaeger, anzahl_sonder_pelztierjaeger, unterhalt_pelztierjaeger, radius_pelztierjaeger, groesse_pelztierjaeger, anzahl_auslastung_pelztierjaeger, produktionsdauer_pelztierjaeger + " " + activity.getString(R.string.str_sek), baukosten_pelztierjaeger, ressourcen_pelztierjaeger);
    }
    private void erstelleKuerschnerei(){
        gebaeudeKuerschnerei = new Gebaeude(dialogersteller.GB_KUERSCHNER, art_bev_kuerschnerei, anzahl_bev_kuerschnerei, anzahl_sonder_kuerschnerei, unterhalt_kuerschnerei, radius_kuerschnerei, groesse_kuerschnerei, anzahl_auslastung_kuerschnerei, produktionsdauer_kuerschnerei + " " + activity.getString(R.string.str_sek), baukosten_kuerschnerei, ressourcen_kuerschnerei);
    }
    private void erstelleGoldmine(){
        gebaeudeGoldmine = new Gebaeude(dialogersteller.GB_GOLDMINE, art_bev_goldmine, anzahl_bev_goldmine, anzahl_sonder_goldmine, unterhalt_goldmine, radius_goldmine, groesse_goldmine, anzahl_auslastung_goldmine, produktionsdauer_goldmine + " " + activity.getString(R.string.str_sek), baukosten_goldmine, ressourcen_goldmine);
    }
    private void erstelleGoldschmelze(){
        gebaeudeGoldschmelze = new Gebaeude(dialogersteller.GB_GOLDSCHMELZE, art_bev_goldschmelze, anzahl_bev_goldschmelze, anzahl_sonder_goldschmelze, unterhalt_goldschmelze, radius_goldschmelze, groesse_goldschmelze, anzahl_auslastung_goldschmelze, produktionsdauer_goldschmelze + " " + activity.getString(R.string.str_sek), baukosten_goldschmelze, ressourcen_goldschmelze);
    }
    private void erstelleSeide(){
        gebaeudeSeide = new Gebaeude(dialogersteller.GB_SEIDE, art_bev_seide, anzahl_bev_seide, anzahl_sonder_seide, unterhalt_seide, radius_seide, groesse_seide, activity.getString(R.string.str_nur_einkauf), produktionsdauer_seide + " " + activity.getString(R.string.str_sek), baukosten_seide, ressourcen_seide);
    }
    private void erstelleSeidenweberei(){
        gebaeudeSeidenweberei = new Gebaeude(dialogersteller.GB_SEIDENWEBEREI, art_bev_seidenweberei, anzahl_bev_seidenweberei, anzahl_sonder_seidenweberei, unterhalt_seidenweberei, radius_seidenweberei, groesse_seidenweberei, anzahl_auslastung_seidenweberei, produktionsdauer_seidenweberei + " " + activity.getString(R.string.str_sek), baukosten_seidenweberei, ressourcen_seidenweberei);
    }
    private void erstellePapiermuehle(){
        gebaeudePapiermuehle = new Gebaeude(dialogersteller.GB_PAPIERMUEHLE, art_bev_papiermuehle, anzahl_bev_papiermuehle, anzahl_sonder_papiermuehle, unterhalt_papiermuehle, radius_papiermuehle, groesse_papiermuehle, anzahl_auslastung_papiermuehle, produktionsdauer_papiermuehle + " " + activity.getString(R.string.str_sek), baukosten_papiermuehle, ressourcen_papiermuehle);
    }
    private void erstelleIndigo(){
        gebaeudeIndigo = new Gebaeude(dialogersteller.GB_INDIGO, art_bev_indigo, anzahl_bev_indigo, anzahl_sonder_indigo, unterhalt_indigo, radius_indigo, groesse_indigo, activity.getString(R.string.str_nur_einkauf), produktionsdauer_indigo + " " + activity.getString(R.string.str_sek), baukosten_indigo, ressourcen_indigo);
    }
    private void erstelleDruckerei(){
        gebaeudeDruckerei = new Gebaeude(dialogersteller.GB_DRUCKEREI, art_bev_druckerei, anzahl_bev_druckerei, anzahl_sonder_druckerei, unterhalt_druckerei, radius_druckerei, groesse_druckerei, anzahl_auslastung_druckerei, produktionsdauer_druckerei + " " + activity.getString(R.string.str_sek), baukosten_druckerei, ressourcen_druckerei);
    }
    private void erstelleImker(){
        gebaeudeImker = new Gebaeude(dialogersteller.GB_IMKER, art_bev_imker, anzahl_bev_imker, anzahl_sonder_imker, unterhalt_imker, radius_imker, groesse_imker, anzahl_auslastung_imker, produktionsdauer_imker + " " + activity.getString(R.string.str_sek), baukosten_imker, ressourcen_imker);
    }
    private void erstelleLichtzieher(){
        gebaeudeLichtzieher = new Gebaeude(dialogersteller.GB_LICHTZIEHER, art_bev_lichtzieher, anzahl_bev_lichtzieher, anzahl_sonder_lichtzieher, unterhalt_lichtzieher, radius_lichtzieher, groesse_lichtzieher, anzahl_auslastung_lichtzieher, produktionsdauer_lichtzieher + " " + activity.getString(R.string.str_sek), baukosten_lichtzieher, ressourcen_lichtzieher);
    }
    private void erstelleFeinschmiede(){
        gebaeudeFeinschmiede = new Gebaeude(dialogersteller.GB_FEINSCHMIEDE, art_bev_feinschmiede, anzahl_bev_feinschmiede, anzahl_sonder_feinschmiede, unterhalt_feinschmiede, radius_feinschmiede, groesse_feinschmiede, anzahl_auslastung_feinschmiede, produktionsdauer_feinschmiede + " " + activity.getString(R.string.str_sek), baukosten_feinschmiede, ressourcen_feinschmiede);
    }
    private void erstelleKupfermine(){
        gebaeudeKupfermine = new Gebaeude(dialogersteller.GB_KUPFERMINE, art_bev_kupfermine, anzahl_bev_kupfermine, anzahl_sonder_kupfermine, unterhalt_kupfermine, radius_kupfermine, groesse_kupfermine, anzahl_auslastung_kupfermine, produktionsdauer_kupfermine + " " + activity.getString(R.string.str_sek), baukosten_kupfermine, ressourcen_kupfermine);
    }
    private void erstelleKupferschmelze(){
        gebaeudeKupferschmelze = new Gebaeude(dialogersteller.GB_KUPFERSCHMELZE, art_bev_kupferschmelze, anzahl_bev_kupferschmelze, anzahl_sonder_kupferschmelze, unterhalt_kupferschmelze, radius_kupferschmelze, groesse_kupferschmelze, anzahl_auslastung_kupferschmelze, produktionsdauer_kupferschmelze + " " + activity.getString(R.string.str_sek), baukosten_kupferschmelze, ressourcen_kupferschmelze);
    }
    private void erstelleBrillenmacher(){
        gebaeudeBrillenmacher = new Gebaeude(dialogersteller.GB_BRILLENMACHER, art_bev_brillenmacher, anzahl_bev_brillenmacher, anzahl_sonder_brillenmacher, unterhalt_brillenmacher, radius_brillenmacher, groesse_brillenmacher, anzahl_auslastung_brillenmacher, produktionsdauer_brillenmacher + " " + activity.getString(R.string.str_sek), baukosten_brillenmacher, ressourcen_brillenmacher);
    }

    
    /* SHOP */
    private void erstelleTieferSteinmetz(){
        gebaeudeTieferSteinmetz = new Gebaeude(dialogersteller.GB_TIEFER_STEINMETZ, art_bev_tiefer_steinmetz, anzahl_bev_tiefer_steinmetz, anzahl_sonder_tiefer_steinmetz, unterhalt_tiefer_steinmetz, radius_tiefer_steinmetz, groesse_tiefer_steinmetz, anzahl_auslastung_tiefer_steinmetz, produktionsdauer_tiefer_steinmetz + " " + activity.getString(R.string.str_sek), baukosten_tiefer_steinmetz, ressourcen_tiefer_steinmetz);
    }
    private void erstelleTiefeEisenmine(){
        gebaeudeTiefeEisenmine = new Gebaeude(dialogersteller.GB_TIEFE_EISENMINE, art_bev_tiefe_eisenmine, anzahl_bev_tiefe_eisenmine, anzahl_sonder_tiefe_eisenmine, unterhalt_tiefe_eisenmine, radius_tiefe_eisenmine, groesse_tiefe_eisenmine, anzahl_auslastung_tiefe_eisenmine, produktionsdauer_tiefe_eisenmine + " " + activity.getString(R.string.str_sek), baukosten_tiefe_eisenmine, ressourcen_tiefe_eisenmine);
    }
    private void erstelleTieferQuarzbruch(){
        gebaeudeTieferQuarzbruch = new Gebaeude(dialogersteller.GB_TIEFER_QUARZBRUCH, art_bev_tiefer_quarzbruch, anzahl_bev_tiefer_quarzbruch, anzahl_sonder_tiefer_quarzbruch, unterhalt_tiefer_quarzbruch, radius_tiefer_quarzbruch, groesse_tiefer_quarzbruch, anzahl_auslastung_tiefer_quarzbruch, produktionsdauer_tiefer_quarzbruch + " " + activity.getString(R.string.str_sek), baukosten_tiefer_quarzbruch, ressourcen_tiefer_quarzbruch);
    }
    private void erstelleTiefesKohlebergwerk(){
        gebaeudeTiefesKohlebergwerk = new Gebaeude(dialogersteller.GB_TIEFES_KOHLEBERGWERK, art_bev_tiefes_kohlebergwerk, anzahl_bev_tiefes_kohlebergwerk, anzahl_sonder_tiefes_kohlebergwerk, unterhalt_tiefes_kohlebergwerk, radius_tiefes_kohlebergwerk, groesse_tiefes_kohlebergwerk, anzahl_auslastung_tiefes_kohlebergwerk, produktionsdauer_tiefes_kohlebergwerk + " " + activity.getString(R.string.str_sek), baukosten_tiefes_kohlebergwerk, ressourcen_tiefes_kohlebergwerk);
    }
    private void erstelleTieferSalzstock(){
        gebaeudeTieferSalzstock = new Gebaeude(dialogersteller.GB_TIEFER_SALZSTOCK, art_bev_tiefer_salzstock, anzahl_bev_tiefer_salzstock, anzahl_sonder_tiefer_salzstock, unterhalt_tiefer_salzstock, radius_tiefer_salzstock, groesse_tiefer_salzstock, anzahl_auslastung_tiefer_salzstock, produktionsdauer_tiefer_salzstock + " " + activity.getString(R.string.str_sek), baukosten_tiefer_salzstock, ressourcen_tiefer_salzstock);
    }
    private void erstelleTieferPelztierjaeger(){
        gebaeudeTieferPelztierjaeger = new Gebaeude(dialogersteller.GB_TIEFER_PELZTIERJAEGER, art_bev_tiefer_pelztierjaeger, anzahl_bev_tiefer_pelztierjaeger, anzahl_sonder_tiefer_pelztierjaeger, unterhalt_tiefer_pelztierjaeger, radius_tiefer_pelztierjaeger, groesse_tiefer_pelztierjaeger, anzahl_auslastung_tiefer_pelztierjaeger, produktionsdauer_tiefer_pelztierjaeger + " " + activity.getString(R.string.str_sek), baukosten_tiefer_pelztierjaeger, ressourcen_tiefer_pelztierjaeger);
    }
    private void erstelleTiefeGoldmine(){
        gebaeudeTiefeGoldmine = new Gebaeude(dialogersteller.GB_TIEFE_GOLDMINE, art_bev_tiefe_goldmine, anzahl_bev_tiefe_goldmine, anzahl_sonder_tiefe_goldmine, unterhalt_tiefe_goldmine, radius_tiefe_goldmine, groesse_tiefe_goldmine, anzahl_auslastung_tiefe_goldmine, produktionsdauer_tiefe_goldmine + " " + activity.getString(R.string.str_sek), baukosten_tiefe_goldmine, ressourcen_tiefe_goldmine);
    }
    private void erstelleTiefeKupfermine(){
        gebaeudeTiefeKupfermine = new Gebaeude(dialogersteller.GB_TIEFE_KUPFERMINE, art_bev_tiefe_kupfermine, anzahl_bev_tiefe_kupfermine, anzahl_sonder_tiefe_kupfermine, unterhalt_tiefe_kupfermine, radius_tiefe_kupfermine, groesse_tiefe_kupfermine, anzahl_auslastung_tiefe_kupfermine, produktionsdauer_tiefe_kupfermine + " " + activity.getString(R.string.str_sek), baukosten_tiefe_kupfermine, ressourcen_tiefe_kupfermine);
    }
    private void erstelleVerbessertenWeizenhof(){
        gebaeudeVerbessertenWeizenhof = new Gebaeude(dialogersteller.GB_VERB_WEIZENHOF, art_bev_verb_weizenhof, anzahl_bev_verb_weizenhof, anzahl_sonder_verb_weizenhof, unterhalt_verb_weizenhof, radius_verb_weizenhof, groesse_verb_weizenhof, anzahl_auslastung_verb_weizenhof, produktionsdauer_verb_weizenhof + " " + activity.getString(R.string.str_sek), baukosten_verb_weizenhof, ressourcen_verb_weizenhof);
    }
    private void erstelleVerbessertePapiermuehle(){
        gebaeudeVerbessertePapiermuehle = new Gebaeude(dialogersteller.GB_VERWUN_PAPIERMUEHLE, art_bev_verb_papiermuehle, anzahl_bev_verb_papiermuehle, anzahl_sonder_verb_papiermuehle, unterhalt_verb_papiermuehle, radius_verb_papiermuehle, groesse_verb_papiermuehle, anzahl_auslastung_verb_papiermuehle, produktionsdauer_verb_papiermuehle + " " + activity.getString(R.string.str_sek), baukosten_verb_papiermuehle, ressourcen_verb_papiermuehle);
    }
    private void erstelleVerbesserteMuehle(){
        gebaeudeVerbesserteMuehle = new Gebaeude(dialogersteller.GB_VERWUN_MUEHLE, art_bev_verb_muehle, anzahl_bev_verb_muehle, anzahl_sonder_verb_muehle, unterhalt_verb_muehle, radius_verb_muehle, groesse_verb_muehle, anzahl_auslastung_verb_muehle, produktionsdauer_verb_muehle + " " + activity.getString(R.string.str_sek), baukosten_verb_muehle, ressourcen_verb_muehle);
    }
    private void erstelleVerbesserteBaeckerei(){
        gebaeudeVerbesserteBaeckerei = new Gebaeude(dialogersteller.GB_VERB_BACKSTUBE, art_bev_verb_baeckerei, anzahl_bev_verb_baeckerei, anzahl_sonder_verb_baeckerei, unterhalt_verb_baeckerei, radius_verb_baeckerei, groesse_verb_baeckerei, anzahl_auslastung_verb_baeckerei, produktionsdauer_verb_baeckerei + " " + activity.getString(R.string.str_sek), baukosten_verb_baeckerei, ressourcen_verb_baeckerei);
    }
    private void erstelleGewuerzbasar(){
        gebaeudeGewuerzbasar = new Gebaeude(dialogersteller.GB_GEWUERZBASAR, art_bev_gewuerzbasar, anzahl_bev_gewuerzbasar, anzahl_sonder_gewuerzbasar, unterhalt_gewuerzbasar, radius_gewuerzbasar, groesse_gewuerzbasar, anzahl_auslastung_gewuerzbasar, produktionsdauer_gewuerzbasar + " " + activity.getString(R.string.str_sek), baukosten_gewuerzbasar, ressourcen_gewuerzbasar);
    }
    private void erstelleScheune(){
        gebaeudeScheune = new Gebaeude(dialogersteller.GB_SCHEUNE, art_bev_scheune, anzahl_bev_scheune, anzahl_sonder_scheune, unterhalt_scheune, radius_scheune, groesse_scheune, anzahl_auslastung_scheune, produktionsdauer_scheune + " " + activity.getString(R.string.str_sek), baukosten_scheune, ressourcen_scheune);
    }
    private void erstelleSilo(){
        gebaeudeSilo = new Gebaeude(dialogersteller.GB_SILO, art_bev_silo, anzahl_bev_silo, anzahl_sonder_silo, unterhalt_silo, radius_silo, groesse_silo, anzahl_auslastung_silo, produktionsdauer_silo + " " + activity.getString(R.string.str_sek), baukosten_silo, ressourcen_silo);
    }
    private void erstelleMuseum(){
        gebaeudeMuseum = new Gebaeude(dialogersteller.GB_MUSEUM, art_bev_museum, anzahl_bev_museum, anzahl_sonder_museum, unterhalt_museum, radius_museum, groesse_museum, anzahl_auslastung_museum, produktionsdauer_museum + " " + activity.getString(R.string.str_sek), baukosten_museum, ressourcen_museum);
    }
    private void erstelleStadtarchiv(){
        gebaeudeStadtarchiv = new Gebaeude(dialogersteller.GB_STADTARCHIV, art_bev_stadtarchiv, anzahl_bev_stadtarchiv, anzahl_sonder_stadtarchiv, unterhalt_stadtarchiv, radius_stadtarchiv, groesse_stadtarchiv, anzahl_auslastung_stadtarchiv, produktionsdauer_stadtarchiv + " " + activity.getString(R.string.str_sek), baukosten_stadtarchiv, ressourcen_stadtarchiv);
    }
    private void erstelleVerbesserterMarktplatz(){
        gebaeudeVerbesserterMarktplatz = new Gebaeude(dialogersteller.GB_VERB_MARKTPLATZ, art_bev_verb_marktplatz, anzahl_bev_verb_marktplatz, anzahl_sonder_verb_marktplatz, unterhalt_verb_marktplatz, radius_verb_marktplatz, groesse_verb_marktplatz, anzahl_auslastung_verb_marktplatz, produktionsdauer_verb_marktplatz + " " + activity.getString(R.string.str_sek), baukosten_verb_marktplatz, ressourcen_verb_marktplatz);
    }

    // GETTER
    public Gebaeude getGebaeudeHolzfaeller() {
        return gebaeudeHolzfaeller;
    }

    public Gebaeude getGebaeudeSteinbruch() {
        return gebaeudeSteinbruch;
    }

    public Gebaeude getGebaeudeEisenmine() {
        return gebaeudeEisenmine;
    }

    public Gebaeude getGebaeudeKoehlerhuette() {
        return gebaeudeKoehlerhuette;
    }

    public Gebaeude getGebaeudeKohlebergwerk() {
        return gebaeudeKohlebergwerk;
    }

    public Gebaeude getGebaeudeEisenschmelze() {
        return gebaeudeEisenschmelze;
    }

    public Gebaeude getGebaeudeWerkzeugmacher() {
        return gebaeudeWerkzeugmacher;
    }

    public Gebaeude getGebaeudeWaldglashuette() {
        return gebaeudeWaldglashuette;
    }

    public Gebaeude getGebaeudeQuarzbruch() {
        return gebaeudeQuarzbruch;
    }

    public Gebaeude getGebaeudeGlasschmelze() {
        return gebaeudeGlasschmelze;
    }

    public Gebaeude getGebaeudeFischer() {
        return gebaeudeFischer;
    }

    public Gebaeude getGebaeudeWeizenhof() {
        return gebaeudeWeizenhof;
    }

    public Gebaeude getGebaeudeMuehle() {
        return gebaeudeMuehle;
    }

    public Gebaeude getGebaeudeBackstube() {
        return gebaeudeBackstube;
    }

    public Gebaeude getGebaeudeGewuerze() {
        return gebaeudeGewuerze;
    }

    public Gebaeude getGebaeudeRinderfarm() {
        return gebaeudeRinderfarm;
    }

    public Gebaeude getGebaeudeMetzger() {
        return gebaeudeMetzger;
    }

    public Gebaeude getGebaeudeZiegenfarm() {
        return gebaeudeZiegenfarm;
    }

    public Gebaeude getGebaeudeApfelhof() {
        return gebaeudeApfelhof;
    }

    public Gebaeude getGebaeudeMosthof() {
        return gebaeudeMosthof;
    }

    public Gebaeude getGebaeudeKlostergarten() {
        return gebaeudeKlostergarten;
    }

    public Gebaeude getGebaeudeKlosterbrauerei() {
        return gebaeudeKlosterbrauerei;
    }

    public Gebaeude getGebaeudeWeingut() {
        return gebaeudeWeingut;
    }

    public Gebaeude getGebaeudeFasskueferei() {
        return gebaeudeFasskueferei;
    }

    public Gebaeude getGebaeudeKelterei() {
        return gebaeudeKelterei;
    }

    public Gebaeude getGebaeudeSchaffarm() {
        return gebaeudeSchaffarm;
    }

    public Gebaeude getGebaeudeSpinnerei() {
        return gebaeudeSpinnerei;
    }

    public Gebaeude getGebaeudeHanfplantage() {
        return gebaeudeHanfplantage;
    }

    public Gebaeude getGebaeudeWebstube() {
        return gebaeudeWebstube;
    }

    public Gebaeude getGebaeudeSchweinefarm() {
        return gebaeudeSchweinefarm;
    }

    public Gebaeude getGebaeudeSalzstock() {
        return gebaeudeSalzstock;
    }

    public Gebaeude getGebaeudeSaline() {
        return gebaeudeSaline;
    }

    public Gebaeude getGebaeudeGerberei() {
        return gebaeudeGerberei;
    }

    public Gebaeude getGebaeudePelztierjaeger() {
        return gebaeudePelztierjaeger;
    }

    public Gebaeude getGebaeudeKuerschnerei() {
        return gebaeudeKuerschnerei;
    }

    public Gebaeude getGebaeudeGoldmine() {
        return gebaeudeGoldmine;
    }

    public Gebaeude getGebaeudeGoldschmelze() {
        return gebaeudeGoldschmelze;
    }

    public Gebaeude getGebaeudeSeide() {
        return gebaeudeSeide;
    }

    public Gebaeude getGebaeudeSeidenweberei() {
        return gebaeudeSeidenweberei;
    }

    public Gebaeude getGebaeudePapiermuehle() {
        return gebaeudePapiermuehle;
    }

    public Gebaeude getGebaeudeIndigo() {
        return gebaeudeIndigo;
    }

    public Gebaeude getGebaeudeDruckerei() {
        return gebaeudeDruckerei;
    }

    public Gebaeude getGebaeudeImker() {
        return gebaeudeImker;
    }

    public Gebaeude getGebaeudeLichtzieher() {
        return gebaeudeLichtzieher;
    }

    public Gebaeude getGebaeudeFeinschmiede() {
        return gebaeudeFeinschmiede;
    }

    public Gebaeude getGebaeudeKupfermine() {
        return gebaeudeKupfermine;
    }

    public Gebaeude getGebaeudeKupferschmelze() {
        return gebaeudeKupferschmelze;
    }

    public Gebaeude getGebaeudeBrillenmacher() {
        return gebaeudeBrillenmacher;
    }

    public Gebaeude getGebaeudeTieferSteinmetz() {
        return gebaeudeTieferSteinmetz;
    }

    public Gebaeude getGebaeudeTiefeEisenmine() {
        return gebaeudeTiefeEisenmine;
    }

    public Gebaeude getGebaeudeTieferQuarzbruch() {
        return gebaeudeTieferQuarzbruch;
    }

    public Gebaeude getGebaeudeTiefesKohlebergwerk() {
        return gebaeudeTiefesKohlebergwerk;
    }

    public Gebaeude getGebaeudeTieferSalzstock() {
        return gebaeudeTieferSalzstock;
    }

    public Gebaeude getGebaeudeTieferPelztierjaeger() {
        return gebaeudeTieferPelztierjaeger;
    }

    public Gebaeude getGebaeudeTiefeGoldmine() {
        return gebaeudeTiefeGoldmine;
    }

    public Gebaeude getGebaeudeTiefeKupfermine() {
        return gebaeudeTiefeKupfermine;
    }

    public Gebaeude getGebaeudeVerbessertenWeizenhof() {
        return gebaeudeVerbessertenWeizenhof;
    }

    public Gebaeude getGebaeudeVerbesserteMuehle() {
        return gebaeudeVerbesserteMuehle;
    }

    public Gebaeude getGebaeudeVerbesserteBaeckerei() {
        return gebaeudeVerbesserteBaeckerei;
    }

    public Gebaeude getGebaeudeVerbessertePapiermuehle() {
        return gebaeudeVerbessertePapiermuehle;
    }

    public Gebaeude getGebaeudeGewuerzbasar() {
        return gebaeudeGewuerzbasar;
    }

    public Gebaeude getGebaeudeScheune() {
        return gebaeudeScheune;
    }

    public Gebaeude getGebaeudeSilo() {
        return gebaeudeSilo;
    }

    public Gebaeude getGebaeudeMuseum() {
        return gebaeudeMuseum;
    }

    public Gebaeude getGebaeudeStadtarchiv() {
        return gebaeudeStadtarchiv;
    }

    public Gebaeude getGebaeudeVerbesserterMarktplatz() {
        return gebaeudeVerbesserterMarktplatz;
    }

    public Gebaeude getGebaeudeKontorLvl1() {
        return gebaeudeKontorLvl1;
    }

    public Gebaeude getGebaeudeKontorLvl2() {
        return gebaeudeKontorLvl2;
    }

    public Gebaeude getGebaeudeKontorLvl3() {
        return gebaeudeKontorLvl3;
    }

    public Gebaeude getGebaeudeKontorLvl4() {
        return gebaeudeKontorLvl4;
    }

    public Gebaeude getGebaeudeLagerhausLvl1() {
        return gebaeudeLagerhausLvl1;
    }

    public Gebaeude getGebaeudeLagerhausLvl2() {
        return gebaeudeLagerhausLvl2;
    }

    public Gebaeude getGebaeudeLagerhausLvl3() {
        return gebaeudeLagerhausLvl3;
    }

    public Gebaeude getGebaeudeLagerhausLvl4() {
        return gebaeudeLagerhausLvl4;
    }

    public Gebaeude getGebaeudeLagerhausLvl5() {
        return gebaeudeLagerhausLvl5;
    }

    public Gebaeude getGebaeudeLagerhausLvl6() {
        return gebaeudeLagerhausLvl6;
    }

    public Gebaeude getGebaeudeLagerhausLvl7() {
        return gebaeudeLagerhausLvl7;
    }

    public Gebaeude getGebaeudeLagerhausLvl8() {
        return gebaeudeLagerhausLvl8;
    }

    public Gebaeude getGebaeudeLagerhausLvl9() {
        return gebaeudeLagerhausLvl9;
    }

    public Gebaeude getGebaeudeLeuchtturmLvl1() {
        return gebaeudeLeuchtturmLvl1;
    }

    public Gebaeude getGebaeudeLeuchtturmLvl2() {
        return gebaeudeLeuchtturmLvl2;
    }

    public Gebaeude getGebaeudeLeuchtturmLvl3() {
        return gebaeudeLeuchtturmLvl3;
    }

    public Gebaeude getGebaeudeLeuchtturmLvl4() {
        return gebaeudeLeuchtturmLvl4;
    }

    public Gebaeude getGebaeudeLeuchtturmLvl5() {
        return gebaeudeLeuchtturmLvl5;
    }

    public Gebaeude getGebaeudeLeuchtturmLvl6() {
        return gebaeudeLeuchtturmLvl6;
    }

    public Gebaeude getGebaeudeLeuchtturmLvl7() {
        return gebaeudeLeuchtturmLvl7;
    }

    public Gebaeude getGebaeudeLeuchtturmLvl8() {
        return gebaeudeLeuchtturmLvl8;
    }

    public Gebaeude getGebaeudeLeuchtturmLvl9() {
        return gebaeudeLeuchtturmLvl9;
    }

    public Gebaeude getGebaeudeSchatzkammerLvl1() {
        return gebaeudeSchatzkammerLvl1;
    }

    public Gebaeude getGebaeudeSchatzkammerLvl2() {
        return gebaeudeSchatzkammerLvl2;
    }

    public Gebaeude getGebaeudeSchatzkammerLvl3() {
        return gebaeudeSchatzkammerLvl3;
    }

    public Gebaeude getGebaeudeSchatzkammerLvl4() {
        return gebaeudeSchatzkammerLvl4;
    }

    public Gebaeude getGebaeudeSchatzkammerLvl5() {
        return gebaeudeSchatzkammerLvl5;
    }

    public Gebaeude getGebaeudeSchatzkammerLvl6() {
        return gebaeudeSchatzkammerLvl6;
    }

    public Gebaeude getGebaeudeSchatzkammerLvl7() {
        return gebaeudeSchatzkammerLvl7;
    }

    public Gebaeude getGebaeudeSchatzkammerLvl8() {
        return gebaeudeSchatzkammerLvl8;
    }

    public Gebaeude getGebaeudeSchatzkammerLvl9() {
        return gebaeudeSchatzkammerLvl9;
    }

    public Gebaeude getGebaeudeSchatzkammerLvl10() {
        return gebaeudeSchatzkammerLvl10;
    }

    public Gebaeude getGebaeudeBauernhaus() {
        return gebaeudeBauernhaus;
    }

    public Gebaeude getGebaeudeHandwerkerkate() {
        return gebaeudeHandwerkerkate;
    }

    public Gebaeude getGebaeudeKaufmannshaus() {
        return gebaeudeKaufmannshaus;
    }

    public Gebaeude getGebaeudeAdligenhaus() {
        return gebaeudeAdligenhaus;
    }

    public Gebaeude getGebaeudeFeldweg() {
        return gebaeudeFeldweg;
    }

    public Gebaeude getGebaeudeSteinstrasse() {
        return gebaeudeSteinstrasse;
    }

    public Gebaeude getGebaeudeMarktplatzKlein() {
        return gebaeudeMarktplatzKlein;
    }

    public Gebaeude getGebaeudeMarktplatzMittelgross() {
        return gebaeudeMarktplatzMittelgross;
    }

    public Gebaeude getGebaeudeMarktplatzGross() {
        return gebaeudeMarktplatzGross;
    }

    public Gebaeude getGebaeudeMarktplatzRiesig() {
        return gebaeudeMarktplatzRiesig;
    }

    public Gebaeude getGebaeudeMarkthausLvl1() {
        return gebaeudeMarkthausLvl1;
    }

    public Gebaeude getGebaeudeMarkthausLvl2() {
        return gebaeudeMarkthausLvl2;
    }

    public Gebaeude getGebaeudeMarkthausLvl3() {
        return gebaeudeMarkthausLvl3;
    }

    public Gebaeude getGebaeudeMarkthausLvl4() {
        return gebaeudeMarkthausLvl4;
    }

    public Gebaeude getGebaeudeWerft() {
        return gebaeudeWerft;
    }

    public Gebaeude getGebaeudeSchiffsbauer() {
        return gebaeudeSchiffsbauer;
    }

    public Gebaeude getGebaeudeProviantmagazin() {
        return gebaeudeProviantmagazin;
    }

    public Gebaeude getGebaeudeDock() {
        return gebaeudeDock;
    }

    public Gebaeude getGebaeudeGildenhalle() {
        return gebaeudeGildenhalle;
    }

    public Gebaeude getGebaeudePierLvl1() {
        return gebaeudePierLvl1;
    }

    public Gebaeude getGebaeudePierLvl2() {
        return gebaeudePierLvl2;
    }

    public Gebaeude getGebaeudePierLvl3() {
        return gebaeudePierLvl3;
    }

    public Gebaeude getGebaeudeHandelsspeicher() {
        return gebaeudeHandelsspeicher;
    }

    public Gebaeude getGebaeudeBrunnen() {
        return gebaeudeBrunnen;
    }

    public Gebaeude getGebaeudeZimmermann() {
        return gebaeudeZimmermann;
    }

    public Gebaeude getGebaeudeKapelle() {
        return gebaeudeKapelle;
    }

    public Gebaeude getGebaeudeBarbier() {
        return gebaeudeBarbier;
    }

    public Gebaeude getGebaeudeTaverne() {
        return gebaeudeTaverne;
    }

    public Gebaeude getGebaeudeFeuerwache() {
        return gebaeudeFeuerwache;
    }

    public Gebaeude getGebaeudeTurnierplatz() {
        return gebaeudeTurnierplatz;
    }

    public Gebaeude getGebaeudeSchuldturm() {
        return gebaeudeSchuldturm;
    }

    public Gebaeude getGebaeudeKirche() {
        return gebaeudeKirche;
    }

    public Gebaeude getGebaeudeMedikus() {
        return gebaeudeMedikus;
    }

    public static int getProduktionsdauer_apfelhof() {
        return produktionsdauer_apfelhof;
    }

    public static int getProduktionsdauer_backstube() {
        return produktionsdauer_backstube;
    }

    public static int getProduktionsdauer_brillenmacher() {
        return produktionsdauer_brillenmacher;
    }

    public static int getProduktionsdauer_druckerei() {
        return produktionsdauer_druckerei;
    }

    public static int getProduktionsdauer_eisenmine() {
        return produktionsdauer_eisenmine;
    }

    public static int getProduktionsdauer_eisenschmelze() {
        return produktionsdauer_eisenschmelze;
    }

    public static int getProduktionsdauer_fasskueferei() {
        return produktionsdauer_fasskueferei;
    }

    public static int getProduktionsdauer_feinschmiede() {
        return produktionsdauer_feinschmiede;
    }

    public static int getProduktionsdauer_fischer() {
        return produktionsdauer_fischer;
    }

    public static int getProduktionsdauer_gerberei() {
        return produktionsdauer_gerberei;
    }

    public static int getProduktionsdauer_glasschmelze() {
        return produktionsdauer_glasschmelze;
    }

    public static int getProduktionsdauer_goldmine() {
        return produktionsdauer_goldmine;
    }

    public static int getProduktionsdauer_goldschmelze() {
        return produktionsdauer_goldschmelze;
    }

    public static int getProduktionsdauer_hanfplantage() {
        return produktionsdauer_hanfplantage;
    }

    public static int getProduktionsdauer_holzfaeller() {
        return produktionsdauer_holzfaeller;
    }

    public static int getProduktionsdauer_imker() {
        return produktionsdauer_imker;
    }

    public static int getProduktionsdauer_kelterei() {
        return produktionsdauer_kelterei;
    }

    public static int getProduktionsdauer_klosterbrauerei() {
        return produktionsdauer_klosterbrauerei;
    }

    public static int getProduktionsdauer_klostergarten() {
        return produktionsdauer_klostergarten;
    }

    public static int getProduktionsdauer_koehlerhuette() {
        return produktionsdauer_koehlerhuette;
    }

    public static int getProduktionsdauer_kohlemine() {
        return produktionsdauer_kohlemine;
    }

    public static int getProduktionsdauer_kuerschnerei() {
        return produktionsdauer_kuerschnerei;
    }

    public static int getProduktionsdauer_kupfermine() {
        return produktionsdauer_kupfermine;
    }

    public static int getProduktionsdauer_kupferschmelze() {
        return produktionsdauer_kupferschmelze;
    }

    public static int getProduktionsdauer_lichtzieher() {
        return produktionsdauer_lichtzieher;
    }

    public static int getProduktionsdauer_metzger() {
        return produktionsdauer_metzger;
    }

    public static int getProduktionsdauer_mosthof() {
        return produktionsdauer_mosthof;
    }

    public static int getProduktionsdauer_muehle() {
        return produktionsdauer_muehle;
    }

    public static int getProduktionsdauer_papiermuehle() {
        return produktionsdauer_papiermuehle;
    }

    public static int getProduktionsdauer_pelztierjaeger() {
        return produktionsdauer_pelztierjaeger;
    }

    public static int getProduktionsdauer_quarzbruch() {
        return produktionsdauer_quarzbruch;
    }

    public static int getProduktionsdauer_rinderfarm() {
        return produktionsdauer_rinderfarm;
    }

    public static int getProduktionsdauer_saline() {
        return produktionsdauer_saline;
    }

    public static int getProduktionsdauer_salzstock() {
        return produktionsdauer_salzstock;
    }

    public static int getProduktionsdauer_schaffarm() {
        return produktionsdauer_schaffarm;
    }

    public static int getProduktionsdauer_schweinefarm() {
        return produktionsdauer_schweinefarm;
    }

    public static int getProduktionsdauer_seidenweberei() {
        return produktionsdauer_seidenweberei;
    }

    public static int getProduktionsdauer_spinnerei() {
        return produktionsdauer_spinnerei;
    }

    public static int getProduktionsdauer_steinbruch() {
        return produktionsdauer_steinbruch;
    }

    public static int getProduktionsdauer_waldglashuette() {
        return produktionsdauer_waldglashuette;
    }

    public static int getProduktionsdauer_webstube() {
        return produktionsdauer_webstube;
    }

    public static int getProduktionsdauer_weingut() {
        return produktionsdauer_weingut;
    }

    public static int getProduktionsdauer_weizenfarm() {
        return produktionsdauer_weizenfarm;
    }

    public static int getProduktionsdauer_werkzeugmacher() {
        return produktionsdauer_werkzeugmacher;
    }

    public static int getProduktionsdauer_ziegenfarm() {
        return produktionsdauer_ziegenfarm;
    }
}
