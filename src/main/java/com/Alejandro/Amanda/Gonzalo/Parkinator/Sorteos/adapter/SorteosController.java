package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain.SorteosDao;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.service.SorteosService;

/**
 * @author Gonzalo Ruiz Azuar
 * @author Alejandro Moreno Garrido
 * @author Amanda Navas
 * @version V0.0.1
 */

@Controller
public class SorteosController {
    
    private SorteosService sorteosService;

    /**
     * 
     * @param sorteoService Es un parámetro que nos sirve para la creación de sorteos a la hora de mandar los datos entrantes del teclado hacia la base de datos
     */

    public SorteosController(SorteosService sorteoService) {
        this.sorteosService = sorteoService;
    }

    /**
     * 
    * @param model
    * @return Devuelve la página html de la lista de sorteos 
    */

    @GetMapping("/Sorteos")
    public String displaySorteos(Model model) {
        model.addAttribute("Sorteos", sorteosService.getAll());
        return "Sorteos/ListaSorteos";
    }

    /**
     * 
     * @param model
     * @return Devuelve la el formulario html que sirve para introducir los sorteos y sus datos
     */

    @GetMapping("/CreateSorteos")
    public String showUserForm(Model model) {
    SorteosDao sorteosDao= new SorteosDao();
    model.addAttribute("sorteosDao",sorteosDao);
        return "Sorteos/formulariosorteos";
    }

    /**
     * 
     * @param sorteosDao
     * @return Devuelve sorteos
     */

    @PostMapping("/CreateSorteos")
    public String createUser(@ModelAttribute  SorteosDao sorteosDao ){

        this.sorteosService.register(sorteosDao);
    return "redirect:Sorteos"; 
    }
}
