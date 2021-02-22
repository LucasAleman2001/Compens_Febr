package ar.edu.unju.edm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Usuario;

@Service
public interface IUsuarioService {
	public void guardarUsuario(Usuario usuario);
	public List<Usuario> listarUsuarios();
	public Usuario buscarUsuario(Long idUsuario);
	public void eliminarUsuario(Long idUsuario);
	public Optional<Usuario> buscarUsuarioPorUser();
	public void actualizarUsuario();
	
}