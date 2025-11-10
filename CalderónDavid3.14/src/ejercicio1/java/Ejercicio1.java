/*Descripción: Programa que pide dos numeros por teclado y los multiplica
 * Autor:David Calderón Navarro
 * Fecha:10/11/2025
 */

package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		double a, b;
		
		//Pregunto por los dos numeros
		System.out.print("Dime un numero: ");
		a = datos.nextDouble();
		System.out.print("Dime un numero: ");
		b = datos.nextDouble();
		
		//Declaro la variable multiplicacion y le asigno directamente el valor del metodo
		double multiplicacion = multiplica(a, b);
		
		//Le muestro al usuario el resultado
		System.out.println("La multiplicacion da: " + multiplicacion);
		
	}
	
	//Metodo que multiplica un numero por otro devolviendo un valor double
	public static double multiplica (double a, double b) {
		
		double multiplicacion = a * b;
		
		return multiplicacion;
		
		
	}

}
