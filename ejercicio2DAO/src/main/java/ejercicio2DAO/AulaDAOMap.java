package ejercicio2DAO;


import java.util.LinkedList;
import java.util.List;
import java.util.Map;


import ejercicio01oo.model.Aula;

public class AulaDAOMap implements IAulaDAO {

	Map<String, Aula> edificio;

	public void crearAula(Aula aula) {
		if (!edificio.containsValue(aula)) {
			edificio.put(aula.getNombre(), aula);
			System.out.println("Aula " + aula + " agregada");
		}

	}

	public void actualizarAula(Aula aula) {
		if (!edificio.containsValue(aula)) {
			edificio.replace(aula.getNombre(), aula);
			System.out.println("Aula " + aula + " actualizada");
		}

	}

	public void eliminarAula(Aula aula) {
		if (!edificio.containsValue(aula)) {
			edificio.remove(aula.getNombre());
			System.out.println("Aula " + aula + " eliminada");
		}
	}

	public Aula getAula(String nombre) {
		Aula aula = null;
		if (!edificio.containsKey(nombre)) {
			aula = edificio.get(nombre);
		}
		return aula;
	}

	public List<Aula> getAulas() {
		List<Aula> aulas = new LinkedList<Aula>();
		for (int i = 0; edificio.size() > i; i++) {
			aulas.get(i);
		}
		return aulas;
	}

}
