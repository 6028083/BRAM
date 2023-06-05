package com.example.bram;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Switch;
import android.view.View;
import android.content.Intent;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.widget.TextView;
import android.os.Handler;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView timeTextView;
    private TextView dateTextView;
    private Handler handler;
    private Runnable updateTimeRunnable;
    private Runnable updateDateRunnable;

    private ImageView imageView;

    private FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
////////
        FrameLayout lichten = findViewById(R.id.lichten_home);
        FrameLayout contact = findViewById(R.id.contacten_home_view);
        FrameLayout thermo = findViewById(R.id.thermo_home);
        FrameLayout foto = findViewById(R.id.foto_home_view);
        lichten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(MainActivity.this, fotoalbum.class);
                startActivity(intent);
            }
        });
        //////////
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(MainActivity.this, fotoalbum.class);
                startActivity(intent);
            }
        });
        ///////////
        thermo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(MainActivity.this, fotoalbum.class);
                startActivity(intent);
            }
        });
        /////////
        foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(MainActivity.this, fotoalbum.class);
                startActivity(intent);
            }
        });
///////////
        timeTextView = findViewById(R.id.timeTextView);
        dateTextView = findViewById(R.id.dateTextView);
        handler = new Handler();

        updateTimeRunnable = new Runnable() {
            @Override
            public void run() {
                // Get the current time
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                String currentTime = timeFormat.format(calendar.getTime());

                // Update the TextView with the current time
                timeTextView.setText(currentTime);

                // Schedule the next update after 1 second (1000 milliseconds)
                handler.postDelayed(this, 1000);
            }
        };

        updateDateRunnable = new Runnable() {
            @Override
            public void run() {
                // Get the current date
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", new Locale("nl", "NL"));
                String currentDate = dateFormat.format(calendar.getTime());

                // Update the TextView with the current date
                dateTextView.setText(currentDate);

                // Schedule the next update after 1 second (1000 milliseconds)
                handler.postDelayed(this, 1000);
            }
        };

        // Start the initial updates for time and date
        handler.post(updateTimeRunnable);
        handler.post(updateDateRunnable);


    }
}
