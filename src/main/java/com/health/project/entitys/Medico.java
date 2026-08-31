package com.health.project.entitys;
import lombok.Data;
import java.util.Date;

@Data
public class Medico extends Persona {

    // enumeracion 
    private Especialidad especialidad;
    private String empleador;
    private Espacio hospital ; 
    private double costo ; 


    public Medico(Integer id, Long cedula, String nombre, Date fechaNacimiento, String rol, String telefono, String correo, String contrasena, String fechaRegistro,Especialidad especialidad, String empleador, Espacio hospital) {
        super(id, cedula, nombre, fechaNacimiento, rol, telefono, correo, contrasena, fechaRegistro);
        this.especialidad = especialidad;
        this.empleador = empleador;
        this.hospital = hospital;
        this.costo = asignarCosto(especialidad);

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

public double asignarCosto(Especialidad especialidad) {
    switch (especialidad) {
        case MEDICINA_GENERAL:
            return 50000;

        case PEDIATRIA:
            return 70000;

        case CARDIOLOGIA:
            return 120000;

        case DERMATOLOGIA:
            return 100000;

        case NEUROLOGIA:
            return 130000;

        case GINECOLOGIA:
            return 90000;

        case ORTOPEDIA:
            return 110000;

        case CIRUGIA_GENERAL:
            return 150000;

        case OFTALMOLOGIA:
            return 100000;

        case UROLOGIA:
            return 120000;

        case ENDOCRINOLOGIA:
            return 100000;

        case GASTROENTEROLOGIA:
            return 120000;

        case ONCOLOGIA:
            return 180000;

        case PSIQUIATRIA:
            return 90000;

        case NEUMOLOGIA:
            return 110000;

        default:
            return 0;
    }
}



}