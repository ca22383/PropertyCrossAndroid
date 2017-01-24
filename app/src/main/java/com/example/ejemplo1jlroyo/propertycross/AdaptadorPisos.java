package com.example.ejemplo1jlroyo.propertycross;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Vector;

/**
 * Created by jlroyo on 24/1/17.
 */
public class AdaptadorPisos extends RecyclerView.Adapter<AdaptadorPisos.ViewHolder> {

    private LayoutInflater inflador;
    protected Vector<Piso> vectorPisos;
    private Context contexto;

    public AdaptadorPisos(Context contexto, Vector<Piso> vectorPisos){
        inflador = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.vectorPisos = vectorPisos;
        this.contexto = contexto;

    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView portada;
        public TextView titulo;

        public ViewHolder (View itemView){
            super(itemView);
            portada = (ImageView) itemView.findViewById(R.id.portada);
            portada.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            titulo = (TextView) itemView.findViewById(R.id.titulo);


        }

    }

    @Override
    public ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){

        View v = inflador.inflate(R.layout.elemento_selector, null);
        return new ViewHolder (v);


    }

    @Override

    public void onBindViewHolder(ViewHolder holder, int posicion){

        Piso piso = vectorPisos.elementAt(posicion);
        holder.portada.setImageResource(piso.recursoImagen);
        holder.titulo.setText(piso.calle);



    }

    @Override
    public int getItemCount(){
        return vectorPisos.size();
    }

}
