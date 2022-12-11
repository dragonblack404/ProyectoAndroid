package com.example.projectprimtrim;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class CategoriasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }

    /*
    Barra menu con el icono para volver al inicio
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.items_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /*
    solo tenemos un icono de menu, con lo cual el método se queda muy corto con respecto
    al princpial
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent cambiarActividad;
        if (item != null){
            cambiarActividad = new Intent(this, MainActivity.class);
            startActivity(cambiarActividad);
        }
        return super.onOptionsItemSelected(item);
    }


}