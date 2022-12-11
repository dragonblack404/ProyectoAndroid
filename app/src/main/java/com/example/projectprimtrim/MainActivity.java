package com.example.projectprimtrim;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*
    @Override
    protected void onResume() {
        super.onResume();

        //Asociamos el
    }
*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.inicio_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent cambiarActividad;

        switch (item.getItemId()){
            case R.id.acercaItem:
                Toast.makeText(this, "Acerca de..", Toast.LENGTH_SHORT).show();
                break;
            case R.id.homeItem:
                Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show();
                break;
            case R.id.catItem:
                Toast.makeText(this, "Categorias", Toast.LENGTH_SHORT).show();
                cambiarActividad = new Intent(this, CategoriasActivity.class);
                startActivity(cambiarActividad);
                break;
            case R.id.formItem:
                Toast.makeText(this, "Formulario", Toast.LENGTH_SHORT).show();
                break;
            case R.id.listItem:
                Toast.makeText(this, "Listado", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}