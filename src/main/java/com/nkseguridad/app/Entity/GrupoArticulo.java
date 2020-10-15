package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grupoarticulo",schema="public")
public class GrupoArticulo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codgrupoarticulo")
	private String codgrupoarticulo;
	
    private String  nomgrupoarticulo;
    private String tipocosto;
    private Double comision;
    private String tipo;
	private String codnegocio;
	
	

	 public GrupoArticulo() {
			
		}
		
		public GrupoArticulo(String codgrupoarticulo, String nomgrupoarticulo,String tipocosto,Double comision,String tipo, String codnegocio) {
			super();
			this.codgrupoarticulo = codgrupoarticulo;
			this.nomgrupoarticulo = nomgrupoarticulo;
			this.tipocosto=tipocosto;
			this.comision=comision;
			this.tipo=tipo;
			this.codnegocio = codnegocio;
		}
		public String getCodgrupoarticulo() {
			return codgrupoarticulo;
		}

		public void setCodgrupoarticulo(String codgrupoarticulo) {
			this.codgrupoarticulo = codgrupoarticulo;
		}

		public String getNomgrupoarticulo() {
			return nomgrupoarticulo;
		}

		public void setNomgrupoarticulo(String nomgrupoarticulo) {
			this.nomgrupoarticulo = nomgrupoarticulo;
		}

		public String getTipocosto() {
			return tipocosto;
		}

		public void setTipocosto(String tipocosto) {
			this.tipocosto = tipocosto;
		}

		public Double getComision() {
			return comision;
		}

		public void setComision(Double comision) {
			this.comision = comision;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getCodnegocio() {
			return codnegocio;
		}

		public void setCodnegocio(String codnegocio) {
			this.codnegocio = codnegocio;
		}

		@Override
		public String toString() {
			return "GrupoArticulo [codgrupoarticulo=" + codgrupoarticulo + ", nomgrupoarticulo=" + nomgrupoarticulo
					+ ", tipocosto=" + tipocosto + ", comision=" + comision + ", tipo=" + tipo + ", codnegocio="
					+ codnegocio + "]";
		}

}
