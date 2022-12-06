package com.raiseup.datatransaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class SecondActivity extends AppCompatActivity {
    private TextView txt_name,txt_email,txt_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt_name = findViewById(R.id.txt_name);
        txt_email = findViewById(R.id.txt_email);
        txt_phone = findViewById(R.id.txt_phone);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        txt_name.setText(extras.getString("name").toUpperCase(Locale.ROOT));
        txt_email.setText(extras.getString("email").toUpperCase(Locale.ROOT));
        txt_phone.setText(extras.getString("phone").toUpperCase(Locale.ROOT));
    }
}