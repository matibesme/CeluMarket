package com.matiasbesmedrisnikylukaportnoi.dai.apipel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class ListaCelularesFragment extends Fragment {

    View layoutRoot;
ListView listaPelisCelus;
    public ListaCelularesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        layoutRoot = inflater.inflate(R.layout.fragment_lista_celulares, container, false);
        ObtenerReferencias();
        parseandoLista();
        SetearListeners();

        return layoutRoot;
    }

    private void parseandoLista() {
        ArrayList<Celular> datosArrayList;
        ArrayAdapter<Celular> adapter;


        datosArrayList=new ArrayList<>(
        );

        adapter=new PeliculasArrayAdapter(getContext(), R.layout.my_list_item, datosArrayList);
        listaPelisCelus.setAdapter(adapter);


    }

    private void SetearListeners() {
    }

    private void ObtenerReferencias() {
        listaPelisCelus= (ListView) layoutRoot.findViewById(R.id.listView);

    }


}