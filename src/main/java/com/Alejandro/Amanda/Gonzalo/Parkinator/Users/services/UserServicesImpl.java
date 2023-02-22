package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.services;

import org.springframework.stereotype.Service;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.*;
@Service
public class UserServicesImpl implements UserService {

    private UserRepository repository;

    public UserServicesImpl(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public Iterable<User> getAll() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }
    
}
