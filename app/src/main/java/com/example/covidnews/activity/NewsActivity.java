package com.example.covidnews.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covidnews.R;
import com.example.covidnews.adapter.ListNewsAdapter;
import com.example.covidnews.model.Data;
import com.example.covidnews.model.NewsData;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {

    private RecyclerView rvNews;
    private ArrayList<Data> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_news);

        rvNews = findViewById(R.id.rv_news_item);
        rvNews.setHasFixedSize(true);

        list.addAll(NewsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvNews.setLayoutManager(new LinearLayoutManager(this));
        ListNewsAdapter listHeroAdapter = new ListNewsAdapter(list);
        rvNews.setAdapter(listHeroAdapter);
    }

}
