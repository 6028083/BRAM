package com.example.bram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class lichten_toilet extends AppCompatActivity {
    private Switch switchButton_1;
    private Switch switchButton_2;
    private Switch switchButton_3;
    private Switch switchButton_4;
    private Switch switchButton_5;
    private Switch switchButton_6;
    private ImageView imageView_1;
    private ImageView imageView_2;
    private ImageView imageView_3;
    private ImageView imageView_4;
    private ImageView imageView_5;
    private ImageView imageView_6;
    private ImageView sosImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lichten_toilet);

        ImageView terug = findViewById(R.id.terug_knop);

        terug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lichten_toilet.this, MainActivity.class);
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

        sosImageView = findViewById(R.id.sosImageView);
        sosImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lichten_toilet.this, EditContactDoktorActivity.class); // Vervang "NieuwePagina" door de naam van je gewenste nieuwe pagina-activiteit
                startActivity(intent);
            }
        });

        switchButton_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView_1.setImageResource(R.drawable.lamp_aan); // Set the new image resource when the switch is checked
                } else {
                    imageView_1.setImageResource(R.drawable.lamp_uit); // Set the default image resource when the switch is unchecked
                }
            }
        });
        switchButton_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView_2.setImageResource(R.drawable.lamp_aan); // Set the new image resource when the switch is checked
                } else {
                    imageView_2.setImageResource(R.drawable.lamp_uit); // Set the default image resource when the switch is unchecked
                }
            }
        });

        switchButton_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView_3.setImageResource(R.drawable.lamp_aan); // Set the new image resource when the switch is checked
                } else {
                    imageView_3.setImageResource(R.drawable.lamp_uit); // Set the default image resource when the switch is unchecked
                }
            }
        });

        switchButton_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView_4.setImageResource(R.drawable.lamp_aan); // Set the new image resource when the switch is checked
                } else {
                    imageView_4.setImageResource(R.drawable.lamp_uit); // Set the default image resource when the switch is unchecked
                }
            }
        });

        switchButton_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView_5.setImageResource(R.drawable.lamp_aan); // Set the new image resource when the switch is checked
                } else {
                    imageView_5.setImageResource(R.drawable.lamp_uit); // Set the default image resource when the switch is unchecked
                }
            }
        });

        switchButton_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView_6.setImageResource(R.drawable.lamp_aan); // Set the new image resource when the switch is checked
                } else {
                    imageView_6.setImageResource(R.drawable.lamp_uit); // Set the default image resource when the switch is unchecked
                }
            }
        });

    }
}