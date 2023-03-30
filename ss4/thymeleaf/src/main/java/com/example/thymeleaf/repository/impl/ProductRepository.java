package com.example.thymeleaf.repository.impl;

import com.example.thymeleaf.model.Product;
import com.example.thymeleaf.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"Cam",16.7,"màu cam","kỳ bedep"));
        productList.add(new Product(2,"Táo",18.4,"màu đỏ","kỳ bedep"));
        productList.add(new Product(3,"Ổi",10.0,"màu xanh","kỳ bedep"));
        productList.add(new Product(4,"Hông",32.0,"màu hồng","kỳ bedep"));
        productList.add(new Product(4,"Dâu",22.7,"màu baby","kỳ bedep"));
    }
    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Object save(Product product) {
        return productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product: productList) {
            if (id == product.getId()){
                return product;
            }
        }
        return null;
    }
}
