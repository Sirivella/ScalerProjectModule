package com.scaler.projectmodule.DTO;

import com.scaler.projectmodule.models.Category;
import com.scaler.projectmodule.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDTO {
    private long id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;

    public Product getProduct() {
        Product product = new Product();
        product.setId(id);
        product.setTitle(title);
        product.setPrice(price);
        product.setDescription(description);
        product.setImageURL(image);
        Category cat = new Category();
        cat.setTitle(category);
        product.setCategory(cat);
        return product;
    }
}