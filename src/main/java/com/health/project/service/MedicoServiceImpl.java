package com.health.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.project.entitys.Medico;
import com.health.project.repository.MedicoRepository;

@Service
public class MedicoServiceImpl implements MedicoService {
    @Autowired
    private MedicoRepository repo;

    @Override
    public List<Medico> buscarTodos() {
        return repo.findAll();
    }

    @Override
    public Medico buscarPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void guardar(Medico medico) {
        repo.save(medico);
    }
}