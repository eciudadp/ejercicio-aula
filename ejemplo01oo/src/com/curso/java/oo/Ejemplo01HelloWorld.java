package com.curso.java.oo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.curso.java.oo.model.CargoDePolicia;
import com.curso.java.oo.model.Persona;
import com.curso.java.oo.model.Policia;
import com.curso.java.oo.model.PoliciaDeLosDeLasPorras;
import com.curso.java.oo.model.PoliciaPistolero;

//import com.curso.java.oo.model.Persona;

public class Ejemplo01HelloWorld {
	
	//com.curso.java.oo.Ejemplo01HelloWorld arg1 arg2 arg3
	public static void main(String[] args) {
		String miCadena ="Hello World";
		System.out.println(miCadena);
		Persona.explicito="algo";
		Persona persona = new Persona();
		Persona persona2 = new Persona();
		persona.setNombre("Pepe");
		persona.explicito = "Es de Pepe";
		persona2.setNombre("Otro nombre");
		Persona persona3 = new PoliciaDeLosDeLasPorras();
		PoliciaDeLosDeLasPorras poliPorrero = (PoliciaDeLosDeLasPorras) persona3;
		Policia policia = new Policia();
		policia.setCargo(CargoDePolicia.RASO);
		//PoliciaDeLosDeLasPorras otroPorrero = (PoliciaDeLosDeLasPorras) policia;
		Set<Policia> setDePolicias= new HashSet<Policia>();
		setDePolicias.add(poliPorrero);
		setDePolicias.add((Policia) persona3);
		setDePolicias.add(new PoliciaPistolero());
		System.out.println(setDePolicias.size());
		List<Policia> lista = new ArrayList();
		lista.add(poliPorrero);
		lista.add((Policia) persona3);
		lista.add(new PoliciaPistolero());
		System.out.println(lista.size());
		Map<String,Persona> mapa = new HashMap<String, Persona>();
		mapa.put("ROJO",policia);
		mapa.put("VERDE", poliPorrero);
		mapa.put("ROJO",poliPorrero);
		System.out.println(mapa.get("ROJO"));
		

		
		
	}
}
