package com.example.handy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Se_Connecter extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.se_connecter);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changementActivité = new Intent(getApplicationContext(), Inscription.class);
                startActivity(changementActivité);
                finish();
            }
        });
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changementActivité = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(changementActivité);
                finish();
            }
        });
    }

    public void changementActivité(View view) {
        Intent changementActivité = new Intent(getApplicationContext(), Login_forget.class);
        startActivity(changementActivité);
        finish();
    }
    public void changementActivité2(View view) {
        Intent changementActivité = new Intent(getApplicationContext(), Password_forget.class);
        startActivity(changementActivité);
        finish();
    }
}
