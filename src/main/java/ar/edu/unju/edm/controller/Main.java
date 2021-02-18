package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class Main {
	
	@Autowired
	IUsuarioService usuarioService;
	
	@RequestMapping({"/","/login","/home"})
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping("/reservar")
	public String reservar(Model model) {
		return "reservar";
	}
	
	@GetMapping("/listaReservas")
	public String listaReservas(Model model) {
	return "listaReservas";
	}
	
	@GetMapping("/nuevaHabitacion")
	public String nuevaHabitacion(Model model) {
	return "nuevaHabitacion";
	}	
	
	@GetMapping("/consultaUsuario")
	public String consultaUsuario(Model model) {
	return "consultaUsuario";
	}
	
	@GetMapping("/consultaFecha")
	public String consultaFecha(Model model) {
	return "consultaFecha";
	}	
	
	@GetMapping("/consultaReserva")
	public String consultaReserva(Model model) {
	return "consultaReserva";
	}	
	
	@GetMapping("/fechaEncontrada")
	public String fechaEncontrada(Model model) {
	return "fechaEncontrada";
	}	
	
	@GetMapping("/usuarioEncontrado")
	public String usuarioEncontrado(Model model) {
	return "usuarioEncontrado";
	}	
	
	
}