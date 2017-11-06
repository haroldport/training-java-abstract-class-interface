package com.arquitecturajava.ejemplo001;

public class Principal {

	public static void main(String[] args) {
		
		Moto m = new Moto("Ducati");
		Coche c = new Coche("Toyota");
		Vehiculo cm = new Camion("Scania");
		
		acelerarVehiculo(m);
		acelerarVehiculo(c);
		acelerarVehiculo(cm);
		
		c.pagarImpuesto();

	}
	
	//el programador que desarrolla este codigo
	//no necesita conocer la jerarquia de clases
	public static void acelerarVehiculo(Vehiculo v) {
		v.acelerar();
	}

}
