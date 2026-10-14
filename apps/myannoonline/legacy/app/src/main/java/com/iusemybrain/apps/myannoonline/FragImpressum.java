package com.iusemybrain.apps.myannoonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Markus on 02.04.2015.
 */
public class FragImpressum extends Fragment {
    private View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.layout_impressum, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button btn_impr_feedback = (Button) getActivity().findViewById(R.id.btn_impr_feedback);
        btn_impr_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                String[] recipients = new String[]{"feedback.myannoonline@i-use-my-brain.com"};
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);
                emailIntent.setType("text/plain");
                startActivity(Intent.createChooser(emailIntent, getString(R.string.str_impr_feedback)));
            }
        });
    }
}

