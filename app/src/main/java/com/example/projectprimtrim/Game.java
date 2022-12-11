package com.example.projectprimtrim;

/*
Clase con los campos necesarios para la categoria de juegos
 */

import java.io.Serializable;

public class Game implements Serializable {

    private String game;
    private int imgPhoto;
    private String descripcion;
    private String detallada;

    public Game(String s1, String s2, int i, String s3){
        game = s1;
        descripcion = s2;
        imgPhoto = i;
        detallada = s3;
    }

    public int getImgPhoto(){
        return imgPhoto;
    }

    public String getGame(){
        return game;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDetallada(){
        return detallada;
    }

}
