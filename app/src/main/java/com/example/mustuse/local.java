package com.example.mustuse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class local extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);

    }

    public void setBtn59_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("100");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn60_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");

        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("101");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn61_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("1097");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn62_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04027852412");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn63_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("1098");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn64_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("1077");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn65_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("1070");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn66_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("1072");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn67_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("139");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn68_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("108");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn69_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("102");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn70_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("1091");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn71_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("181");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn72_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04023545523");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn73_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04027537541");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }
}

