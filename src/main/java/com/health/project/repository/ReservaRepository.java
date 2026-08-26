package com.health.project.repository;
import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.health.project.entitys.Reserva;
import com.health.project.entitys.Usuario;

import java.util.Map;

@Repository

public class ReservaRepository {

    private Map<Integer, Reserva> data = new HashMap<>();

    public ReservaRepository(){
        Usuario usuario1 = new Usuario(1, null, "ansu fati", null, null, null, null, null, null, null);
        Usuario usuario2 = new Usuario(2, null, "Lamine", null, null, null, null, null, null, null);

data.put(1, new Reserva(
    1,
    usuario1,
    "Espacio 1",
    "2023-10-10",
    "10:00"
));

data.put(2, new Reserva(
    2,
    usuario2,
    "Espacio 2",
    "2023-10-10",
    "11:00"
));

data.put(3, new Reserva(
    3,
    null,
    "Espacio 3",
    "2023-10-10",
    "12:00"
));

}
    public Reserva findById(Integer id){
        return data.get(id);
    }

    public Collection<Reserva> findAll(){
        return data.values();
    }
}