package com.example.covidnews.model;

public class NewsModel {
    private String title;
    private String description;
    private int thumbnail;

    public NewsModel(String title, int thumbnail) {
        this.title = title;
        this.thumbnail = thumbnail;
    }

    public NewsModel(String title, String description, int thumbnail) {
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
