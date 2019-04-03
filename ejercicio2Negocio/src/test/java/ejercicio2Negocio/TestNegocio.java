package ejercicio2Negocio;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import ejercicio01oo.model.Alumno;
import ejercicio01oo.model.Aula;
import ejercicio01oo.model.Profesor;
import ejercicio01oo.model.PuestoDeTrabajo;
import ejercicio2DAO.AulaDAOList;
import ejercicio2DAO.IAulaDAO;

public class TestNegocio {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testCrearAula() {
		Aula aula = new Aula();

		AulasLN claseNegocio = new AulasLN();
		AulaDAOList aulaDAOList = new AulaDAOList();
		aulaDAOList.setEdificio(new ArrayList<Aula>());
		claseNegocio.setAulaDAO(aulaDAOList);

		claseNegocio.crearAula(aula);
		assertTrue(claseNegocio.listarAulas().size() == 1);
		claseNegocio.crearAula(null);
		assertTrue(claseNegocio.listarAulas().size() == 1);
	}

	@Test
	public void testEliminarAula() {

		Aula aula = new Aula();

		AulasLN claseNegocio = new AulasLN();
		AulaDAOList aulaDAOList = new AulaDAOList();
		aulaDAOList.setEdificio(new ArrayList<Aula>());
		claseNegocio.setAulaDAO(aulaDAOList);

		claseNegocio.crearAula(aula);
		claseNegocio.eliminarAula(aula);
		assertTrue(claseNegocio.listarAulas().size() == 0);

	}

	@Test
	public void TestAsignarAlumnoAAula() {
		Aula aula = new Aula();
		Alumno alumno = new Alumno();
		aula.setNombre("Galileo");
		Set<PuestoDeTrabajo> puestoAlumnos = new HashSet<PuestoDeTrabajo>();
		AulasLN claseNegocio = new AulasLN();
		AulaDAOList aulaDAOList = new AulaDAOList();
		aulaDAOList.setEdificio(new ArrayList<Aula>());
		aula.setPuestoDelAlumno(puestoAlumnos);
		claseNegocio.setAulaDAO(aulaDAOList);

		claseNegocio.crearAula(aula, 12);
		claseNegocio.AsignarAlumnoAAula("Galileo", alumno);
		assertTrue("alumno asignado a Aula", aula.getPuestoDelAlumno() != null);
	}

	@Test
	public void TestListaProferoresXAula() {
	
		Aula aula = new Aula();
		Profesor profesor = new Profesor();
		aula.setNombre("Galileo");
		PuestoDeTrabajo puestoProfesor = new PuestoDeTrabajo();
		puestoProfesor.setPersona(profesor);
		AulasLN claseNegocio = new AulasLN();
		AulaDAOList aulaDAOList = new AulaDAOList();
		aulaDAOList.setEdificio(new ArrayList<Aula>());
		//aula.setPuestoDelAlumno(puestoAlumnos);
		aula.setPuestoDelProfesor(puestoProfesor);
		claseNegocio.setAulaDAO(aulaDAOList);
		Collection<Profesor> listaProfesores = new ArrayList<Profesor>();
		
		claseNegocio.crearAula(aula);
		listaProfesores = claseNegocio.ListaProferoresXAula(aula.getNombre());
		assertTrue(listaProfesores.contains(profesor));
		
	}

	@Test
	public void TestListaAlumnosXAula() {
		Aula aula = new Aula();
		Alumno alumno = new Alumno();
		aula.setNombre("Galileo");
		Set<PuestoDeTrabajo> puestoAlumnos = new HashSet<PuestoDeTrabajo>();
		AulasLN claseNegocio = new AulasLN();
		AulaDAOList aulaDAOList = new AulaDAOList();
		aulaDAOList.setEdificio(new ArrayList<Aula>());
		aula.setPuestoDelAlumno(puestoAlumnos);
		claseNegocio.setAulaDAO(aulaDAOList);
//		Collection<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		claseNegocio.crearAula(aula, 2);
		claseNegocio.AsignarAlumnoAAula(aula.getNombre(), alumno);
//		listaAlumnos = claseNegocio.ListaAlumnosXAula(aula.getNombre()).size()=1;
//		assertTrue(listaAlumnos.contains(alumno));	
		assertTrue(claseNegocio.ListaAlumnosXAula(aula.getNombre()).contains(alumno));
		
	}
	
	
	public void TestlistarAulas() {
		Aula aula = new Aula();
		Aula aula2 = new Aula();
		AulasLN claseNegocio = new AulasLN();
		AulaDAOList aulaDAOList = new AulaDAOList();
		aulaDAOList.setEdificio(new ArrayList<Aula>());
		claseNegocio.setAulaDAO(aulaDAOList);
		claseNegocio.crearAula(aula, 2);
		claseNegocio.crearAula(aula2, 2);
		Collection<Aula> listAulas =new ArrayList<Aula>();
		listAulas = claseNegocio.listarAulas();
		assertTrue(listAulas.size()==2);
		
		
		
	}

}
