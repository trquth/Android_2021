package com.example.androidforbeginner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText titleInput, descriptionInput;
    CheckBox isPublicCkb;
    Button increaseNumberBtn;
    int count = 1;
    String title;
    String description;
    boolean isPublic;

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleInput = findViewById(R.id.title_input);
        descriptionInput = findViewById(R.id.description_input);
        isPublicCkb = findViewById(R.id.isPublicCkb);
        increaseNumberBtn = findViewById(R.id.increaseNumberBtn);

        increaseNumberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count += 1;
                increaseNumberBtn.setText(""+count);
            }
        });

        rettrieveData();
    }

    @Override
    protected void onPause() {
        super.onPause();

        saveData();
    }

    public void saveData(){
        sharedPreferences = getSharedPreferences("temp_data",Context.MODE_PRIVATE);
        title = titleInput.getText().toString();
        description = descriptionInput.getText().toString();
        isPublic = isPublicCkb.isChecked();

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("title_key",title);
        editor.putString("description_key",description);
        editor.putBoolean("isPublic_key",isPublic);
        editor.putInt("count_key",count);
        editor.commit();

        Toast.makeText(getApplicationContext(),"Saved data",Toast.LENGTH_LONG).show();
    }

    public  void rettrieveData(){
        sharedPreferences= getSharedPreferences("temp_data", Context.MODE_PRIVATE);
        title = sharedPreferences.getString("title_key","");
        description = sharedPreferences.getString("description_key","");
        isPublic = sharedPreferences.getBoolean("isPublic_key",false);
        count = sharedPreferences.getInt("count_key",0);

        titleInput.setText(title);
        descriptionInput.setText(description);
        isPublicCkb.setChecked(isPublic);
        increaseNumberBtn.setText(""+count);
    }
}