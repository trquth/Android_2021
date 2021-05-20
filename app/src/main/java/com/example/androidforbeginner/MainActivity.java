package com.example.androidforbeginner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("app lifecycle", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("app lifecycle","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("app lifecycle","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("app lifecycle","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("app lifecycle","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("app lifecycle","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("app lifecycle","onRestart");
    }
}