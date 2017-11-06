package com.arquitecturajava.ejemplo001;

public abstract class Vehiculo {
	
	private String marca;

	public Vehiculo(String marca) {
		super();
		this.marca = marca;
	}
	
	//todas las clases hijas lo deben implementar
	//salvo que ellas tambien seas abstractas
	public abstract void acelerar();

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
