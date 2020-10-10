package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="almacen",schema="public")
public class Almacen implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="codalmacen")
	private String codalmacen;
	
	private String codnegocio;
	private String nombre;
	private Boolean principal;
	private String tipoalmacen;
	
	public String getCodalmacen() {
		return codalmacen;
	}
	public void setCodalmacen(String codalmacen) {
		this.codalmacen = codalmacen;
	}
	public String getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getPrincipal() {
		return principal;
	}
	public void setPrincipal(Boolean principal) {
		this.principal = principal;
	}
	public String getTipoalmacen() {
		return tipoalmacen;
	}
	public void setTipoalmacen(String tipoalmacen) {
		this.tipoalmacen = tipoalmacen;
	}
}
