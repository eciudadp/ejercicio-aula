package ejercicio2DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ejercicio01oo.model.Aula;
import ejercicio01oo.model.Persona;
import ejercicio01oo.model.PuestoDeTrabajo;

public class AulaDAOList implements IAulaDAO {

	private List<Aula> edificio;
	
	

	public AulaDAOList() {
		super();
		this.edificio= new ArrayList<Aula>();
	}

	public void crearAula(Aula aula) {
		if (!edificio.contains(aula)) {
			edificio.add(aula);
			System.out.println("Aula " + aula + " agregada");
		}
	}

	public void actualizarAula(Aula aula) {
		int i = 0;
		boolean condicion = false;
		while (i < edificio.size() || !condicion) {
			if (edificio.get(i).getNombre() == aula.getNombre()) {
				edificio.set(i, aula);
				condicion = true;
			}
			i++;
		}
		System.out.println("Aula " + aula + " actualizada");
	}

	public void eliminarAula(Aula aula) {
		if (edificio.contains(aula)) {
			edificio.remove(aula);
			System.out.println("Aula " + aula + " eliminada");
		}
	}

	public Aula getAula(String nombre) {
		int i = 0;
		boolean condicion = false;
		Aula aula = null;
		while (i < edificio.size() || !condicion) {
			Aula aulaAux = edificio.get(i);
			if (aulaAux.getNombre().equals(nombre)) {
				condicion = true;
				aula = aulaAux;
			}
			i++;
		}
		return aula;
	}

	public List<Aula> getAulas() {
		// TODO Auto-generated method stub
		return edificio;
	}

}
