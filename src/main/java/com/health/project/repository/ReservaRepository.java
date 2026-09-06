package com.health.project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.health.project.entitys.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{


}