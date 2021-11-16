package com.matiasbesmedrisnikylukaportnoi.dai.apipel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListaCelularesFragment extends Fragment {

    View layoutRoot;
    ListView listaPelisCelus;
    Celular[] resultado;
    ArrayAdapter<Celular> adapter;

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


        Gson miGson = new Gson();
        resultado = miGson.fromJson(s,Celular[].class);
        adapter = new PeliculasArrayAdapter(getActivity(),R.layout.my_list_item, Arrays.asList(resultado.clone()));
        listaPelisCelus.setAdapter(adapter);


    }

    private void SetearListeners() {
    }

    private void ObtenerReferencias() {
        listaPelisCelus= (ListView) layoutRoot.findViewById(R.id.listView);

    }


}