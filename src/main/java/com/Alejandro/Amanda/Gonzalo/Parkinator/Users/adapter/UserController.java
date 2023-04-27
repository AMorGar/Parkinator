package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.adapter;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.Role;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.UserDao;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.service.UserService;
import com.Alejandro.Amanda.Gonzalo.Parkinator.core.Exceptions.UserExistsException;

import jakarta.validation.Valid;
/**
 * Redirige los datos introducidos por teclado 
 * @author Alejandro Moreno Garrido
 * @author Gonzalo Ruiz AzuarAmanada Navas Rodriguez, 
 * @version V0.0.1   JDK 19
 * 
 */
@Controller
public class UserController {

    private UserService userService;
/**
 * Indica donde se dirigen los datos almacenados    
 * @param userService Es un parametro usado para la creacion de usuario a la hora de dirigir los datos entrantes por teclado hacia la base de datos
 */
    public UserController(UserService userService) {
        this.userService = userService;
    }
/**
 * Mostrar la lista de todos lo usuarios creados en la base de datos
 * @param model Parametros usado para mostrar la lista de todos lo usuarios creados. 
 * @return La lista de usuarios guardados en la base de datos.
 */
    @GetMapping("/Users")
    public String showUsers(Model model) {
        model.addAttribute("usuarios", userService.getAll());
        return "User/listausuarios"; 
    }
/**
 * Crea un usuario y lo guarda en la base de datos
 * @param model Parametro usado para llevar al usuarios hacia el formulario destinado a crear los mismos.
 * @return Pagina con el formulario para crear usuarios.
 */
    @GetMapping("/CreateUser")
    public String showUserForm(Model model) {
        List<Role> roles = Arrays.asList(Role.values());
        model.addAttribute("roles", roles);
    UserDao userDao= new UserDao();
    model.addAttribute("userDao",userDao);
        return "formulario";
    }
/**
 * Redirecciona tras crear usuario
 * @param userDao Crea usuarios
 * @return Redirecciona hacia la lista de usuarios creados tras el guardado.
 */
    @PostMapping("/CreateUser")
    public String createUser(@Valid @ModelAttribute ("userDao")  UserDao userDao, BindingResult bindingResult, Model model ){
        /**
         * Por si hay algún error en la validación automática con userDao se encarga de devolver el formulario 
         */
        if (bindingResult.hasErrors()) {
            model.addAttribute("userDao", userDao);
            return "formulario";
        }

        try { 
        this.userService.register(userDao);
        }
        /**
         * En caso de que ya exista un usuario con ese correo se encarga de devolver el formulario nuevamente
         */
        catch (UserExistsException exception) {
            model.addAttribute("userDao", userDao);
            bindingResult.reject("email","Ya existe un usuario con el correo");
            return "formulario";
        }
    return "redirect:/Users"; 
    }

    
}