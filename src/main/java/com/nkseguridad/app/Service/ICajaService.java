package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Caja;

public interface ICajaService {

	public List<Caja> findAll();
	public Caja findByCodigo(String codigo);
	public Caja save(Caja caja);
	public Caja updaCaja(Caja caja);
	public boolean findByExisteCodigo(String codigo);
}
