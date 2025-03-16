package com.scaler.projectmodule.models;

import jakarta.persistence.Entity;

@Entity
public class Category extends Base{

    private String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Category(String title) {
        this.title = title;
    }

    public Category() {

    }
}