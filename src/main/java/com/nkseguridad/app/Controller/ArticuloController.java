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

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Cliente;
import com.nkseguridad.app.Service.IArticuloService;

@RestController
 @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
 @RequestMapping("api")
public class ArticuloController {

	@Autowired
	private IArticuloService articuloServicio;
	
	@GetMapping("articulo")
	public ResponseEntity<?> ListarArticulos(){
		List<Articulo> LstArticulos = articuloServicio.findAll();
		if (LstArticulos!=null) {
			if (LstArticulos.size()!=0) {
				return new ResponseEntity<>(LstArticulos,HttpStatus.OK);
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
