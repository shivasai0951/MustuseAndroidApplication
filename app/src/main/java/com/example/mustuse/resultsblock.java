package com.example.mustuse;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class resultsblock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultsblock);
    }
    public void jntu(View view) {
        startActivity(new Intent(this, wvju.class));
    }

    public void manabadi(View view) {
        startActivity(new Intent(this, wvmabi.class));
    }

    public void dplama(View view) {
        startActivity(new Intent(this, wvdplama.class));
    }
}