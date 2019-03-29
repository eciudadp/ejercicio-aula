package ejercicio01oo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")

public class PuestoDeTrabajo {
	
	private Persona persona;
	private Boolean ordenador;

	
//	public PuestoDeTrabajo(Boolean ordenador) {
//		this.ordenador = ordenador;
//	}
	/*public PuestoDeTrabajo(String id, String PC, String silla,Integer fila) {
		this.identificador = id;
		this.ordenador =PC;
		this.silla = silla;
		this.fila = fila;
	}*/


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public Boolean getOrdenador() {
		return ordenador;
	}


	public void setOrdenador(Boolean ordenador) {
		this.ordenador = ordenador;
	}




}
