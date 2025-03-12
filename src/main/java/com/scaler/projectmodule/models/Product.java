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
    private String image;
    private Category category;

    public Product(long id, String title, String description, double price, int quantity, String image, Category category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
        this.category = category;
    }
}
