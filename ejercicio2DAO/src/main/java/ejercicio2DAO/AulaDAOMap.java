package ejercicio2DAO;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


import ejercicio01oo.model.Aula;

public class AulaDAOMap implements IAulaDAO {

	private Map<String, Aula> edificio;
	
	
	public AulaDAOMap() {
		super();
		this.edificio= new HashMap<String,Aula>();
	}

	public void crearAula(Aula aula) {
		if (!edificio.containsKey(aula.getNombre())) {
			edificio.put(aula.getNombre(), aula);
			System.out.println("Aula " + aula + " agregada");
		}

	}

	public void actualizarAula(Aula aula) {
		if (!edificio.containsKey(aula.getNombre())) {
			edificio.replace(aula.getNombre(), aula);
			System.out.println("Aula " + aula + " actualizada");
		}
	}

	public void eliminarAula(Aula aula) {
		if (!edificio.containsKey(aula.getNombre())) {
			edificio.remove(aula.getNombre());
			System.out.println("Aula " + aula + " eliminada");
		}
	}

	public Aula getAula(String nombre) {

		return edificio.get(nombre);
	}

	public List<Aula> getAulas() {
		List<Aula> aulas = new LinkedList<Aula>();
		for(String nombreAula: edificio.keySet()) {
			aulas.add(edificio.get(nombreAula));
		}
		return aulas;
	}

}
