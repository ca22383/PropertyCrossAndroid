package com.example.ejemplo1jlroyo.propertycross;

import android.app.Application;

import java.util.Vector;

/**
 * Created by jlroyo on 24/1/17.
 */

public class Aplicacion extends Application {
    //En esta clase almaceno los objetos que quiero usar globalmente en la aplicacion

    private Vector<Piso> vectorPisos;
    private AdaptadorPisos adaptador;

    @Override
    public void onCreate(){
        vectorPisos = Piso.ejemploPisos();
        adaptador = new AdaptadorPisos (this, vectorPisos);

    }

    public AdaptadorPisos getAdaptador(){
        return adaptador;
    }

    public Vector<Piso> getVectorPisos(){
        return vectorPisos;
    }

}
