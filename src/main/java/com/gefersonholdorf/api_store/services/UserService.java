package com.gefersonholdorf.api_store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gefersonholdorf.api_store.entities.User;
import com.gefersonholdorf.api_store.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public List<User> findAll() {
        List<User> users = repository.findAll();

        return users;
    }

    @Transactional(readOnly = true)
    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);

        return obj.get();
    }
    
}
