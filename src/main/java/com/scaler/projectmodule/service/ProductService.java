package com.scaler.projectmodule.service;

import com.scaler.projectmodule.models.Product;
import exceptions.ProductNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    Product getSingleProduct(long id) throws ProductNotFoundException;
    List<Product> getAllProducts();
    Product createProduct( String title, String description, double price,  String imageURL, String category);
}
