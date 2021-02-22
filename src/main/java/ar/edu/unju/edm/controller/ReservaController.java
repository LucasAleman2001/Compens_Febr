package ar.edu.unju.edm.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Reserva;
import ar.edu.unju.edm.service.IReservaService;

@Controller
public class ReservaController {
	
	@Autowired
	Reserva reserva;
	@Autowired
	IReservaService iReservaService;

	@GetMapping("/consultaFecha")
	public String BuscarFecha(Model model) {
		Reserva busq = new Reserva();
		model.addAttribute("fecha", busq);
		return "consultaFecha";
	}
	
	@PostMapping("/consultaFecha")
	public String BuscarFechaPost(@ModelAttribute("fecha") Reserva fecha, Model model) {
		LocalDate busq = LocalDate.parse("fecha");
		System.out.println("Fecha buscada: " + busq);
		return MostrarFecha(busq, model);
	}
	
	@GetMapping("/fechaEncontrada")
	public String MostrarFecha(LocalDate fecha, Model model) {
		model.addAttribute("reservas",iReservaService.buscarReservaPorFecha(fecha));
		System.out.println("Fecha buscada: "+fecha);
		return "fechaBuscada";
	}
	
	@GetMapping("/listaReservas")
	public String listaReservas(Model model) {
		model.addAttribute("reservas",iReservaService.listarReservas());
		return "listaReservas";
	}
	
	
	@GetMapping("/consultaReserva")
	public String consultaReserva() {
		return "consultaReserva";
	}
	
	
	
	@GetMapping("/reservar")
	public String ReservaHabitacion(Model model) {
		model.addAttribute("reservas", iReservaService.listarReservas());
		model.addAttribute("nuevaReser", new Reserva());
		return "consultaReserva";
	}

	@PostMapping("/reservar")
	public String AgregarReserva(@ModelAttribute("reservaDelForm") Reserva reserva, Model model) {
		iReservaService.reservarHabitacion(reserva);
		iReservaService.modificarReserva();
		return "reservar";
	}
	
}
