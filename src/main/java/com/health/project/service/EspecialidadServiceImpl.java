package com.health.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.project.entitys.Especialidades;
import com.health.project.repository.EspecialidadesRepository;

@Service
public class EspecialidadServiceImpl implements EspecialidadesService {
    @Autowired
    private EspecialidadesRepository repo;

    @Override
    public List<Especialidades> buscarTodos() {
        return repo.findAll();
    }

    @Override
    public Especialidades buscarPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void guardar(Especialidades especialidad) {
        repo.save(especialidad);
    }

}