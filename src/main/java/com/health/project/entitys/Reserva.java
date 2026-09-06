package com.health.project.entitys;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Transient;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity 


public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idReserva;
    @Transient
    public Usuario usuario;
    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate fecha;
    @Column(nullable = false)
    @DateTimeFormat(pattern = "HH:mm")
    public LocalTime horaInicio;
    @Column(nullable = false)
    @DateTimeFormat(pattern = "HH:mm")
    public LocalTime horaFin;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 200)
    public EstadoReserva estado;
    @Column(nullable = false, updatable = false)
    public LocalDateTime fechaSolicitud;
    @Column(length = 255)
    public String observaciones;
    @Transient
    public Medico medico;
    @Column(nullable = false)
    public double total;
    // parche mientras el 67 de confianza las pone
    @Transient
    public Espacio espacio;    
    public enum EstadoReserva {
    PENDIENTE,
    CONFIRMADA,
    CANCELADA,
    COMPLETADA
}


public Reserva(Usuario usuario, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, EstadoReserva estado, LocalDateTime fechaSolicitud, String observaciones, Medico medico, double total, Espacio espacio) {
    this.usuario = usuario;
    this.fecha = fecha;
    this.horaInicio = horaInicio;
    this.horaFin = horaFin;
    this.estado = estado;
    this.fechaSolicitud = fechaSolicitud;
    this.observaciones = observaciones;
    this.medico = medico;
    this.total = total;
    this.espacio = espacio;
}






}

// Servicios epseciales a una resevacion