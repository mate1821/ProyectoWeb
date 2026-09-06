package com.health.project.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.health.project.entitys.Medico;


public interface MedicoRepository extends JpaRepository<Medico, Long> {
    
}
