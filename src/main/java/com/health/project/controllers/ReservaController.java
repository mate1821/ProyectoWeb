
package com.health.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.health.project.entitys.Reserva;
import com.health.project.entitys.Servicio;
import com.health.project.service.EspecialidadService;
import com.health.project.service.EstadoResService;
import com.health.project.service.MedicoService;
import com.health.project.service.ReservaService;
import com.health.project.service.ServicioService;
import com.health.project.service.UsuarioService;
import java.time.LocalDateTime;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/reservas")
public class ReservaController {
    
    @Autowired
    ReservaService service;

    
    @Autowired
    private EspecialidadService espService;

    @Autowired
    private MedicoService medService;

    @Autowired
    private UsuarioService pacienteService;

    
    @Autowired
    private ServicioService serviciosService;

    @Autowired
    private EstadoResService estadoService;




    @GetMapping("/mostrar")
    public String mostrarReservas(Model model) {
        model.addAttribute("reservas", service.buscarReservas());
        return "mostrar_reservas";
    }
    
    @GetMapping("/Crear/{id}")
    public String crearReservas(@PathVariable Long id,Model model, @RequestParam(required = false) Long especialidadId)  {

    model.addAttribute("reserva", new Reserva());
    model.addAttribute("especialidades", espService.buscarTodos());
    model.addAttribute("paciente", pacienteService.buscarPorId(id)); 
    model.addAttribute("fechaSolicitud", LocalDateTime.now());
    model.addAttribute("especialidadId", especialidadId);
    model.addAttribute("servicios",serviciosService.searchAll());
    model.addAttribute("medicos", especialidadId == null ? List.of() : medService.buscarPorEspecialidad(especialidadId));

    return "reserva-form";

    }


@PostMapping("/guardar")
public String guardarReserva(@ModelAttribute Reserva reserva,
@RequestParam(name = "servicioIds", required = false) List<Long> servicioIds,@RequestParam(required = false) Long pacienteId,@RequestParam(required = false) Long medicoId) {

    reserva.setUsuario(pacienteService.buscarPorId(pacienteId));
    reserva.setMedico(medService.buscarPorId(medicoId));
    reserva.setEstado(estadoService.buscarPorId(3L));

    if (reserva.getFechaSolicitud() == null) {
        reserva.setFechaSolicitud(LocalDateTime.now());
    }

    if (servicioIds != null && !servicioIds.isEmpty()) {
    List<Servicio> servicios = serviciosService.buscarPorIds(servicioIds);
    reserva.setServicios(servicios);
}

double total = reserva.getMedico().getEspecialidad().getCosto();

    if (reserva.getServicios() != null) {
        for (Servicio s : reserva.getServicios()) {
            total += s.getCosto();
            System.out.println("Servicios:");
            System.out.println(s.getNombre());
        }
    }

    reserva.setTotal(total);
    service.guardar(reserva);

    return "redirect:/reservas/mostrar";
}
}