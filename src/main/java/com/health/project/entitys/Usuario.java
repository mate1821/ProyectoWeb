package com.health.project.entitys;

import lombok.Data;
import java.util.Date;


@Data

public class Usuario extends Persona {

    private String antecedentes;
    private String tipoServicio;
    private Boolean activo;


    public Usuario(Integer id, Long cedula, String nombre, Date fechaNacimiento, String rol, String telefono, String correo, String contrasena, String fechaRegistro,String antecedentes, String tipoServicio, Boolean activo) {
        super(id, cedula, nombre, fechaNacimiento, rol, telefono, correo, contrasena, fechaRegistro);
        
        this.antecedentes = antecedentes;
        this.tipoServicio = tipoServicio;
        this.activo = activo;
    }
    
    @Override
    public String toString() {
        return getNombre();
    }

}