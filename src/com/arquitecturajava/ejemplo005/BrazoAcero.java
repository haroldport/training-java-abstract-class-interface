package com.arquitecturajava.ejemplo005;

//este fabricante, fabrica muchas tipologias de brazos
public class BrazoAcero implements Rotable {
	
	//rotar no es lo mismo que girar
	@Override
	public void rotar() {
		System.out.println("El brazo de acero rota a 70 vueltas/minuto");
	}

}
