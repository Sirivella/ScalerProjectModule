package com.scaler.projectmodule.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    private long id;
    private String title;
    private String description;
    private double price;
    private int quantity;
    private String imageURL;
    private Category category;

    public Product(long id, String title, String description, double price, int quantity, String imageURL, Category category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.imageURL = imageURL;
        this.category = category;
    }

    public Product() {

    }
}
