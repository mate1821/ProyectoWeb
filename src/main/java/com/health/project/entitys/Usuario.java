package com.health.project.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Integer puede ser null
    @Column(nullable = false, length = 100, unique=true)
    private Long cedula;
    @Column(nullable = false, length = 100)
    private String nombre;
    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_nacimiento; // int no puede ser null
    @Column(length = 120)
    private String antecedentes;
    @Column(length = 120)
    private String correo;
    @Column(length = 120)
    private String rol;
    @Column(length = 120)
    private String telefono;
    @Column(length = 120)
    private Boolean activo= true;
    @Column(length = 120)
    private String contrasena;
    @Column(updatable = false)
    private LocalDateTime fechaRegistro;


@Override
public String toString() {
    return nombre;
}

public Usuario (Integer id, Long cedula, String nombre, Date fechaNacimiento, String rol, String telefono, String correo, String contrasena, boolean activo) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fecha_nacimiento = fechaNacimiento;
        this.rol = rol;
        this.telefono = telefono;
        this.correo = correo;
        this.activo=activo;
        this.contrasena = contrasena;
        this.fechaRegistro= LocalDateTime.now();

    }
}

