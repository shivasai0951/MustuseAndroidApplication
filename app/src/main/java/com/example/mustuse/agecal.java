
package com.example.mustuse;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class agecal extends AppCompatActivity {
    int birthY;
    Button button;
    int calculator;
    EditText editText;
    EditText editText1;
    String newAge;
    TextView textView;
    int year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agecal);
        /* access modifiers changed from: protected */
        this.textView = (TextView) findViewById(R.id.textView);
        this.editText = (EditText) findViewById(R.id.editText);
        this.editText1 = (EditText) findViewById(R.id.editText1);
        Button button2 = (Button) findViewById(R.id.button);
        this.button = button2;
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (agecal.this.editText.getText().length() == 0 || agecal.this.editText.getText().equals(" ")) {
                    Toast.makeText(agecal.this, "Enter Your Birth Year",1).show();
                    return;
                }
                agecal agecal = agecal.this;
                agecal.birthY = Integer.valueOf(agecal.editText.getText().toString()).intValue();
                agecal main9Activity2 = agecal.this;
                main9Activity2.year = Integer.valueOf(main9Activity2.editText1.getText().toString()).intValue();
                agecal agecal3 = agecal.this;
                agecal3.calculator = agecal3.year - agecal.this.birthY;
                agecal main9Activity4 = agecal.this;
                StringBuilder sb = new StringBuilder();
                sb.append("You Have ");
                sb.append(agecal.this.calculator);
                sb.append(" Years Old");
                main9Activity4.newAge = sb.toString();
                agecal.this.textView.setText(agecal.this.newAge);
                agecal.this.editText.clearComposingText();
            }
        });
    }
}