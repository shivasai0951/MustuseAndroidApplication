package com.example.mustuse;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class calculatorblock extends AppCompatActivity {
    Button btncal1;
    Button btncal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatorblock);
        this.btncal1 = (Button) findViewById(R.id.btncal1);
        this.btncal2 = (Button) findViewById(R.id.btncal2);
        this.btncal1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calculatorblock.this.opencal();
            }
        });
        this.btncal2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calculatorblock.this.openagecal();
            }
        });
    }

    public void opencal() {
        startActivity(new Intent(this, cal.class));
    }

    public void openagecal() {
        startActivity(new Intent(this, agecal.class));
    }
}
