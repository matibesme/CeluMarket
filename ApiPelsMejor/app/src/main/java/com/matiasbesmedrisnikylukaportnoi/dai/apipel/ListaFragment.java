package com.matiasbesmedrisnikylukaportnoi.dai.apipel;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.matiasbesmedrisnikylukaportnoi.dai.apipel.utils.StreamHelper;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;


public class ListaFragment extends Fragment {



    View layoutRoot;

    Button button;
    Button button2;





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        layoutRoot= inflater.inflate(R.layout.fragment_lista, container, false);

        ObtenerReferencias();
        SetearListeners();
        return layoutRoot;
    }




    public void SetearListeners() {


        View.OnClickListener btnButton_click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity actividadContenedora;
                actividadContenedora = (MainActivity) getActivity();
                actividadContenedora.setFragmentListaCelulares();

            }
        };
    }




    private void ObtenerReferencias() {
        button= (Button) layoutRoot.findViewById(R.id.button);
        button2=(Button) layoutRoot.findViewById(R.id.button2);
    }
}