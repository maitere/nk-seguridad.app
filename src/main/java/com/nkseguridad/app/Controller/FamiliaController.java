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

import com.nkseguridad.app.Entity.Familia;
import com.nkseguridad.app.Service.IFamiliaService;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("api")

public class FamiliaController {

	@Autowired
	private IFamiliaService FamiliaService;

	@GetMapping("familia")
	public ResponseEntity<?> ListarFamilias() {
		List<Familia> LstFamilia = FamiliaService.findAll();
		if (LstFamilia != null) {
			if (LstFamilia.size() != 0) {
				return new ResponseEntity<>(LstFamilia, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("familia/{codfamilia}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "codfamilia") Long codfamilia) {
		Familia Familia = FamiliaService.findByCodigo(codfamilia);
		if (Familia != null) {
			return new ResponseEntity<>(Familia, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("familia")
	public ResponseEntity<?> GuardarFamilia(@RequestBody Familia familia) {
		if (!FamiliaService.findByExisteCodigo(familia.getCodfamilia())) {
			Familia FamiliaObj = FamiliaService.save(familia);
			return new ResponseEntity<>(FamiliaObj, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

	}

	@PutMapping("familia")
	public ResponseEntity<?> ModificarFamilia(@RequestBody Familia Familia) {
		Familia FamiliaUpdate = FamiliaService.findByCodigo(Familia.getCodfamilia());
		if (FamiliaUpdate != null) {
			FamiliaUpdate.setNomfamilia(Familia.getNomfamilia());
			FamiliaUpdate.setNegocioId(Familia.getNegocioId());
			
			Familia FamiliaResult = FamiliaService.updateFamilia(FamiliaUpdate);
			if (FamiliaResult != null) {
				return new ResponseEntity<>(FamiliaResult, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


}
