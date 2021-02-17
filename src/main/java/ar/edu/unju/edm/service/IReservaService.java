package ar.edu.unju.edm.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Reserva;
import ar.edu.unju.edm.model.Usuario;

@Service
public interface IReservaService {
	
	public Reserva guardarReserva (Reserva reserva);
	public List<Reserva>listarReservas();
	public void eliminarReserva (Long reserva);
	public Optional<Reserva> buscarReservaPorFecha(LocalDate fecha);
	public Reserva buscarReservaPorUsuario(Usuario usuario);

}
