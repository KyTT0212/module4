package com.example.orm.service;

import com.example.orm.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll(String name);

    Object save(Product product);

    Product findById(int id);

    void updateProduct(int id, Product product);

    void deleteProduct(int id);
}
