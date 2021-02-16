package ar.edu.unju.edm.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.repository.IUsuarioDAO;
import ar.edu.unju.edm.service.IUsuarioService;

@Service
public class UsuarioServiceImp implements IUsuarioService {

	@Autowired
	IUsuarioDAO iUsuarioDAO;
	@Autowired
	Usuario usuario;

	@Override
	public void guardarUsuario(Usuario usuario) {
		iUsuarioDAO.save(usuario);
	}
	
	@Override
	public void eliminarUsuario(Long idUsuario) {
		iUsuarioDAO.deleteById(idUsuario);
	}

	@Override
	public Optional<Usuario> buscarUsuario(Long idUsuario) {
		return iUsuarioDAO.findById(usuario.getIdUsuario());
	}

	@Override
	public List<Usuario> listarUsuarios() {
		return (List<Usuario>) iUsuarioDAO.findAll();
	}

	@Override
	public Usuario buscarUsuarioPorUser() {
		return iUsuarioDAO.findByUser(usuario.getUser());
	}

}
