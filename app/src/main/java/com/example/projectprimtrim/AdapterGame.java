package com.example.projectprimtrim;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterGame extends ArrayAdapter<Game> {

    private Game[] games;

    public AdapterGame(Context cont, Game[] g){
        super(cont, R.layout.detalle_lista, g);
        games = g;
    }

    public View getView(int pos, View convertView, ViewGroup parent){
        LayoutInflater mostrar = LayoutInflater.from(getContext());
        View elemento = mostrar.inflate(R.layout.detalle_lista, parent, false);
        TextView textoGame = (TextView) elemento.findViewById(R.id.gameTitle);
        textoGame.setText(games[pos].getGame());
        TextView textoDescripcion = (TextView) elemento.findViewById(R.id.gameDescription);
        textoDescripcion.setText(games[pos].getDescripcion());
        ImageView img = elemento.findViewById(R.id.gamePhoto);
        img.setImageResource(games[pos].getImgPhoto());

        return elemento;
    }


}
