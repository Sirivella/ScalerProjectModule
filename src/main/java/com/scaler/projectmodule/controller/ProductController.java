package com.scaler.projectmodule.controller;

import com.scaler.projectmodule.models.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    //@RequestMapping(value = "/Products", method = RequestMethod.POST)
    @PostMapping("/Products")
    public void createProduct(Product product) {

    }

    public void updateProduct(Product product) {

    }

    public void deleteProduct(Product product) {

    }

    public Product getProductById(long id) {
        return null;
    }
}