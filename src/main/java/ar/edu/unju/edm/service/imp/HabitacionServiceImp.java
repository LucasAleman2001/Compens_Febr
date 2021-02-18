package ar.edu.unju.edm.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.repository.IHabitacionDAO;
import ar.edu.unju.edm.service.IHabitacionService;

@Service
public class HabitacionServiceImp implements IHabitacionService {

	@Autowired
	IHabitacionDAO iHabitacionDAO;
	@Autowired
	Habitacion habitacion;
	
	@Override
	public void guardarHabitacion(Habitacion habitacion) {
		iHabitacionDAO.save(habitacion);
	}

	@Override
	public List<Habitacion> listarHabitaciones() {
		return (List<Habitacion>) iHabitacionDAO.findAll();
	}

	@Override
	public Optional<Habitacion> buscarHabitacion() {
		return iHabitacionDAO.findById(habitacion.getIdHab());
	}

	@Override
	public Habitacion buscarPorDisponibilidad(boolean disponibilidad) {
		return iHabitacionDAO.findByDisponibilidad(disponibilidad);
	}

}
