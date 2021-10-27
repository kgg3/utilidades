package com.example.demo2;

public class Persona{
	
	private static int totalId = 1;
	private int id = 1;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String fechaNacimiento;
	private int edad;
	
	public Persona() {
		id = totalId;
		nombre = "Kevin";
		apellido1 = "Garcia";
		apellido2 = "Garcia";
		edad = 30;
		fechaNacimiento = "19901115";
		totalId++;
	}
	
	public Persona(String nombre, String apellido1, String apellido2, String fechaNacimiento, int edad) {
		this.id = totalId;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		totalId++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido) {
		this.apellido1 = apellido;
	}
	
	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido) {
		this.apellido2 = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
		return this.id == ((Persona)obj).id;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
}
