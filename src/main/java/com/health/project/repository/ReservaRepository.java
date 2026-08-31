package com.health.project.repository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.health.project.entitys.Espacio;
import com.health.project.entitys.Reserva;
import com.health.project.entitys.Reserva.EstadoReserva;
import com.health.project.entitys.Usuario;
import com.health.project.entitys.Medico;
import com.health.project.entitys.Medico.Especialidad;


import java.util.Date;

import java.util.Map;

@Repository

public class ReservaRepository {

    private Map<Integer, Reserva> data = new HashMap<>();

    public ReservaRepository(){
    // Usuarios : 
        Usuario usuario1 = new Usuario(
            1, 101001001L, "Ansu Fati", new Date(), "PACIENTE", 
            "3001234567", "ansu@email.com", "12345", "2026-01-10", 
            "Ninguno", "Consulta Externa", true
        );

        Usuario usuario2 = new Usuario(
            2, 102002002L, "Lamine Yamal", new Date(), "PACIENTE", 
            "3009876543", "lamine@email.com", "54321", "2026-02-15", 
            "Alergia a la penicilina", "Urgencias", true
        );

        Usuario usuario3 = new Usuario(
            3, 103030303L, "Pedri González", new Date(), "PACIENTE", 
            "3115554433", "pedri@email.com", "abcde", "2026-03-01", 
            "Lesión muscular recurrente", "Fisioterapia", true
        );

        Usuario usuario4 = new Usuario(
            4, 104040404L, "Gavi Páez", new Date(), "PACIENTE", 
            "3158889911", "gavi@email.com", "qwerty", "2026-04-12", 
            "Cirugía de rodilla previa", "Especialidad", true
        );

        Usuario usuario5 = new Usuario(
            5, 105050505L, "Raphinha Dias", new Date(), "PACIENTE", 
            "3207772233", "raphinha@email.com", "zxcvb", "2026-05-20", 
            "Asma leve", "Chequeo General", true
        );

// espacios : 

        Espacio hospital1 = new Espacio(
            1, "Hospital Central del Norte", "Hospital", 
            "Hospital de alta complejidad con atención 24/7", "Zona Norte", 
            350000.0, "/images/hospital_norte.jpg", true
        );

        Espacio hospital2 = new Espacio(
            2, "Hospital Universitario San José", "Hospital", 
            "Especializado en pediatría y tratamientos avanzados", "Centro Urbano", 
            420000.0, "/images/hospital_sanjose.jpg", true
        );

        Espacio hospital3 = new Espacio(
            3, "Hospital Infantil Lorencita", "Hospital", 
            "Enfocado en atención integral infantil y juvenil", "Zona Sur", 
            280000.0, "/images/hospital_lorencita.jpg", true
        );

        Espacio hospital4 = new Espacio(
            4, "Hospital Militar Central", "Hospital", 
            "Centro de trauma, cirugía compleja y rehabilitación", "Zona Oriente", 
            500000.0, "/images/hospital_militar.jpg", true
        );

        Espacio hospital5 = new Espacio(
            5, "Hospital Cardiovascular", "Hospital", 
            "Especializado en cirugías cardíacas y cuidados intensivos", "Zona Occidente", 
            600000.0, "/images/hospital_cardio.jpg", true
        );

// Medicos : 
Medico medico1 = new Medico(
    1, 1001001L, "Dr. Roberto Gómez", new Date(), "MEDICO",
    "3001112233", "roberto@email.com", "pass123", "2026-01-01",
    Especialidad.CIRUGIA_GENERAL, "Hospital Central", hospital1
);

Medico medico2 = new Medico(
    2, 1002002L, "Dra. Elena Rostova", new Date(), "MEDICO",
    "3002223344", "elena@email.com", "pass123", "2026-01-05",
    Especialidad.PEDIATRIA, "San José", hospital2
);

Medico medico3 = new Medico(
    3, 1003003L, "Dr. Mateo Carvajal", new Date(), "MEDICO",
    "3003334455", "mateo@email.com", "pass123", "2026-01-10",
    Especialidad.NEUMOLOGIA, "Lorencita", hospital3
);

Medico medico4 = new Medico(
    4, 1004004L, "Dr. Fernando Alonso", new Date(), "MEDICO",
    "3004445566", "fernando@email.com", "pass123", "2026-01-15",
    Especialidad.GASTROENTEROLOGIA, "Militar Central", hospital4
);

Medico medico5 = new Medico(
    5, 1005005L, "Dra. Sofía Martínez", new Date(), "MEDICO",
    "3005556677", "sofia@email.com", "pass123", "2026-01-20",
    Especialidad.CARDIOLOGIA, "Cardiovascular", hospital5
);

// Reservas (reemplazando el Espacio por el objeto Medico 'med'):
data.put(1, new Reserva(
    1, usuario1, LocalDate.parse("2026-09-15"), 
    LocalTime.parse("08:00"), LocalTime.parse("10:00"), 
    Reserva.EstadoReserva.CONFIRMADA, LocalDateTime.now(), 
    "Reserva de Quirófano 1", medico1, 350000.0,hospital1
));

data.put(2, new Reserva(
    2, usuario2, LocalDate.parse("2026-09-16"), 
    LocalTime.parse("10:00"), LocalTime.parse("11:30"), 
    Reserva.EstadoReserva.PENDIENTE, LocalDateTime.now(), 
    "Consulta de Valoración", medico2, 420000.0,hospital2
));

data.put(3, new Reserva(
    3, usuario3, LocalDate.parse("2026-09-17"), 
    LocalTime.parse("14:00"), LocalTime.parse("16:00"), 
    Reserva.EstadoReserva.CONFIRMADA, LocalDateTime.now(), 
    "Sesión de Terapia Física", medico3, 280000.0,hospital3
));

data.put(4, new Reserva(
    4, usuario4, LocalDate.parse("2026-09-18"), 
    LocalTime.parse("07:00"), LocalTime.parse("12:00"), 
    Reserva.EstadoReserva.CONFIRMADA, LocalDateTime.now(), 
    "Procedimiento quirúrgico programado", medico4, 500000.0,hospital4
));

data.put(5, new Reserva(
    5, usuario5, LocalDate.parse("2026-09-20"), 
    LocalTime.parse("09:00"), LocalTime.parse("11:00"), 
    Reserva.EstadoReserva.PENDIENTE, LocalDateTime.now(), 
    "Chequeo cardiológico preventivo", medico5, 600000.0,hospital5
));
}

    public Reserva findById(Integer id){
        return data.get(id);
    }

    public Collection<Reserva> findAll(){
        return data.values();
    }



}