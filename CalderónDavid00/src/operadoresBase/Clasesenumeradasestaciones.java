/*
 * Descripción: Voy a hacer ejemplos de clases enumeradas y mostrarlas
 * Autor: David Calderón Navarro
 * Fecha: 26/09/2025
 */

package operadoresBase;

public class Clasesenumeradasestaciones {
	
	enum Estaciones{
		
		INVIERNO, PRIMAVERA, VERANO, OTOÑO
		
	}

	public static void main(String[] args) {
		
		Estaciones Invierno = Estaciones.INVIERNO;
		Estaciones Primavera = Estaciones.PRIMAVERA;
		Estaciones Verano = Estaciones.VERANO;
		Estaciones Otoño = Estaciones.OTOÑO;
		
		System.out.println("La primera y última estación del año es: " + Invierno);
		System.out.println("La segunda estación del año es: " + Primavera);
		System.out.println("La tercera estación del año es: " + Verano);
		System.out.println("La cuarta estación del año es: " + Otoño);
	}

}
