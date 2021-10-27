package com.prueba.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.app.dao.IPersonaDao;
import com.prueba.app.entities.PersonaEntity;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDao personaDao;


	@Override
	public List<PersonaEntity> getPersonas(String literalBusqueda, String filtroCampo) {
		if(literalBusqueda != null && !literalBusqueda.isEmpty()) {
			if("NO".equals(filtroCampo)) {
				return personaDao.findByNombre(literalBusqueda);
			} else if("AP".equals(filtroCampo)) {
				return personaDao.findByApellido1(literalBusqueda);
			}
		} else {
			return personaDao.findAll();
		}
		
		return null;
	}

	@Override
	public void guardarPersona(PersonaEntity persona) {
		personaDao.save(persona);
	}

	@Override
	public void modificarPersona(PersonaEntity persona) {
		personaDao.save(persona);
	}

	@Override
	public PersonaEntity getPersona(String id) {
		return personaDao.findById(Long.parseLong(id)).orElse(null);
	}
	


}
