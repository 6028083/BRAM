package com.example.bram;

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

public class fotoalbum extends Activity {
    private static final int REQUEST_IMAGE_PICK = 100;
    private ImageView photoAlbumImageView;
    private ImageView plusKnop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotoalbum);

        plusKnop = findViewById(R.id.plus_knop);
        CardView fotoAlbumCardView = findViewById(R.id.foto_album_main);
        photoAlbumImageView = fotoAlbumCardView.findViewById(R.id.plaatje_in_cardview);

        plusKnop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, REQUEST_IMAGE_PICK);
            }
        });
        ImageView terug = findViewById(R.id.terug_knop);

        terug.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent intent = new Intent(fotoalbum.this, MainActivity.class);
        startActivity(intent);
        }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_PICK && resultCode == Activity.RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            if (selectedImage != null) {
                try {
                    // Get the bitmap from the URI
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    Bitmap bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(selectedImage), null, options);

                    // Save the bitmap to your photo album or perform any other desired actions
                    // Here, you can add the bitmap to your photo album or display it in an ImageView
                    photoAlbumImageView.setImageBitmap(bitmap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


//////////////////////////////////
