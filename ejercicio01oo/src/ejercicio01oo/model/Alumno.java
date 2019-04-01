package ejercicio01oo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Alumno")
@Scope(value="prototype")
public class Alumno extends Persona{
	
	@Value("true")
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
