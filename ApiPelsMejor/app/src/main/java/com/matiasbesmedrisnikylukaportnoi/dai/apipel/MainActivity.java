package com.matiasbesmedrisnikylukaportnoi.dai.apipel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListaFragment fragmentLista;
    ListaCelularesFragment fragmentListaCelulares;
    AgregarCeluFragment fragmentAgregarCelu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crearFragments();
        reemplazarFragmenbts(fragmentLista,false);
    }

    public void reemplazarFragmenbts(Fragment fragmento){
        reemplazarFragmenbts(fragmento,true);
    }

    public void reemplazarFragmenbts(Fragment fragmento, Boolean blnAddToBackStack){
        FragmentManager manager= getSupportFragmentManager();
        FragmentTransaction transision = manager.beginTransaction();

        transision.replace(R.id.frameLayout1, fragmento, null );
        if(blnAddToBackStack){

            transision.addToBackStack(null);
        }
        transision.commit();

    }
    private void crearFragments() {
        fragmentLista = new ListaFragment();
        fragmentListaCelulares=new ListaCelularesFragment();
        fragmentAgregarCelu= new AgregarCeluFragment();

    }

    public  void setFragmentLista(){

        reemplazarFragmenbts(fragmentLista);
    }
    public  void setFragmentListaCelulares(){

        reemplazarFragmenbts(fragmentListaCelulares);
    }
    public  void setfragmentAgregarCelu(){

        reemplazarFragmenbts(fragmentAgregarCelu);
    }




}