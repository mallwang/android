package com.iusemybrain.apps.myannoonline;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.iusemybrain.apps.myannoonline.dialogcontent.Insel;

/**
 * Created by Markus on 02.04.2015.
 */
public class FragInseln extends Fragment {
    private View rootView;
    private Dialogersteller dialogersteller;
    private Inselersteller inselersteller;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.layout_inseln, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        dialogersteller = new Dialogersteller(getActivity());
        inselersteller = new Inselersteller(getActivity());

        // Alle Inseln erstellen
        inselersteller.erstelleInseln();

        /* ACTIONLISTENER */
        // Kleine Inseln
        ImageButton btn_insel_klein = (ImageButton) rootView.findViewById(R.id.btn_insel_klein);
        btn_insel_klein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Insel insel_klein1 = inselersteller.getIns_klein1();
                Insel insel_klein2 = inselersteller.getIns_klein2();
                Insel insel_klein3 = inselersteller.getIns_klein3();
                Insel insel_klein4 = inselersteller.getIns_klein4();
                Insel insel_klein5 = inselersteller.getIns_klein5();
                Insel[] alleInseln = {insel_klein1, insel_klein2, insel_klein3, insel_klein4, insel_klein5};
                dialogersteller.erstelleInselDialog(getString(R.string.str_inseln_klein), alleInseln);
            }
        });

        // Mittlere Inseln
        ImageButton btn_insel_mittel = (ImageButton) rootView.findViewById(R.id.btn_inseln_mittel);
        btn_insel_mittel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Insel insel_mittel1 = inselersteller.getIns_mittel1();
                Insel insel_mittel2 = inselersteller.getIns_mittel2();
                Insel insel_mittel3 = inselersteller.getIns_mittel3();
                Insel insel_mittel4 = inselersteller.getIns_mittel4();
                Insel insel_mittel5 = inselersteller.getIns_mittel5();
                Insel insel_mittel6 = inselersteller.getIns_mittel6();
                Insel insel_mittel7 = inselersteller.getIns_mittel7();
                Insel insel_mittel8 = inselersteller.getIns_mittel8();
                Insel insel_mittel9 = inselersteller.getIns_mittel9();
                Insel insel_mittel10 = inselersteller.getIns_mittel10();
                Insel[] alleInseln = {insel_mittel1, insel_mittel2, insel_mittel3, insel_mittel4, insel_mittel5, insel_mittel6, insel_mittel7, insel_mittel8, insel_mittel9, insel_mittel10};
                dialogersteller.erstelleInselDialog(getString(R.string.str_inseln_mittel), alleInseln);
            }
        });

        // Große Inseln
        ImageButton btn_insel_gross = (ImageButton) rootView.findViewById(R.id.btn_inseln_gross);
        btn_insel_gross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Insel insel_gross1 = inselersteller.getIns_gross1();
                Insel insel_gross2 = inselersteller.getIns_gross2();
                Insel insel_gross3 = inselersteller.getIns_gross3();
                Insel insel_gross4 = inselersteller.getIns_gross4();
                Insel insel_gross5 = inselersteller.getIns_gross5();
                Insel insel_gross6 = inselersteller.getIns_gross6();
                Insel[] alleInseln = {insel_gross1, insel_gross2, insel_gross3, insel_gross4, insel_gross5, insel_gross6};
                dialogersteller.erstelleInselDialog(getString(R.string.str_inseln_gross), alleInseln);
            }
        });

        // Riesige Inseln
        ImageButton btn_insel_riesig = (ImageButton) rootView.findViewById(R.id.btn_inseln_riesig);
        btn_insel_riesig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Insel insel_riesig1 = inselersteller.getIns_riesig1();
                Insel insel_riesig2 = inselersteller.getIns_riesig2();
                Insel insel_riesig3 = inselersteller.getIns_riesig3();
                Insel insel_riesig4 = inselersteller.getIns_riesig4();
                Insel insel_riesig5 = inselersteller.getIns_riesig5();
                Insel insel_riesig6 = inselersteller.getIns_riesig6();
                Insel insel_riesig7 = inselersteller.getIns_riesig7();
                Insel insel_riesig8 = inselersteller.getIns_riesig8();
                Insel insel_riesig9 = inselersteller.getIns_riesig9();
                Insel[] alleInseln = {insel_riesig1, insel_riesig2, insel_riesig3, insel_riesig4, insel_riesig5, insel_riesig6, insel_riesig7, insel_riesig8, insel_riesig9};
                dialogersteller.erstelleInselDialog(getString(R.string.str_inseln_riesig), alleInseln);
            }
        });

    }
}
