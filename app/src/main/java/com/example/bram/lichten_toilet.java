package com.example.bram;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class lichten_toilet extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lichten_toilet);

         ---KNOP VOOR DE LICHTEN---//        switchButton_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView_1.setImageResource(R.drawable.lamp_aan);
                } else {
                    imageView_1.setImageResource(R.drawable.lamp_uit);
                }
            }
        });

    }
}