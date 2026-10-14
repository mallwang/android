package com.iusemybrain.apps.myannoonline;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by Markus on 02.04.2015.
 */
public class  FragSchiffe extends Fragment {
    private View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.layout_schiffe, container, false);
        return rootView;
    }
}
