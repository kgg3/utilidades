package com.prueba.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.prueba.app.dao.IUsuarioDao;
import com.prueba.app.entities.UsuarioEntity;

@Service
public class UsuarioServiceImpl implements IUsuarioService, UserDetailsService{

	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	public UsuarioEntity getUsuario(String username, String password) {
		return usuarioDao.findByUsernameAndPassword(username, password);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UsuarioEntity user = usuarioDao.findByUsername(username);
		if(user == null) {
			
		}
		
		List<String> roles = new ArrayList<String>();
		roles.add("ADMIN");
		List<GrantedAuthority> authorities = roles
				.stream()
				.map(rol -> new SimpleGrantedAuthority(rol))
				.collect(Collectors.toList());
		
		return new User(user.getUsername(), user.getPassword(), true, true, true, true, authorities);
	}

}
