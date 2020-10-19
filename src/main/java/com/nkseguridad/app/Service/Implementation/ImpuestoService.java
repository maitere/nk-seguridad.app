package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Repository.IImpuestoRepository;
import com.nkseguridad.app.Service.IImpuestoService;

@Service
public class ImpuestoService implements IImpuestoService {

	@Autowired
	private IImpuestoRepository impuestoRepository;
	
	@Override
	public List<Impuesto> findAll() {
		// TODO Auto-generated method stub
		return (List<Impuesto>)impuestoRepository.findAll();
	}

}
