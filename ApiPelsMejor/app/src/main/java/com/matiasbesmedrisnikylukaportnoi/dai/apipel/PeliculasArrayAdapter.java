package com.matiasbesmedrisnikylukaportnoi.dai.apipel;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PeliculasArrayAdapter extends ArrayAdapter<Celular> {
    List<Celular> listaPelis;
    Context mCtx;
    private int resource;


    public PeliculasArrayAdapter(Context mCtx, int resource, List<Celular> listaPelis){
        super(mCtx,resource,listaPelis);
        this.mCtx=mCtx;
        this.resource=resource;
        this.listaPelis=listaPelis;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(mCtx) ;
        View view=inflater.inflate(resource,null);
        TextView tvNombreApellido=view.findViewById(R.id.tvNombrePelicula);
        TextView precio1=view.findViewById(R.id.tvAño);
        ImageView imgPelicula=view.findViewById(R.id.imgPelicula);





        Celular peliculas=listaPelis.get(position);
        String URLrecibidaImagen =  peliculas.getImage();
        Log.d("Gonza", "ImagenInflada: " + URLrecibidaImagen);
        Picasso.get().load(URLrecibidaImagen).into(imgPelicula);

        tvNombreApellido.setText(peliculas.getName());
        precio1.setText(String.valueOf(peliculas.getPrecio()));



        return view;
    }



}
