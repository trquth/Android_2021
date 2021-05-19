package com.example.androidforbeginner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

class Programmer {
    String name;
    String userName;
    String social;
    Integer avatar;


    public Programmer(String name,String userName,String social,Integer avatar){
        this.name = name;
        this.userName = userName;
        this.social = social;
        this.avatar = avatar;
    }
}
public class RecyclerViewActivity extends AppCompatActivity {

    ArrayList<Programmer>  hotGitPersons = new ArrayList<Programmer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.recycler);

        hotGitPersons.add(new Programmer("Dan Abramov","gaearon","@dan_abramov", R.drawable.danabramov));
        hotGitPersons.add(new Programmer("Matt","mattt","@mattt", R.drawable.mattt));
        hotGitPersons.add(new Programmer("Jake Wharton","JakeWharton","@JakeWharton", R.drawable.jakewharton));

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(hotGitPersons, this);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}