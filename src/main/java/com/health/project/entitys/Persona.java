package com.health.project.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data

class Persona {

    private Integer id; // Integer puede ser null 
    private Long cedula; 
    private String nombre;
    private Date fechaNacimiento; // int no puede ser null
    private String rol;
    private String telefono;
    private String correo;
    private String contrasena;
    private String fechaRegistro; 

    public Persona(Integer id, Long cedula, String nombre, Date fechaNacimiento, String rol, String telefono, String correo, String contrasena, String fechaRegistro) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
        this.fechaRegistro = fechaRegistro;
    }


}