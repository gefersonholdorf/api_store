package com.gefersonholdorf.api_store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gefersonholdorf.api_store.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
