package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente", schema = "public")
public class Proveedor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6120941947340254068L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigo;
    private String codgrupo;
    private String cedula;
    private String rif;
    private String telefonofijo1;
    private String telefonofijo2;
    private String telefonomovil;
    private String telefonofax;
    private String direccionfiscal;
    private String correoe;
    private String paginaweb;
    private String tipopersona;
    private Long plazocredito;
    private Double montocredito;
    private String tipocredito;
    private String unidadplazocredito;
    private String status;
    private String nombre;
    private String regimeniva;
    private String razonsocial;
    fecharegistro date,
    codnegocio character varying(12) COLLATE pg_catalog."default" NOT NULL,
    codigocontable character varying(12) COLLATE pg_catalog."default",
    nombrecheque character varying(70) COLLATE pg_catalog."default",
    aplicarretencion character varying(50) COLLATE pg_catalog."default",
    tiporetencion character varying(50) COLLATE pg_catalog."default"

}
