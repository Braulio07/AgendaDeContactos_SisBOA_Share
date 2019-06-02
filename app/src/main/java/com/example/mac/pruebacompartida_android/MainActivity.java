package com.example.mac.pruebacompartida_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String nombreVendedor = "";
    String apellido="";
    Button btnIrActivity2_;
    EditText txtEscribeUnNombre_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEscribeUnNombre_ = (EditText) findViewById(R.id.txtEscribeUnNombre);
        btnIrActivity2_ = (Button) findViewById(R.id.btnIrActivity2);

        btnIrActivity2_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegunaActivity.class);
                intent.putExtra("nombreUsuario", txtEscribeUnNombre_.getText().toString());
                startActivity(intent);

            }
        });



        MetodoSaludar();

    }//...



    //saludar
    public void MetodoSaludar(){
        Toast.makeText(getApplicationContext(), "Hola mundo ESTOY SALUDANDO", Toast.LENGTH_LONG).show();
    }


}
