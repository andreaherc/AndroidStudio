package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvInfoEnviada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvInfoEnviada = findViewById(R.id.tvRespuesta);

        Bundle bundle=getIntent().getExtras();

        String dato = bundle.getString("Info").toString();
        tvInfoEnviada.setText(dato);

        findViewById(R.id.btnVolver).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volver =  new Intent(MainActivity2.this, MainActivity.class);
                startActivity(volver);
            }
        });

        findViewById(R.id.btnSalir).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();
            }
        });
    }
}