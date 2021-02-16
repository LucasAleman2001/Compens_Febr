package ar.edu.unju.edm.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.repository.IUsuarioDAO;
import ar.edu.unju.edm.service.IUsuarioService;

@Service
public class UsuarioServiceImp implements IUsuarioService {

	@Autowired
	IUsuarioDAO usuarioDAO;
	@Autowired
	Usuario usuario;

	@Override
	public void guardarUsuario(Usuario usuario) {
		usuarioDAO.save(usuario);
	}
	
	@Override
	public void eliminarUsuario(Long idUsuario) {
		usuarioDAO.delete(usuario);
	}

	@Override
	public Usuario buscarUsuario(Long idUsuario) throws Exception {
		return usuarioDAO.findById(idUsuario).orElseThrow(()-> new Exception("Usuario Inexistente"));
	}
	public void bUsuario(Usuario desde, Usuario hasta) {
		hasta.setNombre(desde.getNombre());
		hasta.setApellido(desde.getApellido());
		hasta.setNombre(desde.getNombre());
		hasta.setTipo(desde.getTipo());
	}

}
