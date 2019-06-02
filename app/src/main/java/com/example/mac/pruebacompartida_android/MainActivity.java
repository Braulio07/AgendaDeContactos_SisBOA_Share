package com.example.mac.pruebacompartida_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String nombreVendedor = "";
    String apellido="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//...



    //saludar
    public void MetodoSaludar(){
        Toast.makeText(getApplicationContext(), "Hola mundo", Toast.LENGTH_LONG).show();
    }


}
