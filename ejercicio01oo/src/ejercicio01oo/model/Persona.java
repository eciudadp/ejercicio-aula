package ejercicio01oo.model;

public class Persona {
	private String nombre;
	//private String DNI;
	
	
	
	public Persona(){
		
	}
	public Persona(String nombre, String DNI){
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
