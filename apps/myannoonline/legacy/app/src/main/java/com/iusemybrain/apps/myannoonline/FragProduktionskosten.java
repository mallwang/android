package com.iusemybrain.apps.myannoonline;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Markus on 02.04.2015.
 */
public class FragProduktionskosten extends Fragment {
    private View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.layout_produktionskosten, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Resources resources = getResources();

        // Holz
        TextView tv_prk_holz = (TextView) rootView.findViewById(R.id.tv_prk_holz);
        tv_prk_holz.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_holz)));
        tv_prk_holz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_holz));
            }
        });

        // Stein
        TextView tv_prk_stein = (TextView) rootView.findViewById(R.id.tv_prk_stein);
        tv_prk_stein.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_stein)));
        tv_prk_stein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_stein));
            }
        });

        // Eisenerz
        TextView tv_prk_eisenerz = (TextView) rootView.findViewById(R.id.tv_prk_eisenerz);
        tv_prk_eisenerz.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_eisenerz)));
        tv_prk_eisenerz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_eisenerz));
            }
        });

        // Kohle
        TextView tv_prk_kohle = (TextView) rootView.findViewById(R.id.tv_prk_kohle);
        tv_prk_kohle.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_kohle)));
        tv_prk_kohle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_kohle));
            }
        });

        // Eisen
        TextView tv_prk_eisen = (TextView) rootView.findViewById(R.id.tv_prk_eisen);
        tv_prk_eisen.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_eisen)));
        tv_prk_eisen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_eisen));
            }
        });

        // Werkzeug
        TextView tv_prk_werkzeug = (TextView) rootView.findViewById(R.id.tv_prk_werkzeug);
        tv_prk_werkzeug.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_werkzeug)));
        tv_prk_werkzeug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_werkzeug));
            }
        });

        // Pottasche
        TextView tv_prk_pottasche = (TextView) rootView.findViewById(R.id.tv_prk_pottasche);
        tv_prk_pottasche.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_pottasche)));
        tv_prk_pottasche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_pottasche));
            }
        });

        // Quarz
        TextView tv_prk_quarz = (TextView) rootView.findViewById(R.id.tv_prk_quarz);
        tv_prk_quarz.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_quarz)));
        tv_prk_quarz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_quarz));
            }
        });

        // Glas
        TextView tv_prk_glas = (TextView) rootView.findViewById(R.id.tv_prk_glas);
        tv_prk_glas.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_glas)));
        tv_prk_glas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_glas));
            }
        });

        // Fisch
        TextView tv_prk_fisch = (TextView) rootView.findViewById(R.id.tv_prk_fisch);
        tv_prk_fisch.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_fisch)));
        tv_prk_fisch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_fisch));
            }
        });

        // Weizen
        TextView tv_prk_weizen = (TextView) rootView.findViewById(R.id.tv_prk_weizen);
        tv_prk_weizen.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_weizen)));
        tv_prk_weizen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_weizen));
            }
        });

        // Mehl
        TextView tv_prk_mehl = (TextView) rootView.findViewById(R.id.tv_prk_mehl);
        tv_prk_mehl.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_mehl)));
        tv_prk_mehl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_mehl));
            }
        });

        // Brot
        TextView tv_prk_brot = (TextView) rootView.findViewById(R.id.tv_prk_brot);
        tv_prk_brot.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_brot)));
        tv_prk_brot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_brot));
            }
        });

        // Vieh
        TextView tv_prk_vieh = (TextView) rootView.findViewById(R.id.tv_prk_vieh);
        tv_prk_vieh.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_vieh)));
        tv_prk_vieh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_vieh));
            }
        });

        // Fleisch
        TextView tv_prk_fleisch = (TextView) rootView.findViewById(R.id.tv_prk_fleisch);
        tv_prk_fleisch.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_fleisch)));
        tv_prk_fleisch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_fleisch));
            }
        });

        // Milch
        TextView tv_prk_milch = (TextView) rootView.findViewById(R.id.tv_prk_milch);
        tv_prk_milch.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_milch)));
        tv_prk_milch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_milch));
            }
        });

        // Äpfel
        TextView tv_prk_aepfel = (TextView) rootView.findViewById(R.id.tv_prk_aepfel);
        tv_prk_aepfel.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_aepfel)));
        tv_prk_aepfel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_aepfel));
            }
        });

        // Most
        TextView tv_prk_most = (TextView) rootView.findViewById(R.id.tv_prk_most);
        tv_prk_most.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_most)));
        tv_prk_most.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_most));
            }
        });

        // Kräuter
        TextView tv_prk_kraeuter = (TextView) rootView.findViewById(R.id.tv_prk_kraeuter);
        tv_prk_kraeuter.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_kraeuter)));
        tv_prk_kraeuter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_kraeuter));
            }
        });

        // Bier
        TextView tv_prk_bier = (TextView) rootView.findViewById(R.id.tv_prk_bier);
        tv_prk_bier.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_bier)));
        tv_prk_bier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_bier));
            }
        });

        // Trauben
        TextView tv_prk_trauben = (TextView) rootView.findViewById(R.id.tv_prk_trauben);
        tv_prk_trauben.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_trauben)));
        tv_prk_trauben.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_trauben));
            }
        });

        // Fässer
        TextView tv_prk_faesser = (TextView) rootView.findViewById(R.id.tv_prk_faesser);
        tv_prk_faesser.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_faesser)));
        tv_prk_faesser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_faesser));
            }
        });

        // Wein
        TextView tv_prk_wein = (TextView) rootView.findViewById(R.id.tv_prk_wein);
        tv_prk_wein.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_wein)));
        tv_prk_wein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_wein));
            }
        });

        // Wolle
        TextView tv_prk_wolle = (TextView) rootView.findViewById(R.id.tv_prk_wolle);
        tv_prk_wolle.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_wolle)));
        tv_prk_wolle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_wolle));
            }
        });

        // Wollgewänder
        TextView tv_prk_wollgewaender = (TextView) rootView.findViewById(R.id.tv_prk_wollgewaender);
        tv_prk_wollgewaender.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_wollgewaender)));
        tv_prk_wollgewaender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_wollgewaender));
            }
        });

        // Hanf
        TextView tv_prk_hanf = (TextView) rootView.findViewById(R.id.tv_prk_hanf);
        tv_prk_hanf.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_hanf)));
        tv_prk_hanf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_hanf));
            }
        });

        // Leinengewänder
        TextView tv_prk_leinengewaender = (TextView) rootView.findViewById(R.id.tv_prk_leinengewaender);
        tv_prk_leinengewaender.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_leinengewaender)));
        tv_prk_leinengewaender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_leinengewaender));
            }
        });

        // Tierhäute
        TextView tv_prk_tierhaeute = (TextView) rootView.findViewById(R.id.tv_prk_tierhaeute);
        tv_prk_tierhaeute.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_tierhaeute)));
        tv_prk_tierhaeute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_tierhaeute));
            }
        });

        // Sole
        TextView tv_prk_sole = (TextView) rootView.findViewById(R.id.tv_prk_sole);
        tv_prk_sole.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_sole)));
        tv_prk_sole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_sole));
            }
        });

        // Salz
        TextView tv_prk_salz = (TextView) rootView.findViewById(R.id.tv_prk_salz);
        tv_prk_salz.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_salz)));
        tv_prk_salz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_salz));
            }
        });

        // Lederwämser
        TextView tv_prk_lederwaemser = (TextView) rootView.findViewById(R.id.tv_prk_lederwaemser);
        tv_prk_lederwaemser.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_lederwaemser)));
        tv_prk_lederwaemser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_lederwaemser));
            }
        });

        // Pelze
        TextView tv_prk_pelze = (TextView) rootView.findViewById(R.id.tv_prk_pelze);
        tv_prk_pelze.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_pelze)));
        tv_prk_pelze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_pelze));
            }
        });

        // Pelzmäntel
        TextView tv_prk_pelzmaentel = (TextView) rootView.findViewById(R.id.tv_prk_pelzmaentel);
        tv_prk_pelzmaentel.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_pelzmaentel)));
        tv_prk_pelzmaentel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_pelzmaentel));
            }
        });

        // Golderz
        TextView tv_prk_golderz = (TextView) rootView.findViewById(R.id.tv_prk_golderz);
        tv_prk_golderz.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_golderz)));
        tv_prk_golderz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_golderz));
            }
        });

        // Gold
        TextView tv_prk_gold = (TextView) rootView.findViewById(R.id.tv_prk_gold);
        tv_prk_gold.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_gold)));
        tv_prk_gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_gold));
            }
        });

        // Brokatgewänder
        TextView tv_prk_brokatgewaender = (TextView) rootView.findViewById(R.id.tv_prk_brokatgewaender);
        tv_prk_brokatgewaender.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_brokatgewaender)));
        tv_prk_brokatgewaender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_brokatgewaender));
            }
        });

        // Papier
        TextView tv_prk_papier = (TextView) rootView.findViewById(R.id.tv_prk_papier);
        tv_prk_papier.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_papier)));
        tv_prk_papier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_papier));
            }
        });

        // Bücher
        TextView tv_prk_buecher = (TextView) rootView.findViewById(R.id.tv_prk_buecher);
        tv_prk_buecher.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_buecher)));
        tv_prk_buecher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_buecher));
            }
        });

        // Kupfererz
        TextView tv_prk_kupfererz = (TextView) rootView.findViewById(R.id.tv_prk_kupfererz);
        tv_prk_kupfererz.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_kupfererz)));
        tv_prk_kupfererz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_kupfererz));
            }
        });

        // Messing
        TextView tv_prk_messing = (TextView) rootView.findViewById(R.id.tv_prk_messing);
        tv_prk_messing.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_messing)));
        tv_prk_messing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_messing));
            }
        });

        // Bienenwachs
        TextView tv_prk_bienenwachs = (TextView) rootView.findViewById(R.id.tv_prk_bienenwachs);
        tv_prk_bienenwachs.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_bienenwachs)));
        tv_prk_bienenwachs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_bienenwachs));
            }
        });

        // Kerzen
        TextView tv_prk_kerzen = (TextView) rootView.findViewById(R.id.tv_prk_kerzen);
        tv_prk_kerzen.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_kerzen)));
        tv_prk_kerzen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_kerzen));
            }
        });

        // Kerzenleuchter
        TextView tv_prk_kerzenleuchter = (TextView) rootView.findViewById(R.id.tv_prk_kerzenleuchter);
        tv_prk_kerzenleuchter.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_kerzenleuchter)));
        tv_prk_kerzenleuchter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_kerzenhalter));
            }
        });

        // Brillen
        TextView tv_prk_brillen = (TextView) rootView.findViewById(R.id.tv_prk_brillen);
        tv_prk_brillen.setText(String.valueOf(resources.getInteger(R.integer.int_produktionskosten_brillen)));
        tv_prk_brillen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_brillen));
            }
        });
    }

    private void makeShortToast(String produkt) {
        Toast.makeText(getActivity().getApplicationContext(), produkt, Toast.LENGTH_SHORT).show();
    }
}

