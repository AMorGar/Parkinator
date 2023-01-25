package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SorteosController {
    
    private SorteosRepository repository = new SorteosRepository();

    @GetMapping("/Sorteos")
    public String displaySorteos() {
        return "ListaSorteos";
    }
}
