package com.iusemybrain.apps.myannoonline;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.iusemybrain.apps.myannoonline.dialogcontent.Monument;

/**
 * Created by Markus on 02.04.2015.
 */
public class FragMonumente extends Fragment {
    private View rootView;
    private Dialogersteller dialogersteller;
    private Monumentersteller monumentersteller;
    
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.layout_monumente, container, false);
        return rootView;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        dialogersteller = new Dialogersteller(getActivity());
        monumentersteller = new Monumentersteller(getActivity());
        
        // Alle Monumente erstellen
        monumentersteller.erstelleMonumente();

        /* ImageButtons abfragen */
        ImageButton btn_mon_bibliothek = (ImageButton) rootView.findViewById(R.id.btn_mon_bibliothek);
        ImageButton btn_mon_kaiserdom = (ImageButton) rootView.findViewById(R.id.btn_mon_kaiserdom);
        ImageButton btn_mon_amphitheater = (ImageButton) rootView.findViewById(R.id.btn_mon_amphitheater);
        ImageButton btn_mon_festung = (ImageButton) rootView.findViewById(R.id.btn_mon_festung);
        ImageButton btn_mon_apfelgarten = (ImageButton) rootView.findViewById(R.id.btn_mon_apfelgarten);
        ImageButton btn_mon_weizengarten = (ImageButton) rootView.findViewById(R.id.btn_mon_weizengarten);
        ImageButton btn_mon_hanfgarten = (ImageButton) rootView.findViewById(R.id.btn_mon_hanfgarten);
        ImageButton btn_mon_kraeutergarten = (ImageButton) rootView.findViewById(R.id.btn_mon_kraeutergarten);
        ImageButton btn_mon_traubengarten = (ImageButton) rootView.findViewById(R.id.btn_mon_traubengarten);
        ImageButton btn_mon_bienenwachsgarten = (ImageButton) rootView.findViewById(R.id.btn_mon_bienenwachsgarten);

        /* ACTIONLISTENER */
        // Bibliothek
        btn_mon_bibliothek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Monument monumentBibliothekGesamt = monumentersteller.getMonumentBibliothekGesamt();
                Monument monumentBibliothekPhase1 = monumentersteller.getMonumentBibliothekPhase1();
                Monument monumentBibliothekPhase2 = monumentersteller.getMonumentBibliothekPhase2();
                Monument[] alleMonumente = {monumentBibliothekGesamt, monumentBibliothekPhase1, monumentBibliothekPhase2};
                dialogersteller.erstelleMonumentDialog(getString(R.string.str_mon_bibliothek), alleMonumente);
            }
        });
        // Kaiserdom
        btn_mon_kaiserdom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Monument monumentKaiserdomGesamt = monumentersteller.getMonumentKaiserdomGesamt();
                Monument monumentKaiserdomPhase1 = monumentersteller.getMonumentKaiserdomPhase1();
                Monument monumentKaiserdomPhase2 = monumentersteller.getMonumentKaiserdomPhase2();
                Monument monumentKaiserdomPhase3 = monumentersteller.getMonumentKaiserdomPhase3();
                Monument[] alleMonumente = {monumentKaiserdomGesamt, monumentKaiserdomPhase1, monumentKaiserdomPhase2, monumentKaiserdomPhase3};
                dialogersteller.erstelleMonumentDialog(getString(R.string.str_mon_kaiserdom), alleMonumente);
            }
        });
        // Amphitheater
        btn_mon_amphitheater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Monument monumentAmphitheaterGesamt = monumentersteller.getMonumentAmphitheaterGesamt();
                Monument monumentAmphitheaterPhase1 = monumentersteller.getMonumentAmphitheaterPhase1();
                Monument monumentAmphitheaterPhase2 = monumentersteller.getMonumentAmphitheaterPhase2();
                Monument monumentAmphitheaterPhase3 = monumentersteller.getMonumentAmphitheaterPhase3();
                Monument[] alleMonumente = {monumentAmphitheaterGesamt, monumentAmphitheaterPhase1, monumentAmphitheaterPhase2, monumentAmphitheaterPhase3};
                dialogersteller.erstelleMonumentDialog(getString(R.string.str_mon_amphitheater), alleMonumente);
            }
        });
        // Festung
        btn_mon_festung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Monument monumentFestungGesamt = monumentersteller.getMonumentFestungGesamt();
                Monument monumentFestungPhase1 = monumentersteller.getMonumentFestungPhase1();
                Monument monumentFestungPhase2 = monumentersteller.getMonumentFestungPhase2();
                Monument monumentFestungPhase3 = monumentersteller.getMonumentFestungPhase3();
                Monument[] alleMonumente = {monumentFestungGesamt, monumentFestungPhase1, monumentFestungPhase2, monumentFestungPhase3};
                dialogersteller.erstelleMonumentDialog(getString(R.string.str_mon_amphitheater), alleMonumente);
            }
        });
        // Apfelgarten
        btn_mon_apfelgarten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Monument monumentApfelgartenGesamt = monumentersteller.getMonumentApfelgartenGesamt();
                Monument monumentApfelgartenPhase1 = monumentersteller.getMonumentApfelgartenPhase1();
                Monument monumentApfelgartenPhase2 = monumentersteller.getMonumentApfelgartenPhase2();
                Monument[] alleMonumente = {monumentApfelgartenGesamt, monumentApfelgartenPhase1, monumentApfelgartenPhase2};
                dialogersteller.erstelleMonumentDialog(getString(R.string.str_mon_amphitheater), alleMonumente);
            }
        });
        // Weizengarten
        btn_mon_weizengarten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Monument monumentWeizengartenGesamt = monumentersteller.getMonumentWeizengartenGesamt();
                Monument monumentWeizengartenPhase1 = monumentersteller.getMonumentWeizengartenPhase1();
                Monument monumentWeizengartenPhase2 = monumentersteller.getMonumentWeizengartenPhase2();
                Monument[] alleMonumente = {monumentWeizengartenGesamt, monumentWeizengartenPhase1, monumentWeizengartenPhase2};
                dialogersteller.erstelleMonumentDialog(getString(R.string.str_mon_amphitheater), alleMonumente);
            }
        });
        // Hanfgarten
        btn_mon_hanfgarten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Monument monumentHanfgartenGesamt = monumentersteller.getMonumentHanfgartenGesamt();
                Monument monumentHanfgartenPhase1 = monumentersteller.getMonumentHanfgartenPhase1();
                Monument monumentHanfgartenPhase2 = monumentersteller.getMonumentHanfgartenPhase2();
                Monument[] alleMonumente = {monumentHanfgartenGesamt, monumentHanfgartenPhase1, monumentHanfgartenPhase2};
                dialogersteller.erstelleMonumentDialog(getString(R.string.str_mon_amphitheater), alleMonumente);
            }
        });
        // Kraeutergarten
        btn_mon_kraeutergarten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Monument monumentKraeutergartenGesamt = monumentersteller.getMonumentKraeutergartenGesamt();
                Monument monumentKraeutergartenPhase1 = monumentersteller.getMonumentKraeutergartenPhase1();
                Monument monumentKraeutergartenPhase2 = monumentersteller.getMonumentKraeutergartenPhase2();
                Monument[] alleMonumente = {monumentKraeutergartenGesamt, monumentKraeutergartenPhase1, monumentKraeutergartenPhase2};
                dialogersteller.erstelleMonumentDialog(getString(R.string.str_mon_amphitheater), alleMonumente);
            }
        });
        // Traubengarten
        btn_mon_traubengarten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Monument monumentTraubengartenGesamt = monumentersteller.getMonumentTraubengartenGesamt();
                Monument monumentTraubengartenPhase1 = monumentersteller.getMonumentTraubengartenPhase1();
                Monument monumentTraubengartenPhase2 = monumentersteller.getMonumentTraubengartenPhase2();
                Monument[] alleMonumente = {monumentTraubengartenGesamt, monumentTraubengartenPhase1, monumentTraubengartenPhase2};
                dialogersteller.erstelleMonumentDialog(getString(R.string.str_mon_amphitheater), alleMonumente);
            }
        });
        // Bienenwachsgarten
        btn_mon_bienenwachsgarten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Monument monumentBienenwachsgartenGesamt = monumentersteller.getMonumentBienenwachsgartenGesamt();
                Monument monumentBienenwachsgartenPhase1 = monumentersteller.getMonumentBienenwachsgartenPhase1();
                Monument monumentBienenwachsgartenPhase2 = monumentersteller.getMonumentBienenwachsgartenPhase2();
                Monument[] alleMonumente = {monumentBienenwachsgartenGesamt, monumentBienenwachsgartenPhase1, monumentBienenwachsgartenPhase2};
                dialogersteller.erstelleMonumentDialog(getString(R.string.str_mon_amphitheater), alleMonumente);
            }
        });

    }
}
