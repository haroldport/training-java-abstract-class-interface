package com.arquitecturajava.ejemplo005;

public class SuperBrazo implements Girable, Rotable {

	@Override
	public void rotar() {
		System.out.println("El super brazo rota");
	}

	@Override
	public void girar() {
		System.out.println("El super brazo gira");
	}

}
