package ejercicio01oo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



public class Persona {
	
	private String nombre;
	//private String DNI;
	
	
	public Persona(){
		
	}
	public Persona(String nombre){
		super();
		this.nombre = nombre;
		//this.DNI=DNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
