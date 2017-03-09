package com.example.laboratorio.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        TextView texto = (TextView) findViewById(R.id.textCalculadora);

        String msg = getIntent().getStringExtra("TextoCalcular");

        texto.setText(msg);


    }
}
