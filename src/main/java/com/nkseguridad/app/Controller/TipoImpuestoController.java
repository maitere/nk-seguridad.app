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

import com.nkseguridad.app.Entity.TipoImpuesto;
import com.nkseguridad.app.Service.ITipoImpuestoService;



@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("api")
public class TipoImpuestoController {
	
	@Autowired
	private ITipoImpuestoService tipoimpuestoServicio;
	
	@GetMapping("tipoimpuesto")
	
	public ResponseEntity<?> ListarTipoImpuestos(){
		List<TipoImpuesto> LstTipoImpuesto = tipoimpuestoServicio.findAll();
		if (LstTipoImpuesto!=null) {
			if (LstTipoImpuesto.size()!=0) {
				return new ResponseEntity<>(LstTipoImpuesto,HttpStatus.OK);
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
