package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.service.IHabitacionService;

@Controller
public class HabitacionController {

	@Autowired
	Habitacion habitacion;
	@Autowired
	IHabitacionService iHabitacionService;
	
	@GetMapping("/nuevaHabitacion")
	public String nuevaHabitacion(Model model) {
		model.addAttribute("nuevaHab",new Habitacion());
		return "nuevaHabitacion";
	}
	@PostMapping("/nuevaHabitacion")
	public String nuevaHabitacionPost(@ModelAttribute("nuevaHab") Habitacion habitacion, Model model) {
		iHabitacionService.guardarHabitacion(habitacion);
		return "admin";
	}
	
}
