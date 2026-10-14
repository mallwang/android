package com.iusemybrain.apps.myannoonline.dialogcontent;

public class Gebaeude {

    // Benötigte Variablen
    private int artGebaeude;
    private int artBevoelkerung;
    private int anzahlBevoelkerung;
    private int anzahlSonder;
    private int unterhalt;
    private int radius;
    private String groesse;
    private String anzahlAuslastung;
    private String produktionsdauer;
    private String baukosten;
    private int[] ressourcen;

    // Konstruktor
    public Gebaeude(int artGebaeude, int artBevoelkerung, int anzahlBevoelkerung, int anzahlSonder, int unterhalt, int radius, String groesse, String anzahlAuslastung, String produktionsdauer, String baukosten, int[] ressourcen){
        this.artGebaeude = artGebaeude;
        this.artBevoelkerung = artBevoelkerung;
        this.anzahlBevoelkerung = anzahlBevoelkerung;
        this.anzahlSonder = anzahlSonder;
        this.unterhalt = unterhalt;
        this.radius = radius;
        this.groesse = groesse;
        this.anzahlAuslastung = anzahlAuslastung;
        this.produktionsdauer = produktionsdauer;
        this.baukosten = baukosten;
        this.ressourcen = ressourcen;
    }

    // Getter
    public int getArtGebaeude() {
        return artGebaeude;
    }

    public int getArtBevoelkerung() {
        return artBevoelkerung;
    }

    public int getAnzahlBevoelkerung() {
        return anzahlBevoelkerung;
    }

    public int getAnzahlSonder() {
        return anzahlSonder;
    }

    public int getUnterhalt() {
        return unterhalt;
    }

    public int getRadius() {
        return radius;
    }

    public String getGroesse() {
        return groesse;
    }

    public String getAnzahlAuslastung() {
        return anzahlAuslastung;
    }

    public String getProduktionsdauer() {
        return produktionsdauer;
    }

    public String getBaukosten() {
        return baukosten;
    }

    public int[] getRessourcen() {
        return ressourcen;
    }

    // Setter
    public void setAnzahlAuslastung(String anzahlAuslastung) {
        this.anzahlAuslastung = anzahlAuslastung;
    }
}
