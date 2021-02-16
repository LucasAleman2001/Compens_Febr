package ar.edu.unju.edm.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ar.edu.unju.edm.model.Usuario;

@Repository
public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{
	@Query("from Usuario e order by e.user")
	public Optional<Usuario> findByNombreUsuario(String nombre);
}