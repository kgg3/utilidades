package com.prueba.app.model;

import java.io.Serializable;

public class Producto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	private String tipo;
	private int cantidad;
	
	public Producto(int id, String nombre, String tipo, int cantidad) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.cantidad = cantidad;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
