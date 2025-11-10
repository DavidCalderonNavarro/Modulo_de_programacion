/*Descripción: Programa que mete 30 numeros aleatorios del 1 al 10 y los ordena
 * Autor: David Calderón Navarro
 * Fecha: 06/11/2025
 */

package ejercicio18.java;

import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		//Creo constante para evitar literales
		final int NUMEROS_TOTAL = 30;
		
		//Declaro el arrays
		int[] arrays = new int[NUMEROS_TOTAL];
		
		//Meto los 30 numeros en el arrays
		for (int i = 0; i < NUMEROS_TOTAL; i++) {
			
			arrays[i] = (int) (Math.random()*10);
			
		}
		
		//Metodo para ordenar el arrays
		Arrays.sort(arrays);
		
		//Muestro el arrays ordenado
		for (int e = 0; e < NUMEROS_TOTAL; e++) {
			
			System.out.println(arrays[e]);
			
		}
		
		
		
	}

}
