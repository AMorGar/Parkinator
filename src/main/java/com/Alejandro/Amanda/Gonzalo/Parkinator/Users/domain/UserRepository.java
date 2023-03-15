package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private ArrayList<User> usuarios;
    public UserRepository() {
        usuarios  = new ArrayList<>();
    }
    public ArrayList<User> getAll() {
        this.usuarios.clear();
        this.usuarios.add(new User("Manolo", "El del Bombo", "Ortega", "Profesor"));
        return this.usuarios;
    }
    public Iterable<com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.User> findAll() {
        return null;
    }
}