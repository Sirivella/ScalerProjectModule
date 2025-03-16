package com.scaler.projectmodule.service;

import com.scaler.projectmodule.DTO.FakeStoreProductDTO;
import com.scaler.projectmodule.models.Product;
import exceptions.ProductNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService{

    RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(long id) throws ProductNotFoundException {
        FakeStoreProductDTO fakeStoreProductDTO = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductDTO.class);
        //System.out.println(fakeStoreProductDTO.toString());

        if(fakeStoreProductDTO == null){
            throw new ProductNotFoundException("Product not found with id "+ id);
        }

        return fakeStoreProductDTO.getProduct();
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(String title, String description, double price, String imageURL, String category) {
        FakeStoreProductDTO fakeStoreProductDTO = new FakeStoreProductDTO();
        fakeStoreProductDTO.setPrice(price);
        fakeStoreProductDTO.setTitle(title);
        fakeStoreProductDTO.setDescription(description);
        fakeStoreProductDTO.setImage(imageURL);
        fakeStoreProductDTO.setCategory(category);

        FakeStoreProductDTO response = restTemplate.postForObject("https://fakestoreapi.com/products", fakeStoreProductDTO, FakeStoreProductDTO.class );
        assert response != null;
        return response.getProduct();
    }
}