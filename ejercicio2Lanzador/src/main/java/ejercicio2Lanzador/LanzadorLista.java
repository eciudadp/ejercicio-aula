package ejercicio2Lanzador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ejercicio01oo.model.Alumno;
import ejercicio01oo.model.Aula;
import ejercicio01oo.model.PuestoDeTrabajo;
import ejercicio2Negocio.AulasLN;

public class LanzadorLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuestoDeTrabajo puesto1= new PuestoDeTrabajo(true);
		PuestoDeTrabajo puesto2= new PuestoDeTrabajo(true);
		Set<PuestoDeTrabajo> puestosAlumnos = new HashSet<PuestoDeTrabajo>();
		Aula aula = new Aula("Galileo",true,true,puestosAlumnos);
		List<Aula> listaAulas= new ArrayList<Aula>();
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		alumno1.setNombre("Enrique");
		alumno2.setNombre("Ines");
		alumno1.setSubvencionado(true);
		alumno2.setSubvencionado(true);
		puesto1.setPersona(alumno1);
		puesto2.setPersona(alumno2);
		puestosAlumnos.add(puesto1);
		puestosAlumnos.add(puesto2);
		AulasLN negocio = new AulasLN(aula); 
		
		
	}

}
