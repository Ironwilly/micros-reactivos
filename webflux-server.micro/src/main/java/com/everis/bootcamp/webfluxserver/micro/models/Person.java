package com.everis.bootcamp.webfluxserver.micro.models;

public class Person {

	private String nombre;
	private String apellidos;
	private int edad;

	public Person(String nombre, String apellidos, int edad) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public Person() {
		super();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
