package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView showTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        showTV = findViewById(R.id.show_tv);

        Bundle bundle  = getIntent().getExtras();
        String value = bundle.getString("data");
        showTV.setText(value);

    }
}