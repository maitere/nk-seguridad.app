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

import com.nkseguridad.app.Entity.Cliente;
import com.nkseguridad.app.Entity.Factura;
import com.nkseguridad.app.Service.IClienteService;
import com.nkseguridad.app.Service.IFacturaService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("api")
public class FacturaController {

	@Autowired
	private IFacturaService facturaService;
	
	@GetMapping("factura")
	public ResponseEntity<?> ListarFacturas(){
		List<Factura> lstFacturas = facturaService.findAll();
		if (lstFacturas!=null) {
			if (lstFacturas.size()!=0) {
				return new ResponseEntity<>(lstFacturas,HttpStatus.OK);
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
