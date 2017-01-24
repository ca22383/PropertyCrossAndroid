package com.example.ejemplo1jlroyo.propertycross;

import java.util.Vector;

/**
 * Created by jlroyo on 24/1/17.
 */
public class Piso {

    public String ciudad;
    public String calle;
    public int numero;
    public int recursoImagen;


    public Piso(String ciudad, String calle, int numero, int recursoImagen){

        this.ciudad = ciudad;
        this.calle = calle;
        this.numero= numero;
        this.recursoImagen = recursoImagen;


    }

    public static Vector<Piso> ejemploPisos() {

        Vector<Piso> pisos = new Vector<Piso>();

        pisos.add(new Piso("Barcelona", "Muntaner", 535, R.drawable.piso1));
        pisos.add(new Piso("Madrid", "Castellana", 155, R.drawable.piso2));
        pisos.add(new Piso("Valencia", "Ganton", 197, R.drawable.piso3));
        pisos.add(new Piso("Girona", "Numancia", 457, R.drawable.piso4));
    return pisos;
    }
}
