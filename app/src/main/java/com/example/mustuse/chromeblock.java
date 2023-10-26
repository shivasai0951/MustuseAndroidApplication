package com.example.mustuse;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class chromeblock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chromeblock);

    }
    public void google(View view) {
        startActivity(new Intent(this, wvggl.class));
    }

    public void youtube(View view) {
        startActivity(new Intent(this, wvyt.class));
    }

    public void yahoo(View view) {
        startActivity(new Intent(this, wvyo.class));
    }
    public void email(View view) {
        startActivity(new Intent(this, wvel.class));
    }
}
