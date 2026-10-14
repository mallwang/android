package com.iusemybrain.apps.myannoonline.dialogcontent;

/**
 * Created by Markus on 27.04.2015.
 */
public class Insel {

    // Benötigte Variablen
    private int artInsel;
    private int artVorkommen;
    private int artFruchtbarkeit;
    private int rubine;

    // Konstruktor
    public Insel(int artInsel, int artVorkommen, int artFruchtbarkeit, int rubine) {
        this.artInsel = artInsel;
        this.artVorkommen = artVorkommen;
        this.artFruchtbarkeit = artFruchtbarkeit;
        this.rubine = rubine;
    }

    // Getter
    public int getArtInsel() {
        return artInsel;
    }

    public int getArtVorkommen() {
        return artVorkommen;
    }

    public int getArtFruchtbarkeit() {
        return artFruchtbarkeit;
    }

    public int getRubine() {
        return rubine;
    }
}
