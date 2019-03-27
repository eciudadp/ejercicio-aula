package ejercicio01oo.model;

public class Alumno extends Persona{

	private boolean subvencionado;
	
	public Alumno(){
		
	}
	/*public Alumno(String progreso){
		//super.nombre = nombre;
		//this.DNI=DNI;
		this.progreso = progreso;
	}*/

	public boolean isSubvencionado() {
		return subvencionado;
	}

	public void setSubvencionado(boolean subvencionado) {
		this.subvencionado = subvencionado;
	}

}
