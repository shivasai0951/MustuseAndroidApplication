package com.example.mustuse;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btn1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openActivity2();
            }
        });
        btn2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openActivity3();
            }
        });
        btn3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openActivity4();
            }
        });

        btn4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openActivity5();
            }
        });
        btn5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openActivity6();
            }
        });
        btn6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openActivity7();
            }
        });
        btn7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openActivity10();
            }
        });
        btn8.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openActivity14();
            }
        });

        btn9.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openActivity15();
            }
        });
    }

    public void openActivity2() {
        startActivity(new Intent(this, socialblock.class));
    }

    public void openActivity3() {
        startActivity(new Intent(this, chromeblock.class));
    }

    public void openActivity4() {
        startActivity(new Intent(this, callsblock.class));
    }

    public void openActivity5() {
        startActivity(new Intent(this, shopingblock.class));
    }

    public void openActivity6() {
        startActivity(new Intent(this, resultsblock.class));
    }

    public void openActivity7() {
        startActivity(new Intent(this, calculatorblock.class));
    }

    public void openActivity10() {
        startActivity(new Intent(this, moreblock.class));
    }

    public void openActivity14() {
        startActivity(new Intent(this, aboutblock.class));
    }

    public void openActivity15() {
        startActivity(new Intent(this, enter.class));
    }

    public void onBackPressed() {
        Builder builder = new Builder(this);
        String str = "no";
        builder.setMessage((CharSequence) "are you want to exit ?").setCancelable(false).setPositiveButton((CharSequence) "yes", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int i) {
                MainActivity.super.onBackPressed();
            }
        }).setNegativeButton((CharSequence) str, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int i) {
                dialog.cancel();
            }
        });
        builder.create().show();
    }
}