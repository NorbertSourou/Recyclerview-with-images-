package com.example.projectmadrojudi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Item[] myListData = new Item[]{
                new Item("trttrt", "Titre 1", new SimpleDateFormat("dd/MM/yyyy à HH:mm:ss").format(new Date()), "ViewPagify is a ViewPager similar to the one used " +
                        "in Spotify Player. It creates a cover flow effect where the selected" +
                        " album appears bigger in the middle of the screen, showing a sneak peak of the next and previous albums." +
                        " It is a great view to be used in a Music Player or Album Store application."),
                new Item("trttrt", "Titre 2", new SimpleDateFormat("dd/MM/yyyy à HH:mm:ss").format(new Date()), "Petite Descriprion"),
                new Item("trttrt", "Titre 3", new SimpleDateFormat("dd/MM/yyyy à HH:mm:ss").format(new Date()), "des"),
                new Item("trttrt", "Titre 4", new SimpleDateFormat("dd/MM/yyyy à HH:mm:ss").format(new Date()), "des")

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        MyAdapter adapter = new MyAdapter(myListData);
        //recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
