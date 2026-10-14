package com.iusemybrain.apps.myannoonline;

import android.app.Activity;

import com.iusemybrain.apps.myannoonline.dialogcontent.Insel;

/**
 * Created by Markus on 11.04.2015.
 */
class Inselersteller {

    private Dialogersteller dialogersteller;
    private final Activity activity;

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
    
    // Kleine Insel 1
    private static final int fruchtb_insel_klein1 = FRUCHTB_ALLE;
    private static final int vork_insel_klein1 = VORK_ALLE;
    private static final int rubine_insel_klein1 = 0;
    // Kleine Insel 2
    private static final int fruchtb_insel_klein2 = FRUCHTB_ALLE;
    private static final int vork_insel_klein2 = VORK_ALLE;
    private static final int rubine_insel_klein2 = 0;
    // Kleine Insel 3
    private static final int fruchtb_insel_klein3 = FRUCHTB_ALLE;
    private static final int vork_insel_klein3 = VORK_ALLE;
    private static final int rubine_insel_klein3 = 0;
    // Kleine Insel 4
    private static final int fruchtb_insel_klein4 = FRUCHTB_ALLE;
    private static final int vork_insel_klein4 = VORK_ALLE;
    private static final int rubine_insel_klein4 = 0;
    // Kleine Insel 5
    private static final int fruchtb_insel_klein5 = FRUCHTB_ALLE;
    private static final int vork_insel_klein5 = VORK_ALLE;
    private static final int rubine_insel_klein5 = 0;
    
    
    // Mittlere Insel 1
    private static final int fruchtb_insel_mittel1 = FRUCHTB_ALLE;
    private static final int vork_insel_mittel1 = VORK_ALLE;
    private static final int rubine_insel_mittel1 = 0;
    // Mittlere Insel 2
    private static final int fruchtb_insel_mittel2 = FRUCHTB_ALLE;
    private static final int vork_insel_mittel2 = VORK_ALLE;
    private static final int rubine_insel_mittel2 = 0;
    // Mittlere Insel 3
    private static final int fruchtb_insel_mittel3 = FRUCHTB_ALLE;
    private static final int vork_insel_mittel3 = VORK_ALLE;
    private static final int rubine_insel_mittel3 = 0;
    // Mittlere Insel 4
    private static final int fruchtb_insel_mittel4 = FRUCHTB_ALLE;
    private static final int vork_insel_mittel4 = VORK_ALLE;
    private static final int rubine_insel_mittel4 = 0;
    // Mittlere Insel 5
    private static final int fruchtb_insel_mittel5 = FRUCHTB_HANF;
    private static final int vork_insel_mittel5 = VORK_3ST_2E;
    private static final int rubine_insel_mittel5 = 1490;
    // Mittlere Insel 6
    private static final int fruchtb_insel_mittel6 = FRUCHTB_WEIZEN;
    private static final int vork_insel_mittel6 = VORK_3ST_2E;
    private static final int rubine_insel_mittel6 = 1490;
    // Mittlere Insel 7
    private static final int fruchtb_insel_mittel7 = FRUCHTB_KRAEUTER;
    private static final int vork_insel_mittel7 = VORK_2ST_2E_2P_2KO;
    private static final int rubine_insel_mittel7 = 2450;
    // Mittlere Insel 8
    private static final int fruchtb_insel_mittel8 = FRUCHTB_AEPFEL_HANF;
    private static final int vork_insel_mittel8 = VORK_3ST_2E_2F;
    private static final int rubine_insel_mittel8 = 2950;
    // Mittlere Insel 9
    private static final int fruchtb_insel_mittel9 = FRUCHTB_AEPFEL_BIENENWACHS;
    private static final int vork_insel_mittel9 = VORK_2ST_2E_2SO_3KU_1G;
    private static final int rubine_insel_mittel9 = 3450;
    // Mittlere Insel 10
    private static final int fruchtb_insel_mittel10 = FRUCHTB_HANF_WEIN;
    private static final int vork_insel_mittel10 = VORK_2ST_2E_2P_1KU_1G;
    private static final int rubine_insel_mittel10 = 5450;
    
    
    // Grosse Insel 1
    private static final int fruchtb_insel_gross1 = FRUCHTB_ALLE;
    private static final int vork_insel_gross1 = VORK_GROSS;
    private static final int rubine_insel_gross1 = 0;
    // Grosse Insel 2
    private static final int fruchtb_insel_gross2 = FRUCHTB_ALLE;
    private static final int vork_insel_gross2 = VORK_GROSS;
    private static final int rubine_insel_gross2 = 0;
    // Grosse Insel 3
    private static final int fruchtb_insel_gross3 = FRUCHTB_KRAEUTER;
    private static final int vork_insel_gross3 = VORK_3ST_3E_3SO_3KO_4F;
    private static final int rubine_insel_gross3 = 3950;
    // Grosse Insel 4
    private static final int fruchtb_insel_gross4 = FRUCHTB_BIENENWACHS_WEIN;
    private static final int vork_insel_gross4 = VORK_3ST_3E_2P_3KO_3Q_2KU;
    private static final int rubine_insel_gross4 = 8950;
    // Grosse Insel 5
    private static final int fruchtb_insel_gross5 = FRUCHTB_WEIZEN_HANF;
    private static final int vork_insel_gross5 = VORK_4ST_3E_3SO_3Q_4F_2G;
    private static final int rubine_insel_gross5 = 10900;
    // Grosse Insel 6
    private static final int fruchtb_insel_gross6 = FRUCHTB_HANF;
    private static final int vork_insel_gross6 = VORK_2E_3SO_4P_3KO_8F_4Q_3KU_3G;
    private static final int rubine_insel_gross6 = 29500;
    
    
    // Riesige Insel 1
    private static final int fruchtb_insel_riesig1 = FRUCHTB_AEPFEL;
    private static final int vork_insel_riesig1 = VORK_1E_4SO_3P_2KO_4F_4Q_3G;
    private static final int rubine_insel_riesig1 = 12900;
    // Riesige Insel 2
    private static final int fruchtb_insel_riesig2 = FRUCHTB_HANF;
    private static final int vork_insel_riesig2 = VORK_2E_2SO_4P_3KO_4F_2Q_5KU;
    private static final int rubine_insel_riesig2 = 14900;
    // Riesige Insel 3
    private static final int fruchtb_insel_riesig3 = FRUCHTB_KRAEUTER;
    private static final int vork_insel_riesig3 = VORK_2E_2SO_4KO_4F_3Q_3KU_4G;
    private static final int rubine_insel_riesig3 = 17400;
    // Riesige Insel 4
    private static final int fruchtb_insel_riesig4 = FRUCHTB_WEINTRAUBEN;
    private static final int vork_insel_riesig4 = VORK_4E_2SO_4P_4KO_4F_1KU_3G;
    private static final int rubine_insel_riesig4 = 18400;
    // Riesige Insel 5
    private static final int fruchtb_insel_riesig5 = FRUCHTB_WEIZEN;
    private static final int vork_insel_riesig5 = VORK_1E_4P_2KO_4F_6Q_3KU_2G;
    private static final int rubine_insel_riesig5 = 18900;
    // Riesige Insel 6
    private static final int fruchtb_insel_riesig6 = FRUCHTB_BIENENWACHS;
    private static final int vork_insel_riesig6 = VORK_4E_2SO_4P_4KO_4F_1KU_3G;
    private static final int rubine_insel_riesig6 = 18900;
    // Riesige Insel 7
    private static final int fruchtb_insel_riesig7 = FRUCHTB_HANF_BIENENWACHS;
    private static final int vork_insel_riesig7 = VORK_2E_2SO_4P_3KO_4F_2Q_5KU;
    private static final int rubine_insel_riesig7 = 18900;
    // Riesige Insel 8
    private static final int fruchtb_insel_riesig8 = FRUCHTB_BIENENWACHS_WEIN;
    private static final int vork_insel_riesig8 = VORK_4E_2SO_4P_4KO_4F_1KU_3G;
    private static final int rubine_insel_riesig8 = 19900;
    // Riesige Insel 9
    private static final int fruchtb_insel_riesig9 = FRUCHTB_WEIZEN_KRAEUTER;
    private static final int vork_insel_riesig9 = VORK_1E_4P_2KO_4F_6Q_3KU_2G;
    private static final int rubine_insel_riesig9 = 19900;

    // Kleine Inseln
    private Insel ins_klein1;
    private Insel ins_klein2;
    private Insel ins_klein3;
    private Insel ins_klein4;
    private Insel ins_klein5;
    
    // Mittlere Inseln
    private Insel ins_mittel1;
    private Insel ins_mittel2;
    private Insel ins_mittel3;
    private Insel ins_mittel4;
    private Insel ins_mittel5;
    private Insel ins_mittel6;
    private Insel ins_mittel7;
    private Insel ins_mittel8;
    private Insel ins_mittel9;
    private Insel ins_mittel10;
    
    // Große Inseln
    private Insel ins_gross1;
    private Insel ins_gross2;
    private Insel ins_gross3;
    private Insel ins_gross4;
    private Insel ins_gross5;
    private Insel ins_gross6;
    
    // Riesige Inseln
    private Insel ins_riesig1;
    private Insel ins_riesig2;
    private Insel ins_riesig3;
    private Insel ins_riesig4;
    private Insel ins_riesig5;
    private Insel ins_riesig6;
    private Insel ins_riesig7;
    private Insel ins_riesig8;
    private Insel ins_riesig9;

    // Konstruktor
    public Inselersteller(Activity activity){
        this.activity = activity;
    }

    // Alle Inseln erstellen
    public void erstelleInseln(){
    	// Kleine Inseln
        erstelleKleineInseln();
    	// Mittlere Inseln
        erstelleMittlereInseln();
    	// Große Inseln
        erstelleGrosseInseln();
    	// Riesige Inseln
        erstelleRiesigeInseln();
    }
    
    private void erstelleKleineInseln(){
    	erstelleInselKlein1();
    	erstelleInselKlein2();
    	erstelleInselKlein3();
    	erstelleInselKlein4();
    	erstelleInselKlein5();
    }
    
	private void erstelleMittlereInseln(){
	    erstelleInselMittel1();
	    erstelleInselMittel2();
	    erstelleInselMittel3();
	    erstelleInselMittel4();
	    erstelleInselMittel5();
	    erstelleInselMittel6();
	    erstelleInselMittel7();
	    erstelleInselMittel8();
	    erstelleInselMittel9();
	    erstelleInselMittel10();
	}
	
	private void erstelleGrosseInseln(){
		erstelleInselGross1();
		erstelleInselGross2();
		erstelleInselGross3();
		erstelleInselGross4();
		erstelleInselGross5();
		erstelleInselGross6();
	}
	
	private void erstelleRiesigeInseln(){
		erstelleInselRiesig1();
		erstelleInselRiesig2();
		erstelleInselRiesig3();
		erstelleInselRiesig4();
		erstelleInselRiesig5();
		erstelleInselRiesig6();
		erstelleInselRiesig7();
		erstelleInselRiesig8();
		erstelleInselRiesig9();
	}

    
    // Aufbau der Arrays
    // [0] = int inselArt (benötigt für richtiges Bild)
    // [1] = int vorkommenArt
    // [2] = int fruchtbarkeitArt

    /* KLEINE INSELN */
    private void erstelleInselKlein1(){
        ins_klein1 = new Insel(dialogersteller.INS_KLEIN1, vork_insel_klein1, fruchtb_insel_klein1, rubine_insel_klein1);
    }
    private void erstelleInselKlein2(){
        ins_klein2 = new Insel(dialogersteller.INS_KLEIN2, vork_insel_klein2, fruchtb_insel_klein2, rubine_insel_klein2);
    }
    private void erstelleInselKlein3(){
        ins_klein3 = new Insel(dialogersteller.INS_KLEIN3, vork_insel_klein3, fruchtb_insel_klein3, rubine_insel_klein3);
    }
    private void erstelleInselKlein4(){
        ins_klein4 = new Insel(dialogersteller.INS_KLEIN4, vork_insel_klein4, fruchtb_insel_klein4, rubine_insel_klein4);
    }
    private void erstelleInselKlein5(){
        ins_klein5 = new Insel(dialogersteller.INS_KLEIN5, vork_insel_klein5, fruchtb_insel_klein5, rubine_insel_klein5);
    }
    
    /* MITTLERE INSELN */
    private void erstelleInselMittel1(){
        ins_mittel1 = new Insel(dialogersteller.INS_MITTEL1, vork_insel_mittel1, fruchtb_insel_mittel1, rubine_insel_mittel1);
    }
    private void erstelleInselMittel2(){
        ins_mittel2 = new Insel(dialogersteller.INS_MITTEL2, vork_insel_mittel2, fruchtb_insel_mittel2, rubine_insel_mittel2);
    }
    private void erstelleInselMittel3(){
        ins_mittel3 = new Insel(dialogersteller.INS_MITTEL3, vork_insel_mittel3, fruchtb_insel_mittel3, rubine_insel_mittel3);
    }
    private void erstelleInselMittel4(){
        ins_mittel4 = new Insel(dialogersteller.INS_MITTEL4, vork_insel_mittel4, fruchtb_insel_mittel4, rubine_insel_mittel4);
    }
    private void erstelleInselMittel5(){
        ins_mittel5 = new Insel(dialogersteller.INS_MITTEL5, vork_insel_mittel5, fruchtb_insel_mittel5, rubine_insel_mittel5);
    }
    private void erstelleInselMittel6(){
        ins_mittel6 = new Insel(dialogersteller.INS_MITTEL6, vork_insel_mittel6, fruchtb_insel_mittel6, rubine_insel_mittel6);
    }
    private void erstelleInselMittel7(){
        ins_mittel7 = new Insel(dialogersteller.INS_MITTEL7, vork_insel_mittel7, fruchtb_insel_mittel7, rubine_insel_mittel7);
    }
    private void erstelleInselMittel8(){
        ins_mittel8 = new Insel(dialogersteller.INS_MITTEL8, vork_insel_mittel8, fruchtb_insel_mittel8, rubine_insel_mittel8);
    }
    private void erstelleInselMittel9(){
        ins_mittel9 = new Insel(dialogersteller.INS_MITTEL9, vork_insel_mittel9, fruchtb_insel_mittel9, rubine_insel_mittel9);
    }
    private void erstelleInselMittel10(){
        ins_mittel10 = new Insel(dialogersteller.INS_MITTEL10, vork_insel_mittel10, fruchtb_insel_mittel10, rubine_insel_mittel10);
    }
    
    /* GROSSE INSELN */
    private void erstelleInselGross1(){
        ins_gross1 = new Insel(dialogersteller.INS_GROSS1, vork_insel_gross1, fruchtb_insel_gross1, rubine_insel_gross1);
    }
    private void erstelleInselGross2(){
        ins_gross2 = new Insel(dialogersteller.INS_GROSS2, vork_insel_gross2, fruchtb_insel_gross2, rubine_insel_gross2);
    }
    private void erstelleInselGross3(){
        ins_gross3 = new Insel(dialogersteller.INS_GROSS3, vork_insel_gross3, fruchtb_insel_gross3, rubine_insel_gross3);
    }
    private void erstelleInselGross4(){
        ins_gross4 = new Insel(dialogersteller.INS_GROSS4, vork_insel_gross4, fruchtb_insel_gross4, rubine_insel_gross4);
    }
    private void erstelleInselGross5(){
        ins_gross5 = new Insel(dialogersteller.INS_GROSS5, vork_insel_gross5, fruchtb_insel_gross5, rubine_insel_gross5);
    }
    private void erstelleInselGross6(){
        ins_gross6 = new Insel(dialogersteller.INS_GROSS6, vork_insel_gross6, fruchtb_insel_gross6, rubine_insel_gross6);
    }
    
    /* RIESIGE INSELN */
    private void erstelleInselRiesig1(){
        ins_riesig1 = new Insel(dialogersteller.INS_RIESIG1, vork_insel_riesig1, fruchtb_insel_riesig1, rubine_insel_riesig1);
    }
    private void erstelleInselRiesig2(){
        ins_riesig2 = new Insel(dialogersteller.INS_RIESIG2, vork_insel_riesig2, fruchtb_insel_riesig2, rubine_insel_riesig2);
    }
    private void erstelleInselRiesig3(){
        ins_riesig3 = new Insel(dialogersteller.INS_RIESIG3, vork_insel_riesig3, fruchtb_insel_riesig3, rubine_insel_riesig3);
    }
    private void erstelleInselRiesig4(){
        ins_riesig4 = new Insel(dialogersteller.INS_RIESIG4, vork_insel_riesig4, fruchtb_insel_riesig4, rubine_insel_riesig4);
    }
    private void erstelleInselRiesig5(){
        ins_riesig5 = new Insel(dialogersteller.INS_RIESIG5, vork_insel_riesig5, fruchtb_insel_riesig5, rubine_insel_riesig5);
    }
    private void erstelleInselRiesig6(){
        ins_riesig6 = new Insel(dialogersteller.INS_RIESIG6, vork_insel_riesig6, fruchtb_insel_riesig6, rubine_insel_riesig6);
    }
    private void erstelleInselRiesig7(){
        ins_riesig7 = new Insel(dialogersteller.INS_RIESIG7, vork_insel_riesig7, fruchtb_insel_riesig7, rubine_insel_riesig7);
    }
    private void erstelleInselRiesig8(){
        ins_riesig8 = new Insel(dialogersteller.INS_RIESIG8, vork_insel_riesig8, fruchtb_insel_riesig8, rubine_insel_riesig8);
    }
    private void erstelleInselRiesig9(){
        ins_riesig9 = new Insel(dialogersteller.INS_RIESIG9, vork_insel_riesig9, fruchtb_insel_riesig9, rubine_insel_riesig9);
    }

    // Getter
    public Insel getIns_klein1() {
        return ins_klein1;
    }
    public Insel getIns_klein2() {
        return ins_klein2;
    }
    public Insel getIns_klein3() {
        return ins_klein3;
    }
    public Insel getIns_klein4() {
        return ins_klein4;
    }
    public Insel getIns_klein5() {
        return ins_klein5;
    }
    public Insel getIns_mittel1() {
        return ins_mittel1;
    }
    public Insel getIns_mittel2() {
        return ins_mittel2;
    }
    public Insel getIns_mittel3() {
        return ins_mittel3;
    }
    public Insel getIns_mittel4() {
        return ins_mittel4;
    }
    public Insel getIns_mittel5() {
        return ins_mittel5;
    }
    public Insel getIns_mittel6() {
        return ins_mittel6;
    }
    public Insel getIns_mittel7() {
        return ins_mittel7;
    }
    public Insel getIns_mittel8() {
        return ins_mittel8;
    }
    public Insel getIns_mittel9() {
        return ins_mittel9;
    }
    public Insel getIns_mittel10() {
        return ins_mittel10;
    }
    public Insel getIns_gross1() {
        return ins_gross1;
    }
    public Insel getIns_gross2() {
        return ins_gross2;
    }
    public Insel getIns_gross3() {
        return ins_gross3;
    }
    public Insel getIns_gross4() {
        return ins_gross4;
    }
    public Insel getIns_gross5() {
        return ins_gross5;
    }
    public Insel getIns_gross6() {
        return ins_gross6;
    }
    public Insel getIns_riesig1() {
        return ins_riesig1;
    }
    public Insel getIns_riesig2() {
        return ins_riesig2;
    }
    public Insel getIns_riesig3() {
        return ins_riesig3;
    }
    public Insel getIns_riesig4() {
        return ins_riesig4;
    }
    public Insel getIns_riesig5() {
        return ins_riesig5;
    }
    public Insel getIns_riesig6() {
        return ins_riesig6;
    }
    public Insel getIns_riesig7() {
        return ins_riesig7;
    }
    public Insel getIns_riesig8() {
        return ins_riesig8;
    }
    public Insel getIns_riesig9() {
        return ins_riesig9;
    }
}
