package com.example.projectprimtrim;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalleLista extends AppCompatActivity {
    private TextView gameTitulo, gameDescripcion;
    private ImageView imgFoto;
    private Game item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descripcion_detallada);
        if (item != null) {
            gameTitulo = findViewById(R.id.gameTitle);
            gameDescripcion = findViewById(R.id.gameDescription);
            imgFoto = findViewById(R.id.gamePhoto);

            gameTitulo.setText(item.getGame());
            gameDescripcion.setText(item.getDescripcion());
            imgFoto.setImageResource(item.getImgPhoto());
        }

    }
}