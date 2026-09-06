
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
        model.addAttribute("reservas", service.buscarReservas());
        return "mostrar_reservas";
    }
    
    @GetMapping("/CrearReserva")
    public String crearReservas(Model model) {
        model.addAttribute("reserva", service.buscarReservas());
        return "reserva-form";
    }


}
