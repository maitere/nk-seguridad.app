package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    private String nombreimpuesto;
    private Long idtipoimpuesto;    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtipoimpuesto",  insertable = false, updatable = false)
    private TipoImpuesto tipoimpuestos;
  
     public Long getIdimpuesto() {
		return idimpuesto;
	}
	public TipoImpuesto getTipoimpuestos() {
		return tipoimpuestos;
	}
	public void setTipoimpuestos(TipoImpuesto tipoimpuestos) {
		this.tipoimpuestos = tipoimpuestos;
	}
	public String getNombreimpuesto() {
		return nombreimpuesto;
	}
	public void setNombreimpuesto(String nombreimpuesto) {
		this.nombreimpuesto = nombreimpuesto;
	}
	public Long getIdtipoimpuesto() {
		return idtipoimpuesto;
	}
	public void setIdtipoimpuesto(Long idtipoimpuesto) {
		this.idtipoimpuesto = idtipoimpuesto;
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
