package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.services.UserService;

@Controller
public class UserController {

    private UserService userservice;

    public UserController(UserService userservice){
        this.userservice = userservice;
    }

    @GetMapping("/Users")
    public String showUsers(Model model) {
        model.addAttribute("usuarios", userservice.getAll());
        return "listausuarios";
    }
}