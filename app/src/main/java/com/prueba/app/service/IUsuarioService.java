package com.prueba.app.service;

import com.prueba.app.entities.UsuarioEntity;

public interface IUsuarioService {
	
	public UsuarioEntity getUsuario(String username, String password);
	
}
