package com.example.thymeleaf.repository;

import com.example.thymeleaf.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll(String name);

    Object save(Product product);

    Product findById(int id);
    void updateProduct(int id,Product product);
    void deleteProduct (int id);
}
