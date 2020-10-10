package edu.cientifica.convivirapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class estadoCuentaActivity extends AppCompatActivity {

    List<UnidadPrivada> unidadPrivadaList;
    RecyclerView recyclerViewViviendas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estado_cuenta);

        recyclerViewViviendas = findViewById(R.id.recyclerViviendas);

        recyclerViewViviendas.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        //recyclerViewViviendas.setLayoutManager(new GridLayoutManager(this,2));
        unidadPrivadaList = new ArrayList<UnidadPrivada>();
        cargarDatos();
        UnidadPrivadaListAdapter adapter =  new UnidadPrivadaListAdapter(unidadPrivadaList);

        recyclerViewViviendas.setAdapter(adapter);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UnidadPrivada vivienda;
                vivienda =  unidadPrivadaList.get(recyclerViewViviendas.getChildAdapterPosition(view));
                Toast.makeText(getApplicationContext(), "Seleccion: "+vivienda.getTipo()+" "+vivienda.getNumero(),Toast.LENGTH_LONG).show();

            }
        });
    }

    private void cargarDatos() {
        unidadPrivadaList.add(new UnidadPrivada(1,101,"Ana Vivanco Fabian","Vivienda"));
        unidadPrivadaList.add(new UnidadPrivada(2,102,"Betty Carrillo Teran","Vivienda"));
        unidadPrivadaList.add(new UnidadPrivada(3,103,"Carlos Estrada Poma","Vivienda"));
        unidadPrivadaList.add(new UnidadPrivada(4,104,"Denis Garcia Gutierrez","Vivienda"));
        unidadPrivadaList.add(new UnidadPrivada(5,105101,"Edgar Zamudio Urrutia","Departamento"));
        unidadPrivadaList.add(new UnidadPrivada(6,105102,"Emely Estrada Limaymanta","Departamento"));
        unidadPrivadaList.add(new UnidadPrivada(7,105201,"Fidencia Llamocca Nuñez","Departamento"));
        unidadPrivadaList.add(new UnidadPrivada(8,105202,"Fernando Richerson Batista","Departamento"));
        unidadPrivadaList.add(new UnidadPrivada(9,105301,"Guadalupe Patrick Sarmiento","Departamento"));
        unidadPrivadaList.add(new UnidadPrivada(10,105302,"Guillermo Canchucaja Manani","Departamento"));

    }
}