package com.example.ejemplo1jlroyo.propertycross.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ejemplo1jlroyo.propertycross.model.Piso;
import com.example.ejemplo1jlroyo.propertycross.R;

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
        public TextView calle;
        public TextView ciudad;
        public TextView precio;




        public ViewHolder (View itemView){
            super(itemView);
            portada = (ImageView) itemView.findViewById(R.id.portada);
            portada.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ciudad = (TextView) itemView.findViewById(R.id.ciudad);
            calle = (TextView) itemView.findViewById(R.id.calle);
            precio = (TextView) itemView.findViewById(R.id.precio);


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
        holder.ciudad.setText(piso.ciudad);
        holder.calle.setText(piso.calle);
        holder.precio.setText(String.valueOf(piso.precio));





    }

    @Override
    public int getItemCount(){
        return vectorPisos.size();
    }

}
