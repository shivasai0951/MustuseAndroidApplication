package com.example.mustuse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class moreblock extends AppCompatActivity {
    Button btn74;
    Button btn75;
    Button btn79;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moreblock);
        /* access modifiers changed from: protected */
        this.btn74 = (Button) findViewById(R.id.btn74);
        this.btn75 = (Button) findViewById(R.id.btn75);
        btn79=(Button) findViewById(R.id.btn79);
        this.btn74.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                moreblock.this.openmore1();
            }
        });
        this.btn75.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                moreblock.this.openmore2();
            }
        });
        btn79.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                moreblock.this.openmore3();
            }
        });
    }

    public void openmore1() {
        startActivity(new Intent(this, more1.class));
    }
    public void openmore2() {
        startActivity(new Intent(this, more2.class));
    }

    public void openmore3() {
        startActivity(new Intent(this, more3.class));
    }

}
