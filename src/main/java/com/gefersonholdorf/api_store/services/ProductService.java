package com.gefersonholdorf.api_store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gefersonholdorf.api_store.entities.Product;
import com.gefersonholdorf.api_store.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<Product> findAll() {
        List<Product> products = repository.findAll();

        return products;
    }

    @Transactional(readOnly = true)
    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);

        return obj.get();
    }
    
}
