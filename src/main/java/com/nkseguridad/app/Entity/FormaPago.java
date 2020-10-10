package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formapago", schema = "public")

public class FormaPago implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "codigoforma")
	private String codigoforma;
	
	public String getCodigoforma() {
		return codigoforma;
	}
	public void setCodigoforma(String codigoforma) {
		this.codigoforma = codigoforma;
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
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getAplicara() {
		return aplicara;
	}
	public void setAplicara(String aplicara) {
		this.aplicara = aplicara;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getLimitecredito() {
		return limitecredito;
	}
	public void setLimitecredito(Double limitecredito) {
		this.limitecredito = limitecredito;
	}
	public Double getDias() {
		return dias;
	}
	public void setDias(Double dias) {
		this.dias = dias;
	}
	public Double getPorcinteres() {
		return porcinteres;
	}
	public void setPorcinteres(Double porcinteres) {
		this.porcinteres = porcinteres;
	}
	public Double getNumerogiros() {
		return numerogiros;
	}
	public void setNumerogiros(Double numerogiros) {
		this.numerogiros = numerogiros;
	}
	public Double getDiasxgiro() {
		return diasxgiro;
	}
	public void setDiasxgiro(Double diasxgiro) {
		this.diasxgiro = diasxgiro;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String codnegocio;
    private String nombre;
    private Long numero;
    private String aplicara;
    private String tipo;
    private Double limitecredito;
    private Double dias;
    private Double porcinteres;
    private Double numerogiros;
    private Double diasxgiro;
    private String status;

	
}
