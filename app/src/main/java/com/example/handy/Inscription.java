package com.example.handy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;


public class Inscription extends AppCompatActivity {
    private EditText inscription_pseudo, inscription_email, inscription_password, inscription_password2;
    private Button btn_inscrire, btn_se_connecter, btn_maps;
    private ProgressBar loading;
    private static String URL="";
    private RequestQueue queue;
    private MyRequest request;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription);

        loading = findViewById(R.id.loading);
        inscription_pseudo = (EditText) findViewById(R.id.editTextTextPersonName);
        inscription_email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        inscription_password = (EditText) findViewById(R.id.editTextTextPassword5);
        inscription_password2 = (EditText) findViewById(R.id.editTextTextPassword6);
        btn_inscrire = (Button) findViewById(R.id.Inscription);
        btn_se_connecter = (Button) findViewById(R.id.button3);
        btn_maps = (Button) findViewById(R.id.button6);

        queue = VolleySingleton.getInstance(this).getRequestQueue();
        request = new MyRequest(this, queue);

        btn_se_connecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changementActivité = new Intent(getApplicationContext(), Se_Connecter.class);
                startActivity(changementActivité);
                finish();
            }
        });
        btn_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changementActivité = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(changementActivité);
                finish();
            }
        });
        btn_inscrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pseudo = inscription_pseudo.getText().toString().trim();
                String email = inscription_email.getText().toString().trim();
                String password = inscription_password.getText().toString().trim();
                String password2 = inscription_password2.getText().toString().trim();
                request.inscription(pseudo, email, password, password2);
            }
        });
    }

    protected void Inscrire() {
        loading.setVisibility(View.VISIBLE);
        btn_inscrire.setVisibility(View.GONE);

        final String name = inscription_pseudo.getText().toString().trim();
        final String email = inscription_email.getText().toString().trim();
        final String password = inscription_password.getText().toString().trim();
        final String password2 = inscription_password2.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return super.getParams();
            }
        };

    }
}
