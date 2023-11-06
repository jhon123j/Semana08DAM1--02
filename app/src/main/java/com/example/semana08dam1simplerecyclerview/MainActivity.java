package com.example.semana08dam1simplerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.semana08dam1simplerecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private AdapterLista adapterLista = new AdapterLista();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rvInfo.setLayoutManager(
                new LinearLayoutManager(getApplicationContext())
        );
        binding.rvInfo.setAdapter(adapterLista);
        adapterLista.setLista(getData());
    }

    private ArrayList<String> getData(){
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            lista.add("Dato: " + i);
        }
        return lista;
    }
}