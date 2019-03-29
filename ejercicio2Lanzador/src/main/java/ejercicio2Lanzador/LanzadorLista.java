package ejercicio2Lanzador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ejercicio01oo.model.Alumno;
import ejercicio01oo.model.Aula;
import ejercicio01oo.model.Profesor;
import ejercicio01oo.model.PuestoDeTrabajo;
import ejercicio2Negocio.AulasLN;

public class LanzadorLista {
	
	public static ApplicationContext context;

	static {
		context = new ClassPathXmlApplicationContext("beansDAOComponentes.xml");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//private ApplicationContext context;
			
		
		//PuestoDeTrabajo puesto1 = context.getBean(PuestoDeTrabajo.class);
		Alumno alumno1= context.getBean(Alumno.class);
		Alumno alumno2= context.getBean(Alumno.class);
		PuestoDeTrabajo puestoProfesor = context.getBean(PuestoDeTrabajo.class);
		Profesor profesor = context.getBean(Profesor.class);
		Aula aula1 = context.getBean(Aula.class);
		Aula aula2 = context.getBean(Aula.class);
		puestoProfesor.setPersona(profesor);
		aula1.setPuestoDelProfesor(puestoProfesor);
		alumno1.setNombre("Enrique");
		alumno2.setNombre("Ines");
		alumno1.setSubvencionado(true);
		alumno2.setSubvencionado(true);
		aula1.setNombre("Kepler");
		aula2.setNombre("Galileo");
		
		for(int i =0;i< 12;i++) {
			aula1.getPuestoDelAlumno().add(context.getBean(PuestoDeTrabajo.class));
			System.out.println(aula1 +" añadido puesto de alumno");
		}
		
		AulasLN negocio = context.getBean(AulasLN.class); 
		negocio.crearAula(aula1);
		//System.out.println(negocio.crearAula(aula1));
		System.out.println(negocio.crearAula(aula2));
		negocio.ListaProferoresXAula("Kepler");
		System.out.println(negocio.listarAulas());
		//System.out.println(negocio.AsignarAlumnoAAula("aula1", alumno1););
		//System.out.println();
		//List<Aula> listaAulas
		/*PuestoDeTrabajo puesto1= new PuestoDeTrabajo(true);
		PuestoDeTrabajo puesto2= new PuestoDeTrabajo(true);
		PuestoDeTrabajo puesto0 = new PuestoDeTrabajo(true);
		
		Set<PuestoDeTrabajo> puestosAlumnos = new HashSet<PuestoDeTrabajo>();
		Aula aula1 = new Aula("Galileo",true,true,puestosAlumnos);
		Aula aula2 = new Aula("Kepler",true,true,puestosAlumnos);
		List<Aula> listaAulas= new ArrayList<Aula>();
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		Profesor profesor=new Profesor();
		profesor.setNombre("Ruben");
		profesor.setMalaLeche(true);
		puesto0.setPersona(profesor);
		aula1.setPuestoDelProfesor(puesto0);
		alumno1.setNombre("Enrique");
		alumno2.setNombre("Ines");
		alumno1.setSubvencionado(true);
		alumno2.setSubvencionado(true);
		puesto1.setPersona(alumno1);
		//puesto2.setPersona(alumno2);
		puestosAlumnos.add(puesto1);
		//puestosAlumnos.add(puesto2);
		AulasLN negocio = context.getBean(AulasLN.class); 
		negocio.crearAula(aula1);
		negocio.crearAula(aula2);
		negocio.AsignarAlumnoAAula("aula1", alumno1);
		//negocio.AsignarAlumnoAAula("Galileo", alumno2);
		//negocio.ListaAlumnosXAula("Galileo");
		//negocio.ListaProferoresXAula("Galileo");
		//listaAulas= (List<Aula>) negocio.listarAulas();
		System.out.println(negocio.listarAulas());
		/*System.out.println("Listado de todas las aulas");
		
		for(int i = 0; i < listaAulas.size();i++) {
			Aula aulaAux = listaAulas.get(i);
			System.out.println("Aula " + i + " "+ aulaAux.getNombre() );
		}
		negocio.eliminarAula(aula2);*/
		
	}

}
