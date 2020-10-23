package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipoimpuesto",schema="public")
public class TipoImpuesto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	private String nombretipoimpuesto;
	private String codnegocio;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombretipoimpuesto() {
		return nombretipoimpuesto;
	}
	public void setNombretipoimpuesto(String nombretipoimpuesto) {
		this.nombretipoimpuesto = nombretipoimpuesto;
	}
	public String getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}
	

}
