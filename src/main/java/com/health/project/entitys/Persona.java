package com.health.project.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

import jakarta.persistence.MappedSuperclass;

@Data
@NoArgsConstructor


@MappedSuperclass
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private Long cedula;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false)
    private Date fechaNacimiento;

    @Column(length = 120)
    private String rol;

    @Column(length = 120)
    private String telefono;

    @Column(length = 120)
    private String correo;

    @Column(length = 120)
    private String contrasena;

    @Column(updatable = false)
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