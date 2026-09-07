package com.health.project.service;

import java.util.List;

import com.health.project.entitys.Servicio;

public interface ServicioService {
    public List<Servicio> searchAll();
    public Servicio searchById(Long id);

}
