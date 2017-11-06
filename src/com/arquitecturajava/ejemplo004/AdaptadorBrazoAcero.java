package com.arquitecturajava.ejemplo004;

public class AdaptadorBrazoAcero implements Girable {
	
	private BrazoAcero brazoAcero;

	public AdaptadorBrazoAcero(BrazoAcero brazoAcero) {
		super();
		this.brazoAcero = brazoAcero;
	}

	public BrazoAcero getBrazoAcero() {
		return brazoAcero;
	}

	public void setBrazoAcero(BrazoAcero brazoAcero) {
		this.brazoAcero = brazoAcero;
	}

	@Override
	public void girar() {
		//este es el metodo que adapta el brazo de acero al robot
		//usando delegacion
		brazoAcero.rotar();
	}

}
