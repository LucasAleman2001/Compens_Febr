package ar.edu.unju.edm.service.imp;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Reserva;
import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.repository.IReservaDAO;
import ar.edu.unju.edm.service.IReservaService;

@Service
public class ReservaServiceImp implements IReservaService {

	@Autowired
	IReservaDAO iReservaDAO;
	@Autowired
	Reserva reserva;
	
	@Override
	public List<Reserva> listarReservas() {
		return (List<Reserva>) iReservaDAO.findAll();
	}

	@Override
	public Reserva guardarReserva(Reserva reserva) {
		return iReservaDAO.save(reserva);
	}

	@Override
	public void eliminarReserva(Long reserva) {
		iReservaDAO.deleteById(reserva);
	}

	@Override
	public Optional<Reserva> buscarReservaPorFecha(LocalDate fecha) {
		return iReservaDAO.findByFecha(reserva.getFecha());
	}

	@Override
	public Reserva buscarReservaPorUsuario(Usuario usuario) {
		return iReservaDAO.findByUsuario(usuario);
	}

}
