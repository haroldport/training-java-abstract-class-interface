package com.arquitecturajava.ejemplo003;

public class BrazoRapido extends Brazo implements Girable {

	@Override
	public void girar() {
		System.out.println("El brazo gira a 50 vueltas/minuto");
	}

}
