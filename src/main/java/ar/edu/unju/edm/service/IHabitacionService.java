package ar.edu.unju.edm.service;

import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Habitacion;

@Service
public interface IHabitacionService {
	
	public void guardarHabitacion(Habitacion habitacion);
	public Iterable<Habitacion> mostrarHabitaciones();
	
}
