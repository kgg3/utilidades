package com.prueba.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.app.entities.UsuarioEntity;
import com.prueba.app.model.Usuario;
import com.prueba.app.service.IUsuarioService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@PostMapping(value = "/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestParam("username") String username, @RequestParam("password") String password) throws Exception{
		UsuarioEntity usuarioEntity = usuarioService.getUsuario(username, password);
		if(usuarioEntity != null) {
//			final UserDetails userDetails = jwtInMemoryUserDetailsService.loadUserByUsername(username);
//
//			final String token = jwtTokenUtil.generateToken(userDetails);
//
//			return ResponseEntity.ok(token);
			return new ResponseEntity<>(new Usuario(usuarioEntity.getUsername(), usuarioEntity.getPassword()), HttpStatus.ACCEPTED);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
