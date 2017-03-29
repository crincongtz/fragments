package com.crincongtz.fragments.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crincongtz.fragments.R;

/**
 * Created by crincon on 28/03/17.
 */

public class Derecha extends Fragment {
    View rootView;
    TextView txt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.derecha, container, false);
        txt = (TextView) rootView.findViewById(R.id.txt);

        return rootView;
    }

    public void ObtenerDatos(String mensaje){
        txt.setText(mensaje);
    }

}
