
package com.tienda.controller;


import com.tienda.entity.Pais;
import com.tienda.entity.Persona;
import com.tienda.service.IPaisService;
import com.tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {
    
    @Autowired
    private IPersonaService personaService;
    
    @Autowired
    private IPaisService paisService;
    
    @GetMapping("/persona")
    public String index(Model model){
    List<Persona> listaPersona = personaService.getAllPersona();
    model.addAttribute("titulo","Tabla Persona");
    model.addAttribute("persona",listaPersona);
    return "personas";
    }
    @GetMapping("/personaN")
    public String crearPersona(Model model){
    List<Pais> listaPaises = paisService.listCountry();
    model.addAttribute("persona", new Persona());
    model.addAttribute("paises", listaPaises);
    return "crear";
    }
}
