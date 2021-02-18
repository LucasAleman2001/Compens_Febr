package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	Usuario usuario;
	@Autowired
	IUsuarioService usuarioService;
	
	@GetMapping("/agregarUsuario")
	public String agregarUsuario(Model model) {
		model.addAttribute("unUsuario", usuario);
		return "guardarUsuario";
	}
	
	@PostMapping("/guardarUsuario")
	public String guardarUsuario(@ModelAttribute Usuario usuario, Model model) {
		usuarioService.guardarUsuario(usuario);
		model.addAttribute("unUsuario", usuario);
		return "reservar";
	}
	
	@GetMapping("/borrarUsuario/{id}")
	public String eliminarUsuario(Model model, @PathVariable(name="id") Long id) {
		try {
			usuarioService.eliminarUsuario(usuario.getIdUsuario());
		}catch(Exception e) {
			model.addAttribute("listErrorMessage", e.getMessage());
		}
		return "redirect:/usuario";
	}
	
	@GetMapping("/nuevoUsuario")
	public String nuevoUsuario(Model model) {
	return "nuevoUsuario";
	}	
	
}