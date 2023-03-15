package com.Alejandro.Amanda.Gonzalo.Parkinator.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository repositorio;

    @GetMapping("/Users")
    public String showUsers(Model model) {
        model.addAttribute("usuarios", repositorio.getAll());
        return "listausuarios";
    }

    @GetMapping("/CreateUser")
    public String showUserForm(Model model) {
    UserDao userDao= new UserDao();
    model.addAttribute("userDao",userDao);
        return "formulario";
    }

    @PostMapping("/CreateUser")
    public String createUser(@ModelAttribute  UserDao userDao ){

        
    return "redirect:/Users"; 
    }

    
}