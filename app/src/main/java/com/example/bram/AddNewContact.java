package com.example.bram;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AddNewContact extends AppCompatActivity {
    private ImageView sosImageView;
    private ImageView terugImageView;
    private TextView gereedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_contact);

        terugImageView = findViewById(R.id.terug_knop);
        terugImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Finish the current activity and navigate back to the previous page
            }
        });

        sosImageView = findViewById(R.id.sosImageView);
        sosImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddNewContact.this, EditContactDoktorActivity.class);
                startActivity(intent);
            }
        });

        gereedText = findViewById(R.id.gereedText);
        gereedText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform any necessary actions

                // Navigate back to the Activity_Contacten activity
                Intent intent = new Intent(AddNewContact.this, Activity_Contacten.class);
                startActivity(intent);
            }
        });
    }
}
