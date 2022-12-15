package com.example.projectprimtrim;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
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
        gameStringTitulo = getIntent().getStringExtra("nombreJuego");
        gameStringDescripcion = getIntent().getStringExtra("detalladajuego");
        imgIntFoto = getIntent().getIntExtra("imagenJuego",0 );

        gameTitulo = findViewById(R.id.gtTitle);
        gameTitulo.setText(gameStringTitulo);

        gameDescripcion = findViewById(R.id.gtDescriptionDet);
        gameDescripcion.setText(gameStringDescripcion);

        gameFoto = findViewById(R.id.gtPhoto);
        gameFoto.setImageResource(imgIntFoto);

        ImageButton atrasBut =  findViewById(R.id.atrasButton);
        atrasBut.setOnClickListener(view -> finish());
    }


}