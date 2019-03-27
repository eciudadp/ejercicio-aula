package ejercicio2DAO;

import java.util.List;
import java.util.Map;

import ejercicio01oo.model.Alumno;
import ejercicio01oo.model.Aula;

public interface IAulaDAO {
	void crearAula(Aula aula);
	
	void actualizarAula(Aula aula);
	
	void eliminarAula(String nombre);
	
	Aula getAula(String nombre);
	
	//void asignarAlumno(Aula aula, Alumno alumno);
	
	List<Aula> getAulas();
	
	Map<String,Aula> getAlumnosAula();
	
	Map<String,Aula> getProfesoresAula();
}
