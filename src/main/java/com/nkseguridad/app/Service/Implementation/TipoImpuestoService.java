package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.TipoImpuesto;
import com.nkseguridad.app.Repository.ITipoImpuestoRepository;
import com.nkseguridad.app.Service.ITipoImpuestoService;

@Service
public class TipoImpuestoService implements ITipoImpuestoService {

	@Autowired
	private ITipoImpuestoRepository tipoimpuestoRepository;
	
	
	@Override
	public List<TipoImpuesto> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoImpuesto>)tipoimpuestoRepository.findAll();
	}

}
