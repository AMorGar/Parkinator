package com.Alejandro.Amanda.Gonzalo.Parkinator.Users;
import java.util.ArrayList;

public class UserRepository {

    private ArrayList<User> usuarios;
    public UserRepository() {
        User = new ArrayList<>();
    }
    public ArrayList<User> getAll() {
        this.usuarios.clear();
        this.usuarios.add(new User("email:anavrod125@g.educaand.es","name:Amanda Navas Rodriguez"));
        return this.usuarios;
    }

}