package ejercicio01oo.model;

import java.util.HashSet;
import java.util.Set;

public class Aula {
	private String nombre;
	private PuestoDeTrabajo puestoDelProfesor;
	private Set<PuestoDeTrabajo> puestoDelAlumno;
	private boolean proyector;
	private boolean pizarra;
	
	
	
	public Aula(String nombre, boolean proyector, boolean pizarra, Set<PuestoDeTrabajo> puestoDelAlumno) {
		super();
		this.nombre = nombre;
		this.proyector = proyector;
		this.pizarra = pizarra;
		this.puestoDelAlumno = puestoDelAlumno;
	}
	//private Alumno alumno;
	//private Profesor profesor;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}




	@Override
	public String toString() {
		return nombre;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public PuestoDeTrabajo getPuestoDelProfesor() {
		return puestoDelProfesor;
	}
	public void setPuestoDelProfesor(PuestoDeTrabajo puestoDelProfesor) {
		this.puestoDelProfesor = puestoDelProfesor;
	}
	public Set<PuestoDeTrabajo> getPuestoDelAlumno() {
		return puestoDelAlumno;
	}
	public void setPuestoDelAlumno(Set<PuestoDeTrabajo> puestoDelAlumno) {
		this.puestoDelAlumno = puestoDelAlumno;
	}
	public boolean isProyector() {
		return proyector;
	}
	public void setProyector(boolean proyector) {
		this.proyector = proyector;
	}
	public boolean isPizarra() {
		return pizarra;
	}
	public void setPizarra(boolean pizarra) {
		this.pizarra = pizarra;
	}
	
	

}
