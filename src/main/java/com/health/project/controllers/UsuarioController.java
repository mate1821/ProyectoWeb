/*
package com.health.project.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.health.project.entitys.Usuario;

import ch.qos.logback.classic.Logger;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.health.project.service.ReservaService;


@RequestMapping("/user")
@Controller
public class UsuarioController { 


    @Autowired 
    private Usuario user1;

    @Autowired
    ReservaService service;


    @GetMapping()
    public String mostrarUsuarios(Model model) {
        model.addAttribute("estudiante", service.searchAll());
        return new String();
    }

    @GetMapping("/{id}")
    public String mostrarUsuarioPorId(Model model, @RequestParam("id") Integer id) {
        Usuario user = service.searchById(id);
        model.addAttribute("estudiante", user);
    }
    

private Usuario user ; 





} */