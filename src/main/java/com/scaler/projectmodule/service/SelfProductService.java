package com.scaler.projectmodule.service;

import com.scaler.projectmodule.models.Category;
import com.scaler.projectmodule.models.Product;
import com.scaler.projectmodule.repository.CategoryRepository;
import com.scaler.projectmodule.repository.ProductRepository;
import exceptions.ProductNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
public class SelfProductService implements ProductService {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(long id) throws ProductNotFoundException {
        Optional<Product> p = productRepository.findById(id);
        if(p.isPresent()) {
            return p.get();
        }
        throw new ProductNotFoundException("Product not found");
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(String title, String description, double price, String imageURL, String categoryTitle) {
        Product product = new Product();
        Category currentCat = categoryRepository.findByTitle(categoryTitle);
        if(currentCat == null) {
            Category newCat = new Category();
            newCat.setTitle(categoryTitle);
            Category newRow = categoryRepository.save(newCat);
            product.setCategory(newRow);
        }else{
            product.setCategory(currentCat);
        }
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setImageURL(imageURL);
        productRepository.save(product);
        return product;
    }
}