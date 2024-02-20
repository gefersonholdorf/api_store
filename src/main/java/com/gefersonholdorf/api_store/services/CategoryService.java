package com.gefersonholdorf.api_store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gefersonholdorf.api_store.entities.Category;
import com.gefersonholdorf.api_store.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<Category> findAll() {
        List<Category> categories = repository.findAll();

        return categories;
    }

    @Transactional(readOnly = true)
    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);

        return obj.get();
    }
    
}
