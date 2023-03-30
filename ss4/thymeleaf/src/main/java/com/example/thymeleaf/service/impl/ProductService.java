package com.example.thymeleaf.service.impl;

import com.example.thymeleaf.model.Product;
import com.example.thymeleaf.repository.IProductRepository;
import com.example.thymeleaf.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository repository;

    @Override
    public List<Product> findAll(String name) {
        return repository.findAll(name);
    }

    @Override
    public Object save(Product product) {
        return repository.save(product);
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void updateProduct(int id, Product product) {
        repository.updateProduct(id, product);
    }

    @Override
    public void deleteProduct(int id) {
        repository.deleteProduct(id);
    }
}
