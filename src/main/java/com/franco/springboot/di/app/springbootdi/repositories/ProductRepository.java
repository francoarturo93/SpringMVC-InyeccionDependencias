package com.franco.springboot.di.app.springbootdi.repositories;

import java.util.List;

import com.franco.springboot.di.app.springbootdi.models.Product;

public interface ProductRepository {
    List<Product> findAll();

    Product findById(Long id);
}
