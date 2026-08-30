package com.health.project.entitys;
import lombok.Data;
import java.util.Date;

@Data
public class Medico extends Persona {

    
    private String especialidad;
    private String empleador;

    public Medico(Integer id, Long cedula, String nombre, Date fechaNacimiento, String rol, String telefono, String correo, String contrasena, String fechaRegistro,String especialidad, String empleador) {
        super(id, cedula, nombre, fechaNacimiento, rol, telefono, correo, contrasena, fechaRegistro);
        this.especialidad = especialidad;
        this.empleador = empleador;
    }
}