package com.health.project.entitys;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
    private Integer id;
    private Usuario usuario;
    private String espacio;//CAMBIAR LUEGO A ENTIDAD ESPACIO
    private String fecha;
    private String hora;
}