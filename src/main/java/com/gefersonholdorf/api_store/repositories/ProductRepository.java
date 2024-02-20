package com.gefersonholdorf.api_store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gefersonholdorf.api_store.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
