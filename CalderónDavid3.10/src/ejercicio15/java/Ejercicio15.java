/*Descripción: Programa que pide el tamanyo del arrays y los valores que tendra y los muestra
 * Autor: David Calderón Navarro
 * Fecha: 04/11/2025
 */

package ejercicio15.java;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int tamanyo, valor;
		
		//Pregunto los datos al usuario
		System.out.print("Dime el tamanyo del arrays: ");
		tamanyo = datos.nextInt();
		
		System.out.print("Dime el valor de las posicion(es): ");
		valor = datos.nextInt();
		
		//Declaro el arrays
		int[] arrays = new int[tamanyo];
		
		//Meto el valor en cada una de las posiciones
		for (int i = 0; i < tamanyo; i++) {
			
			arrays[i] = valor;
			
		}
		
		//Muestra el valor de cada posicion del arrays
		for (int e = 0; e < tamanyo; e++) {
			
			System.out.print(arrays[e] + " ");
			
		}
		
		
		
	}

}
