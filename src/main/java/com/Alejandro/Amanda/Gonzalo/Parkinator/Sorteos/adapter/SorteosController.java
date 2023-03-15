package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.service.SorteosService;

@Controller
public class SorteosController {
    
    private SorteosService sorteosService;

    public SorteosController(SorteosService sorteoService) {
        this.sorteosService = sorteoService;
    }

    @GetMapping("/Sorteos")
    public String displaySorteos(Model model) {
        model.addAttribute("Sorteos", sorteosService.getAll());
        return "Sorteos/ListaSorteos";
    }
}
