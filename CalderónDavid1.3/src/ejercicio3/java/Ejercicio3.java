/*
 * Descripción: Voy a hacer un intercambio de datos de las variables pedidas
 * Autor: David Calderón Navarro
 * Fecha: 02/10/2025
 */

package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);
		
		//Creo las variables
		
		int num1;
		System.out.print("Dime el primer número: ");
		num1 = numeros.nextInt();
		
		int num2;
		System.out.print("Dime el segundo número: ");
		num2 = numeros.nextInt();
		
		int num3;
		num3 = 0;
		
		//Cambio las variables de lugar
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("La variable num1 es: " + num1);
		System.out.println("La variable num2 es: " + num2);

	}

}
