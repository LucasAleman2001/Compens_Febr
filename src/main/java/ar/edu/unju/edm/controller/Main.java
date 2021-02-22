package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.service.IHabitacionService;
import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class Main {
	
	@Autowired
	IUsuarioService iUsuarioService;
	@Autowired
	IHabitacionService iHabitacionService;
	
	@GetMapping({"/","/login","/home","/login?error=true"})
	public String login(Model model) {
		
		//iHabitacionService.guardarHabitacion(new Habitacion((long)1, "Primavera", 12, "Especial para pasar tardes trabajando",2400.0, "no", "simple"));
		//iHabitacionService.guardarHabitacion(new Habitacion((long)2, "Verano", 23, "Si queres pasar un verano excelente",3400.0, "si", "doble"));
		//iHabitacionService.guardarHabitacion(new Habitacion((long)3, "Invierno", 34, "Con calefaccion para estar calentitos",3600.0, "si", "doble"));
		//iHabitacionService.guardarHabitacion(new Habitacion((long)4, "Otono", 45, "Bienvenido a Otono-room",2600.0, "no", "simple"));
		//iUsuarioService.guardarUsuario(new Usuario (43526613,"luks","luks","Lucas","Aleman","Admin"));
		//iUsuarioService.guardarUsuario(new Usuario(43526614,"pedro","1234","Pedro","Torres","Cliente"));
		
		return "login";
	}
	
	
}