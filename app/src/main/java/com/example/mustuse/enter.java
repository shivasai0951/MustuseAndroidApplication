package com.example.mustuse;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class enter extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);

    }



    public void gana(View view) {

        startActivity(new Intent(this, music2.class));
    }




    public void voot(View view) {

        startActivity(new Intent(this, video2.class));
    }
}