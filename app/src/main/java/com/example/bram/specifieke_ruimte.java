package com.example.bram;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.FrameLayout;

public class specifieke_ruimte extends AppCompatActivity {

    private Switch switchButton_1;
    private ImageView imageView_1;

    private Switch switchButton_2;
    private ImageView imageView_2;

    private Switch switchButton_3;
    private ImageView imageView_3;

    private Switch switchButton_4;
    private ImageView imageView_4;

    private Switch switchButton_5;
    private ImageView imageView_5;

    private Switch switchButton_6;
    private ImageView imageView_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specifieke_ruimte);

        ImageView terug = findViewById(R.id.terug_knop);
        terug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(specifieke_ruimte.this, ruimtes.class);
                startActivity(intent);
            }
        });

        ImageView sosImageView = findViewById(R.id.sosImageView);

        sosImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(specifieke_ruimte.this, EditContactDoktorActivity.class);
                startActivity(intent);
            }
        });


        FrameLayout  kleurtoon = findViewById(R.id.woonkamerPagina);
        kleurtoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(specifieke_ruimte.this, kleurtoon.class);
                startActivity(intent);
            }
        });

        switchButton_1 = findViewById(R.id.switch_button_1);
        imageView_1 = findViewById(R.id.image_view_1);

        switchButton_2 = findViewById(R.id.switch_button_2);
        imageView_2 = findViewById(R.id.image_view_2);

        switchButton_3 = findViewById(R.id.switch_button_3);
        imageView_3 = findViewById(R.id.image_view_3);

        switchButton_4 = findViewById(R.id.switch_button_4);
        imageView_4 = findViewById(R.id.image_view_4);

        switchButton_5 = findViewById(R.id.switch_button_5);
        imageView_5 = findViewById(R.id.image_view_5);

        switchButton_6 = findViewById(R.id.switch_button_6);
        imageView_6 = findViewById(R.id.image_view_6);

        switchButton_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView_1.setImageResource(R.drawable.lamp_aan);
                } else {
                    imageView_1.setImageResource(R.drawable.lamp_uit);
                }
            }
        });
        switchButton_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView_2.setImageResource(R.drawable.lamp_aan);
                } else {
                    imageView_2.setImageResource(R.drawable.lamp_uit);
                }
            }
        });
        switchButton_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView_3.setImageResource(R.drawable.lamp_aan);
                } else {
                    imageView_3.setImageResource(R.drawable.lamp_uit);
                }
            }
        });
        switchButton_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView_4.setImageResource(R.drawable.lamp_aan);
                } else {
                    imageView_4.setImageResource(R.drawable.lamp_uit);
                }
            }
        });
        switchButton_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView_5.setImageResource(R.drawable.lamp_aan);
                } else {
                    imageView_5.setImageResource(R.drawable.lamp_uit);
                }
            }
        });
        switchButton_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView_6.setImageResource(R.drawable.lamp_aan);
                } else {
                    imageView_6.setImageResource(R.drawable.lamp_uit);
                }
            }
        });

    }
}