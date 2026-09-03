
package com.health.project.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.health.project.entitys.Reserva;
import com.health.project.repository.ReservaRepository;


@Service
public class ReservaServiceImpl implements ReservaService {
    @Autowired
    ReservaRepository reservaRepository;
    
    @Override
    public Reserva searchById(Integer id) {
        return reservaRepository.findById(id);
        
    }

    @Override
    public Collection<Reserva> searchAll(){
        return reservaRepository.findAll();
    

}
}
