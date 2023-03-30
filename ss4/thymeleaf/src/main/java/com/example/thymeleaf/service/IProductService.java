package com.example.thymeleaf.service;

import com.example.thymeleaf.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Object save(Product product);

    Product findById(int id);
    void updateProduct(int id,Product product);
    void deleteProduct (int id);
}
