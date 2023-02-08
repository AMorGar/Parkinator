package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SorteosController {
    
    @Autowired
    private SorteosRepository repository;

    @GetMapping("/Sorteos")
    public String displaySorteos(Model model) {
        model.addAttribute("Sorteos", repository.getAll());
        return "ListaSorteos";
    }
}
