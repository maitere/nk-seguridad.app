package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Usuario;
import com.nkseguridad.app.Service.IUsuarioService;

@RestController
@RequestMapping("api")

public class UsuarioController {

	@Autowired
	private IUsuarioService Usuarioservice;

	@GetMapping("/usuario")
	public ResponseEntity<?> ListarUsuarios() {
		List<Usuario> LstUsuarios = Usuarioservice.findAll();
		if (LstUsuarios != null) {
			if (LstUsuarios.size() != 0) {
				return new ResponseEntity<>(LstUsuarios, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/usuario/{login}")
	public ResponseEntity<?> ObtenerUsuarioLogin(@PathVariable(name = "login") String Login) {
		Usuario User = Usuarioservice.findByLogin(Login);
		if (User != null) {
			return new ResponseEntity<>(User, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/usuario/autenticar")
	public ResponseEntity<?> AutenticarUsuarioLogin(@RequestBody Usuario Usuario) {
		if (Usuario != null) {
			Usuario User = Usuarioservice.findByUser(Usuario);
			if (User != null) {
				return new ResponseEntity<>(User, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

}
