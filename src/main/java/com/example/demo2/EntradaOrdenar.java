package com.example.demo2;

import java.util.List;

public class EntradaOrdenar {
	




	private List<Persona> listaPersona;
	private String filtro;
	
	public EntradaOrdenar(List<Persona> listaPersona, String filtro) {
		this.listaPersona = listaPersona;
		this.filtro = filtro;
	}
	
	public List<Persona> getListaPersona() {
		return listaPersona;
	}
	public void setListaPersona(List<Persona> listaPersona) {
		this.listaPersona = listaPersona;
	}
	public String getFiltro() {
		return filtro;
	}
	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}

}
