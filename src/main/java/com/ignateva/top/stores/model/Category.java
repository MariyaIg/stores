package com.ignateva.top.stores.model;

public class Category {
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private int id;
    private String title;

    public Category(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Category() {

    }
}
