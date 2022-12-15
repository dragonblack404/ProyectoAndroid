package com.example.projectprimtrim;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CategoriasActivity extends AppCompatActivity {

    public String descripcionCat, gameCat, descripcionDetCat;
    int numCat;
    public static Game gameSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //Juegos para mostrar en la lista
        Game[] games = new Game[]{
                new Game(getString(R.string.cat_bat), getString(R.string.des_bat), R.drawable.batt, getString(R.string.det_bat)),
                new Game(getString(R.string.cat_cod), getString(R.string.des_cod), R.drawable.cod, getString(R.string.det_cod)),
                new Game(getString(R.string.cat_fifa), getString(R.string.des_fifa), R.drawable.easport, getString(R.string.det_fifa)),
                new Game(getString(R.string.cat_lol), getString(R.string.des_lol), R.drawable.lol, getString(R.string.det_lol))
        };


        ListView listadoGames = findViewById(R.id.lvItems);

        // Cabecera del listado

        View viewListado = null;

        viewListado = getLayoutInflater().inflate(R.layout.cabezera_lista, null);
/*
Solucion al problema de la cabecera
 */
        if (listadoGames.getHeaderViewsCount() == 0)
            listadoGames.addHeaderView(viewListado);

        // Instanciamos y asignamos el adaptador personalizado
        AdapterGame adaptador = new AdapterGame(this, games);
        listadoGames.setAdapter(adaptador);

        /* Listener para controlar el pulsado de alguna de las opciones del listado. Recogemos los textos
        del ítem pulsado y la imagen */


        listadoGames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //gameSelected = (Game) adapterView.getItemAtPosition(i);

                TextView gameSeleccionado = findViewById(R.id.gameTitle);
                gameCat = ((Game) adapterView.getItemAtPosition(i)).getGame();
                gameSeleccionado.setText(gameCat);

                ImageView fotoSeleccionada = findViewById(R.id.gamePhoto);
                numCat = ((Game) adapterView.getItemAtPosition(i)).getImgPhoto();
                fotoSeleccionada.setImageResource(numCat);

                TextView descripcionSeleccionada = findViewById(R.id.gameDescription);
                descripcionCat = ((Game) adapterView.getItemAtPosition(i)).getDescripcion();
                descripcionSeleccionada.setText(descripcionCat);

                descripcionDetCat = ((Game) adapterView.getItemAtPosition(i)).getDetallada();

                lanzarActivity(view);
            }
        });
    }

    private void lanzarActivity(View view) {
        Intent detalle;
        detalle = new Intent(this, DetalleLista.class);
        detalle.putExtra("nombreJuego", gameCat);
        detalle.putExtra("detalladajuego", descripcionDetCat);
        detalle.putExtra("imagenJuego", numCat);
        startActivity(detalle);
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