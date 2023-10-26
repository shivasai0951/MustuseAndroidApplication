package com.example.mustuse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mustuse.R;

public class shopingblock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopingblock);
    }
    public void amazon(View view) {
        startActivity(new Intent(this, wvaz.class));
    }

    public void flipkart(View view) {
        startActivity(new Intent(this, wvfk.class));
    }

    public void paytm(View view) {
        startActivity(new Intent(this, wvptm.class));
    }
}


