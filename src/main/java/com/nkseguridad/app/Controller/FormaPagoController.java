package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.FormaPago;
import com.nkseguridad.app.Service.IFormaPagoService;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("api")
public class FormaPagoController {
	@Autowired
	private IFormaPagoService FormaPagoService;

	@GetMapping("formapago")
	public ResponseEntity<?> ListarFormaPagos() {
		List<FormaPago> LstFormaPagos = FormaPagoService.findAll();
		if (LstFormaPagos != null) {
			if (LstFormaPagos.size() != 0) {
				return new ResponseEntity<>(LstFormaPagos, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("formapago/{codigoforma}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "codigoforma") String codigoforma) {

		FormaPago formaPago = FormaPagoService.findByCodigo(codigoforma);
		if (formaPago != null) {
			return new ResponseEntity<>(formaPago, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("formapago")
	public ResponseEntity<?> GuardarFormaPago(@RequestBody FormaPago formaPago) {
		try {
			FormaPago formaPagoUpdate = FormaPagoService.findByCodigo(formaPago.getCodigoforma());
			if (formaPagoUpdate!=null) {
				return new ResponseEntity<Void>(HttpStatus.FOUND);
			} 
			else {				
				FormaPago formaPagoOut= FormaPagoService.save(formaPago);
				if (formaPagoOut!=null) {
					return new ResponseEntity<>(formaPagoOut, HttpStatus.OK);
				}
				else {
					return new ResponseEntity<Void>(HttpStatus.CONFLICT);
				}
				
			}
		} 
		catch (Exception m) {
			System.out.print("Error guardando "+m);
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}


	@PutMapping("formapago")
	public ResponseEntity<?> ModificarFormaPago(@RequestBody FormaPago formaPago) {
		try {
			FormaPago formaPagoUpdate = FormaPagoService.findByCodigo(formaPago.getCodigoforma());
			if (formaPagoUpdate!=null) {
				formaPagoUpdate.setCodnegocio(formaPago.getCodigoforma());
				formaPagoUpdate.setNombre(formaPago.getNombre());
				formaPagoUpdate.setNumero(formaPago.getNumero());
				formaPagoUpdate.setAplicara(formaPago.getAplicara());
				formaPagoUpdate.setTipo(formaPago.getTipo());
				formaPagoUpdate.setLimitecredito(formaPago.getLimitecredito());
				formaPagoUpdate.setDias(formaPago.getDias());
				formaPagoUpdate.setPorcinteres(formaPago.getPorcinteres());
				formaPagoUpdate.setNumerogiros(formaPago.getNumerogiros());
				formaPagoUpdate.setDiasxgiro(formaPago.getDiasxgiro());
				formaPagoUpdate.setStatus(formaPago.getStatus());
				FormaPago formaPagoOut= FormaPagoService.save(formaPagoUpdate);
				if (formaPagoOut!=null) {
					return new ResponseEntity<>(formaPagoOut, HttpStatus.OK);
				}
				else {
					return new ResponseEntity<Void>(HttpStatus.CONFLICT);
				}
			} 
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} 
		catch (Exception m) {
			System.out.print("Error guardando "+m);
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}

}
