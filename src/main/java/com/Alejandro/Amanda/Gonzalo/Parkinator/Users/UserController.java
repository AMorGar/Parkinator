package com.Alejandro.Amanda.Gonzalo.Parkinator.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository repositorio;

    @GetMapping("/Users")
    public String showUsers(Model model) {
        model.addAttribute("usuarios", repositorio.getAll());
        return "listausuarios";
    }
}