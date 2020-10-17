package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nkseguridad.app.Entity.Factura;
import com.nkseguridad.app.Repository.IFacturaRepository;
import com.nkseguridad.app.Service.IFacturaService;

@Service
public class FacturaService implements IFacturaService {

	@Autowired
	private IFacturaRepository facturaReposotory;
	
	@Override
	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		return (List<Factura>)facturaReposotory.findAll();
	}

}
