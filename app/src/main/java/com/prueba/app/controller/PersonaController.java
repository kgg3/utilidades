package com.prueba.app.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.app.entities.PersonaEntity;
import com.prueba.app.model.Persona;
import com.prueba.app.service.IPersonaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
public class PersonaController {
	
	@Autowired
	private IPersonaService personaService;
	
	@RequestMapping(value = "/buscador", method = RequestMethod.GET)
	public List<Persona> personas(
	@RequestParam(value = "literalBusqueda", defaultValue = "") String literalBusqueda,
	@RequestParam(value = "filtroCampo", defaultValue = "NO") String filtroCampo){
		List<PersonaEntity> personasEntity = personaService.getPersonas(literalBusqueda, filtroCampo);
		return convertir(personasEntity);
	}
	
	private List<Persona> convertir(List<PersonaEntity> personasEntity) {
		List<Persona> listaPersona = new ArrayList<Persona>();
		for(PersonaEntity persona : personasEntity) {
			listaPersona.add(new Persona(Integer.parseInt(persona.getId().toString()), persona.getNombre(), persona.getApellido1(), persona.getApellido2(), persona.getFechaNacimiento()));
		}
		return listaPersona;
	}

	@PostMapping(value = "/guardarPersona")
	public void guardarPersona(@RequestBody Persona persona) {
		PersonaEntity personaEntity = new PersonaEntity();
		personaEntity.setApellido1(persona.getApellido1());
		personaEntity.setApellido2(persona.getApellido2());
		personaEntity.setEdad(persona.getEdad());
		personaEntity.setFechaNacimiento(calcularFecha(persona.getEdad()));
		personaEntity.setNombre(persona.getNombre());
		personaService.guardarPersona(personaEntity);
	}
	
	@PostMapping(value = "/modificarPersona")
	public void modificarPersona(@RequestBody Persona persona) {
		PersonaEntity personaEntity = personaService.getPersona(Integer.toString(persona.getId()));
		personaEntity.setApellido1(persona.getApellido1());
		personaEntity.setApellido2(persona.getApellido2());
		personaEntity.setEdad(persona.getEdad());
		personaEntity.setFechaNacimiento(calcularFecha(persona.getEdad()));
		personaEntity.setNombre(persona.getNombre());
		personaService.modificarPersona(personaEntity);
	}
	
	private Date calcularFecha(int edad) {
		Calendar fecha = Calendar.getInstance();
		fecha.setTime(new Date());
		fecha.add(Calendar.YEAR, -edad);
		return fecha.getTime();
	}
}
