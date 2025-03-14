package com.scaler.projectmodule.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Category {
    private int id;
    private String title;
    public Category(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Category() {

    }
}
