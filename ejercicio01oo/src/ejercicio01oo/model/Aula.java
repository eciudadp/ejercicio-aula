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
