package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.User;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.UserRepository;

@Service 
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository; 
    }

    @Override
    public Iterable<User> getAll() {
        return this.userRepository.findAll();
    }
    
}
