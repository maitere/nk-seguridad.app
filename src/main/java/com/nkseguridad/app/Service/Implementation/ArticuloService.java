package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Cliente;
import com.nkseguridad.app.Repository.IArticuloRepository;
import com.nkseguridad.app.Service.IArticuloService;

@Service
public class ArticuloService implements IArticuloService {

	@Autowired
	private IArticuloRepository articuloRepository;
	
	@Override
	public List<Articulo> findAll() {
		// TODO Auto-generated method stub
		return (List<Articulo>)articuloRepository.findAll();
	}

}
