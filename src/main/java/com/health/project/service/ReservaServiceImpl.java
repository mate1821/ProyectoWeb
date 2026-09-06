
package com.health.project.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.health.project.entitys.Reserva;
import com.health.project.entitys.Reserva.EstadoReserva;
import com.health.project.repository.ReservaRepository;
import java.util.List;


@Service
public class ReservaServiceImpl implements ReservaService {



    @Autowired
    private ReservaRepository repo;

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
            reserva.setEstado(EstadoReserva.CANCELADA);
            repo.save(reserva);
        }
    }

    @Override
    public void confirmar(Long id) {
        Reserva reserva = buscarPorId(id);
        if (reserva != null) {
            reserva.setEstado(EstadoReserva.CONFIRMADA);
            repo.save(reserva);
        }
    }








}
