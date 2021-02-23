package ar.edu.unju.edm.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public void guardarUsuario(Usuario usuario) {
		String pass = usuario.getPassword();
		usuario.setPassword(bCryptPasswordEncoder.encode(pass));
		iUsuarioDAO.save(usuario);
	}
	
	@Override
	public void eliminarUsuario(Long idUsuario) {
		iUsuarioDAO.deleteById(idUsuario);
	}

	@Override
	public Usuario buscarUsuario(Long idUsuario) {
		return iUsuarioDAO.findById(idUsuario).get();
	}

	@Override
	public List<Usuario> listarUsuarios() {
		return (List<Usuario>) iUsuarioDAO.findAll();
	}

	@Override
	public Optional<Usuario> buscarUsuarioPorUser() {
		return iUsuarioDAO.findByUser(usuario.getUser());
	}

	@Override
	public void actualizarUsuario() {
		Usuario usu = new Usuario();
		iUsuarioDAO.save(usu);
		iUsuarioDAO.delete(usu);
	}

}
