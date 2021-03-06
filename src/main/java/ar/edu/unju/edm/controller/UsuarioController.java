package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Reserva;
import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.service.IReservaService;
import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	Usuario usuario;
	Reserva reserva;
	@Autowired
	IUsuarioService iUsuarioService;
	IReservaService iReservaService;
	
	@GetMapping("/Cliente")
	public String Cliente(Model model) {
		return "cliente";
	}
	
	@PostMapping("/Cliente")
	public String ClienteP(Model model) {
		return "cliente";
	}
	
	@GetMapping("/Admin")
	public String Admin(Model model) {
		return "admin";
	}
	
	@GetMapping("/nuevoUsuario")
	public String nuevoUsuario(Model model) {
		model.addAttribute("nuevoUsu", new Usuario());
		return "nuevoUsuario";
	}
	
	@PostMapping("/nuevoUsuario")
	public String nuevoUsuarioPost(@ModelAttribute("nuevoUsu") Usuario usuario, Model model) {
		iUsuarioService.guardarUsuario(usuario);
		return "admin";
	}
	
	@GetMapping("/listaUsuarios")
	public String listarUsuarios(Model model) {
		model.addAttribute("nuevoUsu", iUsuarioService.listarUsuarios());
		return "listaUsuarios";
	}
	
	
}