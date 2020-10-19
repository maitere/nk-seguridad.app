package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.nkseguridad.app.Entity.Impuesto;

import com.nkseguridad.app.Service.IImpuestoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("api")
public class ImpuestoController {
	
	@Autowired
	private IImpuestoService impuestoServicio;
	
	@GetMapping("impuesto")
	public ResponseEntity<?> ListarImpuestos(){
		List<Impuesto> LstImpuestos = impuestoServicio.findAll();
		if (LstImpuestos!=null) {
			if (LstImpuestos.size()!=0) {
				return new ResponseEntity<>(LstImpuestos,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}

}
