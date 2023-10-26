package com.example.mustuse;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class socialblock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socialblock);

    }
    public void facebook(View view) {
        startActivity(new Intent(this, wvfb.class));
    }

    public void insta(View view) {
        startActivity(new Intent(this, wvis.class));
    }

    public void twitter(View view) {
        startActivity(new Intent(this, wvttr.class));
    }
}
