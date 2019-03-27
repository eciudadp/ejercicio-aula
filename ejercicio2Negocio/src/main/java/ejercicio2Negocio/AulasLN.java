package ejercicio2Negocio;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ejercicio01oo.model.Alumno;
import ejercicio01oo.model.Aula;
import ejercicio01oo.model.Persona;
import ejercicio01oo.model.Profesor;
import ejercicio01oo.model.PuestoDeTrabajo;
import ejercicio2DAO.IAulaDAO;

public class AulasLN {
	private IAulaDAO aulaDAO;

	public AulasLN(IAulaDAO aulaDAO) {
		super();
		this.aulaDAO = aulaDAO;
	}

	public Aula crearAula(String nombre, boolean proyector, boolean pizarra, Set<PuestoDeTrabajo> puestoDelAlumno) {
		Aula aula = new Aula(nombre, proyector, pizarra, puestoDelAlumno);
		this.aulaDAO.crearAula(aula);
		return this.aulaDAO.getAula(nombre);
	}

	public Collection<Alumno> ListaAlumnosXAula(String nombre) {
		Aula aula = this.aulaDAO.getAula(nombre);
		Set<PuestoDeTrabajo> puestos = aula.getPuestoDelAlumno();
		Collection<Alumno> listaAlumnos = new LinkedList<Alumno>();
		Iterator<PuestoDeTrabajo> iterador = puestos.iterator();

		while (iterador.hasNext()) {
			PuestoDeTrabajo puestoActual = iterador.next();
			if (puestoActual.getPersona() != null) {
				Persona personilla = puestoActual.getPersona();
				if (personilla instanceof Alumno) {
					listaAlumnos.add((Alumno) puestoActual.getPersona());
				}
			}
		}
		return listaAlumnos;

	}

	public Collection<Profesor> ListaProferoresXAula(String nombre) {
		Aula aula = this.aulaDAO.getAula(nombre);
		Set<PuestoDeTrabajo> puestos = aula.getPuestoDelAlumno();
		PuestoDeTrabajo puestoProfesor = aula.getPuestoDelProfesor();
		Collection<Profesor> listaProfesores = new LinkedList<Profesor>();
		Iterator<PuestoDeTrabajo> iterador = puestos.iterator();
		while (iterador.hasNext()) {
			PuestoDeTrabajo puestoActual = iterador.next();
			if (puestoActual.getPersona() != null) {
				Persona personilla = puestoActual.getPersona();
				if (personilla instanceof Profesor) {
					listaProfesores.add((Profesor) puestoActual.getPersona());
				}
			}
		}
		listaProfesores.add((Profesor) puestoProfesor.getPersona());
		return listaProfesores;

	}

	public void AsignarAlumnoAAula(String nombre, Alumno alumno) {
		Aula aula = this.aulaDAO.getAula(nombre);
		Set<PuestoDeTrabajo> puestos = aula.getPuestoDelAlumno();
		Iterator<PuestoDeTrabajo> iterador = puestos.iterator();
		while (iterador.hasNext()) {
			PuestoDeTrabajo puestoActual = iterador.next();
			if (puestoActual.getPersona() == null && puestoActual.isOrdenador()) {
				puestoActual.setPersona(alumno);
			}
		}
	}

	public void eliminarAula(List<Aula> aulas) {
		for (Aula aula : aulas) {
			this.aulaDAO.eliminarAula(aula);
		}
	}

}
