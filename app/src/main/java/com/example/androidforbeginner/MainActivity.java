package com.example.androidforbeginner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view){
        System.out.println("Do");
        Spinner color = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
//        System.out.println(beerType);
      TextView brands = (TextView) findViewById(R.id.brands);
//        brands.setText(beerType);
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormetted = new StringBuilder();
        for (String brand: brandsList){
            brandsFormetted.append(brand).append('\n');
        }
        brands.setText(brandsFormetted);

    }
}