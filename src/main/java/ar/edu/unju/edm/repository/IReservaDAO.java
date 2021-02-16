package ar.edu.unju.edm.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ar.edu.unju.edm.model.Reserva;

@Repository
public interface IReservaDAO extends CrudRepository<Reserva, Long>{
	
	public Optional<Reserva> findByFecha(LocalDate fecha);
	public Reserva findByUser();
	
}
