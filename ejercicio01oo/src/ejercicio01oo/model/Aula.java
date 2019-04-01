package ejercicio01oo.model;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope (value="prototype")
public class Aula {
	private String nombre;
	private PuestoDeTrabajo puestoDelProfesor;
	@Autowired
	@Qualifier("setDePuestos")
	private Set<PuestoDeTrabajo> puestoDelAlumno;
	private Boolean proyector;
	private Boolean pizarra;
	
	
	
//	public Aula(String nombre, boolean proyector, boolean pizarra, Set<PuestoDeTrabajo> puestoDelAlumno) {
//		super();
//		this.nombre = nombre;
//		this.proyector = proyector;
//		this.pizarra = pizarra;
//		this.puestoDelAlumno = puestoDelAlumno;
//	}
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



	public Boolean getProyector() {
		return proyector;
	}



	public void setProyector(Boolean proyector) {
		this.proyector = proyector;
	}



	public Boolean getPizarra() {
		return pizarra;
	}



	public void setPizarra(Boolean pizarra) {
		this.pizarra = pizarra;
	}

	
	

}
