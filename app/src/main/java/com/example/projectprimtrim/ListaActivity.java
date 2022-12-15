package com.example.projectprimtrim;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
    }

    /*
        Barra menu con el icono para volver al inicio
        */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.items_menu, menu);
        return true;
    }

    /*
    solo tenemos un icono de menu, con lo cual el método se queda muy corto con respecto
    al princpial
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent cambiarActividad;
        cambiarActividad = new Intent(this, MainActivity.class);
        switch (item.getItemId()) {
            case R.id.homeItem:
                startActivity(cambiarActividad);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}