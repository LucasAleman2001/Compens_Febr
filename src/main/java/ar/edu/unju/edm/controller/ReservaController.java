package ar.edu.unju.edm.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Reserva;
import ar.edu.unju.edm.service.IHabitacionService;
import ar.edu.unju.edm.service.IReservaService;
import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class ReservaController {
	
	@Autowired
	Reserva reserva;
	@Autowired
	IReservaService iReservaService;
	@Autowired
	IHabitacionService iHabitacionService;
	IUsuarioService iUsuarioService;

	@GetMapping("/consultaFecha")
	public String BuscarFecha(Model model) {
		Reserva busq = new Reserva();
		model.addAttribute("fecha", busq);
		return "consultaFecha";
	}
	
	@PostMapping("/consultaFecha")
	public String BuscarFechaPost(@ModelAttribute("fecha") LocalDate fecha, Model model) {
		LocalDate busq = fecha;
		System.out.println("Fecha a buscar: " + busq);
		return MostrarFecha(busq, model);
	}
	
	@GetMapping("/fechaEncontrada")
	public String MostrarFecha(LocalDate busq, Model model) {
		model.addAttribute("reservas",iReservaService.buscarReservaPorFecha(busq));
		System.out.println("Fecha buscada: "+busq);
		return "fechaEncontrada";
	}
	
	@GetMapping("/listaReservas")
	public String listaReservas(Model model) {
		model.addAttribute("reservas",iReservaService.listarReservas());
		return "reservar";
	}
	
	
	@GetMapping("/consultaReserva")
	public String consultaReserva() {
		return "consultaReserva";
	}
	
	
	@GetMapping("/reservar")
	public String reservarHabitacion(Model model) {
		model.addAttribute("habitaciones", iHabitacionService.listarHabitaciones());
		model.addAttribute("nuevaReser", new Reserva());
		return "reservar";
	}

	@PostMapping("/reservar")
	public String reservarHabitacionPost(@ModelAttribute("nuevaReser") Reserva reserva, Model model) {
		iReservaService.guardarReserva(reserva);
		return "reservar";
	}
	
}