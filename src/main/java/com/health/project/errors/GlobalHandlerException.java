package com.health.project.errors;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice 
public class GlobalHandlerException {

    // Esta primera excepción es para validar que no haya usuarios duplicados
    @ExceptionHandler (UsuarioDuplicado.class)
    public String handlerUserNotFound(UsuarioDuplicado ex, Model model){
        model.addAttribute("error", ex.getMessage());
        return "usuarioDuplicado";
    }

    // Esta excepción valida que haya médicos para la especialidad seleccionada 
    @ExceptionHandler(MedicoNoSeleccionadoException.class)
    public String handlerMedicoNoSeleccionado( MedicoNoSeleccionadoException ex, Model model){ 
        model.addAttribute("error", ex.getMessage()); 
        return "medicoNoSeleccionado"; 
    }

}
