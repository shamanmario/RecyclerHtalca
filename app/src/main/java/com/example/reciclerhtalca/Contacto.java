package com.example.reciclerhtalca;

public class Contacto {

    private String nombre, telefono;

    public Contacto(){
        nombre = "";
        telefono = "";
    }

    public Contacto(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTelefono(){
        return telefono;
    }
}
