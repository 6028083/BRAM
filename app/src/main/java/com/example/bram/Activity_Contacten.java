package com.example.bram;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Contacten extends AppCompatActivity {

    private TextView dokterTextView;

    private ImageView sosImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacten);

        dokterTextView = findViewById(R.id.dokterTextView);
        dokterTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDokterTextViewClick();
            }
        });
        ImageView terug = findViewById(R.id.terug_knop);

        sosImageView = findViewById(R.id.sosImageView);
        sosImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Contacten.this, EditContactDoktorActivity.class);
                startActivity(intent);
            }
        });

        terug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Contacten.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageView addImageView = findViewById(R.id.plus_knop);
        addImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Contacten.this, AddNewContact.class);
                startActivity(intent);
            }
        });

    }

    public void onDokterTextViewClick() {
        // Perform navigation to EditContactDoktorActivity
        Intent intent = new Intent(Activity_Contacten.this, EditContactDoktorActivity.class);
        startActivity(intent);
    }

    public void onDokterTextViewClick(View view) {
    }
}