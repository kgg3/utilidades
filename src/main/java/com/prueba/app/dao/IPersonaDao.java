package com.prueba.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prueba.app.entities.PersonaEntity;

public interface IPersonaDao extends JpaRepository<PersonaEntity, Long> {

	@Query("select p from PersonaEntity p where p.nombre like %?1%")
	public List<PersonaEntity> findByNombre(String nombre);
	@Query("select p from PersonaEntity p where p.apellido1 like %?1%")
	public List<PersonaEntity> findByApellido1(String apellido1);
}
