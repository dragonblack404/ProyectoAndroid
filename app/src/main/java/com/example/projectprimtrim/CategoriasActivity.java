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

    public String descripcionCat, gameCat;
    int numCat;

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
                new Game(getString(R.string.cat_bat), getString(R.string.des_bat), R.drawable.batt,getString(R.string.det_bat)),
                new Game(getString(R.string.cat_cod), getString(R.string.des_cod), R.drawable.cod, getString(R.string.det_cod)),
                new Game(getString(R.string.cat_fifa), getString(R.string.des_fifa), R.drawable.easport, getString(R.string.det_fifa),
                new Game(getString(R.string.cat_lol), getString(R.string.des_lol), R.drawable.lol, getString(R.string.det_lol))

        };


        ListView listadoGames = (ListView) findViewById(R.id.lvItems);

        // Cabecera del listado
        View cabeceraGV = getLayoutInflater().inflate(R.layout.cabezera_lista, null);
        listadoGames.addHeaderView(cabeceraGV);

        // Instanciamos y asignamos el adaptador personalizado
        AdapterGame adaptador = new AdapterGame(this, games);
        listadoGames.setAdapter(adaptador);

        /* Listener para controlar el pulsado de alguna de las opciones del listado. Recogemos los textos
        del ítem pulsado y los mostramos en 2 controles TextView */



        listadoGames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                TextView gameSeleccionado = (TextView) findViewById(R.id.gtTitle);
                gameCat = ((Game)adapterView.getItemAtPosition(i)).getGame();
                gameSeleccionado.setText(gameCat);

                ImageView fotoSeleccionada = findViewById(R.id.gtPhoto);
                numCat = ((Game)adapterView.getItemAtPosition(i)).getImgPhoto();
                fotoSeleccionada.setImageResource(numCat);

                TextView descripcionSeleccionada = (TextView) findViewById(R.id.gtDescripcionDetallada);
                descripcionCat = ((Game)adapterView.getItemAtPosition(i)).getDescripcion();
                descripcionSeleccionada.setText(descripcionCat);

                lanzarActivity();
            }
        });
    }

    private void lanzarActivity(){
        Intent detalle;
        detalle = new Intent(this, DetalleLista.class);
        startActivity(detalle);
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