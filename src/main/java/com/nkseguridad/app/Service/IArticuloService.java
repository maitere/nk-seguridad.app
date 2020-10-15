package com.nkseguridad.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nkseguridad.app.Entity.Articulo;

public interface IArticuloService {
 
	
	
	public List<Articulo> findAll();
}
