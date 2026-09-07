package com.health.project.service;

import java.util.List;

import com.health.project.entitys.Medico;
import com.health.project.entitys.Usuario;

public interface MedicoService {

    List<Medico> buscarTodos();

    Medico buscarPorId(Long id);

    void guardar(Medico medico);

    void guardarMedicoDesdeUsuario(Usuario usuario, Long especialidadId);


}