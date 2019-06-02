package com.example.mac.pruebacompartida_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegunaActivity extends AppCompatActivity {

    TextView txtSegundaActividad_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguna);

        String nombreMostrar = getIntent().getStringExtra("nombreUsuario");

        txtSegundaActividad_ = (TextView)findViewById(R.id.txtSegundaActividad);
        txtSegundaActividad_.setText("Bienvenido: "+nombreMostrar);
    }
}
