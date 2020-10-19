package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Marca;
import com.nkseguridad.app.Repository.IMarcaRepository;
import com.nkseguridad.app.Service.IMarcaService;

@Service
public class MarcaService implements IMarcaService {

	@Autowired
	private IMarcaRepository marcaRepository;
	
	@Override
	public List<Marca> findAll() {
		// TODO Auto-generated method stub
		return (List<Marca>)marcaRepository.findAll();
	}

}
