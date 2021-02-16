package ar.edu.unju.edm.service.imp;

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
	public Iterable<Habitacion> mostrarHabitaciones() {
		return iHabitacionDAO.findAll();
	}


}
