package com.example.androidforbeginner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondIntentActivity extends AppCompatActivity {

    TextView nameLbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_intent);

        nameLbl = findViewById(R.id.passed_name_lbl);
        String name = getIntent().getStringExtra("name");
        nameLbl.setText(name);
    }
}