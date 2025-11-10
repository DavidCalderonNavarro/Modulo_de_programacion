/*Descripción: Programa que recoge 8 puntuaciones y las ordena de mayor a menor
 * Autor: David Calderón Navarro
 * Fecha: 06/11/2025
 */

package ejercicio19.java;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Creo una constante para evitar literales
		final int NUMEROS_TOTAL = 8;
		
		//Declaro las variables y el arrays
		int puntos, contador = 1;
		int[] arrays = new int[NUMEROS_TOTAL];
		
		//Guardo los puntos en un arrays
		for (int i = 0; i < NUMEROS_TOTAL; i++) {
			
			System.out.println("Dime la puntuacion del jugador " + contador + " :");
			puntos = datos.nextInt();
			contador++;
			
			arrays[i] = puntos;
			
		}
		
		//Los ordeno
		Arrays.sort(arrays);
		
		System.out.println("-------------");
		System.out.println("PUNTUACIONES");
		System.out.println("-------------");
		System.out.println(" ");
		
		//Los invierto porque es de mayor a menor
		for (int i = 7; i >= 0; i--) {
			
			System.out.println(arrays[i]);
			
		}
		
	}

}
