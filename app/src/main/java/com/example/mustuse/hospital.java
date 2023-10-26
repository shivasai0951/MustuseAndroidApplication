package com.example.mustuse;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class hospital extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
    }

    public void setBtn43_onclick(View view) {
        Intent intent = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04045674567");
        intent.setData(Uri.parse(sb.toString()));
        startActivity(intent);
    }

    public void setBtn44_onclick(View view) {
        Intent intent1 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04023608050");
        intent1.setData(Uri.parse(sb.toString()));
        startActivity(intent1);
    }

    public void setBtn45_onclick(View view) {
        Intent intent2 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("9885720000");
        intent2.setData(Uri.parse(sb.toString()));
        startActivity(intent2);
    }

    public void setBtn46_onclick(View view) {
        Intent intent3 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("9966580972");
        intent3.setData(Uri.parse(sb.toString()));
        startActivity(intent3);
    }

    public void setBtn49_onclick(View view) {
        Intent intent4 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04023538846");
        intent4.setData(Uri.parse(sb.toString()));
        startActivity(intent4);
    }

    public void setBtn50_onclick(View view) {
        Intent intent5 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("04024600146");
        intent5.setData(Uri.parse(sb.toString()));
        startActivity(intent5);
    }

    public void setBtn47_onclick(View view) {
        Intent intent6 = new Intent("android.intent.action.CALL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append("18001088108");
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
