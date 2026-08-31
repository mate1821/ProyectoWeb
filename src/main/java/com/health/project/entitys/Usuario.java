package com.health.project.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
    private Date fecha_nacimiento; // int no puede ser null
    @Column(length = 120)
    private String antecedentes;
    @Column(length = 120)
    private String correo;
    @Column(length = 120)
    private String tipo_servicio ;
    @Column(length = 120)
    private String rol;
    @Column(length = 120)
    private String telefono;
    @Column(length = 120)
    private Boolean activo;

@Override
public String toString() {
    return nombre;
}

public Usuario(String nombre, String correo,String rol, String telefono) {
this.nombre = nombre;
this.correo = correo;
this.rol = rol;
this.telefono = telefono;
this.activo = true;
}
}

