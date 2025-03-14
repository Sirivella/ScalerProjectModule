package com.scaler.projectmodule.controller;

import com.scaler.projectmodule.DTO.ErrorDTO;
import com.scaler.projectmodule.models.Product;
import com.scaler.projectmodule.service.ProductService;
import exceptions.ProductNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //@RequestMapping(value = "/Products", method = RequestMethod.POST)
    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product.getTitle(),product.getDescription(),product.getPrice(), product.getImageURL(), product.getCategory().getTitle());
    }

    public void updateProduct(Product product) {

    }

    public void deleteProduct(Product product) {

    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") long id) throws ProductNotFoundException {
        return productService.getSingleProduct(id);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ErrorDTO handleProductNotFoundException(Exception e) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setMessage(e.getMessage());
        return errorDTO;
    }
}