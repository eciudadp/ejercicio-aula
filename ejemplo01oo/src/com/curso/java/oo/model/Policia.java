package com.curso.java.oo.model;

public class Policia extends Persona {
	//evitar uso tipos primitivos preferiblemente usar objetos menos el booleano
	private Integer numeroDePlaca;
	//private int numeroPrimitivo;
	//private Boolean booleano;
	//private boolean booleanoPrimitivo;
	private CargoDePolicia cargo;
	
	
	public Integer getNumeroDePlaca() {
		return numeroDePlaca;
	}
	public void setNumeroDePlaca(Integer numeroDePlaca) {
		this.numeroDePlaca = numeroDePlaca;
	}
	public CargoDePolicia getCargo() {
		return cargo;
	}
	public void setCargo(CargoDePolicia cargo) {
		this.cargo = cargo;
	}
	
}
