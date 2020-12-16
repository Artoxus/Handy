package com.example.handy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Favori extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.favori);

            Spinner spinner = findViewById(R.id.action_bar_spinner);
            spinner.setOnItemSelectedListener( this);
            List<String> catégorie = new ArrayList<>();
            catégorie.add("Compte");
            catégorie.add("Connexion");
            catégorie.add("S'inscrire");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, catégorie);


            ImageButton maps = findViewById(R.id.Maps);
            maps.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent changementActivité = new Intent(getApplicationContext(), MapsActivity.class);
                    startActivity(changementActivité);
                    finish();
                }
            });
            ImageButton home = findViewById(R.id.Home);
            home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent changementActivité = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(changementActivité);
                    finish();
                }
            });
            ImageButton favori = findViewById(R.id.Favori);
            favori.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent changementActivité = new Intent(getApplicationContext(), Favori.class);
                    startActivity(changementActivité);
                    finish();
                }
            });
            ImageButton compte = findViewById(R.id.Compte);
            compte.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setAdapter(dataAdapter);
                }
            });
        }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getItemAtPosition(position).toString() == "Connexion") {
            Intent changementActivité = new Intent(getApplicationContext(), Se_Connecter.class);
            startActivity(changementActivité);
            finish();
        }
        if (parent.getItemAtPosition(position).toString() == "S'inscrire") {
            Intent changementActivité = new Intent(getApplicationContext(), Inscription.class);
            startActivity(changementActivité);
            finish();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
