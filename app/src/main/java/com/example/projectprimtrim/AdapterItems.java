package com.example.projectprimtrim;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterItems {

    private ItemLista[] lista;
/*
    public AdapterItems(Context cont, ItemLista[] g){
        super(cont, R.layout.activity_lista, g);
        lista = g;
    }

    public View getView(int pos, View convertView, ViewGroup parent){
        LayoutInflater mostrar = LayoutInflater.from(getContext());
        View elemento = mostrar.inflate(R.layout.activity_lista, parent, false);
        TextView textoGame = (TextView) elemento.findViewById(R.id.gameTitle);
        textoGame.setText(games[pos].getGame());
        TextView textoDescripcion = (TextView) elemento.findViewById(R.id.gameDescription);
        textoDescripcion.setText(games[pos].getDescripcion());
        ImageView img = elemento.findViewById(R.id.gamePhoto);
        img.setImageResource(games[pos].getImgPhoto());

        return elemento;
    }
*/

}
