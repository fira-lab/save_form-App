package com.example.saveblob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        ImageView displayProfileImage = findViewById(R.id.displayProfileImage);
        TextView displayNameTextView = findViewById(R.id.displayNameTextView);
        TextView displayAddressTextView = findViewById(R.id.displayAddressTextView);
        TextView displayRegionTextView = findViewById(R.id.displayRegionTextView);
        TextView displayStatusTextView = findViewById(R.id.displayStatusTextView);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String address = extras.getString("address");
            String region = extras.getString("region");
            String status = extras.getString("status");
            Bitmap profileImage = (Bitmap) extras.getParcelable("profileImage");

            displayProfileImage.setImageBitmap(profileImage);
            displayNameTextView.setText(name);
            displayAddressTextView.setText(address);
            displayRegionTextView.setText(region);
            displayStatusTextView.setText(status);
        }
    }
}

