package com.example.androidforbeginner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button goBackBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        goBackBtn = findViewById(R.id.go_back_btn);

        goBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),FirstActivity.class);
                startActivity(i);
            }
        });

        Log.d("Activity lifecycle","✌️ onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Activity lifecycle","✌️ onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Activity lifecycle","✌️ onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Activity lifecycle","✌️ onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Activity lifecycle","✌️ onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Activity lifecycle","✌️ onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("Activity lifecycle","✌️ onRestart");
    }
}