package com.iusemybrain.apps.myannoonline;

import android.content.res.Resources;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Markus on 02.04.2015.
 */
public class FragVerbrauchstabelle extends Fragment {
    private View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.layout_verbauchstabelle, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Resources resources = getResources();

        /* Alle Textviews abfragen */
        // Fisch
        TextView tv_vbt_fisch_bauern = (TextView) rootView.findViewById(R.id.tv_vbt_fisch_bauern);
        TextView tv_vbt_fisch_handwerker = (TextView) rootView.findViewById(R.id.tv_vbt_fisch_handwerker);
        TextView tv_vbt_fisch_kaufleute = (TextView) rootView.findViewById(R.id.tv_vbt_fisch_kaufleute);
        TextView tv_vbt_fisch_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_fisch_adlige);
        // Brot
        TextView tv_vbt_brot_handwerker = (TextView) rootView.findViewById(R.id.tv_vbt_brot_handwerker);
        TextView tv_vbt_brot_kaufleute = (TextView) rootView.findViewById(R.id.tv_vbt_brot_kaufleute);
        TextView tv_vbt_brot_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_brot_adlige);
        // Fleisch
        TextView tv_vbt_fleisch_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_fleisch_adlige);
        // Milch
        TextView tv_vbt_milch_bauern = (TextView) rootView.findViewById(R.id.tv_vbt_milch_bauern);
        TextView tv_vbt_milch_handwerker = (TextView) rootView.findViewById(R.id.tv_vbt_milch_handwerker);
        TextView tv_vbt_milch_kaufleute = (TextView) rootView.findViewById(R.id.tv_vbt_milch_kaufleute);
        TextView tv_vbt_milch_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_milch_adlige);
        // Most
        TextView tv_vbt_most_handwerker = (TextView) rootView.findViewById(R.id.tv_vbt_most_handwerker);
        TextView tv_vbt_most_kaufleute = (TextView) rootView.findViewById(R.id.tv_vbt_most_kaufleute);
        TextView tv_vbt_most_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_most_adlige);
        // Bier
        TextView tv_vbt_bier_kaufleute = (TextView) rootView.findViewById(R.id.tv_vbt_bier_kaufleute);
        TextView tv_vbt_bier_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_bier_adlige);
        // Wein
        TextView tv_vbt_wein_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_wein_adlige);
        // Wollgewänder
        TextView tv_vbt_wollgewaender_bauern = (TextView) rootView.findViewById(R.id.tv_vbt_wollgewaender_bauern);
        TextView tv_vbt_wollgewaender_handwerker = (TextView) rootView.findViewById(R.id.tv_vbt_wollgewaender_handwerker);
        TextView tv_vbt_wollgewaender_kaufleute = (TextView) rootView.findViewById(R.id.tv_vbt_wollgewaender_kaufleute);
        TextView tv_vbt_wollgewaender_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_wollgewaender_adlige);
        // Leinengewänder
        TextView tv_vbt_leinengewaender_handwerker = (TextView) rootView.findViewById(R.id.tv_vbt_leinengewaender_handwerker);
        TextView tv_vbt_leinengewaender_kaufleute = (TextView) rootView.findViewById(R.id.tv_vbt_leinengewaender_kaufleute);
        TextView tv_vbt_leinengewaender_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_leinengewaender_adlige);
        // Lederwämser
        TextView tv_vbt_lederwaemser_kaufleute = (TextView) rootView.findViewById(R.id.tv_vbt_lederwaemser_kaufleute);
        TextView tv_vbt_lederwaemser_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_lederwaemser_adlige);
        // Pelzmäntel
        TextView tv_vbt_pelzmaentel_kaufleute = (TextView) rootView.findViewById(R.id.tv_vbt_pelzmaentel_kaufleute);
        TextView tv_vbt_pelzmaentel_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_pelzmaentel_adlige);
        // Brokatgewänder
        TextView tv_vbt_brokatgewaender_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_brokatgewaender_adlige);
        // Bücher
        TextView tv_vbt_buecher_kaufleute = (TextView) rootView.findViewById(R.id.tv_vbt_buecher_kaufleute);
        TextView tv_vbt_buecher_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_buecher_adlige);
        // Kerzenleuchter
        TextView tv_vbt_kerzenleuchter_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_kerzenleuchter_adlige);
        // Brillen
        TextView tv_vbt_brillen_adlige = (TextView) rootView.findViewById(R.id.tv_vbt_brillen_adlige);

        /* Werte setzen */
        // Fisch
        tv_vbt_fisch_bauern.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_fisch_bauern)));
        tv_vbt_fisch_handwerker.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_fisch_handwerker)));
        tv_vbt_fisch_kaufleute.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_fisch_kaufleute)));
        tv_vbt_fisch_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_fisch_adlige)));
        // Brot
        tv_vbt_brot_handwerker.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_brot_handwerker)));
        tv_vbt_brot_kaufleute.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_brot_kaufleute)));
        tv_vbt_brot_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_brot_adlige)));

        // Fleisch
        tv_vbt_fleisch_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_fleisch_adlige)));

        // Milch
        tv_vbt_milch_bauern.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_milch_bauern)));
        tv_vbt_milch_handwerker.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_milch_handwerker)));
        tv_vbt_milch_kaufleute.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_milch_kaufleute)));
        tv_vbt_milch_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_milch_adlige)));

        // Most
        tv_vbt_most_handwerker.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_most_handwerker)));
        tv_vbt_most_kaufleute.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_most_kaufleute)));
        tv_vbt_most_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_most_adlige)));

        // Bier
        tv_vbt_bier_kaufleute.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_bier_kaufleute)));
        tv_vbt_bier_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_bier_adlige)));

        // Wein
        tv_vbt_wein_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_wein_adlige)));

        // Wollgewaender
        tv_vbt_wollgewaender_bauern.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_wollgewaender_bauern)));
        tv_vbt_wollgewaender_handwerker.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_wollgewaender_handwerker)));
        tv_vbt_wollgewaender_kaufleute.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_wollgewaender_kaufleute)));
        tv_vbt_wollgewaender_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_wollgewaender_adlige)));

        // Leinengewaender
        tv_vbt_leinengewaender_handwerker.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_leinengewaender_handwerker)));
        tv_vbt_leinengewaender_kaufleute.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_leinengewaender_kaufleute)));
        tv_vbt_leinengewaender_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_leinengewaender_adlige)));

        // Lederwaemser
        tv_vbt_lederwaemser_kaufleute.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_lederwaemser_kaufleute)));
        tv_vbt_lederwaemser_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_lederwaemser_adlige)));

        // Pelzmaentel
        tv_vbt_pelzmaentel_kaufleute.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_pelzmaentel_kaufleute)));
        tv_vbt_pelzmaentel_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_pelzmaentel_adlige)));

        // Brokatgewaender
        tv_vbt_brokatgewaender_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_brokatgewaender_adlige)));

        // Buecher
        tv_vbt_buecher_kaufleute.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_buecher_kaufleute)));
        tv_vbt_buecher_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_buecher_adlige)));

        // Kerzenleuchter
        tv_vbt_kerzenleuchter_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_kerzenleuchter_adlige)));

        // Brillen
        tv_vbt_brillen_adlige.setText(String.valueOf(resources.getInteger(R.integer.int_versorgung_brillen_adlige)));

        // Alle Imageviews abfragen
        ImageView iv_vbt_bauern = (ImageView) rootView.findViewById(R.id.iv_vbt_bauern);
        ImageView iv_vbt_handwerker = (ImageView) rootView.findViewById(R.id.iv_vbt_handwerker);
        ImageView iv_vbt_kaufleute = (ImageView) rootView.findViewById(R.id.iv_vbt_kaufleute);
        ImageView iv_vbt_adlige = (ImageView) rootView.findViewById(R.id.iv_vbt_adlige);
        ImageView iv_vbt_fisch = (ImageView) rootView.findViewById(R.id.iv_vbt_fisch);
        ImageView iv_vbt_brot = (ImageView) rootView.findViewById(R.id.iv_vbt_brot);
        ImageView iv_vbt_fleisch = (ImageView) rootView.findViewById(R.id.iv_vbt_fleisch);
        ImageView iv_vbt_milch = (ImageView) rootView.findViewById(R.id.iv_vbt_milch);
        ImageView iv_vbt_most = (ImageView) rootView.findViewById(R.id.iv_vbt_most);
        ImageView iv_vbt_bier = (ImageView) rootView.findViewById(R.id.iv_vbt_bier);
        ImageView iv_vbt_wein = (ImageView) rootView.findViewById(R.id.iv_vbt_wein);
        ImageView iv_vbt_wollgewaender = (ImageView) rootView.findViewById(R.id.iv_vbt_wollgewaender);
        ImageView iv_vbt_leinengewaender = (ImageView) rootView.findViewById(R.id.iv_vbt_leinengewaender);
        ImageView iv_vbt_lederwaemser = (ImageView) rootView.findViewById(R.id.iv_vbt_lederwaemser);
        ImageView iv_vbt_pelzmaentel = (ImageView) rootView.findViewById(R.id.iv_vbt_pelzmaentel);
        ImageView iv_vbt_brokatgewaender = (ImageView) rootView.findViewById(R.id.iv_vbt_brokatgewaender);
        ImageView iv_vbt_buecher = (ImageView) rootView.findViewById(R.id.iv_vbt_buecher);
        ImageView iv_vbt_kerzenleuchter = (ImageView) rootView.findViewById(R.id.iv_vbt_kerzenleuchter);
        ImageView iv_vbt_brillen = (ImageView) rootView.findViewById(R.id.iv_vbt_brillen);

        /* OnClickListener setzen */
        // Bauern
        iv_vbt_bauern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_ew_bauer));
            }
        });
        // Handwerker
        iv_vbt_handwerker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_ew_handwerker));
            }
        });
        // Kaufleute
        iv_vbt_kaufleute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_ew_kaufleute));
            }
        });
        // Adllige
        iv_vbt_adlige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_ew_adlige));
            }
        });
        // Fisch
        iv_vbt_fisch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_fisch));
            }
        });
        // Brot
        iv_vbt_brot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_brot));
            }
        });
        // Fleisch
        iv_vbt_fleisch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_fleisch));
            }
        });
        // Milch
        iv_vbt_milch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_milch));
            }
        });
        // Most
        iv_vbt_most.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_most));
            }
        });
        // Bier
        iv_vbt_bier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_bier));
            }
        });
        // Wein
        iv_vbt_wein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_wein));
            }
        });
        // Wollgewaender
        iv_vbt_wollgewaender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_wollgewaender));
            }
        });
        // Leinengewaender
        iv_vbt_leinengewaender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_leinengewaender));
            }
        });
        // Lederwaemser
        iv_vbt_lederwaemser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_lederwaemser));
            }
        });
        // Pelzmaentel
        iv_vbt_pelzmaentel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_pelzmaentel));
            }
        });
        // Brokatgewaender
        iv_vbt_brokatgewaender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_brokatgewaender));
            }
        });
        // Buecher
        iv_vbt_buecher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_buecher));
            }
        });
        // Kerzenleuchter
        iv_vbt_kerzenleuchter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShortToast(getString(R.string.str_pr_kerzenhalter));
            }
        });
        // Brillen
        iv_vbt_brillen.setOnClickListener(new View.OnClickListener() {
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

