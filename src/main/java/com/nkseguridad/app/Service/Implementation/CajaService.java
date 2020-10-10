package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Caja;
import com.nkseguridad.app.Repository.ICajaRepository;
import com.nkseguridad.app.Service.ICajaService;

@Service
public class CajaService implements ICajaService {

	@Autowired
	private ICajaRepository CajaRepository;
	
	@Override
	public List<Caja> findAll() {
		// TODO Auto-generated method stub
		return (List<Caja>)CajaRepository.findAll();
	}

	@Override
	public Caja findByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return CajaRepository.findById(codigo).orElse(null);
	}

	@Override
	public Caja save(Caja caja) {
		// TODO Auto-generated method stub
		return CajaRepository.save(caja);
	}

	@Override
	public Caja updaCaja(Caja caja) {
		// TODO Auto-generated method stub
		return CajaRepository.save(caja);
	}

	@Override
	public boolean findByExisteCodigo(String codigo) {
		// TODO Auto-generated method stub
		return CajaRepository.existsById(codigo);
	}

}
