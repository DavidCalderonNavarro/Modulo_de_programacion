/*
 * Descripción: Voy a aplicar distintas funciones math a un número decimal
 * Autor: David Calderón Navarro
 * Fecha: 02/10/2025
 */

package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner decimal = new Scanner(System.in);
		
		//Aqui le pido al usuario que me diga un número decimal
		double num1;
		System.out.print("Dime un número decimal: ");
		num1 = decimal.nextDouble();
		
		//Aqui declaro las funciones Math
		double techo = Math.ceil(num1);
		double suelo = Math.floor(num1);
		double redondeo = Math.round(num1);
		
		//Aqui le muestro su número con las distintas funciones Math
		System.out.println("Tu número con la función ceil es: " + techo);
		System.out.println("Tu número con la función floor es: " + suelo);
		System.out.println("Tu número con la funciónround es: " + redondeo);
		
	}

}
