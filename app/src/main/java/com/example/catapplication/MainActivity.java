package com.example.catapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.location.Address;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.txt_vw);
        View view = findViewById(R.id.viewcol);

        String jsonText = "{'name':'Мурзик','color':-16707216,'age':8}";;

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Cat murzik = gson.fromJson(jsonText, Cat.class);
        Log.i("GSON", "Имя: " + murzik.name + "\nВозраст: " + murzik.age);

        textView.setText("Имя: " + murzik.name + "\nВозраст: " + murzik.age + "\nЦвет: ");

        view.setBackgroundColor(murzik.color);

    }

}