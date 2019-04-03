package ejercicio2DAO;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ejercicio01oo.model.Aula;

public class TestDAO {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void TestCrearAula() {
		Aula aula = new Aula();
		AulaDAOList claseDAO = new AulaDAOList();
		claseDAO.setEdificio(new ArrayList<Aula>());
		claseDAO.crearAula(aula);
		assertTrue(claseDAO.getEdificio().size() == 1);
		claseDAO.crearAula(null);
		assertTrue(claseDAO.getEdificio().size() == 1);
	}

//	@Test
//	public void TestActualizarAula() {
//		Aula aula = new Aula();
//		AulaDAOList claseDAO = new AulaDAOList();
//		claseDAO.crearAula(aula);
//		claseDAO.actualizarAula(aula);		
//		assertTrue();
//		
//	}

	@Test
	public void TestEliminarAula() {
		Aula aula = new Aula();
		AulaDAOList claseDAO = new AulaDAOList();
		claseDAO.setEdificio(new ArrayList<Aula>());
		claseDAO.crearAula(aula);
		claseDAO.eliminarAula(aula);
		assertTrue("No se elimina el aula", claseDAO.getEdificio().size() == 0);
	}

	@Test
	public void TestGetAula() {
		Aula aula = new Aula();
		AulaDAOList claseDAO = new AulaDAOList();
		claseDAO.setEdificio(new ArrayList<Aula>());
		claseDAO.crearAula(aula);
		Aula aulaAux = claseDAO.getAula(aula.getNombre());
		assertTrue("No obtiene el aula", aulaAux.equals(aula));
	}

}
