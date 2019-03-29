package ejercicio01oo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alumno extends Persona{

	private Boolean subvencionado;
	
	public Alumno(){
		
	}
	/*public Alumno(String progreso){
		//super.nombre = nombre;
		//this.DNI=DNI;
		this.progreso = progreso;
	}*/

	public Boolean getSubvencionado() {
		return subvencionado;
	}

	public void setSubvencionado(Boolean subvencionado) {
		this.subvencionado = subvencionado;
	}



}
