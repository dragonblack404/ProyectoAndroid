package com.example.projectprimtrim;

/*
Clase con los campos necesarios para la categoria de juegos
 */

public class Game {

    private String game;

    private String descripcion;

    public Game(String s1, String s2){
        game = s1;
        descripcion = s2;
    }

    public String getGame(){
        return game;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
