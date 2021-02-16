package ar.edu.unju.edm.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Habitacion;

@Service
public interface IHabitacionService {
	
	public void guardarHabitacion(Habitacion habitacion);
	public List<Habitacion> listarHabitaciones();
	public Optional<Habitacion> buscarHabitacion();
	public Habitacion buscarPorDisponibilidad();

}
