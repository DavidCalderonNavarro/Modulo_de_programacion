/*Descripción: Programa que convierte de millas a kilometros
 * Autor:David Calderón Navarro
 * Fecha:13/11/2025
 */

package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		double millas, conversion;
		
		//Le pido las millas
		System.out.print("Dime las millas que quieres pasar a kilometros: ");
		millas = datos.nextInt();
		
		//Llamo al metodo
		conversion = millas_a_kilometros(millas);
		
		//Muestro el resultado
		System.out.println("Tus millas a kilometros son: " + conversion + " kilometros");
		
	}
	
	//Metodo para pasar de millas a kilometros
	public static double millas_a_kilometros(double millas) {
		
		double kilometros = 1.60934;
		double conversion;
		
		conversion = kilometros * millas;
		
		return conversion;
		
	}

}
