package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.UserDao;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.service.UserService;


@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/Users")
    public String showUsers(Model model) {
        model.addAttribute("usuarios", userService.getAll());
        return "User/listausuarios"; 
    }

    @GetMapping("/CreateUser")
    public String showUserForm(Model model) {
    UserDao userDao= new UserDao();
    model.addAttribute("userDao",userDao);
        return "formulario";
    }

    @PostMapping("/CreateUser")
    public String createUser(@ModelAttribute  UserDao userDao ){

        this.userService.register(userDao);
    return "redirect:/Users"; 
    }

    
}