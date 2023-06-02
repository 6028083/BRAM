package com.example.bram;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Switch switchButton;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchButton = findViewById(R.id.switch_button);
        imageView = findViewById(R.id.image_view);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(MainActivity.this, lichten_woonkamer.class);
                startActivity(intent);
            }
        });
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView.setImageResource(R.drawable.lamp_aan); // Set the new image resource when the switch is checked
                } else {
                    imageView.setImageResource(R.drawable.lamp_uit); // Set the default image resource when the switch is unchecked
                }
            }
        });
    }
}