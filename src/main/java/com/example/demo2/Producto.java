package com.example.demo2;

public class Producto{
	
	private static int totalId = 1;
	private int id = 1;
	private String nombre;
	private String tipo;
	private int cantidad;
	
	public Producto() {
		id = totalId;
		setNombre("Kia Rio");
		setTipo("Coche");
		setCantidad(1);
		totalId++;
	}
	
	public Producto(String nombre, String tipo, int cantidad) {
		this.id = totalId;
		this.setNombre(nombre);
		this.setTipo(tipo);
		this.setCantidad(cantidad);
		totalId++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void calcularId() {
		this.id = totalId;
		aumnetarId();
	}
	
	private static void aumnetarId() {
		totalId++;
	}
	
	@Override
    public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
		    return false;
		}
		
		return this.id == ((Producto)obj).id;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
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
