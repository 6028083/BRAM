package com.example.bram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.example.bram.R;
import android.graphics.Bitmap;
import androidx.cardview.widget.CardView;
import android.widget.LinearLayout;

public class ruimtes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruimtes);

        ImageView terug = findViewById(R.id.terug_knop);
        terug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ruimtes.this, MainActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout woonkamer = findViewById(R.id.woonkamerBox);
        LinearLayout slaapkamer = findViewById(R.id.slaapkamerBox);
        LinearLayout toilet = findViewById(R.id.toiletBox);
        woonkamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ruimtes.this, specifieke_ruimte.class);
                startActivity(intent);
            }
        });
        slaapkamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ruimtes.this, specifieke_ruimte.class);
                startActivity(intent);
            }
        });
        toilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ruimtes.this, specifieke_ruimte.class);
                startActivity(intent);
            }
        });
    }
}