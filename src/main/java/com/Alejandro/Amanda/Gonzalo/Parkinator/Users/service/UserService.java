package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.service;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.*;

public interface UserService {
    
    public Iterable<User> getAll();
    public void register(UserDao userDao);
}
