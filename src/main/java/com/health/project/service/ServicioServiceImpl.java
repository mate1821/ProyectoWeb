package com.health.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.health.project.entitys.Servicio;
import com.health.project.repository.ServicioRepository;

public class ServicioServiceImpl implements ServicioService{
    @Autowired
    ServicioRepository repo;

    @Override
    public List<Servicio> searchAll() {
        return repo.findAll();
    }

    @Override
    public Servicio searchById(Long id) {
        return repo.findById(id).orElseThrow();
    }
    
}
