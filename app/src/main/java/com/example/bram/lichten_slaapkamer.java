package com.example.bram;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class lichten_slaapkamer extends AppCompatActivity {


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
    }

}
