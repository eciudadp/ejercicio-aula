package ejercicio01oo.model;

import org.springframework.beans.factory.annotation.Value;



public class Persona {
	@Value("pepito")
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
	@Override
	public String toString() {
		return nombre;
	}

	
}
