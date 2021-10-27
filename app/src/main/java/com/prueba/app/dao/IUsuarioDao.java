package com.prueba.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.app.entities.UsuarioEntity;

public interface IUsuarioDao extends JpaRepository<UsuarioEntity, Long>{

	public UsuarioEntity findByUsernameAndPassword(String username, String password);

	public UsuarioEntity findByUsername(String username);
}
