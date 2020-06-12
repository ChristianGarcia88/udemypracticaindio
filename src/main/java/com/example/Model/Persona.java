package com.example.Model;

import java.io.Serializable;

import javax.validation.constraints.Size;

public class Persona implements Serializable{
	
	private Integer id ;
	@Size(max = 10, message = "demasiadas letras a entrar ")
	@Size(min = 3 , message = "pocas letras en el nombre ")
	private String nombre;
	@Size(max = 5, message = "demasiadas letras a ingresar " )
	@Size(min = 3 , message = "pocas letras  en el apellido")
	private String apeliido;

	
	
	public Persona() {
	
	}



	public Persona(Integer id, String nombre, String apeliido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apeliido = apeliido;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApeliido() {
		return apeliido;
	}



	public void setApeliido(String apeliido) {
		this.apeliido = apeliido;
	}
	
}
