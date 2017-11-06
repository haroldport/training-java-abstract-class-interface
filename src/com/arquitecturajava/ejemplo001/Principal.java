package com.arquitecturajava.ejemplo001;

public class Principal {

	public static void main(String[] args) {
		
		Moto m = new Moto("Ducati");
		Coche c = new Coche("Toyota");
		
		System.out.println(m.getMarca());
		System.out.println(c.getMarca());

	}

}
