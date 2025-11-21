/*Descripción: Programa que convierte de kilometros a millas
 * Autor:David Calderón Navarro
 * Fecha:14/11/2025
 */

package ejercicio12.java;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		double kilometros, conversion;
		
		//Pido los datos
		System.out.print("Dime los kilometros que quiereas pasar a millas: ");
		kilometros = datos.nextDouble();
		
		//Llamo al metodo
		conversion = kilometros_a_millas(kilometros);
		
		//Muestro el resultado
		System.out.printf("Tus kilometros a millas son: %.2f ", conversion);
		
	}
	
	//Metodo para convertir de kilometros a millas
	public static double kilometros_a_millas(double a) {
		
		double kilometros = 1.60934;
		double conversion;
		
		conversion = a / kilometros;
		
		return conversion;
		
	}

}
