package com.example.bram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
//import com.flask.colorpicker.ColorPickerDialog;
//import com.flask.colorpicker.OnColorSelectedListener;

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

//        Button colorPickerButton = findViewById(R.id.colorPickerButton);
//        colorPickerButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Create a new instance of the color picker dialog
//                ColorPickerDialog colorPickerDialog = new ColorPickerDialog();
//
//                // Set an OnColorSelectedListener to get the selected color
//                colorPickerDialog.setOnColorSelectedListener(new OnColorSelectedListener() {
//                    @Override
//                    public void onColorSelected(int color) {
//                        // Handle the selected color
//                        // You can use the selected color in your desired way, e.g., update the UI or save it for later use
//                    }
//                });
//
//                // Show the color picker dialog
//                colorPickerDialog.show(getSupportFragmentManager(), "color_picker_dialog");
//            }
//        });
    }
}

