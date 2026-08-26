
package com.health.project.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.health.project.entitys.Reserva;



@Service
public interface ReservaService {

    public Reserva searchById(Integer id) ;

    public Collection<Reserva> searchAll();

}


