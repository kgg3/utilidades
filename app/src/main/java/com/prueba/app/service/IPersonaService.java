package com.prueba.app.service;

import java.util.List;

import com.prueba.app.entities.PersonaEntity;

public interface IPersonaService {
	
	public List<PersonaEntity> getPersonas(String literalBusqueda, String filtroCampo);
	
	public PersonaEntity getPersona(String id);
		
	public void guardarPersona(PersonaEntity persona);
	
	public void modificarPersona(PersonaEntity persona);
}
