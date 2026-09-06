package com.health.project.entitys;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity 
@AllArgsConstructor 
public class Especialidades {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length =150, unique=true)
    private String nombreEspecialidad ; 

    @Column(nullable = false)
    private Double costo;
}
