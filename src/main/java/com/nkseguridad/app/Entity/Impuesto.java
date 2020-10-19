package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="impuesto",schema="public")
public class Impuesto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idimpuesto")
	private Long idimpuesto;
   
	private String tipoimpuesto;
    private Double normal;
    private Double recargo;
    private Date fechaini;
    private Date fechafin;
    private String status;
    private String codnegocio;
	public Long getIdimpuesto() {
		return idimpuesto;
	}
	public void setIdimpuesto(Long idimpuesto) {
		this.idimpuesto = idimpuesto;
	}
	public String getTipoimpuesto() {
		return tipoimpuesto;
	}
	public void setTipoimpuesto(String tipoimpuesto) {
		this.tipoimpuesto = tipoimpuesto;
	}
	public Double getNormal() {
		return normal;
	}
	public void setNormal(Double normal) {
		this.normal = normal;
	}
	public Double getRecargo() {
		return recargo;
	}
	public void setRecargo(Double recargo) {
		this.recargo = recargo;
	}
	public Date getFechaini() {
		return fechaini;
	}
	public void setFechaini(Date fechaini) {
		this.fechaini = fechaini;
	}
	public Date getFechafin() {
		return fechafin;
	}
	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}
    
}
