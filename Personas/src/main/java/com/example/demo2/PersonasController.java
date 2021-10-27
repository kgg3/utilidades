package com.example.demo2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.services.PersonasService;

@RestController
@CrossOrigin
public class PersonasController implements PersonasService{
	
    
	
	@RequestMapping(value = "/personas", method = RequestMethod.GET)
	public List<Persona> personas(
	@RequestParam(value = "literalBusqueda", defaultValue = "") String literalBusqueda, 
	@RequestParam(value = "filtro", defaultValue = "NO") String filtro, 
	@RequestParam(value = "filtroCampo", defaultValue = "NO") String filtroCampo) {
		
	}
	
	
	

}
