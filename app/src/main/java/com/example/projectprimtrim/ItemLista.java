package com.example.projectprimtrim;

public class ItemLista {

    private String objeto;
    private int precio;

    public ItemLista(String s, int i){
        objeto = s;
        precio = i;
    }

    public String getObjeto() {
        return objeto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
