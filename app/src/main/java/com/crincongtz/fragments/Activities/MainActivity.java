package com.crincongtz.fragments.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.crincongtz.fragments.EnviarMensaje;
import com.crincongtz.fragments.Fragments.Derecha;
import com.crincongtz.fragments.R;

public class MainActivity extends AppCompatActivity implements EnviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviarDatos(String mensaje) {
        Derecha derecha = (Derecha) getFragmentManager().findFragmentById(R.id.derecha);
        derecha.ObtenerDatos(mensaje);
    }
}
