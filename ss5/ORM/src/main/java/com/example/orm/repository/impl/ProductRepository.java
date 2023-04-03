package com.example.orm.repository.impl;

import com.example.orm.model.Product;
import com.example.orm.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {

    @Override
    public List<Product> findAll(String name) {
//        List<Product> products = BaseRepository.entityManager.createQuery("select p from Product p", Product.class).getResultList();
        List<Product> products = BaseRepository.entityManager.createQuery("select p from Product p where name like concat('%', :name, '%')", Product.class).setParameter("name", name).getResultList();
        return products;


    }

    @Override
    public Object save(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
        return product;
    }

    @Override
    public Product findById(int id) {
        Product product = BaseRepository.entityManager.find(Product.class, id);
        return product;
    }

    @Override
    public void updateProduct(int id, Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public void deleteProduct(int id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(findById(id));
        entityTransaction.commit();
    }
}
