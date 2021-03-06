package ar.edu.unju.edm.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Habitacion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native", strategy="native")
	private Long idHab;
	@Column
	private String nombreHab;
	@Column
	private int numeroHab;
	@Column
	private String detallesHab;
	@Column
	private double costo;
	@Column
	private String disponibilidad;
	@Column
	private String tipoHab;
	
	public Habitacion() {
		
	}

	public Habitacion(Long idHab, String nombreHab, int numeroHab, String detallesHab, double costo,
			String disponibilidad, String tipoHab) {
		super();
		this.idHab = idHab;
		this.nombreHab = nombreHab;
		this.numeroHab = numeroHab;
		this.detallesHab = detallesHab;
		this.costo = costo;
		this.disponibilidad = disponibilidad;
		this.tipoHab = tipoHab;
	}

	public Long getIdHab() {
		return idHab;
	}

	public void setIdHab(Long idHab) {
		this.idHab = idHab;
	}

	public String getNombreHab() {
		return nombreHab;
	}

	public void setNombreHab(String nombreHab) {
		this.nombreHab = nombreHab;
	}

	public int getNumeroHab() {
		return numeroHab;
	}

	public void setNumeroHab(int numeroHab) {
		this.numeroHab = numeroHab;
	}

	public String getDetallesHab() {
		return detallesHab;
	}

	public void setDetallesHab(String detallesHab) {
		this.detallesHab = detallesHab;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getTipoHab() {
		return tipoHab;
	}

	public void setTipoHab(String tipoHab) {
		this.tipoHab = tipoHab;
	}

}