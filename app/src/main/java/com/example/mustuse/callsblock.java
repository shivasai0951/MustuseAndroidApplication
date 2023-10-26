package com.example.mustuse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class  callsblock extends AppCompatActivity {
    Button btn16;
    Button btn17;
    Button btn18;

    /* access modifiers changed from: protected */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callsblock);
        this.btn16 = (Button) findViewById(R.id.btn16);
        this.btn17 = (Button) findViewById(R.id.btn17);
        this.btn18 = (Button) findViewById(R.id.btn18);
        this.btn16.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                callsblock.this.openlocal();
            }
        });
        this.btn17.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                callsblock.this.openhospital();
            }
        });
        this.btn18.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                callsblock.this.openbloodbank();
            }
        });
    }

    public void openlocal() {
        startActivity(new Intent(this, local.class));
    }

    public void openhospital() {
        startActivity(new Intent(this, hospital.class));
    }

    public void openbloodbank() {
        startActivity(new Intent(this, bloodbank.class));
    }
}

