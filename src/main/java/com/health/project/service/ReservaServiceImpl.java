
package com.health.project.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.project.entitys.EstadoReserva;
import com.health.project.entitys.Reserva;
import com.health.project.repository.EstadoReservaRepository;
import com.health.project.repository.ReservaRepository;
import java.util.List;


@Service
public class ReservaServiceImpl implements ReservaService {

    private static final Long ID_CANCELADA = 2L;
    private static final Long ID_CONFIRMADA = 1L;
    
    @Autowired
    private ReservaRepository repo;

    @Autowired 
    private EstadoReservaRepository estadoRepo;

    @Override
    public List<Reserva> buscarReservas() {
        return repo.findAll();
    }

    @Override
    public Reserva buscarPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void guardar(Reserva reserva) {
        repo.save(reserva);
    }

    @Override
    public void cancelar(Long id) {
        Reserva reserva = buscarPorId(id);
        if (reserva != null) {
            EstadoReserva estado = estadoRepo.findById(ID_CANCELADA).orElse(null);
            reserva.setEstado(estado);
            repo.save(reserva);
        }
    }

    @Override
    public void confirmar(Long id) {
        Reserva reserva = buscarPorId(id);
        if (reserva != null) {
            EstadoReserva estado = estadoRepo.findById(ID_CONFIRMADA).orElse(null);
            reserva.setEstado(estado);;
            repo.save(reserva);
        }
    }








}
