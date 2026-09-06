package com.health.project.service;

import java.util.List;

import com.health.project.entitys.Especialidades;

public interface EspecialidadesService {

    List<Especialidades> buscarTodos();

    Especialidades buscarPorId(Long id);

    void guardar(Especialidades especialidad);

}
