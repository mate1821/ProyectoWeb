package com.health.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.project.entitys.Usuario;

public interface UsuarioRepository 
extends JpaRepository<Usuario, Long>{

    
}