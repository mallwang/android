package com.iusemybrain.apps.myannoonline.dialogcontent;

public class Monument{

    // Benötigte Variablen
    private int artMonument;
    private int artBevoelkerung;
    private int anzahlBevoelkerung;
    private int unterhalt;
    private int radius;
    private String groesse;
    private int wissen;
    private String dauer;
    private int konstruktionsteile;
    private int einwohnerPlus;
    private int[] artProdukte;
    private int[] mengeProdukte;
    private String text;

    // Konstruktor
    public Monument(int artMonument, int artBevoelkerung, int anzahlBevoelkerung, int unterhalt, int radius, String groesse, int wissen, String dauer, int konstruktionsteile, int einwohnerPlus, int[] artProdukte, int[]mengeProdukte, String text) {
        // Variablen zuweisen
        this.artMonument = artMonument;
        this.artBevoelkerung = artBevoelkerung;
        this.anzahlBevoelkerung = anzahlBevoelkerung;
        this.unterhalt = unterhalt;
        this.radius = radius;
        this.groesse = groesse;
        this.wissen = wissen;
        this.dauer = dauer;
        this.konstruktionsteile = konstruktionsteile;
        this.einwohnerPlus = einwohnerPlus;
        this.artProdukte = artProdukte;
        this.mengeProdukte = mengeProdukte;
        this.text = text;
    }

    // Anzahl an Produkten
    public int zaehleProdukte(){
        int anzahl = 0;
        return artProdukte.length;
    }

    // Getter
    public int getArtMonument(){
        return artMonument;
    }

    public int getArtBevoelkerung(){
        return artBevoelkerung;
    }

    public int getAnzahlBevoelkerung() {
        return anzahlBevoelkerung;
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

    public int getWissen() {
        return wissen;
    }

    public String getDauer() {
        return dauer;
    }

    public int getKonstruktionsteile() {
        return konstruktionsteile;
    }

    public int getEinwohnerPlus() {
        return einwohnerPlus;
    }

    public int[] getArtProdukte() {
        return artProdukte;
    }

    public int[] getMengeProdukte() {
        return mengeProdukte;
    }

    public String getText() {
        return text;
    }
}