package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain.SorteosDao;
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

    @GetMapping("/CreateSorteos")
    public String showUserForm(Model model) {
    SorteosDao sorteosDao= new SorteosDao();
    model.addAttribute("sorteosDao",sorteosDao);
        return "Sorteos/formulariosorteos";
    }s

    @PostMapping("/CreateSorteos")
    public String createUser(@ModelAttribute  SorteosDao sorteosDao ){

        this.sorteosService.register(sorteosDao);
    return "redirect:Sorteos/ListaSorteos"; 
    }
}
