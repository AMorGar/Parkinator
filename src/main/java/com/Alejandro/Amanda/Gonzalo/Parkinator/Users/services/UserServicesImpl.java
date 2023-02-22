package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.services;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.*;

public class UserServicesImpl implements UserService {

    private UserRepository repository;

    @Override
    public Iterable<User> getAll() {
        // TODO Auto-generated method stub
        repository.findAll();
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    
}
