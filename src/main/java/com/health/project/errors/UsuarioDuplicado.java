package com.health.project.errors;

import com.health.project.entitys.Rol;

public class UsuarioDuplicado extends RuntimeException{

    public UsuarioDuplicado (long id, Rol rol){
        super("Ya existe un usuario de tipo " + rol.getNombre()+ " registrado con la cédula "+ id);
    }
    
}
