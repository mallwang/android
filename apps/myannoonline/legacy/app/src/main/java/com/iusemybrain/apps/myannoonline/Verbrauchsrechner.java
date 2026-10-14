package com.iusemybrain.apps.myannoonline;

/**
 * Created by Markus on 09.04.2015.
 */
class Verbrauchsrechner {
    // Dauer des Ticks in Sekunden
    private double dauer_tick = 30;

    // Einwohner
    private int anzahl_bauern = 0;
    private int anzahl_handwerker = 0;
    private int anzahl_kaufleute = 0;
    private int anzahl_adlige = 0;
    private int gesamtbevoelkerung = 0;
    private int bevoelkerung_stufe2 = 0;
    private int bevoelkerung_stufe3 = 0;
    private int bevoelkerung_stufe4 = 0;

    // Verbrauchswerte
    // Nahrung
    private final double verbr_fisch_bauern = 0.00042;
    private final double verbr_fisch_handwerker = 0.00030;
    private final double verbr_fisch_kaufleute = 0.00025;
    private final double verbr_fisch_adlige = 0.00022;
    private final double verbr_brot_handwerker = 0.00025;
    private final double verbr_brot_kaufleute = 0.00020;
    private final double verbr_brot_adlige = 0.00018;
    double verbr_gewuerze_kaufleute = 0.00012;
    double verbr_gewuerze_adlige = 0.00011;
    private final double verbr_fleisch_adlige = 0.00017;

    // Getränke
    private final double verbr_milch_bauern = 0.00050;
    private final double verbr_milch_handwerker = 0.00036;
    private final double verbr_milch_kaufleute = 0.00030;
    private final double verbr_milch_adlige = 0.00026;
    private final double verbr_most_handwerker = 0.00022;
    private final double verbr_most_kaufleute = 0.00018;
    private final double verbr_most_adlige = 0.00016;
    private final double verbr_bier_kaufleute = 0.00012;
    private final double verbr_bier_adlige = 0.00011;
    private final double verbr_wein_adlige = 0.00009;

    // Kleidung
    private final double verbr_wollgewaender_bauern = 0.00027;
    private final double verbr_wollgewaender_handwerker = 0.00020;
    private final double verbr_wollgewaender_kaufleute = 0.00016;
    private final double verbr_wollgewaender_adlige = 0.00014;
    private final double verbr_leinengewaender_handwerker = 0.00015;
    private final double verbr_leinengewaender_kaufleute = 0.00012;
    private final double verbr_leinengewaender_adlige = 0.00010;
    private final double verbr_lederwaemser_kaufleute = 0.00004;
    private final double verbr_lederwaemser_adlige = 0.00003;
    private final double verbr_pelzmaentel_kaufleute = 0.00004;
    private final double verbr_pelzmaentel_adlige = 0.00003;
    private final double verbr_brokatgewaender_adlige = 0.00002;

    // Besitz
    private final double verbr_buecher_kaufleute = 0.00012;
    private final double verbr_buecher_adlige = 0.00011;
    private final double verbr_kerzenleuchter_adlige = 0.00008;
    private final double verbr_brillen_adlige = 0.00003;

    // Verbrauchswerte für vorgelagerte Produktion
    private double verbr_per_tick_fisch = 0.00000;
    private double verbr_per_tick_brot = 0.00000;
    private double verbr_per_tick_gewuerze = 0.00000;
    private double verbr_per_tick_fleisch = 0.00000;
    private double verbr_per_tick_milch = 0.00000;
    private double verbr_per_tick_most = 0.00000;
    private double verbr_per_tick_bier = 0.00000;
    private double verbr_per_tick_wein = 0.00000;
    private double verbr_per_tick_wollgewaender = 0.00000;
    private double verbr_per_tick_leinengewander = 0.00000;
    private double verbr_per_tick_lederwaemser = 0.00000;
    private double verbr_per_tick_pelzmaentel = 0.00000;
    private double verbr_per_tick_brokatgewaender = 0.00000;
    private double verbr_per_tick_buecher = 0.00000;
    private double verbr_per_tick_kerzenleuchter = 0.00000;
    private double verbr_per_tick_brillen = 0.00000;

    // Gezahlte Steuern
    // Nahrung
    double steu_fisch_bauern = 0.00104;
    double steu_fisch_handwerker = 0.00104;
    double steu_fisch_kaufleute = 0.00104;
    double steu_fisch_adlige = 0.00104;
    double steu_brot_handwerker = 0.00438;
    double steu_brot_kaufleute = 0.00438;
    double steu_brot_adlige = 0.00438;
    double steu_gewuerze_kaufleute = 0.00500;
    double steu_gewuerze_adlige = 0.00500;
    double steu_fleisch_adlige = 0.02480;

    // Getränke
    double steu_milch_bauern = 0.00118;
    double steu_milch_handwerker = 0.00118;
    double steu_milch_kaufleute = 0.00118;
    double steu_milch_adlige = 0.00118;
    double steu_most_handwerker = 0.00419;
    double steu_most_kaufleute = 0.00419;
    double steu_most_adlige = 0.00419;
    double steu_bier_kaufleute = 0.01250;
    double steu_bier_adlige = 0.01250;
    double steu_wein_adlige = 0.06650;

    // Kleidung
    double steu_wollgewaender_bauern = 0.00234;
    double steu_wollgewaender_handwerker = 0.00234;
    double steu_wollgewaender_kaufleute = 0.00234;
    double steu_wollgewaender_adlige = 0.00234;
    double steu_leinengewaender_handwerker = 0.01000;
    double steu_leinengewaender_kaufleute = 0.01000;
    double steu_leinengewaender_adlige = 0.01000;
    double steu_lederwaemser_kaufleute = 0.01750;
    double steu_lederwaemser_adlige = 0.01750;
    double steu_pelzmaentel_kaufleute = 0.02000;
    double steu_pelzmaentel_adlige = 0.02000;
    double steu_brokatgewaender_adlige = 0.18800;

    // Besitz
    double steu_buecher_kaufleute = 0.01000;
    double steu_buecher_adlige = 0.01000;
    double steu_kerzenleuchter_adlige = 0.06200;
    double steu_brillen_adlige = 0.06000;

    // Produktionszeiten
    // Baumaterialien
    private double prod_time_holz = 105;
    private double prod_time_stein = 180;
    private double prod_time_eisenerz = 210;
    private double prod_time_kohle = 210;
    private double prod_time_kohlemine = 105;
    private double prod_time_eisen = 315;
    private double prod_time_werkzeug = 420;
    private double prod_time_pottasche = 840;
    private double prod_time_quarz = 1260;
    private double prod_time_glas = 1260;

    // Nahrung
    private double prod_time_fisch = 110;
    private double prod_time_weizen = 440;
    private double prod_time_mehl = 220;
    private double prod_time_brot = 220;
    private double prod_time_vieh = 840;
    private double prod_time_fleisch = 630;

    // Getränke
    private double prod_time_milch = 235;
    private double prod_time_aepfel = 380;
    private double prod_time_most = 190;
    private double prod_time_kraeuter = 660;
    private double prod_time_bier = 330;
    private double prod_time_trauben = 2205;
    private double prod_time_faesser = 945;
    private double prod_time_wein = 1260;

    // Kleidung
    private double prod_time_woole = 200;
    private double prod_time_wollgewaender = 200;
    private double prod_time_hanf = 630;
    private double prod_time_leinengewaender = 210;
    private double prod_time_tierhaeute = 840;
    private double prod_time_sole = 140;
    private double prod_time_salz = 210;
    private double prod_time_lederwaemser = 420;
    private double prod_time_pelze = 600;
    private double prod_time_pelzmaentel = 600;
    private double prod_time_golderz = 1260;
    private double prod_time_gold = 1050;
    private double prod_time_brokatgewaender = 3150;

    // Besitz
    private double prod_time_papier = 210;
    private double prod_time_buecher = 630;
    private double prod_time_bienenwachs = 840;
    private double prod_time_kerzen = 1260;
    private double prod_time_kerzenleuchter = 840;
    private double prod_time_kupfererz = 280;
    private double prod_time_messing = 420;
    private double prod_time_brillen = 1260;

    // Auslastungen
    private String auslastung_fisch = "";
    private String auslastung_brot = "";
    private String auslastung_fleisch = "";
    private String auslastung_milch = "";
    private String auslastung_most = "";
    private String auslastung_bier = "";
    private String auslastung_wein = "";
    private String auslastung_wollgewaender = "";
    private String auslastung_leinengewaender = "";
    private String auslastung_lederwaemser = "";
    private String auslastung_pelzmaentel = "";
    private String auslastung_brokatgewaender = "";
    private String auslastung_buecher = "";
    private String auslastung_kerzenleuchter = "";
    private String auslastung_brillen = "";

    // Produktionsketten
    private int prk_fisch = 0;
    private int prk_brot = 0;
    private int prk_fleisch = 0;
    private int prk_milch = 0;
    private int prk_most = 0;
    private int prk_bier = 0;
    private int prk_wein = 0;
    private int prk_wollgewaender = 0;
    private int prk_leinengewaender = 0;
    private int prk_lederwaemser = 0;
    private int prk_pelzmaentel = 0;
    private int prk_brokatgewaender = 0;
    private int prk_buecher = 0;
    private int prk_kerzenleuchter = 0;
    private int prk_brillen = 0;

    // Konstruktor
    public Verbrauchsrechner(int anzahl_bauern, int anzahl_handwerker, int anzahl_kaufleute, int anzahl_adlige){
        this.anzahl_bauern = anzahl_bauern;
        this.anzahl_handwerker = anzahl_handwerker;
        this.anzahl_kaufleute = anzahl_kaufleute;
        this.anzahl_adlige = anzahl_adlige;
        this.gesamtbevoelkerung = anzahl_bauern + anzahl_handwerker + anzahl_kaufleute + anzahl_adlige;
        this.bevoelkerung_stufe2 = anzahl_handwerker + anzahl_kaufleute + anzahl_adlige;
        this.bevoelkerung_stufe3 = anzahl_kaufleute + anzahl_adlige;
        this.bevoelkerung_stufe4 = anzahl_adlige;
        // Berechnungsfunktion
        berechne();
    }

    private void berechne(){
        this.prk_fisch = berechneFisch();
        this.prk_brot = berechneBrot();
        this.prk_fleisch = berechneFleisch();
        this.prk_milch = berechneMilch();
        this.prk_most = berechneMost();
        this.prk_bier = berechneBier();
        this.prk_wein = berechneWein();
        this.prk_wollgewaender = berechneWollgewaender();
        this.prk_leinengewaender = berechneLeinengewaender();
        this.prk_lederwaemser = berechneLederwaemser();
        this.prk_pelzmaentel = berechnePelzmaentel();
        this.prk_brokatgewaender = berechneBrokatgewaender();
        this.prk_buecher = berechneBuecher();
        this.prk_kerzenleuchter = berechneKerzenleuchter();
        this.prk_brillen = berechneBrillen();
    }

    // Fisch
    private int berechneFisch(){
        int anzahl_fischer = 0;
        if (gesamtbevoelkerung > 0) {
            double prod_per_tick = dauer_tick / prod_time_fisch;
            double verbr_per_tick_bauern = anzahl_bauern * verbr_fisch_bauern;
            double verbr_per_tick_handwerker = anzahl_handwerker * verbr_fisch_handwerker;
            double verbr_per_tick_kaufleute = anzahl_kaufleute * verbr_fisch_kaufleute;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_fisch_adlige;
            double verbr_summe = verbr_per_tick_bauern + verbr_per_tick_handwerker + verbr_per_tick_kaufleute + verbr_per_tick_adlige;
            verbr_per_tick_fisch = verbr_summe;
            anzahl_fischer = (int) Math.ceil(verbr_summe / prod_per_tick);
            double auslastung_gesamt = (verbr_summe/prod_per_tick)*100;
            auslastung_fisch = berechneAuslastung(auslastung_gesamt, anzahl_fischer);
        }
        return anzahl_fischer;
    }

    // Brot
    private int berechneBrot() {
        int anzahl_baeckereien = 0;
        if (anzahl_handwerker >= 100 || bevoelkerung_stufe3 > 0) {
            double prod_per_tick = dauer_tick / prod_time_brot;
            double verbr_per_tick_handwerker = anzahl_handwerker * verbr_brot_handwerker;
            double verbr_per_tick_kaufleute = anzahl_kaufleute * verbr_brot_kaufleute;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_brot_adlige;
            double verbr_summe = verbr_per_tick_handwerker + verbr_per_tick_kaufleute + verbr_per_tick_adlige;
            verbr_per_tick_brot = verbr_summe;
            anzahl_baeckereien = (int) Math.ceil(verbr_summe / prod_per_tick);
            double auslastung_gesamt = (verbr_summe/prod_per_tick)*100;
            auslastung_brot = berechneAuslastung(auslastung_gesamt, anzahl_baeckereien);
        }
        return anzahl_baeckereien;
    }

    // Fleisch
    private int berechneFleisch() {
        int anzahl_metzger = 0;
        if (bevoelkerung_stufe4 > 0) {
            double prod_per_tick = dauer_tick / prod_time_fleisch;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_fleisch_adlige;
            verbr_per_tick_fleisch = verbr_per_tick_adlige;
            anzahl_metzger = (int) Math.ceil(verbr_per_tick_adlige / prod_per_tick);
            double auslastung_gesamt = (verbr_per_tick_adlige/prod_per_tick)*100;
            auslastung_fleisch = berechneAuslastung(auslastung_gesamt, anzahl_metzger);
        }
        return anzahl_metzger;
    }

    // Milch
    private int berechneMilch() {
        int anzahl_ziegenfarmen = 0;
        if (anzahl_bauern >= 25 || bevoelkerung_stufe2 > 0) {
            double prod_per_tick = dauer_tick / prod_time_milch;
            double verbr_per_tick_bauern = anzahl_bauern * verbr_milch_bauern;
            double verbr_per_tick_handwerker = anzahl_handwerker * verbr_milch_handwerker;
            double verbr_per_tick_kaufleute = anzahl_kaufleute * verbr_milch_kaufleute;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_milch_adlige;
            double verbr_summe = verbr_per_tick_bauern + verbr_per_tick_handwerker + verbr_per_tick_kaufleute + verbr_per_tick_adlige;
            verbr_per_tick_milch = verbr_summe;
            anzahl_ziegenfarmen = (int) Math.ceil(verbr_summe / prod_per_tick);
            double auslastung_gesamt = (verbr_summe/prod_per_tick)*100;
            auslastung_milch = berechneAuslastung(auslastung_gesamt, anzahl_ziegenfarmen);
        }
        return anzahl_ziegenfarmen;
    }

    // Most
    private int berechneMost() {
        int anzahl_mosthoefe = 0;
        if (anzahl_handwerker >= 500 || bevoelkerung_stufe3 > 0) {
            double prod_per_tick = dauer_tick / prod_time_most;
            double verbr_per_tick_handwerker = anzahl_handwerker * verbr_most_handwerker;
            double verbr_per_tick_kaufleute = anzahl_kaufleute * verbr_most_kaufleute;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_most_adlige;
            double verbr_summe = verbr_per_tick_handwerker + verbr_per_tick_kaufleute + verbr_per_tick_adlige;
            verbr_per_tick_most = verbr_summe;
            anzahl_mosthoefe = (int) Math.ceil(verbr_summe / prod_per_tick);
            double auslastung_gesamt = (verbr_summe/prod_per_tick)*100;
            auslastung_most = berechneAuslastung(auslastung_gesamt, anzahl_mosthoefe);
        }
        return anzahl_mosthoefe;
    }

    // Bier
    private int berechneBier() {
        int anzahl_brauereien = 0;
        if (anzahl_kaufleute >= 250 || bevoelkerung_stufe4 > 0) {
            double prod_per_tick = dauer_tick / prod_time_bier;
            double verbr_per_tick_kaufleute = anzahl_kaufleute * verbr_bier_kaufleute;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_bier_adlige;
            double verbr_summe = verbr_per_tick_kaufleute + verbr_per_tick_adlige;
            verbr_per_tick_bier = verbr_summe;
            anzahl_brauereien = (int) Math.ceil(verbr_summe / prod_per_tick);
            double auslastung_gesamt = (verbr_summe/prod_per_tick)*100;
            auslastung_bier = berechneAuslastung(auslastung_gesamt, anzahl_brauereien);
        }
        return anzahl_brauereien;
    }

    // Wein
    private int berechneWein() {
        int anzahl_keltereien = 0;
        if (bevoelkerung_stufe4 >= 500) {
            double prod_per_tick = dauer_tick / prod_time_wein;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_wein_adlige;
            verbr_per_tick_wein = verbr_per_tick_adlige;
            anzahl_keltereien = (int) Math.ceil(verbr_per_tick_adlige / prod_per_tick);
            double auslastung_gesamt = (verbr_per_tick_adlige/prod_per_tick)*100;
            auslastung_wein = berechneAuslastung(auslastung_gesamt, anzahl_keltereien);
        }
        return anzahl_keltereien;
    }

    // Wollgewänder
    private int berechneWollgewaender() {
        int anzahl_spinnereien = 0;
        if (anzahl_bauern >= 250 || bevoelkerung_stufe2 > 0) {
            double prod_per_tick = dauer_tick / prod_time_wollgewaender;
            double verbr_per_tick_bauern = anzahl_bauern * verbr_wollgewaender_bauern;
            double verbr_per_tick_handwerker = anzahl_handwerker * verbr_wollgewaender_handwerker;
            double verbr_per_tick_kaufleute = anzahl_kaufleute * verbr_wollgewaender_kaufleute;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_wollgewaender_adlige;
            double verbr_summe = verbr_per_tick_bauern + verbr_per_tick_handwerker + verbr_per_tick_kaufleute + verbr_per_tick_adlige;
            verbr_per_tick_wollgewaender = verbr_summe;
            anzahl_spinnereien = (int) Math.ceil(verbr_summe / prod_per_tick);
            double auslastung_gesamt = (verbr_summe/prod_per_tick)*100;
            auslastung_wollgewaender = berechneAuslastung(auslastung_gesamt, anzahl_spinnereien);
        }
        return anzahl_spinnereien;
    }

    // Leinengewänder
    private int berechneLeinengewaender() {
        int anzahl_webereien = 0;
        if (anzahl_handwerker >= 1500 || bevoelkerung_stufe3 > 0) {
            double prod_per_tick = dauer_tick / prod_time_leinengewaender;
            double verbr_per_tick_handwerker = anzahl_handwerker * verbr_leinengewaender_handwerker;
            double verbr_per_tick_kaufleute = anzahl_kaufleute * verbr_leinengewaender_kaufleute;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_leinengewaender_adlige;
            double verbr_summe = verbr_per_tick_handwerker + verbr_per_tick_kaufleute + verbr_per_tick_adlige;
            verbr_per_tick_leinengewander = verbr_summe;
            anzahl_webereien = (int) Math.ceil(verbr_summe / prod_per_tick);
            double auslastung_gesamt = (verbr_summe/prod_per_tick)*100;
            auslastung_leinengewaender = berechneAuslastung(auslastung_gesamt, anzahl_webereien);
        }
        return anzahl_webereien;
    }

    // Lederwämser
    private int berechneLederwaemser() {
        int anzahl_gerbereien = 0;
        if (anzahl_kaufleute >= 2000 || bevoelkerung_stufe4 > 0) {
            double prod_per_tick = dauer_tick / prod_time_lederwaemser;
            double verbr_per_tick_kaufleute = anzahl_kaufleute * verbr_lederwaemser_kaufleute;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_lederwaemser_adlige;
            double verbr_summe = verbr_per_tick_kaufleute + verbr_per_tick_adlige;
            verbr_per_tick_lederwaemser = verbr_summe;
            anzahl_gerbereien = (int) Math.ceil(verbr_summe / prod_per_tick);
            double auslastung_gesamt = (verbr_summe/prod_per_tick)*100;
            auslastung_lederwaemser = berechneAuslastung(auslastung_gesamt, anzahl_gerbereien);
        }
        return anzahl_gerbereien;
    }

    // Pelzmäntel
    private int berechnePelzmaentel() {
        int anzahl_kuerschner = 0;
        if (anzahl_kaufleute >= 3000 || bevoelkerung_stufe4 > 0) {
            double prod_per_tick = dauer_tick / prod_time_pelzmaentel;
            double verbr_per_tick_kaufleute = anzahl_kaufleute * verbr_pelzmaentel_kaufleute;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_pelzmaentel_adlige;
            double verbr_summe = verbr_per_tick_kaufleute + verbr_per_tick_adlige;
            verbr_per_tick_pelzmaentel = verbr_summe;
            anzahl_kuerschner = (int) Math.ceil(verbr_summe / prod_per_tick);
            double auslastung_gesamt = (verbr_summe/prod_per_tick)*100;
            auslastung_pelzmaentel = berechneAuslastung(auslastung_gesamt, anzahl_kuerschner);
        }
        return anzahl_kuerschner;
    }

    // Brokatgewänder
    private int berechneBrokatgewaender() {
        int anzahl_seidenwebereien = 0;
        if (bevoelkerung_stufe4 >= 4000) {
            double prod_per_tick = dauer_tick / prod_time_brokatgewaender;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_brokatgewaender_adlige;
            verbr_per_tick_brokatgewaender = verbr_per_tick_adlige;
            anzahl_seidenwebereien = (int) Math.ceil(verbr_per_tick_adlige / prod_per_tick);
            double auslastung_gesamt = (verbr_per_tick_adlige/prod_per_tick)*100;
            auslastung_brokatgewaender = berechneAuslastung(auslastung_gesamt, anzahl_seidenwebereien);
        }
        return anzahl_seidenwebereien;
    }

    // Bücher
    private int berechneBuecher() {
        int anzahl_druckereien = 0;
        if (anzahl_kaufleute >= 1000 || bevoelkerung_stufe4 > 0) {
            double prod_per_tick = dauer_tick / prod_time_buecher;
            double verbr_per_tick_kaufleute = anzahl_kaufleute * verbr_buecher_kaufleute;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_buecher_adlige;
            double verbr_summe = verbr_per_tick_kaufleute + verbr_per_tick_adlige;
            verbr_per_tick_buecher = verbr_summe;
            anzahl_druckereien = (int) Math.ceil(verbr_summe / prod_per_tick);
            double auslastung_gesamt = (verbr_summe/prod_per_tick)*100;
            auslastung_buecher = berechneAuslastung(auslastung_gesamt, anzahl_druckereien);
        }
        return anzahl_druckereien;
    }

    // Kerzenleuchter
    private int berechneKerzenleuchter() {
        int anzahl_feinschmieden = 0;
        if (bevoelkerung_stufe4 >= 1000) {
            double prod_per_tick = dauer_tick / prod_time_kerzenleuchter;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_kerzenleuchter_adlige;
            verbr_per_tick_kerzenleuchter = verbr_per_tick_adlige;
            anzahl_feinschmieden = (int) Math.ceil(verbr_per_tick_adlige / prod_per_tick);
            double auslastung_gesamt = (verbr_per_tick_adlige/prod_per_tick)*100;
            auslastung_kerzenleuchter = berechneAuslastung(auslastung_gesamt, anzahl_feinschmieden);
        }
        return anzahl_feinschmieden;
    }

    // Brillen
    private int berechneBrillen() {
        int anzahl_brillenmacher = 0;
        if (bevoelkerung_stufe4 >= 2500) {
            double prod_per_tick = dauer_tick / prod_time_brillen;
            double verbr_per_tick_adlige = anzahl_adlige * verbr_brillen_adlige;
            verbr_per_tick_brillen = verbr_per_tick_adlige;
            anzahl_brillenmacher = (int) Math.ceil(verbr_per_tick_adlige / prod_per_tick);
            double auslastung_gesamt = (verbr_per_tick_adlige/prod_per_tick)*100;
            auslastung_brillen = berechneAuslastung(auslastung_gesamt, anzahl_brillenmacher);
        }
        return anzahl_brillenmacher;
    }

    // Auslastung pro Gebäude berechnen
    private String berechneAuslastung(double auslastung_gesamt, int anzahl_gb){
        double auslastung_pro_gb = auslastung_gesamt/anzahl_gb;
        String s = String.valueOf(auslastung_pro_gb);
        double auslastung_pro_gb_rounded = Double.parseDouble(s.substring(0,s.lastIndexOf('.')+2));
        String s2 = String.valueOf(auslastung_pro_gb_rounded);
        if (s2.substring(s2.length()-1).equals("0")){
            s2 = s2.substring(0, s2.lastIndexOf('.'));
        }
        return s2;
    }

    /* GETTER UND SETTER */
    public int getPrk_fisch() {
        return prk_fisch;
    }

    public void setPrk_fisch(int prk_fisch) {
        this.prk_fisch = prk_fisch;
    }

    public int getPrk_brot() {
        return prk_brot;
    }

    public void setPrk_brot(int prk_brot) {
        this.prk_brot = prk_brot;
    }

    public int getPrk_fleisch() {
        return prk_fleisch;
    }

    public void setPrk_fleisch(int prk_fleisch) {
        this.prk_fleisch = prk_fleisch;
    }

    public int getPrk_milch() {
        return prk_milch;
    }

    public void setPrk_milch(int prk_milch) {
        this.prk_milch = prk_milch;
    }

    public int getPrk_most() {
        return prk_most;
    }

    public void setPrk_most(int prk_most) {
        this.prk_most = prk_most;
    }

    public int getPrk_bier() {
        return prk_bier;
    }

    public void setPrk_bier(int prk_bier) {
        this.prk_bier = prk_bier;
    }

    public int getPrk_wein() {
        return prk_wein;
    }

    public void setPrk_wein(int prk_wein) {
        this.prk_wein = prk_wein;
    }

    public int getPrk_wollgewaender() {
        return prk_wollgewaender;
    }

    public void setPrk_wollgewaender(int prk_wollgewaender) {
        this.prk_wollgewaender = prk_wollgewaender;
    }

    public int getPrk_leinengewaender() {
        return prk_leinengewaender;
    }

    public void setPrk_leinengewaender(int prk_leinengewaender) {
        this.prk_leinengewaender = prk_leinengewaender;
    }

    public int getPrk_lederwaemser() {
        return prk_lederwaemser;
    }

    public void setPrk_lederwaemser(int prk_lederwaemser) {
        this.prk_lederwaemser = prk_lederwaemser;
    }

    public int getPrk_pelzmaentel() {
        return prk_pelzmaentel;
    }

    public void setPrk_pelzmaentel(int prk_pelzmaentel) {
        this.prk_pelzmaentel = prk_pelzmaentel;
    }

    public int getPrk_brokatgewaender() {
        return prk_brokatgewaender;
    }

    public void setPrk_brokatgewaender(int prk_brokatgewaender) {
        this.prk_brokatgewaender = prk_brokatgewaender;
    }

    public int getPrk_buecher() {
        return prk_buecher;
    }

    public void setPrk_buecher(int prk_buecher) {
        this.prk_buecher = prk_buecher;
    }

    public int getPrk_kerzenleuchter() {
        return prk_kerzenleuchter;
    }

    public void setPrk_kerzenleuchter(int prk_kerzenleuchter) {
        this.prk_kerzenleuchter = prk_kerzenleuchter;
    }

    public int getPrk_brillen() {
        return prk_brillen;
    }

    public void setPrk_brillen(int prk_brillen) {
        this.prk_brillen = prk_brillen;
    }

    public String getAuslastung_fisch() {
        return auslastung_fisch;
    }

    public void setAuslastung_fisch(String auslastung_fisch) {
        this.auslastung_fisch = auslastung_fisch;
    }

    public String getAuslastung_brot() {
        return auslastung_brot;
    }

    public void setAuslastung_brot(String auslastung_brot) {
        this.auslastung_brot = auslastung_brot;
    }

    public String getAuslastung_fleisch() {
        return auslastung_fleisch;
    }

    public void setAuslastung_fleisch(String auslastung_fleisch) {
        this.auslastung_fleisch = auslastung_fleisch;
    }

    public String getAuslastung_milch() {
        return auslastung_milch;
    }

    public void setAuslastung_milch(String auslastung_milch) {
        this.auslastung_milch = auslastung_milch;
    }

    public String getAuslastung_most() {
        return auslastung_most;
    }

    public void setAuslastung_most(String auslastung_most) {
        this.auslastung_most = auslastung_most;
    }

    public String getAuslastung_bier() {
        return auslastung_bier;
    }

    public void setAuslastung_bier(String auslastung_bier) {
        this.auslastung_bier = auslastung_bier;
    }

    public String getAuslastung_wein() {
        return auslastung_wein;
    }

    public void setAuslastung_wein(String auslastung_wein) {
        this.auslastung_wein = auslastung_wein;
    }

    public String getAuslastung_wollgewaender() {
        return auslastung_wollgewaender;
    }

    public void setAuslastung_wollgewaender(String auslastung_wollgewaender) {
        this.auslastung_wollgewaender = auslastung_wollgewaender;
    }

    public String getAuslastung_leinengewaender() {
        return auslastung_leinengewaender;
    }

    public void setAuslastung_leinengewaender(String auslastung_leinengewaender) {
        this.auslastung_leinengewaender = auslastung_leinengewaender;
    }

    public String getAuslastung_lederwaemser() {
        return auslastung_lederwaemser;
    }

    public void setAuslastung_lederwaemser(String auslastung_lederwaemser) {
        this.auslastung_lederwaemser = auslastung_lederwaemser;
    }

    public String getAuslastung_pelzmaentel() {
        return auslastung_pelzmaentel;
    }

    public void setAuslastung_pelzmaentel(String auslastung_pelzmaentel) {
        this.auslastung_pelzmaentel = auslastung_pelzmaentel;
    }

    public String getAuslastung_brokatgewaender() {
        return auslastung_brokatgewaender;
    }

    public void setAuslastung_brokatgewaender(String auslastung_brokatgewaender) {
        this.auslastung_brokatgewaender = auslastung_brokatgewaender;
    }

    public String getAuslastung_buecher() {
        return auslastung_buecher;
    }

    public void setAuslastung_buecher(String auslastung_buecher) {
        this.auslastung_buecher = auslastung_buecher;
    }

    public String getAuslastung_kerzenleuchter() {
        return auslastung_kerzenleuchter;
    }

    public void setAuslastung_kerzenleuchter(String auslastung_kerzenleuchter) {
        this.auslastung_kerzenleuchter = auslastung_kerzenleuchter;
    }

    public String getAuslastung_brillen() {
        return auslastung_brillen;
    }

    public void setAuslastung_brillen(String auslastung_brillen) {
        this.auslastung_brillen = auslastung_brillen;
    }

    public double getProd_time_milch() {
        return prod_time_milch;
    }

    public void setProd_time_milch(double prod_time_milch) {
        this.prod_time_milch = prod_time_milch;
    }

    public double getProd_time_aepfel() {
        return prod_time_aepfel;
    }

    public void setProd_time_aepfel(double prod_time_aepfel) {
        this.prod_time_aepfel = prod_time_aepfel;
    }

    public double getProd_time_most() {
        return prod_time_most;
    }

    public void setProd_time_most(double prod_time_most) {
        this.prod_time_most = prod_time_most;
    }

    public double getProd_time_kraeuter() {
        return prod_time_kraeuter;
    }

    public void setProd_time_kraeuter(double prod_time_kraeuter) {
        this.prod_time_kraeuter = prod_time_kraeuter;
    }

    public double getProd_time_bier() {
        return prod_time_bier;
    }

    public void setProd_time_bier(double prod_time_bier) {
        this.prod_time_bier = prod_time_bier;
    }

    public double getProd_time_trauben() {
        return prod_time_trauben;
    }

    public void setProd_time_trauben(double prod_time_trauben) {
        this.prod_time_trauben = prod_time_trauben;
    }

    public double getProd_time_faesser() {
        return prod_time_faesser;
    }

    public void setProd_time_faesser(double prod_time_faesser) {
        this.prod_time_faesser = prod_time_faesser;
    }

    public double getProd_time_wein() {
        return prod_time_wein;
    }

    public void setProd_time_wein(double prod_time_wein) {
        this.prod_time_wein = prod_time_wein;
    }

    public double getProd_time_woole() {
        return prod_time_woole;
    }

    public void setProd_time_woole(double prod_time_woole) {
        this.prod_time_woole = prod_time_woole;
    }

    public double getProd_time_wollgewaender() {
        return prod_time_wollgewaender;
    }

    public void setProd_time_wollgewaender(double prod_time_wollgewaender) {
        this.prod_time_wollgewaender = prod_time_wollgewaender;
    }

    public double getProd_time_hanf() {
        return prod_time_hanf;
    }

    public void setProd_time_hanf(double prod_time_hanf) {
        this.prod_time_hanf = prod_time_hanf;
    }

    public double getProd_time_leinengewaender() {
        return prod_time_leinengewaender;
    }

    public void setProd_time_leinengewaender(double prod_time_leinengewaender) {
        this.prod_time_leinengewaender = prod_time_leinengewaender;
    }

    public double getProd_time_tierhaeute() {
        return prod_time_tierhaeute;
    }

    public void setProd_time_tierhaeute(double prod_time_tierhaeute) {
        this.prod_time_tierhaeute = prod_time_tierhaeute;
    }

    public double getProd_time_sole() {
        return prod_time_sole;
    }

    public void setProd_time_sole(double prod_time_sole) {
        this.prod_time_sole = prod_time_sole;
    }

    public double getProd_time_salz() {
        return prod_time_salz;
    }

    public void setProd_time_salz(double prod_time_salz) {
        this.prod_time_salz = prod_time_salz;
    }

    public double getProd_time_lederwaemser() {
        return prod_time_lederwaemser;
    }

    public void setProd_time_lederwaemser(double prod_time_lederwaemser) {
        this.prod_time_lederwaemser = prod_time_lederwaemser;
    }

    public double getProd_time_pelze() {
        return prod_time_pelze;
    }

    public void setProd_time_pelze(double prod_time_pelze) {
        this.prod_time_pelze = prod_time_pelze;
    }

    public double getProd_time_pelzmaentel() {
        return prod_time_pelzmaentel;
    }

    public void setProd_time_pelzmaentel(double prod_time_pelzmaentel) {
        this.prod_time_pelzmaentel = prod_time_pelzmaentel;
    }

    public double getProd_time_golderz() {
        return prod_time_golderz;
    }

    public void setProd_time_golderz(double prod_time_golderz) {
        this.prod_time_golderz = prod_time_golderz;
    }

    public double getProd_time_gold() {
        return prod_time_gold;
    }

    public void setProd_time_gold(double prod_time_gold) {
        this.prod_time_gold = prod_time_gold;
    }

    public double getProd_time_brokatgewaender() {
        return prod_time_brokatgewaender;
    }

    public void setProd_time_brokatgewaender(double prod_time_brokatgewaender) {
        this.prod_time_brokatgewaender = prod_time_brokatgewaender;
    }

    public double getProd_time_papier() {
        return prod_time_papier;
    }

    public void setProd_time_papier(double prod_time_papier) {
        this.prod_time_papier = prod_time_papier;
    }

    public double getProd_time_buecher() {
        return prod_time_buecher;
    }

    public void setProd_time_buecher(double prod_time_buecher) {
        this.prod_time_buecher = prod_time_buecher;
    }

    public double getProd_time_bienenwachs() {
        return prod_time_bienenwachs;
    }

    public void setProd_time_bienenwachs(double prod_time_bienenwachs) {
        this.prod_time_bienenwachs = prod_time_bienenwachs;
    }

    public double getProd_time_kerzen() {
        return prod_time_kerzen;
    }

    public void setProd_time_kerzen(double prod_time_kerzen) {
        this.prod_time_kerzen = prod_time_kerzen;
    }

    public double getProd_time_kerzenleuchter() {
        return prod_time_kerzenleuchter;
    }

    public void setProd_time_kerzenleuchter(double prod_time_kerzenleuchter) {
        this.prod_time_kerzenleuchter = prod_time_kerzenleuchter;
    }

    public double getProd_time_kupfererz() {
        return prod_time_kupfererz;
    }

    public void setProd_time_kupfererz(double prod_time_kupfererz) {
        this.prod_time_kupfererz = prod_time_kupfererz;
    }

    public double getProd_time_messing() {
        return prod_time_messing;
    }

    public void setProd_time_messing(double prod_time_messing) {
        this.prod_time_messing = prod_time_messing;
    }

    public double getProd_time_brillen() {
        return prod_time_brillen;
    }

    public void setProd_time_brillen(double prod_time_brillen) {
        this.prod_time_brillen = prod_time_brillen;
    }

    public double getProd_time_fleisch() {
        return prod_time_fleisch;
    }

    public void setProd_time_fleisch(double prod_time_fleisch) {
        this.prod_time_fleisch = prod_time_fleisch;
    }

    public double getProd_time_vieh() {
        return prod_time_vieh;
    }

    public void setProd_time_vieh(double prod_time_vieh) {
        this.prod_time_vieh = prod_time_vieh;
    }

    public double getProd_time_brot() {
        return prod_time_brot;
    }

    public void setProd_time_brot(double prod_time_brot) {
        this.prod_time_brot = prod_time_brot;
    }

    public double getProd_time_mehl() {
        return prod_time_mehl;
    }

    public void setProd_time_mehl(double prod_time_mehl) {
        this.prod_time_mehl = prod_time_mehl;
    }

    public double getProd_time_weizen() {
        return prod_time_weizen;
    }

    public void setProd_time_weizen(double prod_time_weizen) {
        this.prod_time_weizen = prod_time_weizen;
    }

    public double getProd_time_fisch() {
        return prod_time_fisch;
    }

    public void setProd_time_fisch(double prod_time_fisch) {
        this.prod_time_fisch = prod_time_fisch;
    }

    public double getProd_time_glas() {
        return prod_time_glas;
    }

    public void setProd_time_glas(double prod_time_glas) {
        this.prod_time_glas = prod_time_glas;
    }

    public double getProd_time_quarz() {
        return prod_time_quarz;
    }

    public void setProd_time_quarz(double prod_time_quarz) {
        this.prod_time_quarz = prod_time_quarz;
    }

    public double getProd_time_pottasche() {
        return prod_time_pottasche;
    }

    public void setProd_time_pottasche(double prod_time_pottasche) {
        this.prod_time_pottasche = prod_time_pottasche;
    }

    public double getProd_time_werkzeug() {
        return prod_time_werkzeug;
    }

    public void setProd_time_werkzeug(double prod_time_werkzeug) {
        this.prod_time_werkzeug = prod_time_werkzeug;
    }

    public double getProd_time_eisen() {
        return prod_time_eisen;
    }

    public void setProd_time_eisen(double prod_time_eisen) {
        this.prod_time_eisen = prod_time_eisen;
    }

    public double getProd_time_kohlemine() {
        return prod_time_kohlemine;
    }

    public void setProd_time_kohlemine(double prod_time_kohlemine) {
        this.prod_time_kohlemine = prod_time_kohlemine;
    }

    public double getProd_time_kohle() {
        return prod_time_kohle;
    }

    public void setProd_time_kohle(double prod_time_kohle) {
        this.prod_time_kohle = prod_time_kohle;
    }

    public double getProd_time_eisenerz() {
        return prod_time_eisenerz;
    }

    public void setProd_time_eisenerz(double prod_time_eisenerz) {
        this.prod_time_eisenerz = prod_time_eisenerz;
    }

    public double getProd_time_stein() {
        return prod_time_stein;
    }

    public void setProd_time_stein(double prod_time_stein) {
        this.prod_time_stein = prod_time_stein;
    }

    public double getProd_time_holz() {
        return prod_time_holz;
    }

    public void setProd_time_holz(double prod_time_holz) {
        this.prod_time_holz = prod_time_holz;
    }

    public double getVerbr_per_tick_fisch() {
        return verbr_per_tick_fisch;
    }

    public void setVerbr_per_tick_fisch(double verbr_per_tick_fisch) {
        this.verbr_per_tick_fisch = verbr_per_tick_fisch;
    }

    public double getVerbr_per_tick_brot() {
        return verbr_per_tick_brot;
    }

    public void setVerbr_per_tick_brot(double verbr_per_tick_brot) {
        this.verbr_per_tick_brot = verbr_per_tick_brot;
    }

    public double getVerbr_per_tick_gewuerze() {
        return verbr_per_tick_gewuerze;
    }

    public void setVerbr_per_tick_gewuerze(double verbr_per_tick_gewuerze) {
        this.verbr_per_tick_gewuerze = verbr_per_tick_gewuerze;
    }

    public double getVerbr_per_tick_fleisch() {
        return verbr_per_tick_fleisch;
    }

    public void setVerbr_per_tick_fleisch(double verbr_per_tick_fleisch) {
        this.verbr_per_tick_fleisch = verbr_per_tick_fleisch;
    }

    public double getVerbr_per_tick_milch() {
        return verbr_per_tick_milch;
    }

    public void setVerbr_per_tick_milch(double verbr_per_tick_milch) {
        this.verbr_per_tick_milch = verbr_per_tick_milch;
    }

    public double getVerbr_per_tick_most() {
        return verbr_per_tick_most;
    }

    public void setVerbr_per_tick_most(double verbr_per_tick_most) {
        this.verbr_per_tick_most = verbr_per_tick_most;
    }

    public double getVerbr_per_tick_bier() {
        return verbr_per_tick_bier;
    }

    public void setVerbr_per_tick_bier(double verbr_per_tick_bier) {
        this.verbr_per_tick_bier = verbr_per_tick_bier;
    }

    public double getVerbr_per_tick_wein() {
        return verbr_per_tick_wein;
    }

    public void setVerbr_per_tick_wein(double verbr_per_tick_wein) {
        this.verbr_per_tick_wein = verbr_per_tick_wein;
    }

    public double getVerbr_per_tick_wollgewaender() {
        return verbr_per_tick_wollgewaender;
    }

    public void setVerbr_per_tick_wollgewaender(double verbr_per_tick_wollgewaender) {
        this.verbr_per_tick_wollgewaender = verbr_per_tick_wollgewaender;
    }

    public double getVerbr_per_tick_leinengewander() {
        return verbr_per_tick_leinengewander;
    }

    public void setVerbr_per_tick_leinengewander(double verbr_per_tick_leinengewander) {
        this.verbr_per_tick_leinengewander = verbr_per_tick_leinengewander;
    }

    public double getVerbr_per_tick_lederwaemser() {
        return verbr_per_tick_lederwaemser;
    }

    public void setVerbr_per_tick_lederwaemser(double verbr_per_tick_lederwaemser) {
        this.verbr_per_tick_lederwaemser = verbr_per_tick_lederwaemser;
    }

    public double getVerbr_per_tick_pelzmaentel() {
        return verbr_per_tick_pelzmaentel;
    }

    public void setVerbr_per_tick_pelzmaentel(double verbr_per_tick_pelzmaentel) {
        this.verbr_per_tick_pelzmaentel = verbr_per_tick_pelzmaentel;
    }

    public double getVerbr_per_tick_brokatgewaender() {
        return verbr_per_tick_brokatgewaender;
    }

    public void setVerbr_per_tick_brokatgewaender(double verbr_per_tick_brokatgewaender) {
        this.verbr_per_tick_brokatgewaender = verbr_per_tick_brokatgewaender;
    }

    public double getVerbr_per_tick_buecher() {
        return verbr_per_tick_buecher;
    }

    public void setVerbr_per_tick_buecher(double verbr_per_tick_buecher) {
        this.verbr_per_tick_buecher = verbr_per_tick_buecher;
    }

    public double getVerbr_per_tick_kerzenleuchter() {
        return verbr_per_tick_kerzenleuchter;
    }

    public void setVerbr_per_tick_kerzenleuchter(double verbr_per_tick_kerzenleuchter) {
        this.verbr_per_tick_kerzenleuchter = verbr_per_tick_kerzenleuchter;
    }

    public double getVerbr_per_tick_brillen() {
        return verbr_per_tick_brillen;
    }

    public void setVerbr_per_tick_brillen(double verbr_per_tick_brillen) {
        this.verbr_per_tick_brillen = verbr_per_tick_brillen;
    }

    public double getDauer_tick() {
        return dauer_tick;
    }

    public void setDauer_tick(double dauer_tick) {
        this.dauer_tick = dauer_tick;
    }
}
