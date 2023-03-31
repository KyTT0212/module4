package com.example.orm.repository;

import com.example.orm.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll(String name);

    Object save(Product product);

    Product findById(int id);

    void updateProduct(int id, Product product);

    void deleteProduct(int id);
}
