package com.example.androidforbeginner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    ArrayList<Programmer> hotGitPersons = new ArrayList<Programmer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        hotGitPersons.add(new Programmer("Dan Abramov","gaearon","@dan_abramov", R.drawable.danabramov));
        hotGitPersons.add(new Programmer("Matt","mattt","@mattt", R.drawable.mattt));
        hotGitPersons.add(new Programmer("Jake Wharton","JakeWharton","@JakeWharton", R.drawable.jakewharton));

        GridView gridView = findViewById(R.id.gridview);
        GridViewAdapter gridViewAdapter = new GridViewAdapter(hotGitPersons,this);
        gridView.setAdapter(gridViewAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Selected " + hotGitPersons.get(position).userName, Toast.LENGTH_SHORT).show();
            }
        });
    }
}