package com.matiasbesmedrisnikylukaportnoi.dai.apipel;

import android.media.Image;
import android.widget.ImageView;

public class Celular {

    //String image;
    String name;
    String marca;
    String id;
    String imag;
    int precio;





    public Celular(String id, String name,  String marca, int precio, String imag) {
       // this.image = image;
        this.name = name;
        this.marca = marca;
        this.id=id;
        this.imag=imag;
        this.precio= precio;


    }

    /*public String getImage() {
        return image;
    }*/

    public String getName() {
        return name;
    }

    public  String getMarca() {
        return marca;
    }
    public String getId() {
        return id;
    }
    public String getImage() {
        return imag;
    }
    public int getPrecio() {
        return precio;
    }
}
