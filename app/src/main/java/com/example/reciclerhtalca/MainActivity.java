package com.example.reciclerhtalca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerContactos;
    private Adaptador adaptador;

    private ArrayList<Contacto> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LlenarContactos();

        recyclerContactos = findViewById(R.id.recycler);
        recyclerContactos.setLayoutManager(new LinearLayoutManager(this));

        adaptador = new Adaptador(contactos);



        recyclerContactos.setAdapter(adaptador);
    }

    private void LlenarContactos(){
        contactos = new ArrayList<Contacto>();
        contactos.add(new Contacto("Ivo Muñoz", "+56 9 11223344"));
        contactos.add(new Contacto("Jorge Canales", "+56 9 22334455"));
        contactos.add(new Contacto("Juan Pablo Ulloa", "+56 9 33445566"));
        contactos.add(new Contacto("Luis Gutiérrez", "+56 9 44556677"));

        contactos.add(new Contacto("Ivo Muñoz", "+56 9 11223344"));
        contactos.add(new Contacto("Jorge Canales", "+56 9 22334455"));
        contactos.add(new Contacto("Juan Pablo Ulloa", "+56 9 33445566"));
        contactos.add(new Contacto("Luis Gutiérrez", "+56 9 44556677"));

        contactos.add(new Contacto("Ivo Muñoz", "+56 9 11223344"));
        contactos.add(new Contacto("Jorge Canales", "+56 9 22334455"));
        contactos.add(new Contacto("Juan Pablo Ulloa", "+56 9 33445566"));
        contactos.add(new Contacto("Luis Gutiérrez", "+56 9 44556677"));
    }
}