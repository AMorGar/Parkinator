package com.Alejandro.Amanda.Gonzalo.Parkinator.Users;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private UserRepository repositorio = new UserRepository();

    @GetMapping("/Users")
    public String showUsers() {
        return "listausuarios";
    }
}