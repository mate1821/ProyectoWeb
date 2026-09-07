package com.health.project.service;

import java.util.List;

import com.health.project.entitys.Especialidad;

public interface EspecialidadService {

    List<Especialidad> buscarTodos();

    Especialidad buscarPorId(Long id);

    void guardar(Especialidad especialidad);

}
