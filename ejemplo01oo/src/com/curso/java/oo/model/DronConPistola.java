package com.curso.java.oo.model;

public class DronConPistola extends Maquina implements PuedeDisparar{

	@Override
	void cargarse() {
		System.out.println("Cargando con cargador");

	}

	@Override
	public void dispararSinJuicio(String objetivo) {
		System.out.println("Disparando con el dron a "+ objetivo);
		
	}

}
