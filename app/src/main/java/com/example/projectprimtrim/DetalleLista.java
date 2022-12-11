package com.example.projectprimtrim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalleLista extends AppCompatActivity {
    private String gameStringTitulo, gameStringDescripcion;
    private int imgIntFoto;

    private TextView gameDescripcion, gameTitulo;
    private ImageView gameFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descripcion_detallada);
    }

    @Override
    protected void onResume() {
        super.onResume();
        gameStringTitulo = getIntent().getStringExtra("nombrejuego");
        gameStringDescripcion = getIntent().getStringExtra("detalladajuego");
        imgIntFoto = getIntent().getIntExtra("imagenJuego", 0);

        gameDescripcion = (TextView) findViewById(R.id.gtDescripcionDetallada);
        gameDescripcion.setText(gameStringDescripcion);

        gameTitulo = (TextView) findViewById(R.id.gtTitle);
        gameTitulo.setText(gameStringTitulo);

        gameFoto = (ImageView) findViewById(R.id.gtPhoto);
        gameFoto.setImageResource(imgIntFoto);

        Button atrasBut = findViewById(R.id.atrasButton);
        atrasBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}