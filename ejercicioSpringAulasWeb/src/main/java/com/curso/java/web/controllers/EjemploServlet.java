package com.curso.java.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ejercicio01oo.model.Alumno;
import ejercicio01oo.model.Aula;
import ejercicio01oo.model.Profesor;
import ejercicio01oo.model.PuestoDeTrabajo;
import ejercicio2Negocio.AulasLN;

/**
 * Servlet implementation class EjemploServlet
 */
@WebServlet({ "/alumnos", "/personas" })
public class EjemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ApplicationContext context;
	
	
	
	@Override
	public void init() throws ServletException {
		
		ApplicationContext applicationContext = WebApplicationContextUtils
			.getRequiredWebApplicationContext(getServletContext());
		this.context = applicationContext;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EjemploServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Alumno alumno1= context.getBean(Alumno.class);
		Alumno alumno2= context.getBean(Alumno.class);
		PuestoDeTrabajo puestoProfesor = context.getBean(PuestoDeTrabajo.class);
		PuestoDeTrabajo puestoAlumno1 = context.getBean(PuestoDeTrabajo.class);
		PuestoDeTrabajo puestoAlumno2 = context.getBean(PuestoDeTrabajo.class);
		
		Profesor profesor = context.getBean(Profesor.class);
		profesor.setNombre("Ruben");
		
				
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
//		puestoAlumno1.setPersona(alumno1);
//		puestoAlumno2.setPersona(alumno2);
		 //aula1.getPuestoDelAlumno()).setPersona(alumno1);
//		for(int i =0;i< 12;i++) {
//			aula1.getPuestoDelAlumno().add(context.getBean(PuestoDeTrabajo.class));
//			aula2.getPuestoDelAlumno().add(context.getBean(PuestoDeTrabajo.class));
//			//System.out.println(aula1 +" añadido puesto de alumno");
//		}
//		aula1.getPuestoDelAlumno().add(puestoAlumno2);
//		aula1.getPuestoDelAlumno().add(puestoAlumno1);
		
		
		AulasLN negocio = context.getBean(AulasLN.class); 
		negocio.crearAula(aula1,12);
		negocio.crearAula(aula2,10);
		//System.out.println(negocio.crearAula(aula1));
		//System.out.println(negocio.crearAula(aula2));
		Collection<Profesor> listaProferoresXAula = negocio.ListaProferoresXAula("Kepler");
		System.out.println(negocio.listarAulas());
		System.out.println(listaProferoresXAula);
		negocio.AsignarAlumnoAAula("Kepler", alumno1);
		negocio.AsignarAlumnoAAula("Kepler", alumno2);
		Collection<Alumno> ListaalumnosXAula = negocio.ListaAlumnosXAula("Kepler");
		System.out.println(ListaalumnosXAula);
		Collection<Aula> listaAulas = negocio.listarAulas();
		
		Iterator<Alumno> iterador =ListaalumnosXAula.iterator();
		Iterator<Aula> iteradorAula =listaAulas.iterator();
		
		request.setAttribute("aula",iteradorAula.next());
		request.setAttribute("mensajeAlumno1",iterador.next());
		request.setAttribute("mensajeAlumno2",iterador.next());
		request.setAttribute("aula2",iteradorAula.next());
		request.setAttribute("loquesea", context.getBean("Alumno"));
		//request.setAttribute("mensajeAlumno3", context.getBean("mensajeAlumno"));
		//request.setAttribute("mensajeSession", context.getBean("mensajeSession"));
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/saludar.jsp").forward(request, response);
	}
	
}
