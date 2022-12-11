package com.example.projectprimtrim;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    private Context getActivity() {
        return this;
    }


    /*
    Inicializacion de la barra del menú de inicio con los diferentes items creados
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.inicio_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /*
    Implementenzacion del método para detectar el item escogido, y realizar función según corresponda
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent cambiarActividad;
        //Option

        //Arrancaremos las actividades correspondientes,y ademas lanzaremos unos Toast para avisar
        // al usuario por donde se encuentra
        switch (item.getItemId()){
            case R.id.acercaItem:
                Toast.makeText(this, "Acerca de..", Toast.LENGTH_LONG).show();
                PopUp popup = new PopUp();
                popup.show(getSupportFragmentManager(),"");
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
                cambiarActividad = new Intent(this, FormularioActivity.class);
                startActivity(cambiarActividad);
                break;
            case R.id.listItem:
                Toast.makeText(this, "Listado", Toast.LENGTH_SHORT).show();
                cambiarActividad = new Intent(this, ListaActivity.class);
                startActivity(cambiarActividad);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
/*
    private void onCreateDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Acerca de")
                .setMessage("Esta aplicación ha sido creada en Android Studio programando en Java y su autor es Dónovan Castro Fariña estudiante de 2º de DAM.")
                .setPositiveButton("Aceptar", (d, i) -> {});
        return builder.create();
    }*/
}