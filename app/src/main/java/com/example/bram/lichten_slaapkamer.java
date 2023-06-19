package com.example.bram;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class lichten_slaapkamer extends AppCompatActivity {
    private ImageView sosImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lichten_slaapkamer);

        ImageView terug = findViewById(R.id.terug_knop);

        terug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lichten_slaapkamer.this, MainActivity.class);
                startActivity(intent);
            }
        });
        sosImageView = findViewById(R.id.sosImageView);
        sosImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lichten_slaapkamer.this, EditContactDoktorActivity.class); // Vervang "NieuwePagina" door de naam van je gewenste nieuwe pagina-activiteit
                startActivity(intent);
            }
        });
    }

}
