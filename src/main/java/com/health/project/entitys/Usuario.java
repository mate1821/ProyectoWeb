package com.health.project.entitys;

import lombok.AllArgsConstructor;
import lombok.Data; 
import java.util.Date;

@Data
@AllArgsConstructor
public class Usuario {
    private Integer id; // Integer puede ser null 
    private Long cedula; 
    private String nombre;
    private Date fecha_nacimiento; // int no puede ser null
    private String antecedentes;
    private String correo;
    private String tipo_servicio ; 
    private String rol;
    private String telefono;
    private Boolean activo;

    @Override
public String toString() {
    return nombre;
}



}
