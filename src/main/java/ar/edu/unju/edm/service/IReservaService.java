package ar.edu.unju.edm.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.model.Reserva;
import ar.edu.unju.edm.model.Usuario;

@Service
public interface IReservaService {
	
	public Reserva guardarReserva (Reserva reserva);
	public List<Reserva>listarReservas();
	public void eliminarReserva (Long reserva);
	public Iterable<Habitacion> buscarReservaPorHabitacion(Habitacion habitacion);
}
