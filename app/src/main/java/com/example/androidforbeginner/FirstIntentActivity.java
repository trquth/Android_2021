package com.example.androidforbeginner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstIntentActivity extends AppCompatActivity {

    EditText input;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_intent);

        input = findViewById(R.id.input_name);
        button = findViewById(R.id.pass_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = input.getText().toString();
                Intent intent = new Intent(FirstIntentActivity.this, SecondIntentActivity.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });

    }
}