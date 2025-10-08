/*
 * Descripción: Voy a hacer ejemplos de clases enumeradas y mostrarlas
 * Autor: David Calderón Navarro
 * Fecha: 26/09/2025
 */

package ejercicio4.java;

public class Ejercicio4 {
	
	enum Talla{PEQUEÑA, MEDIANA, GRANDE, EXTRAGRANDE}

	public static void main(String[] args) {
		
		
		Talla S = Talla.PEQUEÑA;
		Talla M = Talla.MEDIANA;
		Talla L = Talla.GRANDE;
		Talla XL = Talla.EXTRAGRANDE;
		
		System.out.println("La talla S es: " + S);
		System.out.println("La talla M es: " + M);
		System.out.println("La talla L es: " + L);
		System.out.println("La talla XL es: " + XL);
		

	}

}
