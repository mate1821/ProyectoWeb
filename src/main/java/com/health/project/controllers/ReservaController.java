package com.health.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.health.project.entitys.Usuario;
import com.health.project.service.ReservaService;

@Controller
@RequestMapping("/reservas")
public class ReservaController {
    
    @Autowired
    ReservaService service;


    @GetMapping("/mostrar")
    public String mostrarReservas(Model model) {
        model.addAttribute("reservas", service.searchAll());
        return "mostrar_reservas";
    }
    
}
