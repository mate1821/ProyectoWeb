package com.health.project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.health.project.entitys.Espacio;
import com.health.project.entitys.Especialidades;
import com.health.project.entitys.Medico;
import com.health.project.entitys.Reserva;
import com.health.project.entitys.Usuario;
import com.health.project.repository.ReservaRepository;
import com.health.project.repository.UsuarioRepository;
import com.health.project.repository.EspacioRepository;
import com.health.project.repository.EspecialidadesRepository;
import com.health.project.repository.MedicoRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
@Component 
@Transactional 
public class DataLoader implements CommandLineRunner {


    @Autowired 
    private ReservaRepository reservaRepo;

    @Autowired 
    private UsuarioRepository  usuarioRepo;

    @Autowired 
    private MedicoRepository medicoRepo;

    @Autowired 
    private EspecialidadesRepository especialidadRepo ;

    @Autowired 
    private EspacioRepository espacioRepo;

    

    @Override
    public void run(String... args) throws Exception {


// insercion de usuarios 

        usuarioRepo.save(new Usuario(1001L, "Ana Torres", new GregorianCalendar(1995, 3, 12).getTime(), "Sin antecedentes relevantes", "PACIENTE", "3001234567", "ana.torres@mail.com", "clave123", true));
        usuarioRepo.save(new Usuario(1002L, "Carlos Ruiz", new GregorianCalendar(1988, 7, 22).getTime(), "Hipertensión controlada", "PACIENTE", "3007654321", "carlos.ruiz@mail.com", "clave123", true));
        usuarioRepo.save(new Usuario(1003L, "Laura Gómez", new GregorianCalendar(1992, 11, 5).getTime(), null, "MEDICO", "3009876543", "laura.gomez@mail.com", "clave123", true));
        usuarioRepo.save(new Usuario(1004L, "Pedro Sánchez", new GregorianCalendar(1979, 1, 18).getTime(), null, "ADMIN", "3004561234", "mati67@mail.com", "clave123", true));
        usuarioRepo.save(new Usuario(1005L, "Sofía Ramírez", new GregorianCalendar(2000, 5, 30).getTime(), "Alergia a la penicilina", "PACIENTE", "3002223344", "sofia.ramirez@mail.com", "clave123", false));


// Insercion de medicos 


        medicoRepo.save(new Medico(null, 2001L, "Laura Gómez", new GregorianCalendar(1985, 4, 10).getTime(), "MEDICO", "3011234567", "laura.gomez@mail.com", "clave123", LocalDateTime.now().toString(), Medico.Especialidad.CARDIOLOGIA, "Clínica del Country", null));
        medicoRepo.save(new Medico(null, 2002L, "Andrés Bermúdez", new GregorianCalendar(1979, 8, 3).getTime(), "MEDICO", "3017654321", "andres.bermudez@mail.com", "clave123", LocalDateTime.now().toString(), Medico.Especialidad.PEDIATRIA, "Hospital San Rafael", null));
        medicoRepo.save(new Medico(null, 2003L, "Camila Vargas", new GregorianCalendar(1990, 1, 27).getTime(), "MEDICO", "3019876543", "camila.vargas@mail.com", "clave123", LocalDateTime.now().toString(), Medico.Especialidad.DERMATOLOGIA, "Centro Médico Colsanitas", null));
        medicoRepo.save(new Medico(null, 2004L, "Juan Restrepo", new GregorianCalendar(1975, 10, 14).getTime(), "MEDICO", "3014561234", "juan.restrepo@mail.com", "clave123", LocalDateTime.now().toString(), Medico.Especialidad.NEUROLOGIA, "Clínica Shaio", null));
        medicoRepo.save(new Medico(null, 2005L, "Valentina Ríos", new GregorianCalendar(1993, 6, 8).getTime(), "MEDICO", "3012223344", "valentina.rios@mail.com", "clave123", LocalDateTime.now().toString(), Medico.Especialidad.GINECOLOGIA, "Fundación Santa Fe", null));


// Espe 

        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.MEDICINA_GENERAL.name(), 50000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.PEDIATRIA.name(), 70000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.CARDIOLOGIA.name(), 120000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.DERMATOLOGIA.name(), 100000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.NEUROLOGIA.name(), 130000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.GINECOLOGIA.name(), 90000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.ORTOPEDIA.name(), 110000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.CIRUGIA_GENERAL.name(), 150000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.OFTALMOLOGIA.name(), 100000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.UROLOGIA.name(), 120000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.ENDOCRINOLOGIA.name(), 100000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.GASTROENTEROLOGIA.name(), 120000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.ONCOLOGIA.name(), 180000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.PSIQUIATRIA.name(), 90000.0));
        especialidadRepo.save(new Especialidades(null, Medico.Especialidad.NEUMOLOGIA.name(), 110000.0));

// reservas


        Usuario u1 = usuarioRepo.findById(1L).orElse(null);
        Usuario u2 = usuarioRepo.findById(2L).orElse(null);
        Usuario u3 = usuarioRepo.findById(3L).orElse(null);

        Medico m1 = medicoRepo.findById(4L).orElse(null);
        Medico m2 = medicoRepo.findById(5L).orElse(null);
        Medico m3 = medicoRepo.findById(6L).orElse(null);

        reservaRepo.save(new Reserva(null, u1, LocalDate.of(2026, 9, 10), LocalTime.of(9, 0), LocalTime.of(9, 30), Reserva.EstadoReserva.PENDIENTE, LocalDateTime.now(), "Primera consulta", m1, 120000, null));
        reservaRepo.save(new Reserva(null, u2, LocalDate.of(2026, 9, 11), LocalTime.of(10, 0), LocalTime.of(10, 30), Reserva.EstadoReserva.CONFIRMADA, LocalDateTime.now(), "Control mensual", m2, 70000, null));
        reservaRepo.save(new Reserva(null, u3, LocalDate.of(2026, 9, 12), LocalTime.of(14, 0), LocalTime.of(14, 30), Reserva.EstadoReserva.PENDIENTE, LocalDateTime.now(), null, m3, 130000, null));
        reservaRepo.save(new Reserva(null, u1, LocalDate.of(2026, 9, 15), LocalTime.of(16, 0), LocalTime.of(16, 30), Reserva.EstadoReserva.CANCELADA, LocalDateTime.now(), "Paciente canceló", m2, 70000, null));
        reservaRepo.save(new Reserva(null, u2, LocalDate.of(2026, 9, 20), LocalTime.of(11, 0), LocalTime.of(11, 30), Reserva.EstadoReserva.COMPLETADA, LocalDateTime.now(), "Consulta finalizada", m1, 120000, null));

// Espacio 



        espacioRepo.save(new Espacio(null, "Consultorio 101", "Consultorio", "Consultorio equipado para consulta general", "Piso 1, Ala Norte", "https://example.com/img/consultorio101.jpg", true));
        espacioRepo.save(new Espacio(null, "Consultorio 102", "Consultorio", "Consultorio para especialidades", "Piso 1, Ala Norte", "https://example.com/img/consultorio102.jpg", true));
        espacioRepo.save(new Espacio(null, "Sala de Cirugía A", "Quirófano", "Quirófano equipado para cirugías generales", "Piso 3, Ala Este", "https://example.com/img/quirofanoA.jpg", true));
        espacioRepo.save(new Espacio(null, "Consultorio 205", "Consultorio", "Consultorio pediátrico", "Piso 2, Ala Sur", "https://example.com/img/consultorio205.jpg", false));
        espacioRepo.save(new Espacio(null, "Sala de Imágenes", "Diagnóstico", "Sala equipada con rayos X y ecógrafo", "Piso 1, Ala Sur", "https://example.com/img/imagenes.jpg", true));



    }

}
        
