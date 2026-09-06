package com.health.project.entitys;

import lombok.Data;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Transient;

@Data
@Entity
public class Medico {

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

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private Especialidad especialidad;

    @Column(length = 100)
    private String empleador;

    @Transient
    @JoinColumn(name = "hospital_id")
    private Espacio hospital;

    public Medico(Integer id, Long cedula, String nombre, Date fechaNacimiento, String rol, String telefono, String correo, String contrasena, String fechaRegistro, Especialidad especialidad, String empleador, Espacio hospital) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
        this.fechaRegistro = fechaRegistro;
        this.especialidad = especialidad;
        this.empleador = empleador;
        this.hospital = hospital;
    }

    public enum Especialidad {
        MEDICINA_GENERAL,
        PEDIATRIA,
        CARDIOLOGIA,
        DERMATOLOGIA,
        NEUROLOGIA,
        GINECOLOGIA,
        ORTOPEDIA,
        CIRUGIA_GENERAL,
        OFTALMOLOGIA,
        UROLOGIA,
        ENDOCRINOLOGIA,
        GASTROENTEROLOGIA,
        ONCOLOGIA,
        PSIQUIATRIA,
        NEUMOLOGIA
    }
}