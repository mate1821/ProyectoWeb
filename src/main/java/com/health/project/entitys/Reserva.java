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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity 


public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idReserva;
    
    @ManyToOne //Se pone sin el mapped porque esta es la clase dominante.
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

    @ManyToOne 
    public EstadoReserva estado;

    @Column(nullable = false, updatable = false)
    public LocalDateTime fechaSolicitud;
    @Column(length = 255)
    public String observaciones;
    
    @ManyToOne //Se pone sin el mapped porque esta es la clase dominante. 
    public Medico medico;


    @Column(nullable = false)
    public double total;
    // parche mientras el 67 de confianza las pone


public Reserva(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, LocalDateTime fechaSolicitud, String observaciones, double total) {
    this.fecha = fecha;
    this.horaInicio = horaInicio;
    this.horaFin = horaFin;
    this.fechaSolicitud = fechaSolicitud;
    this.observaciones = observaciones;
    this.total = total;
}






}
