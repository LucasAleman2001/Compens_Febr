package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Habitacion;
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
	@Autowired
	IUsuarioService iUsuarioService;

	
	
	
	@GetMapping("/consultaFecha")
	public String BuscarFecha(Model model) {
		Reserva res = new Reserva();
		model.addAttribute("nuevaRes", res);
		return "consultaFecha";
	}
	
	@PostMapping("/consultaFecha")
	public String BuscarFechaPost(@ModelAttribute("nuevaRes") Reserva reser, Model model) {
		return MostrarFecha(reser, model);
	}
	
	@GetMapping("/fechaEncontrada")
	public String MostrarFecha(Reserva reser, Model model) {
		model.addAttribute("reservas",iReservaService.buscarReservaPorHabitacion(reser.getHabitacion()));
		return "fechaEncontrada";
	}
	
	@GetMapping("/listaReservas")
	public String listarReservas(Model model) {
		model.addAttribute("reservas",iReservaService.listarReservas());
		return "listaReservas";
	}
	
	
	
	
	@GetMapping("/consultaReserva")
	public String consultaReserva(Model model) {
		model.addAttribute("reservas",iReservaService.listarReservas());
		return "consultaReserva";
	}
	
	
	@GetMapping("/reservar")
	public String reservarHabitacion(Model model) {
		model.addAttribute("habitaciones", iHabitacionService.listarHabitaciones());
		model.addAttribute("nuevaReser", reserva);
		return "reservar";
	}

	@PostMapping("/reservar")
	public String reservarHabitacionPost(@ModelAttribute("nuevaReser") Reserva reserva, Model model) {
		iReservaService.guardarReserva(reserva);
		return "reservar";
	}
	
	
}