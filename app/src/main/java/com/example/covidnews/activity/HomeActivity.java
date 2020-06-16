package com.example.covidnews.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covidnews.R;
import com.example.covidnews.adapter.NewsAdapter;
import com.example.covidnews.model.NewsModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_news_today);

        List<NewsModel> listNews = new ArrayList<>();
        listNews.add(new NewsModel("US stocks surge on stimulus hopes", R.drawable.dummies_pic1));
        listNews.add(new NewsModel("Harvard drops standardized test requirement for admission to class of 2025", R.drawable.dummies_pic2));
        listNews.add(new NewsModel("Blood donations are vital during the COVID-19 Pandemic, PAHO says", R.drawable.dummies_pic3));
        listNews.add(new NewsModel("Harvard drops standardized test requirement for admission to class of 2025", R.drawable.dummies_pic2));

        NewsAdapter newsAdapter = new NewsAdapter(this, listNews);
        recyclerView.setAdapter(newsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
}
