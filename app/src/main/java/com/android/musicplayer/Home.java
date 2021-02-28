package com.android.musicplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList <MainModel> mainmodels;
    MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = findViewById(R.id.artist_view1);

        //integer array
        Integer[] artists ={R.drawable.i,R.drawable.i, R.drawable.i , R.drawable.i , R.drawable.i};

        String [] artist_name ={"ab","bc","cd","de","ef"};

        //Initialize arraylist
        mainmodels = new ArrayList<>();

        for(int i=0;i<artists.length;i++)
        {
            MainModel model = new MainModel(artists[i],artist_name[i]);
            mainmodels.add(model);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(Home.this, LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //Initialize main adapter
        mainAdapter = new MainAdapter(Home.this,mainmodels);
        recyclerView.setAdapter(mainAdapter);
    }
}
