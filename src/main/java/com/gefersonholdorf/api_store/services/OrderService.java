package com.gefersonholdorf.api_store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gefersonholdorf.api_store.entities.Order;
import com.gefersonholdorf.api_store.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<Order> findAll() {
        List<Order> orders = repository.findAll();

        return orders;
    }

    @Transactional(readOnly = true)
    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);

        return obj.get();
    }
    
}
