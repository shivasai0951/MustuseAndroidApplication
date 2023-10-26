package com.example.mustuse;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class bloodbank extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodbank);
    }

    public void setBtn52_onclick(View view) {
        Intent intent = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04027633087");
        intent.setData(Uri.parse(sb.toString()));
        startActivity(intent);
    }

    public void setBtn53_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04027627973");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn54_onclick(View view) {
        Intent intent2 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04027567892");
        intent2.setData(Uri.parse(sb.toString()));
        startActivity(intent2);
    }

    public void setBtn55_onclick(View view) {
        Intent intent3 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04027567893");
        intent3.setData(Uri.parse(sb.toString()));
        startActivity(intent3);
    }

    public void setBtn56_onclick(View view) {
        Intent intent4 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04027702222");
        intent4.setData(Uri.parse(sb.toString()));
        startActivity(intent4);
    }

    public void setBtn57_onclick(View view) {
        Intent intent5 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04023554849");
        intent5.setData(Uri.parse(sb.toString()));
        startActivity(intent5);
    }

    public void setBtn58_onclick(View view) {
        Intent intent6 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04023559555");
        intent6.setData(Uri.parse(sb.toString()));
        startActivity(intent6);
    }

    public void setBtn48_onclick(View view) {
        Intent intent7 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04061656565");
        intent7.setData(Uri.parse(sb.toString()));
        startActivity(intent7);
    }

    public void setBtn51_onclick(View view) {
        Intent intent8 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04027505566");
        intent8.setData(Uri.parse(sb.toString()));
        startActivity(intent8);
    }
}

