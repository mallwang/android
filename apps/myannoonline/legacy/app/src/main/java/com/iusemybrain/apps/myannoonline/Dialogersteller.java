package com.iusemybrain.apps.myannoonline;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.iusemybrain.apps.myannoonline.dialogcontent.Gebaeude;
import com.iusemybrain.apps.myannoonline.dialogcontent.Insel;
import com.iusemybrain.apps.myannoonline.dialogcontent.Monument;

/**
 * Created by Markus on 10.04.2015.
 */
class Dialogersteller {
    private static final int LAENGE_GEBAEUDEBEZEICHNUNG = 13;
    private static final int ANZAHL_LINES = 2;
    private final Activity activity;

    // IDs für Art
    static final int GEBAEUDE = 1;
    static final int MONUMENTE = 2;
    static final int INSELN = 3;

    // IDs für Produktionsgebäude
    static final int GB_HOLZFAELLER = 1;
    static final int GB_STEINBRUCH = 2;
    static final int GB_EISENMINE = 3;
    static final int GB_KOEHLERHUETTE = 4;
    static final int GB_EISENSCHMELZE = 5;
    static final int GB_WERKZEUGMACHER = 6;
    static final int GB_WALDGLASHUETTE = 7;
    static final int GB_QUARZBRUCH = 8;
    static final int GB_GLASSCHMELZE = 9;
    static final int GB_FISCHER = 10;
    static final int GB_WEIZENHOF = 11;
    static final int GB_MUEHLE = 12;
    static final int GB_BACKSTUBE = 13;
    static final int GB_GEWUERZE = 14;
    static final int GB_RINDERFARM = 15;
    static final int GB_METZGER = 16;
    static final int GB_ZIEGENFARM = 17;
    static final int GB_APFELHOF = 18;
    static final int GB_MOSTHOF = 19;
    static final int GB_KLOSTERGARTEN = 20;
    static final int GB_KLOSTERBRAUEREI = 21;
    static final int GB_WEINGUT = 22;
    static final int GB_FASSKUEFEREI = 23;
    static final int GB_KELTEREI = 24;
    static final int GB_SCHAFFARM = 25;
    static final int GB_SPINNEREI = 26;
    static final int GB_HANFHOF = 27;
    static final int GB_WEBSTUBE = 28;
    static final int GB_SCHWEINEFARM = 29;
    static final int GB_SALZSTOCK = 30;
    static final int GB_SALINE = 31;
    static final int GB_GERBEREI = 32;
    static final int GB_PELZTIERJAEGER = 33;
    static final int GB_KUERSCHNER = 34;
    static final int GB_GOLDMINE = 35;
    static final int GB_GOLDSCHMELZE = 36;
    static final int GB_SEIDE = 37;
    static final int GB_SEIDENWEBEREI = 38;
    static final int GB_PAPIERMUEHLE = 39;
    static final int GB_INDIGO = 40;
    static final int GB_DRUCKEREI = 41;
    static final int GB_IMKER = 42;
    static final int GB_LICHTZIEHER = 43;
    static final int GB_FEINSCHMIEDE = 44;
    static final int GB_KUPFERMINE = 45;
    static final int GB_KUPFERSCHMELZE = 46;
    static final int GB_BRILLENMACHER = 47;
    // IDs für Shop-Produktionsgebäude
    static final int GB_TIEFER_STEINMETZ = 48;
    static final int GB_TIEFE_EISENMINE = 49;
    static final int GB_TIEFER_QUARZBRUCH = 50;
    static final int GB_TIEFES_KOHLEBERGWERK = 51;
    static final int GB_TIEFER_SALZSTOCK = 52;
    static final int GB_TIEFER_PELZTIERJAEGER = 53;
    static final int GB_TIEFE_GOLDMINE = 54;
    static final int GB_TIEFE_KUPFERMINE = 55;
    static final int GB_VERB_WEIZENHOF = 56;
    static final int GB_VERWUN_MUEHLE = 57;
    static final int GB_VERWUN_PAPIERMUEHLE = 58;
    static final int GB_VERB_BACKSTUBE = 59;
    static final int GB_KOHLEBERGWERK = 60;
    // IDs für Stadtgebäude
    static final int GB_BAUERNHAUS = 101;
    static final int GB_HANDWERKERKATE = 102;
    static final int GB_KAUFMANNSHAUS = 103;
    static final int GB_ADLIGENHAUS = 104;
    static final int GB_FELDWEG = 105;
    static final int GB_STEINSTRASSE = 106;
    static final int GB_WERFT = 107;
    static final int GB_SCHIFFSBAUER = 108;
    static final int GB_PROVIANTMAGAZIN = 109;
    static final int GB_DOCK = 110;
    static final int GB_GILDENHALLE = 111;
    static final int GB_HANDELSSPEICHER = 112;
    static final int GB_BRUNNEN = 113;
    static final int GB_ZIMMERMANN = 114;
    static final int GB_KAPELLE = 115;
    static final int GB_BARBIER = 116;
    static final int GB_TAVERNE = 117;
    static final int GB_FEUERWACHE = 118;
    static final int GB_TURNIERPLATZ = 119;
    static final int GB_SCHULDTURM = 120;
    static final int GB_KIRCHE = 121;
    static final int GB_MEDIKUS = 122;
    static final int GB_GEWUERZBASAR = 123;
    static final int GB_SCHEUNE = 124;
    static final int GB_SILO = 125;
    static final int GB_MUSEUM = 126;
    static final int GB_STADTARCHIV = 127;
    static final int GB_VERB_MARKTPLATZ = 128;
    static final int GB_PIER_STUFE1 = 131;
    static final int GB_PIER_STUFE2 = 132;
    static final int GB_PIER_STUFE3 = 133;
    static final int GB_KONTOR_STUFE1 = 141;
    static final int GB_KONTOR_STUFE2 = 142;
    static final int GB_KONTOR_STUFE3 = 143;
    static final int GB_KONTOR_STUFE4 = 144;
    static final int GB_MARKTHAUS_STUFE1 = 151;
    static final int GB_MARKTHAUS_STUFE2 = 152;
    static final int GB_MARKTHAUS_STUFE3 = 153;
    static final int GB_MARKTHAUS_STUFE4 = 154;
    static final int GB_MARKTPLATZ_STUFE1 = 161;
    static final int GB_MARKTPLATZ_STUFE2 = 162;
    static final int GB_MARKTPLATZ_STUFE3 = 163;
    static final int GB_MARKTPLATZ_STUFE4 = 164;
    static final int GB_LEUCHTTURM_STUFE1 = 171;
    static final int GB_LEUCHTTURM_STUFE2 = 172;
    static final int GB_LEUCHTTURM_STUFE3 = 173;
    static final int GB_LEUCHTTURM_STUFE4 = 174;
    static final int GB_LAGERHAUS_STUFE1 = 181;
    static final int GB_LAGERHAUS_STUFE2 = 182;
    static final int GB_LAGERHAUS_STUFE3 = 183;
    static final int GB_LAGERHAUS_STUFE4 = 184;
    static final int GB_LAGERHAUS_STUFE5 = 185;
    static final int GB_SCHATZKAMMER_STUFE1 = 191;
    static final int GB_SCHATZKAMMER_STUFE2 = 192;
    static final int GB_SCHATZKAMMER_STUFE3 = 193;

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
    //IDs für Monumente
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

    static final int GB_BEV_KEINE = 200;
    private static final int GB_BEV_BAUER = 201;
    private static final int GB_BEV_HANDWERKER = 202;
    private static final int GB_BEV_KAUFMANN = 203;
    private static final int GB_BEV_ADLIGER = 204;

    // IDs für Inseln
    static final int INS_KLEIN1 = 301;
    static final int INS_KLEIN2 = 302;
    static final int INS_KLEIN3 = 303;
    static final int INS_KLEIN4 = 304;
    static final int INS_KLEIN5 = 305;
    static final int INS_MITTEL1 = 311;
    static final int INS_MITTEL2 = 312;
    static final int INS_MITTEL3 = 313;
    static final int INS_MITTEL4 = 314;
    static final int INS_MITTEL5 = 315;
    static final int INS_MITTEL6 = 316;
    static final int INS_MITTEL7 = 317;
    static final int INS_MITTEL8 = 318;
    static final int INS_MITTEL9 = 319;
    static final int INS_MITTEL10 = 320;
    static final int INS_GROSS1 = 321;
    static final int INS_GROSS2 = 322;
    static final int INS_GROSS3 = 323;
    static final int INS_GROSS4 = 324;
    static final int INS_GROSS5 = 325;
    static final int INS_GROSS6 = 326;
    static final int INS_RIESIG1 = 331;
    static final int INS_RIESIG2 = 332;
    static final int INS_RIESIG3 = 333;
    static final int INS_RIESIG4 = 334;
    static final int INS_RIESIG5 = 335;
    static final int INS_RIESIG6 = 336;
    static final int INS_RIESIG7 = 337;
    static final int INS_RIESIG8 = 338;
    static final int INS_RIESIG9 = 339;

    // IDs für Vorkommen
    static final int VORK_ALLE = 1;
    static final int VORK_3ST_2E = 2;
    static final int VORK_2ST_2E_2P_2KO = 3;
    static final int VORK_3ST_2E_2F = 4;
    static final int VORK_2ST_2E_2SO_3KU_1G = 5;
    static final int VORK_2ST_2E_2P_1KU_1G = 6;
    static final int VORK_3ST_3E_3SO_3KO_4F = 7;
    static final int VORK_3ST_3E_2P_3KO_3Q_2KU = 8;
    static final int VORK_4ST_3E_3SO_3Q_4F_2G = 9;
    static final int VORK_2E_3SO_4P_3KO_8F_4Q_3KU_3G = 10;
    static final int VORK_1E_4SO_3P_2KO_4F_4Q_3G = 11;
    static final int VORK_2E_2SO_4P_3KO_4F_2Q_5KU = 12;
    static final int VORK_2E_2SO_4KO_4F_3Q_3KU_4G = 13;
    static final int VORK_4E_2SO_4P_4KO_4F_1KU_3G = 14;
    static final int VORK_1E_4P_2KO_4F_6Q_3KU_2G = 15;
    static final int VORK_4SO_4E_2KO_4F_4Q_1KU_3G = 16;
    static final int VORK_GROSS = 17;

    // IDs für Fruchtbarkeiten
    static final int FRUCHTB_ALLE = 1;
    static final int FRUCHTB_AEPFEL = 2;
    static final int FRUCHTB_HANF = 3;
    static final int FRUCHTB_WEIZEN = 4;
    static final int FRUCHTB_KRAEUTER = 5;
    static final int FRUCHTB_WEINTRAUBEN = 6;
    static final int FRUCHTB_BIENENWACHS = 7;
    static final int FRUCHTB_AEPFEL_HANF = 8;
    static final int FRUCHTB_AEPFEL_BIENENWACHS = 9;
    static final int FRUCHTB_HANF_WEIN = 10;
    static final int FRUCHTB_BIENENWACHS_WEIN = 11;
    static final int FRUCHTB_WEIZEN_HANF = 12;
    static final int FRUCHTB_HANF_BIENENWACHS = 13;
    static final int FRUCHTB_WEIZEN_KRAEUTER = 14;

    // Shop-Arrays
    private static int[] GB_SHOP;
    private static int[] INSELN_SHOP;

    // Konstruktor
    public Dialogersteller(Activity activity) {
        this.activity = activity;
        GB_SHOP = new int[]{GB_TIEFER_STEINMETZ, GB_TIEFE_EISENMINE, GB_TIEFER_QUARZBRUCH, GB_TIEFES_KOHLEBERGWERK, GB_TIEFER_SALZSTOCK, GB_TIEFER_PELZTIERJAEGER, GB_TIEFE_GOLDMINE,
                GB_TIEFE_KUPFERMINE, GB_VERB_WEIZENHOF, GB_VERWUN_MUEHLE, GB_VERWUN_PAPIERMUEHLE, GB_VERB_BACKSTUBE, GB_GEWUERZBASAR, GB_SCHEUNE, GB_SILO, GB_MUSEUM, GB_STADTARCHIV, GB_VERB_MARKTPLATZ};
        INSELN_SHOP = new int[]{INS_MITTEL5, INS_MITTEL6, INS_MITTEL7, INS_MITTEL8, INS_MITTEL9, INS_MITTEL10, INS_GROSS3, INS_GROSS4, INS_GROSS5, INS_GROSS6, INS_RIESIG1, INS_RIESIG2,
                INS_RIESIG3, INS_RIESIG4, INS_RIESIG5, INS_RIESIG6, INS_RIESIG7, INS_RIESIG8, INS_RIESIG9};
    }

    // Dialoge für Gebäude erstellen
    public void erstelleDialog(String title, Gebaeude[] gebaeude) {
        // Anzahl Gebäude zueisen
        int anzahlGebaeude = gebaeude.length;
        // Dialog erstellen
        final Dialog dialog = new Dialog(activity);
        // Auswahl des richtigen Layouts
        switch (anzahlGebaeude) {
            case 1:
                dialog.setContentView(R.layout.prk1);
                break;
            case 2:
                dialog.setContentView(R.layout.prk2);
                break;
            case 3:
                dialog.setContentView(R.layout.prk3);
                break;
            case 4:
                dialog.setContentView(R.layout.prk4);
                break;
            case 5:
                dialog.setContentView(R.layout.prk5);
                break;
            case 6:
                dialog.setContentView(R.layout.prk6);
                break;
            case 7:
                dialog.setContentView(R.layout.prk7);
                break;
            case 8:
                dialog.setContentView(R.layout.prk8);
                break;
            case 9:
                dialog.setContentView(R.layout.prk9);
                break;
            case 10:
                dialog.setContentView(R.layout.prk10);
                break;
        }
        // Dialogtitel
        dialog.setTitle(title);
        // Iteration über jedes Gebäude
        for (int i = 0; i < anzahlGebaeude; i++) {
            // Views zuweisen
            TextView tv_prk1_gb_ew = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_ew", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_prk1_gb_flds = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_flds", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_prk1_gb_unt = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_unt", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_prk1_gb_rds = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_rds", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_prk1_gb_grsse = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_grsse", "id", "com.iusemybrain.apps.myannoonline"));
            ImageView iv_prk1_gb_img = (ImageView) dialog.findViewById(activity.getResources().getIdentifier("iv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_img", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_prk1_gb_anzahl = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_anzahl", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_prk1_gb_bez = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_bez", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_prk1_gb_produkt = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_produkt", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_prk1_gb_gold = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_gold", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_prk1_gb_holz = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_holz", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_prk1_gb_stein = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_stein", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_prk1_gb_wkz = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_wkz", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_prk1_gb_glas = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_gblayout" + anzahlGebaeude + "_gb" + (i + 1) + "_glas", "id", "com.iusemybrain.apps.myannoonline"));
            Button btn_prk = (Button) dialog.findViewById(activity.getResources().getIdentifier("btn_gblayout" + anzahlGebaeude, "id", "com.iusemybrain.apps.myannoonline"));

            // Gebäude zuweisen
            Gebaeude aktGebaeude = gebaeude[i];

            // Gebäudewerte zuweisen
            int einwohnerArt = aktGebaeude.getArtBevoelkerung();
            int anzahlEinwohner = aktGebaeude.getAnzahlBevoelkerung();
            int anzahlFelder = aktGebaeude.getAnzahlSonder();
            int unterhalt = aktGebaeude.getUnterhalt();
            int radius = aktGebaeude.getRadius();
            String groesse = aktGebaeude.getGroesse();
            int gebaeudeArt = aktGebaeude.getArtGebaeude();
            String gebaeudeAnzahl = aktGebaeude.getAnzahlAuslastung();
            String dauer = aktGebaeude.getProduktionsdauer();
            String baukosten = aktGebaeude.getBaukosten();
            int[] ressourcen = aktGebaeude.getRessourcen();
            int holz = ressourcen[0];
            int stein = ressourcen[1];
            int werkzeug = ressourcen[2];
            int glas = ressourcen[3];

            // Einwohnerart setzen
            setHabitant(einwohnerArt, tv_prk1_gb_ew);

            // Anzahl Einwohner setzen
            tv_prk1_gb_ew.setText(String.valueOf(anzahlEinwohner));

            // Anzahl Felder setzen
            if (anzahlFelder != 0) {
                setField(gebaeudeArt, anzahlFelder, tv_prk1_gb_flds);
            }

            // Unterhalt setzen
            tv_prk1_gb_unt.setText(String.valueOf(unterhalt));

            // Radius setzen
            if (radius == 0)
                tv_prk1_gb_rds.setText("-");
            else
                tv_prk1_gb_rds.setText(String.valueOf(radius));

            // Größe setzen
            tv_prk1_gb_grsse.setText(groesse);

            // Bild hinzufügen
            setImage(GEBAEUDE, gebaeudeArt, iv_prk1_gb_img);

            // Produkt setzen
            setProduct(GEBAEUDE, gebaeudeArt, tv_prk1_gb_produkt);

            // Gebäudebezeichnung setzen
            setBezeichnung(GEBAEUDE, gebaeudeArt, tv_prk1_gb_bez);

            // Länge des Feldes anpassen
            if (tv_prk1_gb_bez.getText().length() > LAENGE_GEBAEUDEBEZEICHNUNG) {
                tv_prk1_gb_bez.setLines(ANZAHL_LINES);
                tv_prk1_gb_bez.setMaxLines(ANZAHL_LINES);
            }

            // Anzahl der Gebäude setzen
            tv_prk1_gb_anzahl.setText(gebaeudeAnzahl);

            // Produktionsdauer setzen
            if (!dauer.startsWith("0")) {
                tv_prk1_gb_produkt.setText(dauer);
            } else {
                tv_prk1_gb_produkt.setText("");
            }

            // Baukosten setzen
            if (!baukosten.equals("0")) {
                // Hintergrund, Text und Anzahl Felder eintragen
                tv_prk1_gb_gold.setText(String.valueOf(baukosten));
                tv_prk1_gb_gold.setBackgroundColor(0xffdedad9);
                // Rubin setzen
                tv_prk1_gb_gold.setCompoundDrawablesWithIntrinsicBounds(R.drawable.muenzen, 0, 0, 0);
                for (final int j : GB_SHOP) {
                    if (j == gebaeudeArt) {
                        tv_prk1_gb_gold.setCompoundDrawablesWithIntrinsicBounds(R.drawable.rubin, 0, 0, 0);
                    }
                }
            }

            // Holz setzen
            if (holz != 0) {
                // Hintergrund, Text und Anzahl Felder eintragen
                tv_prk1_gb_holz.setText(String.valueOf(holz));
                tv_prk1_gb_holz.setCompoundDrawablesWithIntrinsicBounds(R.drawable.holz, 0, 0, 0);
                tv_prk1_gb_holz.setBackgroundColor(0xffdedad9);
            }

            // Steine setzen
            if (stein != 0) {
                // Hintergrund, Text und Anzahl Felder eintragen
                tv_prk1_gb_stein.setText(String.valueOf(stein));
                tv_prk1_gb_stein.setCompoundDrawablesWithIntrinsicBounds(R.drawable.stein1, 0, 0, 0);
                tv_prk1_gb_stein.setBackgroundColor(0xffdedad9);
            }

            // Werkzeug setzen
            if (werkzeug != 0) {
                // Hintergrund, Text und Anzahl Felder eintragen
                tv_prk1_gb_wkz.setText(String.valueOf(werkzeug));
                tv_prk1_gb_wkz.setCompoundDrawablesWithIntrinsicBounds(R.drawable.werkzeug, 0, 0, 0);
                tv_prk1_gb_wkz.setBackgroundColor(0xffdedad9);
            }

            // Glas setzen
            if (glas != 0) {
                // Hintergrund, Text und Anzahl Felder eintragen
                tv_prk1_gb_glas.setText(String.valueOf(glas));
                tv_prk1_gb_glas.setCompoundDrawablesWithIntrinsicBounds(R.drawable.glas, 0, 0, 0);
                tv_prk1_gb_glas.setBackgroundColor(0xffdedad9);
            }

            // OnClickListener für "OK" Button
            btn_prk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });

            // Dialog anzeigen
            dialog.show();
        }


        /*
        // Gebäudewerte zuweisen
        String produkt = "Produktname";

        // Toast mit Produktname
        final String finalProdukt = produkt;
        tv_prk1_gb1_produkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeShortToast(finalProdukt);
            }
        });

        // Vergrößertes Bild bei Klick auf kleines Bild
        final int finalGebaeudeArt = gebaeudeArt;
        iv_prk1_gb1_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Dialog erstellen und anzeigen
                final Dialog dialog2 = new Dialog(activity);
                dialog2.setContentView(R.layout.gb);
                dialog2.setTitle(gebaeudeBez);
                // ImageView erhalten
                ImageView iv_gb_img = (ImageView) dialog2.findViewById(R.id.iv_gb_img);
                // Button erhalten
                Button btn_gb = (Button) dialog2.findViewById(R.id.btn_gb);
                // Bild hinzufügen
                switch (finalGebaeudeArt){
                    case GB_HOLZFAELLER:
                        iv_gb_img.setImageResource(R.drawable.holzfaeller);
                        break;
                    case GB_STEINBRUCH:
                        iv_gb_img.setImageResource(R.drawable.steinbruch);
                        break;
                    case GB_EISENMINE:
                        iv_gb_img.setImageResource(R.drawable.eisenmine);
                        break;
                    case GB_QUARZBRUCH:
                        iv_gb_img.setImageResource(R.drawable.quarzbruch);
                        break;
                    case GB_FISCHER:
                        iv_gb_img.setImageResource(R.drawable.fischer);
                        break;
                    case GB_WEIZENHOF:
                        iv_gb_img.setImageResource(R.drawable.weizenfarm);
                        break;
                    case GB_RINDERFARM:
                        iv_gb_img.setImageResource(R.drawable.rinderfarm);
                        break;
                    case GB_SALZSTOCK:
                        iv_gb_img.setImageResource(R.drawable.salzstock);
                        break;
                    case GB_ZIEGENFARM:
                        iv_gb_img.setImageResource(R.drawable.ziegenfarm);
                        break;
                    case GB_APFELHOF:
                        iv_gb_img.setImageResource(R.drawable.apfelhof);
                        break;
                    case GB_KLOSTERGARTEN:
                        iv_gb_img.setImageResource(R.drawable.klostergarten);
                        break;
                    case GB_WEINGUT:
                        iv_gb_img.setImageResource(R.drawable.weingut);
                        break;
                    case GB_SCHAFFARM:
                        iv_gb_img.setImageResource(R.drawable.schaffarm);
                        break;
                    case GB_HANFHOF:
                        iv_gb_img.setImageResource(R.drawable.hanfplantage);
                        break;
                    case GB_SCHWEINEFARM:
                        iv_gb_img.setImageResource(R.drawable.schweinefarm);
                        break;
                    case GB_PELZTIERJAEGER:
                        iv_gb_img.setImageResource(R.drawable.pelztierjaeger);
                        break;
                    case GB_GOLDMINE:
                        iv_gb_img.setImageResource(R.drawable.goldmine);
                        break;
                    case GB_IMKER:
                        iv_gb_img.setImageResource(R.drawable.imker);
                        break;
                    case GB_KUPFERMINE:
                        iv_gb_img.setImageResource(R.drawable.kupfermine);
                        break;
                    case GB_SEIDE:
                        iv_gb_img.setImageResource(R.drawable.northburg);
                        break;
                    case GB_GEWUERZE:
                        iv_gb_img.setImageResource(R.drawable.northburg);
                        break;
                    case GB_INDIGO:
                        iv_gb_img.setImageResource(R.drawable.northburg);
                        break;
                }

                btn_gb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog2.dismiss();
                    }
                });

                dialog2.show();
            }
        });
        */
    }

    // Dialoge für Monumente erstellen
    public void erstelleMonumentDialog(String title, Monument[] monumente) {
        // Anzahl Monumente zueisen
        int anzahlMonumente = monumente.length;
        // Dialog erstellen
        final Dialog dialog = new Dialog(activity);
        // Auswahl des richtigen Layouts
        switch (anzahlMonumente) {
            case 3:
                dialog.setContentView(R.layout.mon3);
                break;
            case 4:
                dialog.setContentView(R.layout.mon4);
                break;
        }
        // Dialogtitel
        dialog.setTitle(title);
        // Iteration über jedes Monument
        for (int i = 0; i < anzahlMonumente; i++) {
            // Views zuweisen
            ImageView iv_monLayout3_mon1_img = (ImageView) dialog.findViewById(activity.getResources().getIdentifier("iv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_img", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_bez = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_bez", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_text = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_text", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ew = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ew", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_unt = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_unt", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_rds = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_rds", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_grsse = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_grsse", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_wissen = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_wissen", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_dauer = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_dauer", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_konstr = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_konstr", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ewplus = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ewplus", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware1 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware1", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware2 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware2", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware3 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware3", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware4 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware4", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware5 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware5", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware6 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware6", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware7 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware7", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware8 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware8", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware9 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware9", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware10 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware10", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware11 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware11", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware12 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware12", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware13 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware13", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_monLayout3_mon1_ware14 = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_monLayout" + anzahlMonumente + "_mon" + (i + 1) + "_ware14", "id", "com.iusemybrain.apps.myannoonline"));
            Button btn_monLayout = (Button) dialog.findViewById(activity.getResources().getIdentifier("btn_monLayout" + anzahlMonumente, "id", "com.iusemybrain.apps.myannoonline"));

            // Monument zuweisen
            Monument monument = monumente[i];

            // Werte zuweisen
            int artMonument = monument.getArtMonument();
            int artBevoelkerung = monument.getArtBevoelkerung();
            int anzahlBevoelkerung = monument.getAnzahlBevoelkerung();
            int unterhalt = monument.getUnterhalt();
            int radius = monument.getRadius();
            String groesse = monument.getGroesse();
            int wissen = monument.getWissen();
            String dauer = monument.getDauer();
            int konstruktionsteile = monument.getKonstruktionsteile();
            int einwohnerPlus = monument.getEinwohnerPlus();
            int[] artProdukte = monument.getArtProdukte();
            int[] mengeProdukte = monument.getMengeProdukte();
            String text = monument.getText();

            // Bild setzen
            setImage(MONUMENTE, artMonument, iv_monLayout3_mon1_img);

            // Bezeichnung setzen
            setBezeichnung(MONUMENTE, artMonument, tv_monLayout3_mon1_bez);

            // Einwohnerbild setzen
            setHabitant(artBevoelkerung, tv_monLayout3_mon1_ew);

            // Einwohneranzahl setzen
            tv_monLayout3_mon1_ew.setText(String.valueOf(anzahlBevoelkerung));

            // Unterhalt setzen
            tv_monLayout3_mon1_unt.setText(String.valueOf(unterhalt));

            // Radius setzen
            if (radius == 0)
                tv_monLayout3_mon1_rds.setText("-");
            else
                tv_monLayout3_mon1_rds.setText(String.valueOf(radius));

            // Größe setzen
            tv_monLayout3_mon1_grsse.setText(groesse);

            // Wissen setzen
            tv_monLayout3_mon1_wissen.setText(String.valueOf(wissen));

            // Dauer setzen
            tv_monLayout3_mon1_dauer.setText(dauer);

            // Konstruktionsteile setzen
            tv_monLayout3_mon1_konstr.setText(String.valueOf(konstruktionsteile));

            // EinwohnerPlus setzen
            tv_monLayout3_mon1_ewplus.setText(String.valueOf(einwohnerPlus));

            // Text setzen
            tv_monLayout3_mon1_text.setText(text);

            // Produktbilder und Produktmenge setzen
            for (int j = 0; j < artProdukte.length; j++) {
                switch (j + 1) {
                    case 1:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware1);
                        tv_monLayout3_mon1_ware1.setText(String.valueOf(mengeProdukte[j]));
                        break;
                    case 2:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware2);
                        tv_monLayout3_mon1_ware2.setText(String.valueOf(mengeProdukte[j]));
                        break;
                    case 3:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware3);
                        tv_monLayout3_mon1_ware3.setText(String.valueOf(mengeProdukte[j]));
                        break;
                    case 4:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware4);
                        tv_monLayout3_mon1_ware4.setText(String.valueOf(mengeProdukte[j]));
                        break;
                    case 5:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware5);
                        tv_monLayout3_mon1_ware5.setText(String.valueOf(mengeProdukte[j]));
                        break;
                    case 6:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware6);
                        tv_monLayout3_mon1_ware6.setText(String.valueOf(mengeProdukte[j]));
                        break;
                    case 7:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware7);
                        tv_monLayout3_mon1_ware7.setText(String.valueOf(mengeProdukte[j]));
                        break;
                    case 8:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware8);
                        tv_monLayout3_mon1_ware8.setText(String.valueOf(mengeProdukte[j]));
                        break;
                    case 9:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware9);
                        tv_monLayout3_mon1_ware9.setText(String.valueOf(mengeProdukte[j]));
                        break;
                    case 10:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware10);
                        tv_monLayout3_mon1_ware10.setText(String.valueOf(mengeProdukte[j]));
                        break;
                    case 11:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware11);
                        tv_monLayout3_mon1_ware11.setText(String.valueOf(mengeProdukte[j]));
                        break;
                    case 12:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware12);
                        tv_monLayout3_mon1_ware12.setText(String.valueOf(mengeProdukte[j]));
                        break;
                    case 13:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware13);
                        tv_monLayout3_mon1_ware13.setText(String.valueOf(mengeProdukte[j]));
                        break;
                    case 14:
                        setProduct(MONUMENTE, artProdukte[j], tv_monLayout3_mon1_ware14);
                        tv_monLayout3_mon1_ware14.setText(String.valueOf(mengeProdukte[j]));
                        break;
                }
            }

            // Button "OK" Listener
            btn_monLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });

            // Dialog anzeigen
            dialog.show();
        }
    }

    // Dialoge für Inseln erstellen
    public void erstelleInselDialog(String title, Insel[] inseln) {
        // Gebäudelänge zueisen
        int anzahlInseln = inseln.length;
        // Dialog erstellen
        final Dialog dialog = new Dialog(activity);
        // Auswahl des richtigen Layouts
        switch (anzahlInseln) {
            case 5:
                dialog.setContentView(R.layout.insel5);
                break;
            case 6:
                dialog.setContentView(R.layout.insel6);
                break;
            case 9:
                dialog.setContentView(R.layout.insel9);
                break;
            case 10:
                dialog.setContentView(R.layout.insel10);
                break;
        }
        // Dialogtitel
        dialog.setTitle(title);
        // Iteration über jedes Gebäude
        for (int i = 0; i < anzahlInseln; i++) {
            // Views zuweisen
            ImageView iv_inselLayout_insel_img = (ImageView) dialog.findViewById(activity.getResources().getIdentifier("iv_inselLayout" + anzahlInseln + "_insel" + (i + 1) + "_img", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_inselLayout_insel_rubine = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_inselLayout" + anzahlInseln + "_insel" + (i + 1) + "_rubine", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_inselLayout_insel_vork = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_inselLayout" + anzahlInseln + "_insel" + (i + 1) + "_vork", "id", "com.iusemybrain.apps.myannoonline"));
            ImageView iv_inselLayout_insel_vork = (ImageView) dialog.findViewById(activity.getResources().getIdentifier("iv_inselLayout" + anzahlInseln + "_insel" + (i + 1) + "_vork", "id", "com.iusemybrain.apps.myannoonline"));
            TextView tv_inselLayout_insel_fruchtb = (TextView) dialog.findViewById(activity.getResources().getIdentifier("tv_inselLayout" + anzahlInseln + "_insel" + (i + 1) + "_fruchtb", "id", "com.iusemybrain.apps.myannoonline"));
            ImageView iv_inselLayout_insel_fruchtb = (ImageView) dialog.findViewById(activity.getResources().getIdentifier("iv_inselLayout" + anzahlInseln + "_insel" + (i + 1) + "_fruchtb", "id", "com.iusemybrain.apps.myannoonline"));
            Button btn_inselLayout = (Button) dialog.findViewById(activity.getResources().getIdentifier("btn_inselLayout" + anzahlInseln, "id", "com.iusemybrain.apps.myannoonline"));

            // Neue Insel erstellen
            Insel insel = inseln[i];
            // Gebäudewerte zuweisen
            int inselArt = insel.getArtInsel();
            int vorkommenArt = insel.getArtVorkommen();
            int fruchtbarkeitenArt = insel.getArtFruchtbarkeit();
            int rubine = insel.getRubine();

            // Inselbild setzen
            setImage(INSELN, inselArt, iv_inselLayout_insel_img);

            // Vorkommen setzen
            setVorkommen(vorkommenArt, tv_inselLayout_insel_vork, iv_inselLayout_insel_vork);

            // Fruchtbarkeiten setzen
            setFruchtbarkeiten(fruchtbarkeitenArt, tv_inselLayout_insel_fruchtb, iv_inselLayout_insel_fruchtb);

            // Rubine setzen
            if (rubine > 0) {
                tv_inselLayout_insel_rubine.setText(String.valueOf(rubine));
                tv_inselLayout_insel_rubine.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.rubin, 0);
            } else {
                tv_inselLayout_insel_rubine.setVisibility(View.INVISIBLE);
            }

            // Button "OK" Listener
            btn_inselLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });

            // Dialog anzeigen
            dialog.show();
        }
    }

    // Einwohnerbild hinzugfügen
    private void setHabitant(int einwohnerArt, TextView textView) {
        switch (einwohnerArt) {
            case GB_BEV_BAUER:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.bauer, 0, 0, 0);
                break;
            case GB_BEV_HANDWERKER:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.buerger, 0, 0, 0);
                break;
            case GB_BEV_KAUFMANN:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.patrizier, 0, 0, 0);
                break;
            case GB_BEV_ADLIGER:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.adliger, 0, 0, 0);
                break;
            default:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.bauer, 0, 0, 0);
                break;
        }
    }

    // Gebäudebild hinzufügen
    private void setImage(int art, int gebaeudeArt, ImageView imageView) {
        if (art == GEBAEUDE) {
            switch (gebaeudeArt) {
                case GB_HOLZFAELLER:
                    imageView.setImageResource(R.drawable.holzfaeller);
                    break;
                case GB_STEINBRUCH:
                case GB_TIEFER_STEINMETZ:
                    imageView.setImageResource(R.drawable.steinbruch);
                    break;
                case GB_EISENMINE:
                case GB_TIEFE_EISENMINE:
                    imageView.setImageResource(R.drawable.eisenmine);
                    break;
                case GB_QUARZBRUCH:
                case GB_TIEFER_QUARZBRUCH:
                    imageView.setImageResource(R.drawable.quarzbruch);
                    break;
                case GB_FISCHER:
                    imageView.setImageResource(R.drawable.fischer);
                    break;
                case GB_WEIZENHOF:
                    imageView.setImageResource(R.drawable.weizenfarm);
                    break;
                case GB_RINDERFARM:
                    imageView.setImageResource(R.drawable.rinderfarm);
                    break;
                case GB_SALZSTOCK:
                case GB_TIEFER_SALZSTOCK:
                    imageView.setImageResource(R.drawable.salzstock);
                    break;
                case GB_ZIEGENFARM:
                    imageView.setImageResource(R.drawable.ziegenfarm);
                    break;
                case GB_APFELHOF:
                    imageView.setImageResource(R.drawable.apfelhof);
                    break;
                case GB_KLOSTERGARTEN:
                    imageView.setImageResource(R.drawable.klostergarten);
                    break;
                case GB_WEINGUT:
                    imageView.setImageResource(R.drawable.weingut);
                    break;
                case GB_SCHAFFARM:
                    imageView.setImageResource(R.drawable.schaffarm);
                    break;
                case GB_HANFHOF:
                    imageView.setImageResource(R.drawable.hanfplantage);
                    break;
                case GB_SCHWEINEFARM:
                    imageView.setImageResource(R.drawable.schweinefarm);
                    break;
                case GB_PELZTIERJAEGER:
                case GB_TIEFER_PELZTIERJAEGER:
                    imageView.setImageResource(R.drawable.pelztierjaeger);
                    break;
                case GB_GOLDMINE:
                case GB_TIEFE_GOLDMINE:
                    imageView.setImageResource(R.drawable.goldmine);
                    break;
                case GB_IMKER:
                    imageView.setImageResource(R.drawable.imker);
                    break;
                case GB_KUPFERMINE:
                case GB_TIEFE_KUPFERMINE:
                    imageView.setImageResource(R.drawable.kupfermine);
                    break;
                case GB_INDIGO:
                    imageView.setImageResource(R.drawable.northburg);
                    break;
                case GB_SEIDE:
                    imageView.setImageResource(R.drawable.northburg);
                    break;
                case GB_GEWUERZE:
                    imageView.setImageResource(R.drawable.northburg);
                    break;
                case GB_KOEHLERHUETTE:
                    imageView.setImageResource(R.drawable.koehlerhuette);
                    break;
                case GB_TIEFES_KOHLEBERGWERK:
                case GB_KOHLEBERGWERK:
                    imageView.setImageResource(R.drawable.kohlemine);
                    break;
                case GB_EISENSCHMELZE:
                    imageView.setImageResource(R.drawable.eisenschmelze);
                    break;
                case GB_WERKZEUGMACHER:
                    imageView.setImageResource(R.drawable.werkzeugmacher);
                    break;
                case GB_WALDGLASHUETTE:
                    imageView.setImageResource(R.drawable.waldglashuette);
                    break;
                case GB_GLASSCHMELZE:
                    imageView.setImageResource(R.drawable.glasschmelze);
                    break;
                case GB_MUEHLE:
                    imageView.setImageResource(R.drawable.muehle);
                    break;
                case GB_BACKSTUBE:
                    imageView.setImageResource(R.drawable.backstube);
                    break;
                case GB_SALINE:
                    imageView.setImageResource(R.drawable.saline);
                    break;
                case GB_METZGER:
                    imageView.setImageResource(R.drawable.metzger);
                    break;
                case GB_MOSTHOF:
                    imageView.setImageResource(R.drawable.mosthof);
                    break;
                case GB_KLOSTERBRAUEREI:
                    imageView.setImageResource(R.drawable.klosterbrauerei);
                    break;
                case GB_FASSKUEFEREI:
                    imageView.setImageResource(R.drawable.fasskueferei);
                    break;
                case GB_KELTEREI:
                    imageView.setImageResource(R.drawable.kelterei);
                    break;
                case GB_SPINNEREI:
                    imageView.setImageResource(R.drawable.spinnerei);
                    break;
                case GB_WEBSTUBE:
                    imageView.setImageResource(R.drawable.webstube);
                    break;
                case GB_GERBEREI:
                    imageView.setImageResource(R.drawable.gerberei);
                    break;
                case GB_KUERSCHNER:
                    imageView.setImageResource(R.drawable.kuerschnerei);
                    break;
                case GB_GOLDSCHMELZE:
                    imageView.setImageResource(R.drawable.goldschmelze);
                    break;
                case GB_SEIDENWEBEREI:
                    imageView.setImageResource(R.drawable.seidenweberei);
                    break;
                case GB_PAPIERMUEHLE:
                    imageView.setImageResource(R.drawable.papiermuehle);
                    break;
                case GB_DRUCKEREI:
                    imageView.setImageResource(R.drawable.druckerei);
                    break;
                case GB_LICHTZIEHER:
                    imageView.setImageResource(R.drawable.lichtzieher);
                    break;
                case GB_FEINSCHMIEDE:
                    imageView.setImageResource(R.drawable.feinschmiede);
                    break;
                case GB_KUPFERSCHMELZE:
                    imageView.setImageResource(R.drawable.kupferschmelze);
                    break;
                case GB_BRILLENMACHER:
                    imageView.setImageResource(R.drawable.brillenmacher);
                    break;
                case GB_VERB_WEIZENHOF:
                    imageView.setImageResource(R.drawable.verbesserter_weizenhof_gross);
                    break;
                case GB_VERWUN_MUEHLE:
                    imageView.setImageResource(R.drawable.verwunschene_muehle_gross);
                    break;
                case GB_VERWUN_PAPIERMUEHLE:
                    imageView.setImageResource(R.drawable.verwunschene_papiermuehle_gross);
                    break;
                case GB_VERB_BACKSTUBE:
                    imageView.setImageResource(R.drawable.verbesserte_baeckerei_gross);
                    break;
                case GB_GEWUERZBASAR:
                    imageView.setImageResource(R.drawable.gewuerzbasar_gross);
                    break;
                case GB_SCHEUNE:
                    imageView.setImageResource(R.drawable.scheune_gross);
                    break;
                case GB_SILO:
                    imageView.setImageResource(R.drawable.silo_gross);
                    break;
                case GB_MUSEUM:
                    imageView.setImageResource(R.drawable.museum_gross);
                    break;
                case GB_STADTARCHIV:
                    imageView.setImageResource(R.drawable.stadtarchiv_gross);
                    break;
                case GB_VERB_MARKTPLATZ:
                    imageView.setImageResource(R.drawable.verbesserter_marktplatz_gross);
                    break;
                case GB_KONTOR_STUFE1:
                    imageView.setImageResource(R.drawable.kontor1_gross);
                    break;
                case GB_KONTOR_STUFE2:
                    imageView.setImageResource(R.drawable.kontor2_gross);
                    break;
                case GB_KONTOR_STUFE3:
                    imageView.setImageResource(R.drawable.kontor3_gross);
                    break;
                case GB_KONTOR_STUFE4:
                    imageView.setImageResource(R.drawable.kontor4_gross);
                    break;
                case GB_MARKTHAUS_STUFE1:
                    imageView.setImageResource(R.drawable.markthaus1_gross);
                    break;
                case GB_MARKTHAUS_STUFE2:
                    imageView.setImageResource(R.drawable.markthaus2_gross);
                    break;
                case GB_MARKTHAUS_STUFE3:
                    imageView.setImageResource(R.drawable.markthaus3_gross);
                    break;
                case GB_MARKTHAUS_STUFE4:
                    imageView.setImageResource(R.drawable.markthaus4_gross);
                    break;
                case GB_LEUCHTTURM_STUFE1:
                    imageView.setImageResource(R.drawable.leuchtturm1_gross);
                    break;
                case GB_LEUCHTTURM_STUFE2:
                    imageView.setImageResource(R.drawable.leuchtturm2_gross);
                    break;
                case GB_LEUCHTTURM_STUFE3:
                    imageView.setImageResource(R.drawable.leuchtturm3_gross);
                    break;
                case GB_LEUCHTTURM_STUFE4:
                    imageView.setImageResource(R.drawable.leuchtturm4_gross);
                    break;
                case GB_LAGERHAUS_STUFE1:
                    imageView.setImageResource(R.drawable.lagerhaus1_gross);
                    break;
                case GB_LAGERHAUS_STUFE2:
                    imageView.setImageResource(R.drawable.lagerhaus2_gross);
                    break;
                case GB_LAGERHAUS_STUFE3:
                    imageView.setImageResource(R.drawable.lagerhaus3_gross);
                    break;
                case GB_LAGERHAUS_STUFE4:
                    imageView.setImageResource(R.drawable.lagerhaus4_gross);
                    break;
                case GB_LAGERHAUS_STUFE5:
                    imageView.setImageResource(R.drawable.lagerhaus5_gross);
                    break;
                case GB_SCHATZKAMMER_STUFE1:
                    imageView.setImageResource(R.drawable.schatzkammer1_gross);
                    break;
                case GB_SCHATZKAMMER_STUFE2:
                    imageView.setImageResource(R.drawable.schatzkammer2_gross);
                    break;
                case GB_SCHATZKAMMER_STUFE3:
                    imageView.setImageResource(R.drawable.schatzkammer3_gross);
                    break;
                case GB_PIER_STUFE1:
                    imageView.setImageResource(R.drawable.pier1_gross);
                    break;
                case GB_PIER_STUFE2:
                    imageView.setImageResource(R.drawable.pier2_gross);
                    break;
                case GB_PIER_STUFE3:
                    imageView.setImageResource(R.drawable.pier3_gross);
                    break;
                case GB_BAUERNHAUS:
                    imageView.setImageResource(R.drawable.bauernhaus_gross);
                    break;
                case GB_HANDWERKERKATE:
                    imageView.setImageResource(R.drawable.handwerkerkate_gross);
                    break;
                case GB_KAUFMANNSHAUS:
                    imageView.setImageResource(R.drawable.kaufmannshaus_gross);
                    break;
                case GB_ADLIGENHAUS:
                    imageView.setImageResource(R.drawable.adligenhaus_gross);
                    break;
                case GB_FELDWEG:
                    imageView.setImageResource(R.drawable.feldweg_gross);
                    break;
                case GB_STEINSTRASSE:
                    imageView.setImageResource(R.drawable.steinstrasse_gross);
                    break;
                case GB_MARKTPLATZ_STUFE1:
                    imageView.setImageResource(R.drawable.marktplatz1_gross);
                    break;
                case GB_MARKTPLATZ_STUFE2:
                    imageView.setImageResource(R.drawable.marktplatz2_gross);
                    break;
                case GB_MARKTPLATZ_STUFE3:
                    imageView.setImageResource(R.drawable.marktplatz3_gross);
                    break;
                case GB_MARKTPLATZ_STUFE4:
                    imageView.setImageResource(R.drawable.marktplatz4_gross);
                    break;
                case GB_WERFT:
                    imageView.setImageResource(R.drawable.werft_gross);
                    break;
                case GB_SCHIFFSBAUER:
                    imageView.setImageResource(R.drawable.schiffsbauer_gross);
                    break;
                case GB_PROVIANTMAGAZIN:
                    imageView.setImageResource(R.drawable.proviantmagazin_gross);
                    break;
                case GB_DOCK:
                    imageView.setImageResource(R.drawable.dock_gross);
                    break;
                case GB_GILDENHALLE:
                    imageView.setImageResource(R.drawable.gildenhalle_gross);
                    break;
                case GB_HANDELSSPEICHER:
                    imageView.setImageResource(R.drawable.handelsspeicher_gross);
                    break;
                case GB_BRUNNEN:
                    imageView.setImageResource(R.drawable.brunnen_gross);
                    break;
                case GB_ZIMMERMANN:
                    imageView.setImageResource(R.drawable.zimmermann_gross);
                    break;
                case GB_KAPELLE:
                    imageView.setImageResource(R.drawable.kapelle_gross);
                    break;
                case GB_BARBIER:
                    imageView.setImageResource(R.drawable.barbier_gross);
                    break;
                case GB_TAVERNE:
                    imageView.setImageResource(R.drawable.taverne_gross);
                    break;
                case GB_FEUERWACHE:
                    imageView.setImageResource(R.drawable.feuerwache_gross);
                    break;
                case GB_TURNIERPLATZ:
                    imageView.setImageResource(R.drawable.turnierplatz_gross);
                    break;
                case GB_SCHULDTURM:
                    imageView.setImageResource(R.drawable.schuldturm_gross);
                    break;
                case GB_KIRCHE:
                    imageView.setImageResource(R.drawable.kirche_gross);
                    break;
                case GB_MEDIKUS:
                    imageView.setImageResource(R.drawable.medikus_gross);
                    break;
                default:
                    imageView.setImageResource(R.drawable.anno_online_logo);
                    break;
            }
        } else if (art == MONUMENTE) {
            switch (gebaeudeArt) {
                case MON_BIBLIOTHEK_GESAMT:
                    imageView.setImageResource(R.drawable.bibliothek);
                    break;
                case MON_BIBLIOTHEK_PHASE1:
                    imageView.setImageResource(R.drawable.bibliothek_phase1);
                    break;
                case MON_BIBLIOTHEK_PHASE2:
                    imageView.setImageResource(R.drawable.bibliothek_phase2);
                    break;
                case MON_KAISERDOM_GESAMT:
                    imageView.setImageResource(R.drawable.kaiserdom);
                    break;
                case MON_KAISERDOM_PHASE1:
                    imageView.setImageResource(R.drawable.kaiserdom_phase1);
                    break;
                case MON_KAISERDOM_PHASE2:
                    imageView.setImageResource(R.drawable.kaiserdom_phase2);
                    break;
                case MON_KAISERDOM_PHASE3:
                    imageView.setImageResource(R.drawable.kaiserdom_phase3);
                    break;
                case MON_AMPHITHEATER_GESAMT:
                    imageView.setImageResource(R.drawable.amphitheater);
                    break;
                case MON_AMPHITHEATER_PHASE1:
                    imageView.setImageResource(R.drawable.amphitheater_phase1);
                    break;
                case MON_AMPHITHEATER_PHASE2:
                    imageView.setImageResource(R.drawable.amphitheater_phase2);
                    break;
                case MON_AMPHITHEATER_PHASE3:
                    imageView.setImageResource(R.drawable.amphitheater_phase3);
                    break;
                case MON_FESTUNG_GESAMT:
                    imageView.setImageResource(R.drawable.festung);
                    break;
                case MON_FESTUNG_PHASE1:
                    imageView.setImageResource(R.drawable.festung_phase1);
                    break;
                case MON_FESTUNG_PHASE2:
                    imageView.setImageResource(R.drawable.festung_phase2);
                    break;
                case MON_FESTUNG_PHASE3:
                    imageView.setImageResource(R.drawable.festung_phase3);
                    break;
                case MON_APFELGARTEN_GESAMT:
                    imageView.setImageResource(R.drawable.apfelgarten);
                    break;
                case MON_APFELGARTEN_PHASE1:
                    imageView.setImageResource(R.drawable.gaerten_phase1);
                    break;
                case MON_APFELGARTEN_PHASE2:
                    imageView.setImageResource(R.drawable.gaerten_phase2);
                    break;
                case MON_WEIZENGARTEN_GESAMT:
                    imageView.setImageResource(R.drawable.weizengarten);
                    break;
                case MON_WEIZENGARTEN_PHASE1:
                    imageView.setImageResource(R.drawable.gaerten_phase1);
                    break;
                case MON_WEIZENGARTEN_PHASE2:
                    imageView.setImageResource(R.drawable.gaerten_phase2);
                    break;
                case MON_HANFGARTEN_GESAMT:
                    imageView.setImageResource(R.drawable.hanfgarten);
                    break;
                case MON_HANFGARTEN_PHASE1:
                    imageView.setImageResource(R.drawable.gaerten_phase1);
                    break;
                case MON_HANFGARTEN_PHASE2:
                    imageView.setImageResource(R.drawable.gaerten_phase2);
                    break;
                case MON_KRAEUTERGARTEN_GESAMT:
                    imageView.setImageResource(R.drawable.kraeutergarten);
                    break;
                case MON_KRAEUTERGARTEN_PHASE1:
                    imageView.setImageResource(R.drawable.gaerten_phase1);
                    break;
                case MON_KRAEUTERGARTEN_PHASE2:
                    imageView.setImageResource(R.drawable.gaerten_phase2);
                    break;
                case MON_TRAUBENGARTEN_GESAMT:
                    imageView.setImageResource(R.drawable.traubengarten);
                    break;
                case MON_TRAUBENGARTEN_PHASE1:
                    imageView.setImageResource(R.drawable.gaerten_phase1);
                    break;
                case MON_TRAUBENGARTEN_PHASE2:
                    imageView.setImageResource(R.drawable.gaerten_phase2);
                    break;
                case MON_BIENENWACHSGARTEN_GESAMT:
                    imageView.setImageResource(R.drawable.bienenwachsgarten);
                    break;
                case MON_BIENENWACHSGARTEN_PHASE1:
                    imageView.setImageResource(R.drawable.gaerten_phase1);
                    break;
                case MON_BIENENWACHSGARTEN_PHASE2:
                    imageView.setImageResource(R.drawable.gaerten_phase2);
                    break;
                default:
                    imageView.setImageResource(R.drawable.rinderfarm);
                    break;
            }
        } else if (art == INSELN) {
            switch (gebaeudeArt) {
                case INS_KLEIN1:
                    imageView.setImageResource(R.drawable.insel_klein1);
                    break;
                case INS_KLEIN2:
                    imageView.setImageResource(R.drawable.insel_klein2);
                    break;
                case INS_KLEIN3:
                    imageView.setImageResource(R.drawable.insel_klein3);
                    break;
                case INS_KLEIN4:
                    imageView.setImageResource(R.drawable.insel_klein4);
                    break;
                case INS_KLEIN5:
                    imageView.setImageResource(R.drawable.insel_klein5);
                    break;
                case INS_MITTEL1:
                    imageView.setImageResource(R.drawable.insel_mittel1);
                    break;
                case INS_MITTEL2:
                    imageView.setImageResource(R.drawable.insel_mittel2);
                    break;
                case INS_MITTEL3:
                    imageView.setImageResource(R.drawable.insel_mittel3);
                    break;
                case INS_MITTEL4:
                    imageView.setImageResource(R.drawable.insel_mittel4);
                    break;
                case INS_MITTEL5:
                case INS_MITTEL6:
                case INS_MITTEL7:
                case INS_MITTEL8:
                case INS_MITTEL9:
                case INS_MITTEL10:
                    imageView.setImageResource(R.drawable.insel_mittel5);
                    break;
                case INS_GROSS1:
                    imageView.setImageResource(R.drawable.insel_gross1);
                    break;
                case INS_GROSS2:
                    imageView.setImageResource(R.drawable.insel_gross2);
                    break;
                case INS_GROSS3:
                case INS_GROSS4:
                case INS_GROSS5:
                    imageView.setImageResource(R.drawable.insel_gross3);
                    break;
                case INS_GROSS6:
                    imageView.setImageResource(R.drawable.insel_gross4);
                    break;
                case INS_RIESIG1:
                case INS_RIESIG2:
                case INS_RIESIG3:
                case INS_RIESIG4:
                case INS_RIESIG5:
                case INS_RIESIG6:
                case INS_RIESIG7:
                case INS_RIESIG8:
                case INS_RIESIG9:
                    imageView.setImageResource(R.drawable.insel_riesig1);
                    break;
                default:
                    imageView.setImageResource(R.drawable.anno_online_logo);
                    break;
            }
        }
    }

    // Produktbild hinzufügen
    private void setProduct(int art, int gebaeudeArt, TextView textView) {
        if (art == GEBAEUDE) {
            switch (gebaeudeArt) {
                case GB_HOLZFAELLER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.holz, 0, 0);
                    break;
                case GB_STEINBRUCH:
                case GB_TIEFER_STEINMETZ:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.stein1, 0, 0);
                    break;
                case GB_EISENMINE:
                case GB_TIEFE_EISENMINE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.eisenerz, 0, 0);
                    break;
                case GB_QUARZBRUCH:
                case GB_TIEFER_QUARZBRUCH:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.quarz, 0, 0);
                    break;
                case GB_FISCHER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.fisch, 0, 0);
                    break;
                case GB_WEIZENHOF:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.weizen, 0, 0);
                    break;
                case GB_RINDERFARM:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.vieh, 0, 0);
                    break;
                case GB_SALZSTOCK:
                case GB_TIEFER_SALZSTOCK:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.sole, 0, 0);
                    break;
                case GB_ZIEGENFARM:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.milch, 0, 0);
                    break;
                case GB_APFELHOF:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.aepfel, 0, 0);
                    break;
                case GB_KLOSTERGARTEN:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.kraeuter, 0, 0);
                    break;
                case GB_WEINGUT:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.trauben, 0, 0);
                    break;
                case GB_SCHAFFARM:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.wolle, 0, 0);
                    break;
                case GB_HANFHOF:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.hanf, 0, 0);
                    break;
                case GB_SCHWEINEFARM:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.tierhaeute, 0, 0);
                    break;
                case GB_PELZTIERJAEGER:
                case GB_TIEFER_PELZTIERJAEGER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.pelze, 0, 0);
                    break;
                case GB_GOLDMINE:
                case GB_TIEFE_GOLDMINE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.golderz, 0, 0);
                    break;
                case GB_IMKER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.bienenwachs, 0, 0);
                    break;
                case GB_KUPFERMINE:
                case GB_TIEFE_KUPFERMINE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.kupfererz, 0, 0);
                    break;
                case GB_INDIGO:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.indigo, 0, 0);
                    break;
                case GB_SEIDE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.seide, 0, 0);
                    break;
                case GB_GEWUERZE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.gewuerze, 0, 0);
                    break;
                case GB_KOEHLERHUETTE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.holz_kohle, 0, 0);
                    break;
                case GB_TIEFES_KOHLEBERGWERK:
                case GB_KOHLEBERGWERK:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.kohle, 0, 0);
                    break;
                case GB_EISENSCHMELZE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.kohle_eisenerz_eisen, 0, 0);
                    break;
                case GB_WERKZEUGMACHER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.kohle_eisen_werkzeug, 0, 0);
                    break;
                case GB_WALDGLASHUETTE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.holz_pottasche, 0, 0);
                    break;
                case GB_GLASSCHMELZE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.pottasche_quarz_glas, 0, 0);
                    break;
                case GB_MUEHLE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.weizen_mehl, 0, 0);
                    break;
                case GB_BACKSTUBE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.mehl_brot, 0, 0);
                    break;
                case GB_SALINE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.kohle_sole_salz, 0, 0);
                    break;
                case GB_METZGER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.salz_vieh_fleisch, 0, 0);
                    break;
                case GB_MOSTHOF:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.aepfel_most, 0, 0);
                    break;
                case GB_KLOSTERBRAUEREI:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.weizen_kraeuter_bier, 0, 0);
                    break;
                case GB_FASSKUEFEREI:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.holz_eisen_faesser, 0, 0);
                    break;
                case GB_KELTEREI:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.trauben_faesser_wein, 0, 0);
                    break;
                case GB_SPINNEREI:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.wolle_wollgewaender, 0, 0);
                    break;
                case GB_WEBSTUBE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.hanf_leinengewaender, 0, 0);
                    break;
                case GB_GERBEREI:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.salz_tierhaeute_lederwamser, 0, 0);
                    break;
                case GB_KUERSCHNER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.pelze_pelzmaentel, 0, 0);
                    break;
                case GB_GOLDSCHMELZE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.kohle_golderz_gold, 0, 0);
                    break;
                case GB_SEIDENWEBEREI:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.seide_gold_brokatgewaender, 0, 0);
                    break;
                case GB_PAPIERMUEHLE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.holz_papier, 0, 0);
                    break;
                case GB_DRUCKEREI:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.papier_indigo_buecher, 0, 0);
                    break;
                case GB_LICHTZIEHER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.hanf_wachs_kerzen, 0, 0);
                    break;
                case GB_FEINSCHMIEDE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.kerzen_messing_kerzenhalter, 0, 0);
                    break;
                case GB_KUPFERSCHMELZE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.kohle_kupfererz_messing, 0, 0);
                    break;
                case GB_BRILLENMACHER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.quarz_messing_brillen, 0, 0);
                    break;
                case GB_VERB_WEIZENHOF:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.weizen, 0, 0);
                    break;
                case GB_VERWUN_MUEHLE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.weizen_mehl, 0, 0);
                    break;
                case GB_VERWUN_PAPIERMUEHLE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.holz_papier, 0, 0);
                    break;
                case GB_VERB_BACKSTUBE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.mehl_brot, 0, 0);
                    break;
                case GB_GEWUERZBASAR:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.gewuerze, 0, 0);
                    break;
                default:
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    break;
            }
        } else if (art == MONUMENTE) {
            // Hintergrund setzen
            textView.setBackgroundColor(0xffdedad9);
            switch (gebaeudeArt) {
                case PRODUKT_HOLZ:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.holz, 0, 0, 0);
                    break;
                case PRODUKT_STEIN:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.stein1, 0, 0, 0);
                    break;
                case PRODUKT_EISENERZ:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.eisenerz, 0, 0, 0);
                    break;
                case PRODUKT_KOHLE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.kohle, 0, 0, 0);
                    break;
                case PRODUKT_EISEN:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.eisen, 0, 0, 0);
                    break;
                case PRODUKT_WERKZEUG:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.werkzeug, 0, 0, 0);
                    break;
                case PRODUKT_POTTASCHE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.pottasche, 0, 0, 0);
                    break;
                case PRODUKT_QUARZ:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.quarz, 0, 0, 0);
                    break;
                case PRODUKT_GLAS:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.glas, 0, 0, 0);
                    break;
                case PRODUKT_FISCH:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fisch, 0, 0, 0);
                    break;
                case PRODUKT_WEIZEN:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.weizen, 0, 0, 0);
                    break;
                case PRODUKT_MEHL:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mehl, 0, 0, 0);
                    break;
                case PRODUKT_BROT:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.brot, 0, 0, 0);
                    break;
                case PRODUKT_VIEH:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.vieh, 0, 0, 0);
                    break;
                case PRODUKT_FLEISCH:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fleisch, 0, 0, 0);
                    break;
                case PRODUKT_GEWUERZE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.gewuerze, 0, 0, 0);
                    break;
                case PRODUKT_MILCH:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.milch, 0, 0, 0);
                    break;
                case PRODUKT_AEPFEL:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.aepfel, 0, 0, 0);
                    break;
                case PRODUKT_MOST:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.most, 0, 0, 0);
                    break;
                case PRODUKT_KRAEUTER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.kraeuter, 0, 0, 0);
                    break;
                case PRODUKT_BIER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.bier, 0, 0, 0);
                    break;
                case PRODUKT_WEINTRAUBEN:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.trauben, 0, 0, 0);
                    break;
                case PRODUKT_FAESSER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.faesser, 0, 0, 0);
                    break;
                case PRODUKT_WEIN:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.wein, 0, 0, 0);
                    break;
                case PRODUKT_WOLLE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.wolle, 0, 0, 0);
                    break;
                case PRODUKT_WOLLGEWAENDER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.wollgewaender, 0, 0, 0);
                    break;
                case PRODUKT_HANF:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.hanf, 0, 0, 0);
                    break;
                case PRODUKT_LEINENGEWAENDER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.leinengewaender, 0, 0, 0);
                    break;
                case PRODUKT_TIERHAEUTE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.tierhaeute, 0, 0, 0);
                    break;
                case PRODUKT_SOLE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.sole, 0, 0, 0);
                    break;
                case PRODUKT_SALZ:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.salz, 0, 0, 0);
                    break;
                case PRODUKT_LEDERWAEMSER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lederwamser, 0, 0, 0);
                    break;
                case PRODUKT_PELZE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.pelze, 0, 0, 0);
                    break;
                case PRODUKT_PELZMAENTEL:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.pelzmaentel, 0, 0, 0);
                    break;
                case PRODUKT_GOLDERZ:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.golderz, 0, 0, 0);
                    break;
                case PRODUKT_GOLD:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.gold, 0, 0, 0);
                    break;
                case PRODUKT_BROKATGEWAENDER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.brokatgewaender, 0, 0, 0);
                    break;
                case PRODUKT_SEIDE:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.seide, 0, 0, 0);
                    break;
                case PRODUKT_PAPIER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.papier, 0, 0, 0);
                    break;
                case PRODUKT_BUECHER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.buecher, 0, 0, 0);
                    break;
                case PRODUKT_KUPFERERZ:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.kupfererz, 0, 0, 0);
                    break;
                case PRODUKT_MESSING:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.messing, 0, 0, 0);
                    break;
                case PRODUKT_BIENENWACHS:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.bienenwachs, 0, 0, 0);
                    break;
                case PRODUKT_KERZEN:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.kerzen, 0, 0, 0);
                    break;
                case PRODUKT_KERZENLEUCHTER:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.kerzenhalter, 0, 0, 0);
                    break;
                case PRODUKT_BRILLEN:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.brillen, 0, 0, 0);
                    break;
                case PRODUKT_INDIGO:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.indigo, 0, 0, 0);
                    break;
                default:
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.rubin, 0, 0, 0);
                    break;
            }
        }
    }

    // Feldicon hinzufügen
    private void setField(int gebaeudeArt, int anzahlFelder, TextView textView) {
        textView.setBackgroundColor(0xffdedad9);
        String anzFelder = String.valueOf(anzahlFelder);
        // Schatzkammer
        if (gebaeudeArt == GB_SCHATZKAMMER_STUFE1 || gebaeudeArt == GB_SCHATZKAMMER_STUFE2 || gebaeudeArt == GB_SCHATZKAMMER_STUFE3){
            if (anzFelder.length() == 6){
                anzFelder = anzFelder.substring(0, 3) + "k";
            }
            else if (anzFelder.length() == 7) {
                if (anzFelder.substring(1, 2).equals("0")){
                    anzFelder = anzFelder.substring(0, 1) + "M";
                }
                else{
                    anzFelder = anzFelder.substring(0, 1) + "." + anzFelder.substring(1, 2) + "M";
                }
            }
            else if (anzFelder.length() == 8) {
                    anzFelder = anzFelder.substring(0, 2) + "M";
            }
        }
        textView.setText(anzFelder);
        switch (gebaeudeArt) {
            // Produktionsgebäude (Rohstoffzeichen)
            case GB_HOLZFAELLER:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.baum, 0, 0, 0);
                break;
            case GB_STEINBRUCH:
            case GB_TIEFER_STEINMETZ:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.steinvorkommen, 0, 0, 0);
                break;
            case GB_KOHLEBERGWERK:
            case GB_TIEFES_KOHLEBERGWERK:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.kohlevorkommen, 0, 0, 0);
                break;
            case GB_EISENMINE:
            case GB_TIEFE_EISENMINE:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.eisenerzvorkommen, 0, 0, 0);
                break;
            case GB_QUARZBRUCH:
            case GB_TIEFER_QUARZBRUCH:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.quarzvorkommen, 0, 0, 0);
                break;
            case GB_FISCHER:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fischvorkommen, 0, 0, 0);
                break;
            case GB_WEIZENHOF:
            case GB_VERB_WEIZENHOF:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.felder_weizenhof, 0, 0, 0);
                break;
            case GB_RINDERFARM:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.felder_rinderfarm, 0, 0, 0);
                break;
            case GB_ZIEGENFARM:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.felder_ziegenfarm, 0, 0, 0);
                break;
            case GB_APFELHOF:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.felder_apfelhof, 0, 0, 0);
                break;
            case GB_KLOSTERGARTEN:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.felder_klostergarten, 0, 0, 0);
                break;
            case GB_WEINGUT:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.felder_weingut, 0, 0, 0);
                break;
            case GB_SCHAFFARM:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.felder_schaffarm, 0, 0, 0);
                break;
            case GB_HANFHOF:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.felder_hanfplantage, 0, 0, 0);
                break;
            case GB_SCHWEINEFARM:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.felder_schweinefarm, 0, 0, 0);
                break;
            case GB_SALZSTOCK:
            case GB_TIEFER_SALZSTOCK:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.salzvorkommen, 0, 0, 0);
                break;
            case GB_PELZTIERJAEGER:
            case GB_TIEFER_PELZTIERJAEGER:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.hoehle, 0, 0, 0);
                break;
            case GB_GOLDMINE:
            case GB_TIEFE_GOLDMINE:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.goldvorkommen, 0, 0, 0);
                break;
            case GB_KUPFERMINE:
            case GB_TIEFE_KUPFERMINE:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.kupfervorkommen, 0, 0, 0);
                break;
            case GB_IMKER:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.felder_imker, 0, 0, 0);
                break;
            case GB_KUERSCHNER:
            case GB_PAPIERMUEHLE:
            case GB_VERWUN_PAPIERMUEHLE:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fluss, 0, 0, 0);
                break;
            // Shopgebäude
            case GB_MUSEUM:
            case GB_STADTARCHIV:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.einwohner_plus, 0, 0, 0);
                break;
            // Infrastrukturgebäude
            case GB_KONTOR_STUFE1:
            case GB_KONTOR_STUFE2:
            case GB_KONTOR_STUFE3:
            case GB_KONTOR_STUFE4:
            case GB_MARKTHAUS_STUFE1:
            case GB_MARKTHAUS_STUFE2:
            case GB_MARKTHAUS_STUFE3:
            case GB_MARKTHAUS_STUFE4:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.marktkarren_plus, 0, 0, 0);
                break;
            case GB_LEUCHTTURM_STUFE1:
            case GB_LEUCHTTURM_STUFE2:
            case GB_LEUCHTTURM_STUFE3:
            case GB_LEUCHTTURM_STUFE4:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.schiff_gross, 0, 0, 0);
                break;
            case GB_LAGERHAUS_STUFE1:
            case GB_LAGERHAUS_STUFE2:
            case GB_LAGERHAUS_STUFE3:
            case GB_LAGERHAUS_STUFE4:
            case GB_LAGERHAUS_STUFE5:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lagerraum, 0, 0, 0);
                break;
            case GB_SCHATZKAMMER_STUFE1:
            case GB_SCHATZKAMMER_STUFE2:
            case GB_SCHATZKAMMER_STUFE3:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.muenzsack, 0, 0, 0);
                break;
            case GB_PIER_STUFE1:
            case GB_PIER_STUFE2:
            case GB_PIER_STUFE3:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.pier_plus, 0, 0, 0);
                break;
            // Attraktionen
            case GB_BRUNNEN:
            case GB_ZIMMERMANN:
            case GB_KAPELLE:
            case GB_BARBIER:
            case GB_TAVERNE:
            case GB_FEUERWACHE:
            case GB_TURNIERPLATZ:
            case GB_SCHULDTURM:
            case GB_KIRCHE:
            case GB_MEDIKUS:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.einwohner_plus, 0, 0, 0);
                break;
            default:
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.felder_apfelhof, 0, 0, 0);
        }
    }

    // Bezeichnung setzen
    protected void setBezeichnung(int art, int artMonument, TextView textView) {
        if (art == GEBAEUDE) {
            switch (artMonument) {
                case GB_HOLZFAELLER:
                    textView.setText(activity.getString(R.string.str_gb_holzfaeller));
                    break;
                case GB_STEINBRUCH:
                    textView.setText(activity.getString(R.string.str_gb_steinbruch));
                    break;
                case GB_EISENMINE:
                    textView.setText(activity.getString(R.string.str_gb_eisenmine));
                    break;
                case GB_KOEHLERHUETTE:
                    textView.setText(activity.getString(R.string.str_gb_koehlerhuette));
                    break;
                case GB_KOHLEBERGWERK:
                    textView.setText(activity.getString(R.string.str_gb_kohlebergwerk));
                    break;
                case GB_EISENSCHMELZE:
                    textView.setText(activity.getString(R.string.str_gb_eisenschmelze));
                    break;
                case GB_WERKZEUGMACHER:
                    textView.setText(activity.getString(R.string.str_gb_werkzeugmacher));
                    break;
                case GB_WALDGLASHUETTE:
                    textView.setText(activity.getString(R.string.str_gb_waldglashuette));
                    break;
                case GB_QUARZBRUCH:
                    textView.setText(activity.getString(R.string.str_gb_quarzbruch));
                    break;
                case GB_GLASSCHMELZE:
                    textView.setText(activity.getString(R.string.str_gb_glasschmelze));
                    break;
                case GB_FISCHER:
                    textView.setText(activity.getString(R.string.str_gb_fischer));
                    break;
                case GB_WEIZENHOF:
                    textView.setText(activity.getString(R.string.str_gb_weizenfarm));
                    break;
                case GB_MUEHLE:
                    textView.setText(activity.getString(R.string.str_gb_muehle));
                    break;
                case GB_BACKSTUBE:
                    textView.setText(activity.getString(R.string.str_gb_backstube));
                    break;
                case GB_RINDERFARM:
                    textView.setText(activity.getString(R.string.str_gb_rinderfarm));
                    break;
                case GB_SALZSTOCK:
                    textView.setText(activity.getString(R.string.str_gb_salzstock));
                    break;
                case GB_SALINE:
                    textView.setText(activity.getString(R.string.str_gb_saline));
                    break;
                case GB_METZGER:
                    textView.setText(activity.getString(R.string.str_gb_metzger));
                    break;
                case GB_ZIEGENFARM:
                    textView.setText(activity.getString(R.string.str_gb_ziegenfarm));
                    break;
                case GB_APFELHOF:
                    textView.setText(activity.getString(R.string.str_gb_apfelhof));
                    break;
                case GB_MOSTHOF:
                    textView.setText(activity.getString(R.string.str_gb_mosthof));
                    break;
                case GB_KLOSTERGARTEN:
                    textView.setText(activity.getString(R.string.str_gb_klostergarten));
                    break;
                case GB_KLOSTERBRAUEREI:
                    textView.setText(activity.getString(R.string.str_gb_klosterbrauerei));
                    break;
                case GB_WEINGUT:
                    textView.setText(activity.getString(R.string.str_gb_weingut));
                    break;
                case GB_FASSKUEFEREI:
                    textView.setText(activity.getString(R.string.str_gb_fasskueferei));
                    break;
                case GB_KELTEREI:
                    textView.setText(activity.getString(R.string.str_gb_kelterei));
                    break;
                case GB_SCHAFFARM:
                    textView.setText(activity.getString(R.string.str_gb_schaffarm));
                    break;
                case GB_SPINNEREI:
                    textView.setText(activity.getString(R.string.str_gb_spinnerei));
                    break;
                case GB_HANFHOF:
                    textView.setText(activity.getString(R.string.str_gb_hanfplantage));
                    break;
                case GB_WEBSTUBE:
                    textView.setText(activity.getString(R.string.str_gb_webstube));
                    break;
                case GB_SCHWEINEFARM:
                    textView.setText(activity.getString(R.string.str_gb_schweinefarm));
                    break;
                case GB_GERBEREI:
                    textView.setText(activity.getString(R.string.str_gb_gerberei));
                    break;
                case GB_PELZTIERJAEGER:
                    textView.setText(activity.getString(R.string.str_gb_pelztierjaeger));
                    break;
                case GB_KUERSCHNER:
                    textView.setText(activity.getString(R.string.str_gb_kuerschner));
                    break;
                case GB_GOLDMINE:
                    textView.setText(activity.getString(R.string.str_gb_goldmine));
                    break;
                case GB_GOLDSCHMELZE:
                    textView.setText(activity.getString(R.string.str_gb_goldschmelze));
                    break;
                case GB_SEIDE:
                    textView.setText(activity.getString(R.string.str_pr_seide));
                    break;
                case GB_SEIDENWEBEREI:
                    textView.setText(activity.getString(R.string.str_gb_seidenweberei));
                    break;
                case GB_PAPIERMUEHLE:
                    textView.setText(activity.getString(R.string.str_gb_papiermuehle));
                    break;
                case GB_INDIGO:
                    textView.setText(activity.getString(R.string.str_pr_indigo));
                    break;
                case GB_DRUCKEREI:
                    textView.setText(activity.getString(R.string.str_gb_druckerei));
                    break;
                case GB_IMKER:
                    textView.setText(activity.getString(R.string.str_gb_imker));
                    break;
                case GB_LICHTZIEHER:
                    textView.setText(activity.getString(R.string.str_gb_lichtzieher));
                    break;
                case GB_FEINSCHMIEDE:
                    textView.setText(activity.getString(R.string.str_gb_feinschmiede));
                    break;
                case GB_KUPFERMINE:
                    textView.setText(activity.getString(R.string.str_gb_kupfermine));
                    break;
                case GB_KUPFERSCHMELZE:
                    textView.setText(activity.getString(R.string.str_gb_kupferschmelze));
                    break;
                case GB_BRILLENMACHER:
                    textView.setText(activity.getString(R.string.str_gb_brillenmacher));
                    break;
                case GB_TIEFER_STEINMETZ:
                    textView.setText(activity.getString(R.string.str_gb_tiefer_steinmetz));
                    break;
                case GB_TIEFE_EISENMINE:
                    textView.setText(activity.getString(R.string.str_gb_tiefe_eisenmine));
                    break;
                case GB_TIEFER_QUARZBRUCH:
                    textView.setText(activity.getString(R.string.str_gb_tiefer_quarzbruch));
                    break;
                case GB_TIEFES_KOHLEBERGWERK:
                    textView.setText(activity.getString(R.string.str_gb_tiefes_kohlebergwerk));
                    break;
                case GB_TIEFER_SALZSTOCK:
                    textView.setText(activity.getString(R.string.str_gb_tiefer_salzstock));
                    break;
                case GB_TIEFER_PELZTIERJAEGER:
                    textView.setText(activity.getString(R.string.str_gb_tiefer_pelztierjäger));
                    break;
                case GB_TIEFE_GOLDMINE:
                    textView.setText(activity.getString(R.string.str_gb_tiefe_goldmine));
                    break;
                case GB_TIEFE_KUPFERMINE:
                    textView.setText(activity.getString(R.string.str_gb_tiefe_kupfermine));
                    break;
                case GB_VERB_WEIZENHOF:
                    textView.setText(activity.getString(R.string.str_gb_verbesserter_weizenhof));
                    break;
                case GB_VERWUN_MUEHLE:
                    textView.setText(activity.getString(R.string.str_gb_verwunschene_muehle));
                    break;
                case GB_VERB_BACKSTUBE:
                    textView.setText(activity.getString(R.string.str_gb_verbesserte_baeckerei));
                    break;
                case GB_VERWUN_PAPIERMUEHLE:
                    textView.setText(activity.getString(R.string.str_gb_verwunschene_papiermuehle));
                    break;
                case GB_GEWUERZBASAR:
                    textView.setText(activity.getString(R.string.str_gb_gewuerzbasar));
                    break;
                case GB_SCHEUNE:
                    textView.setText(activity.getString(R.string.str_gb_scheune));
                    break;
                case GB_SILO:
                    textView.setText(activity.getString(R.string.str_gb_silo));
                    break;
                case GB_MUSEUM:
                    textView.setText(activity.getString(R.string.str_gb_museum));
                    break;
                case GB_STADTARCHIV:
                    textView.setText(activity.getString(R.string.str_gb_stadtarchiv));
                    break;
                case GB_VERB_MARKTPLATZ:
                    textView.setText(activity.getString(R.string.str_gb_verbesserter_marktplatz));
                    break;
                case GB_BRUNNEN:
                    textView.setText(activity.getString(R.string.str_gb_brunnen));
                    break;
                case GB_ZIMMERMANN:
                    textView.setText(activity.getString(R.string.str_gb_zimmermann));
                    break;
                case GB_KAPELLE:
                    textView.setText(activity.getString(R.string.str_gb_kapelle));
                    break;
                case GB_BARBIER:
                    textView.setText(activity.getString(R.string.str_gb_barbier));
                    break;
                case GB_TAVERNE:
                    textView.setText(activity.getString(R.string.str_gb_taverne));
                    break;
                case GB_FEUERWACHE:
                    textView.setText(activity.getString(R.string.str_gb_feuerwache));
                    break;
                case GB_TURNIERPLATZ:
                    textView.setText(activity.getString(R.string.str_gb_turnierplatz));
                    break;
                case GB_SCHULDTURM:
                    textView.setText(activity.getString(R.string.str_gb_schuldturm));
                    break;
                case GB_KIRCHE:
                    textView.setText(activity.getString(R.string.str_gb_kirche));
                    break;
                case GB_MEDIKUS:
                    textView.setText(activity.getString(R.string.str_gb_medikus));
                    break;
                case GB_KONTOR_STUFE1:
                case GB_KONTOR_STUFE2:
                case GB_KONTOR_STUFE3:
                case GB_KONTOR_STUFE4:
                    textView.setText(activity.getString(R.string.str_gb_kontor));
                    break;
                case GB_LAGERHAUS_STUFE1:
                case GB_LAGERHAUS_STUFE2:
                case GB_LAGERHAUS_STUFE3:
                case GB_LAGERHAUS_STUFE4:
                case GB_LAGERHAUS_STUFE5:
                    textView.setText(activity.getString(R.string.str_gb_lagerhaus));
                    break;
                case GB_LEUCHTTURM_STUFE1:
                case GB_LEUCHTTURM_STUFE2:
                case GB_LEUCHTTURM_STUFE3:
                case GB_LEUCHTTURM_STUFE4:
                    textView.setText(activity.getString(R.string.str_gb_leuchtturm));
                    break;
                case GB_SCHATZKAMMER_STUFE1:
                case GB_SCHATZKAMMER_STUFE2:
                case GB_SCHATZKAMMER_STUFE3:
                    textView.setText(activity.getString(R.string.str_gb_schatzkammer));
                    break;
                case GB_BAUERNHAUS:
                    textView.setText(activity.getString(R.string.str_gb_bauernhaus));
                    break;
                case GB_HANDWERKERKATE:
                    textView.setText(activity.getString(R.string.str_gb_handwerkerkate));
                    break;
                case GB_KAUFMANNSHAUS:
                    textView.setText(activity.getString(R.string.str_gb_kaufmannshaus));
                    break;
                case GB_ADLIGENHAUS:
                    textView.setText(activity.getString(R.string.str_gb_adligenhaus));
                    break;
                case GB_FELDWEG:
                    textView.setText(activity.getString(R.string.str_gb_feldweg));
                    break;
                case GB_STEINSTRASSE:
                    textView.setText(activity.getString(R.string.str_gb_steinstrasse));
                    break;
                case GB_MARKTPLATZ_STUFE1:
                    textView.setText(activity.getString(R.string.str_gb_marktplatz_klein));
                    break;
                case GB_MARKTPLATZ_STUFE2:
                    textView.setText(activity.getString(R.string.str_gb_marktplatz_mittel));
                    break;
                case GB_MARKTPLATZ_STUFE3:
                    textView.setText(activity.getString(R.string.str_gb_marktplatz_gross));
                    break;
                case GB_MARKTPLATZ_STUFE4:
                    textView.setText(activity.getString(R.string.str_gb_marktplatz_riesig));
                    break;
                case GB_MARKTHAUS_STUFE1:
                case GB_MARKTHAUS_STUFE2:
                case GB_MARKTHAUS_STUFE3:
                case GB_MARKTHAUS_STUFE4:
                    textView.setText(activity.getString(R.string.str_gb_markthaus));
                    break;
                case GB_SCHIFFSBAUER:
                    textView.setText(activity.getString(R.string.str_gb_schiffsbauer));
                    break;
                case GB_WERFT:
                    textView.setText(activity.getString(R.string.str_gb_werft));
                    break;
                case GB_PROVIANTMAGAZIN:
                    textView.setText(activity.getString(R.string.str_gb_proviantmagazin));
                    break;
                case GB_DOCK:
                    textView.setText(activity.getString(R.string.str_gb_dock));
                    break;
                case GB_GILDENHALLE:
                    textView.setText(activity.getString(R.string.str_gb_gildenhalle));
                    break;
                case GB_PIER_STUFE1:
                case GB_PIER_STUFE2:
                case GB_PIER_STUFE3:
                    textView.setText(activity.getString(R.string.str_gb_pier));
                    break;
                case GB_HANDELSSPEICHER:
                    textView.setText(activity.getString(R.string.str_gb_handelsspeicher));
                    break;
                default:
                    textView.setText("DummyValue");
                    break;
            }
        } else if (art == MONUMENTE) {
            switch (artMonument) {
                case MON_BIBLIOTHEK_GESAMT:
                    textView.setText(activity.getString(R.string.str_mon_bibliothek) + " " + activity.getString(R.string.str_mon_gesamt));
                    break;
                case MON_BIBLIOTHEK_PHASE1:
                    textView.setText(activity.getString(R.string.str_mon_bibliothek) + " " + activity.getString(R.string.str_mon_phase1));
                    break;
                case MON_BIBLIOTHEK_PHASE2:
                    textView.setText(activity.getString(R.string.str_mon_bibliothek) + " " + activity.getString(R.string.str_mon_phase2));
                    break;
                case MON_KAISERDOM_GESAMT:
                    textView.setText(activity.getString(R.string.str_mon_kaiserdom) + " " + activity.getString(R.string.str_mon_gesamt));
                    break;
                case MON_KAISERDOM_PHASE1:
                    textView.setText(activity.getString(R.string.str_mon_kaiserdom) + " " + activity.getString(R.string.str_mon_phase1));
                    break;
                case MON_KAISERDOM_PHASE2:
                    textView.setText(activity.getString(R.string.str_mon_kaiserdom) + " " + activity.getString(R.string.str_mon_phase2));
                    break;
                case MON_KAISERDOM_PHASE3:
                    textView.setText(activity.getString(R.string.str_mon_kaiserdom) + " " + activity.getString(R.string.str_mon_phase3));
                    break;
                case MON_AMPHITHEATER_GESAMT:
                    textView.setText(activity.getString(R.string.str_mon_amphitheater) + " " + activity.getString(R.string.str_mon_gesamt));
                    break;
                case MON_AMPHITHEATER_PHASE1:
                    textView.setText(activity.getString(R.string.str_mon_amphitheater) + " " + activity.getString(R.string.str_mon_phase1));
                    break;
                case MON_AMPHITHEATER_PHASE2:
                    textView.setText(activity.getString(R.string.str_mon_amphitheater) + " " + activity.getString(R.string.str_mon_phase2));
                    break;
                case MON_AMPHITHEATER_PHASE3:
                    textView.setText(activity.getString(R.string.str_mon_amphitheater) + " " + activity.getString(R.string.str_mon_phase3));
                    break;
                case MON_FESTUNG_GESAMT:
                    textView.setText(activity.getString(R.string.str_mon_festung) + " " + activity.getString(R.string.str_mon_gesamt));
                    break;
                case MON_FESTUNG_PHASE1:
                    textView.setText(activity.getString(R.string.str_mon_festung) + " " + activity.getString(R.string.str_mon_phase1));
                    break;
                case MON_FESTUNG_PHASE2:
                    textView.setText(activity.getString(R.string.str_mon_festung) + " " + activity.getString(R.string.str_mon_phase2));
                    break;
                case MON_FESTUNG_PHASE3:
                    textView.setText(activity.getString(R.string.str_mon_festung) + " " + activity.getString(R.string.str_mon_phase3));
                    break;
                case MON_APFELGARTEN_GESAMT:
                    textView.setText(activity.getString(R.string.str_mon_apfelgarten) + " " + activity.getString(R.string.str_mon_gesamt));
                    break;
                case MON_APFELGARTEN_PHASE1:
                    textView.setText(activity.getString(R.string.str_mon_apfelgarten) + " " + activity.getString(R.string.str_mon_phase1));
                    break;
                case MON_APFELGARTEN_PHASE2:
                    textView.setText(activity.getString(R.string.str_mon_apfelgarten) + " " + activity.getString(R.string.str_mon_phase2));
                    break;
                case MON_WEIZENGARTEN_GESAMT:
                    textView.setText(activity.getString(R.string.str_mon_weizengarten) + " " + activity.getString(R.string.str_mon_gesamt));
                    break;
                case MON_WEIZENGARTEN_PHASE1:
                    textView.setText(activity.getString(R.string.str_mon_weizengarten) + " " + activity.getString(R.string.str_mon_phase1));
                    break;
                case MON_WEIZENGARTEN_PHASE2:
                    textView.setText(activity.getString(R.string.str_mon_weizengarten) + " " + activity.getString(R.string.str_mon_phase2));
                    break;
                case MON_HANFGARTEN_GESAMT:
                    textView.setText(activity.getString(R.string.str_mon_hanfgarten) + " " + activity.getString(R.string.str_mon_gesamt));
                    break;
                case MON_HANFGARTEN_PHASE1:
                    textView.setText(activity.getString(R.string.str_mon_hanfgarten) + " " + activity.getString(R.string.str_mon_phase1));
                    break;
                case MON_HANFGARTEN_PHASE2:
                    textView.setText(activity.getString(R.string.str_mon_hanfgarten) + " " + activity.getString(R.string.str_mon_phase2));
                    break;
                case MON_KRAEUTERGARTEN_GESAMT:
                    textView.setText(activity.getString(R.string.str_mon_kraeutergarten) + " " + activity.getString(R.string.str_mon_gesamt));
                    break;
                case MON_KRAEUTERGARTEN_PHASE1:
                    textView.setText(activity.getString(R.string.str_mon_kraeutergarten) + " " + activity.getString(R.string.str_mon_phase1));
                    break;
                case MON_KRAEUTERGARTEN_PHASE2:
                    textView.setText(activity.getString(R.string.str_mon_kraeutergarten) + " " + activity.getString(R.string.str_mon_phase2));
                    break;
                case MON_TRAUBENGARTEN_GESAMT:
                    textView.setText(activity.getString(R.string.str_mon_traubengarten) + " " + activity.getString(R.string.str_mon_gesamt));
                    break;
                case MON_TRAUBENGARTEN_PHASE1:
                    textView.setText(activity.getString(R.string.str_mon_traubengarten) + " " + activity.getString(R.string.str_mon_phase1));
                    break;
                case MON_TRAUBENGARTEN_PHASE2:
                    textView.setText(activity.getString(R.string.str_mon_traubengarten) + " " + activity.getString(R.string.str_mon_phase2));
                    break;
                case MON_BIENENWACHSGARTEN_GESAMT:
                    textView.setText(activity.getString(R.string.str_mon_bienenwachsgarten) + " " + activity.getString(R.string.str_mon_gesamt));
                    break;
                case MON_BIENENWACHSGARTEN_PHASE1:
                    textView.setText(activity.getString(R.string.str_mon_bienenwachsgarten) + " " + activity.getString(R.string.str_mon_phase1));
                    break;
                case MON_BIENENWACHSGARTEN_PHASE2:
                    textView.setText(activity.getString(R.string.str_mon_bienenwachsgarten) + " " + activity.getString(R.string.str_mon_phase2));
                    break;
                default:
                    textView.setText("DummyValue");
                    break;
            }
        }
    }

    // Vorkommen setzen
    private void setVorkommen(int vorkommenArt, TextView textView, ImageView imageView) {
        switch (vorkommenArt) {
            case VORK_ALLE:
                textView.setText("Mögliche Vorkommen");
                imageView.setImageResource(R.drawable.alle_vorkommen);
                break;
            case VORK_GROSS:
                textView.setText("Mögliche Vorkommen");
                imageView.setImageResource(R.drawable.vork_gross);
                break;
            case VORK_3ST_2E:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_3st_2e);
                break;
            case VORK_2ST_2E_2P_2KO:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_2st_2e_2p_2ko);
                break;
            case VORK_3ST_2E_2F:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_3st_2e_2f);
                break;
            case VORK_2ST_2E_2SO_3KU_1G:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_2st_2e_2so_3ku_1g);
                break;
            case VORK_2ST_2E_2P_1KU_1G:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_2st_2e_2p_1ku_1g);
                break;
            case VORK_3ST_3E_3SO_3KO_4F:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_3st_3e_3so_3ko_4f);
                break;
            case VORK_3ST_3E_2P_3KO_3Q_2KU:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_3st_3e_2p_3ko_3q_2ku);
                break;
            case VORK_4ST_3E_3SO_3Q_4F_2G:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_4st_3e_3so_3q_4f_2g);
                break;
            case VORK_2E_3SO_4P_3KO_8F_4Q_3KU_3G:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_2e_3so_4p_3ko_8f_4q_3ku_3g);
                break;
            case VORK_1E_4SO_3P_2KO_4F_4Q_3G:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_1e_4so_3p_2ko_4f_4q_3g);
                break;
            case VORK_2E_2SO_4P_3KO_4F_2Q_5KU:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_2e_2so_4p_3ko_4f_2q_5ku);
                break;
            case VORK_2E_2SO_4KO_4F_3Q_3KU_4G:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_2e_2so_4ko_4f_3q_3ku_4g);
                break;
            case VORK_4E_2SO_4P_4KO_4F_1KU_3G:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_4e_2so_4p_4ko_4f_1ku_3g);
                break;
            case VORK_1E_4P_2KO_4F_6Q_3KU_2G:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_1e_4p_2ko_4f_6q_3ku_2g);
                break;
            case VORK_4SO_4E_2KO_4F_4Q_1KU_3G:
                textView.setText("Vorkommen");
                imageView.setImageResource(R.drawable.vork_1e_4p_2ko_4f_6q_3ku_2g);
                break;
            default:
                textView.setText("Vorkommen");
                break;
        }
    }

    // Fruchtbarkeiten setzen
    private void setFruchtbarkeiten(int fruchtbarkeitenArt, TextView textView, ImageView imageView) {
        switch (fruchtbarkeitenArt) {
            case FRUCHTB_ALLE:
                textView.setText("Mögliche Fruchtbarkeiten");
                imageView.setImageResource(R.drawable.alle_fruchtbarkeiten);
                break;
            case FRUCHTB_AEPFEL:
                textView.setText("Fruchtbarkeit");
                imageView.setImageResource(R.drawable.aepfel);
                break;
            case FRUCHTB_HANF:
                textView.setText("Fruchtbarkeit");
                imageView.setImageResource(R.drawable.hanf);
                break;
            case FRUCHTB_WEIZEN:
                textView.setText("Fruchtbarkeit");
                imageView.setImageResource(R.drawable.weizen);
                break;
            case FRUCHTB_KRAEUTER:
                textView.setText("Fruchtbarkeit");
                imageView.setImageResource(R.drawable.kraeuter);
                break;
            case FRUCHTB_WEINTRAUBEN:
                textView.setText("Fruchtbarkeit");
                imageView.setImageResource(R.drawable.trauben);
                break;
            case FRUCHTB_BIENENWACHS:
                textView.setText("Fruchtbarkeit");
                imageView.setImageResource(R.drawable.bienenwachs);
                break;
            case FRUCHTB_AEPFEL_HANF:
                textView.setText("Fruchtbarkeiten");
                imageView.setImageResource(R.drawable.fruchtb_aepfel_hanf);
                break;
            case FRUCHTB_AEPFEL_BIENENWACHS:
                textView.setText("Fruchtbarkeiten");
                imageView.setImageResource(R.drawable.fruchtb_aepfel_bienenwachs);
                break;
            case FRUCHTB_HANF_WEIN:
                textView.setText("Fruchtbarkeiten");
                imageView.setImageResource(R.drawable.fruchtb_hanf_wein);
                break;
            case FRUCHTB_BIENENWACHS_WEIN:
                textView.setText("Fruchtbarkeiten");
                imageView.setImageResource(R.drawable.fruchtb_bienenwachs_wein);
                break;
            case FRUCHTB_WEIZEN_HANF:
                textView.setText("Fruchtbarkeiten");
                imageView.setImageResource(R.drawable.fruchtb_hanf_weizen);
                break;
            case FRUCHTB_HANF_BIENENWACHS:
                textView.setText("Fruchtbarkeiten");
                imageView.setImageResource(R.drawable.fruchtb_hanf_bienenwachs);
                break;
            default:
                textView.setText("Fruchtbarkeiten");
                break;
        }
    }
}
