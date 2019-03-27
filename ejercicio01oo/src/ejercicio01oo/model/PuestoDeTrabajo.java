package ejercicio01oo.model;

public class PuestoDeTrabajo {
	
	private Persona persona;
	private boolean ordenador;

	
	public PuestoDeTrabajo(boolean ordenador) {
		this.ordenador = ordenador;
	}
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


	public boolean isOrdenador() {
		return ordenador;
	}


	public void setOrdenador(boolean ordenador) {
		this.ordenador = ordenador;
	}

}
