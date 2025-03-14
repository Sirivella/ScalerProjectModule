package com.scaler.projectmodule.controller;

import com.scaler.projectmodule.models.Product;
import com.scaler.projectmodule.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //@RequestMapping(value = "/Products", method = RequestMethod.POST)
    @PostMapping("/products")
    public void createProduct(Product product) {
        //for commit
    }

    public void updateProduct(Product product) {

    }

    public void deleteProduct(Product product) {

    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") long id) {
        return null;
    }
}