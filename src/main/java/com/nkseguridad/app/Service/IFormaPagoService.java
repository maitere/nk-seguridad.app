package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.FormaPago;


public interface IFormaPagoService {
	public List<FormaPago> findAll();
	public FormaPago findByCodigo(String codigo);
	public boolean existebyCodigo(String codigo);
	public FormaPago save(FormaPago formapago);

}
