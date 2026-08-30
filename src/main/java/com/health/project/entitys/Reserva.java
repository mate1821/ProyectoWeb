package com.health.project.entitys;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor


public class Reserva {
    public int idReserva;
    public Usuario usuario;
    public Espacio espacio;
    public LocalDate fecha;
    public LocalTime horaInicio;
    public LocalTime horaFin;
    public EstadoReserva estado ;
    public LocalDateTime fechaSolicitud;
    public String observaciones;
    public double total;


    public enum EstadoReserva {
    PENDIENTE,
    CONFIRMADA,
    CANCELADA,
    COMPLETADA
}
}