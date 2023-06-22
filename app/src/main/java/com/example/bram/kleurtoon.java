package com.example.bram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class kleurtoon extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kleurtoon);

        ImageView terug = findViewById(R.id.terug_knop);

        terug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kleurtoon.this, specifieke_ruimte.class);
                startActivity(intent);
            }
        });

        ImageView sosImageView = findViewById(R.id.sosImageView);

        sosImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kleurtoon.this, EditContactDoktorActivity.class);
                startActivity(intent);
            }
        });
        ImageView infoKleurtoon = findViewById(R.id.info_Kleurtoon);
        infoKleurtoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(kleurtoon.this, "Sleep de balk om de helderheid aan te passen.", Toast.LENGTH_SHORT).show();
            }

        });
    }
}