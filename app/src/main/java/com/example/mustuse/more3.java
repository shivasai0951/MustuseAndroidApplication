package com.example.mustuse;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.mustuse.R;

public class more3 extends Activity {
    EditText txt_phone_number, txt_msg;
    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more3);

        txt_phone_number = (EditText) findViewById(R.id.txt_phone_number);
        txt_msg = (EditText) findViewById(R.id.txt_msg);
    }


    public void btn_send(View view) {

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);

        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {

            MYMessage();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, 0);
        }

    }

    private void MYMessage() {

        String phoneNumber = txt_phone_number.getText().toString().trim();
        String msg = txt_msg.getText().toString().trim();

        if (!txt_phone_number.getText().toString().equals("") || !txt_msg.getText().toString().equals("")) {

            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNumber, null, msg, null, null);

            Toast.makeText(this, "message sent", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "please enter number or message", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);


        switch (requestCode) {
            case 0:
                if (grantResults.length >= 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    MYMessage();
                } else {
                    Toast.makeText(this, "you dont have permission to text", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
