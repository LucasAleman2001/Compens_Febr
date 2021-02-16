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
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping("/reservar")
	public String reservar(Model model) {
		return "reservar";
	}
	
	@GetMapping("/nuevoUsuario")
		public String nuevoUsuario(Model model) {
		return "nuevoUsuario";
	}
	@GetMapping("/listaUsuario")
		public String listaUsuario(Model model) {
		return "listaUsuario";
	}
	
}
