package com.Alejandro.Amanda.Gonzalo.Parkinator.Users;
import java.util.ArrayList;

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

}