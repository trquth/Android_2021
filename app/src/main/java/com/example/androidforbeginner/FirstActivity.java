package com.example.androidforbeginner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    TextView textView;
    Button increaseNumberBtn;
    Button nextActivityBtn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        textView = findViewById(R.id.number);
        increaseNumberBtn = findViewById(R.id.increase_number_btn);
        nextActivityBtn = findViewById(R.id.go_next_btn);

        increaseNumberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter + 1;
                textView.setText(""+counter);
            }
        });

        nextActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(i);
            }
        });

        Log.d("Activity lifecycle","☝️ onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Activity lifecycle","☝️ onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Activity lifecycle","☝️ onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Activity lifecycle","☝️ onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Activity lifecycle","☝️ onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Activity lifecycle","☝️ onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("Activity lifecycle","☝️ onRestart");
    }
}