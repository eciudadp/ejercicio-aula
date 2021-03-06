package ejercicio2Negocio;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.ws.ServiceMode;

import ejercicio01oo.model.Alumno;
import ejercicio01oo.model.Aula;
import ejercicio01oo.model.Persona;
import ejercicio01oo.model.Profesor;
import ejercicio01oo.model.PuestoDeTrabajo;
import ejercicio2DAO.IAulaDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AulasLN {

	@Autowired
	private IAulaDAO aulaDAO;

	public AulasLN(IAulaDAO aulaDAO) {
		super();
		this.aulaDAO = aulaDAO;
	}

	public AulasLN() {
		super();
	}

	public Aula crearAula(Aula aula) {
		// Aula aula = new Aula(nombre, proyector, pizarra, puestoDelAlumno);
		if (aula != null) {
			this.aulaDAO.crearAula(aula);
			return this.aulaDAO.getAula(aula.getNombre());
		} else
			return null;

	}

	public Aula crearAula(Aula aula, Integer numPuestos) {
		// Aula aula = new Aula(nombre, proyector, pizarra, puestoDelAlumno);
		if (aula != null) {
			this.aulaDAO.crearAula(aula, numPuestos);
			return this.aulaDAO.getAula(aula.getNombre());
		} else
			return null;

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
		if (puestos != null) {
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
		}
		listaProfesores.add((Profesor) puestoProfesor.getPersona());
		return listaProfesores;

	}

	public void AsignarAlumnoAAula(String nombre, Alumno alumno) {
		// Aula aula = this.aulaDAO.getAula(nombre);
		boolean admitido = false;
		// Set<PuestoDeTrabajo> puestos = aula.getPuestoDelAlumno();
		Set<PuestoDeTrabajo> puestos = this.aulaDAO.getAula(nombre).getPuestoDelAlumno();
		Iterator<PuestoDeTrabajo> iterador = puestos.iterator();
		while (iterador.hasNext() && !admitido) {
			PuestoDeTrabajo puestoActual = iterador.next();
			if (puestoActual.getPersona() == null && puestoActual.getOrdenador() == true) {
				puestoActual.setPersona(alumno);
				admitido = true;
			}
		}

	}

	public void eliminarAula(Aula aula) {
		this.aulaDAO.eliminarAula(aula);

	}

	public Collection<Aula> listarAulas() {
		List<Aula> listaAulas = this.aulaDAO.getAulas();
		return listaAulas;

	}

	public IAulaDAO getAulaDAO() {
		return aulaDAO;
	}

	public void setAulaDAO(IAulaDAO aulaDAO) {
		this.aulaDAO = aulaDAO;
	}

}
