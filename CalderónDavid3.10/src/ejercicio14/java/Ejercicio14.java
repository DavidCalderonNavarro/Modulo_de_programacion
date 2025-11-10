/*Descripción: Programa que muestra una secuencia de valores creciente
 * Autor: David Calderón Navarro
 * Fecha: 04/11/2025
 */

package ejercicio14.java;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		//Creo constante para evitar valores
		final int NUMEROS_TOTAL = 55;
		
		//Creo el contador para recorrer la variable
		int contador = 0;
		
		//Creo el arrays
		int[] arrays = new int[NUMEROS_TOTAL];
		
		//Meto los valores en el arrays
		for (int i = 1; i <= 10; i++) {
			

			for (int e = 0; e < i; e++) {
				
				arrays[contador] = i;
				contador++;
				
			}
			
		}
		
		//Muestro el valor de las posiciones del arrays
		for (int a = 0; a < NUMEROS_TOTAL; a++) {
			
			System.out.print(arrays[a]);
			
			
		}
		
	}

}
