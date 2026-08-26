package com.health.project.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Administrador {
    private Integer id; // Integer puede ser null  
    private String nombre;
    private String especialidad;
    private String correo;
    private String empleador;
}

