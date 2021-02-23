package ar.edu.unju.edm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.repository.IHabitacionDAO;
import ar.edu.unju.edm.repository.IReservaDAO;
import ar.edu.unju.edm.service.IHabitacionService;

@Service
public class HabitacionServiceImp implements IHabitacionService {

	@Autowired
	IHabitacionDAO iHabitacionDAO;
	@Autowired
	Habitacion habitacion;
	@Autowired
	IReservaDAO iReservaDAO;
	
	@Override
	public void guardarHabitacion(Habitacion habitacion) {
		iHabitacionDAO.save(habitacion);
	}

	@Override
	public List<Habitacion> listarHabitaciones() {
		return (List<Habitacion>) iHabitacionDAO.findAll();
	}

}
