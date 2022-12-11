package com.example.projectprimtrim;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalleLista extends AppCompatActivity {
    private TextView gameTitulo, gameDescripcion;
    private ImageView imgFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descripcion_detallada);
    }

    @Override
    protected void onResume() {
        super.onResume();

        gameDescripcion = findViewById(R.id.gameDescription);
        Intent recibirDato = getIntent();
        gameDescripcion.setText(recibirDato.getStringExtra(""));
    }
}