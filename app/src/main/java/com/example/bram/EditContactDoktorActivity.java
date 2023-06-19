package com.example.bram;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class EditContactDoktorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editcontactendoktor);

        ImageView terug = findViewById(R.id.terug_knop);


        terug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditContactDoktorActivity.this, Activity_Contacten.class);
                startActivity(intent);
            }
        });
    }
}
