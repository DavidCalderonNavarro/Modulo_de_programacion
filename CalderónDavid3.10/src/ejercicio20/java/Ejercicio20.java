/*Descripción: Programa que guarda 1000 numeros del 0 al 99 y le pregunta al usuario por uno, 
 * si existe, le dice cuantas veces se repite
 * Autor: David Calderón Navarro
 * Fecha: 06/11/2025
 */

package ejercicio20.java;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		final int NUMEROS_TOTAL = 1000;
		
		int num, contador = 0;
		int[] arrays = new int[NUMEROS_TOTAL];
		
		for (int i = 0; i < NUMEROS_TOTAL; i++) {
			
			arrays[i] = (int) (Math.random()*100);
			
		}
		
		System.out.print("Que numero quieres saber si esta en el arrays: ");
		num = datos.nextInt();
		
		for (int e = 0; e < NUMEROS_TOTAL; e++) {
			
			if (arrays[e] == num) {
				
				contador++;
				
			}
			
		}
		
		if (contador > 0) {
			
			System.out.println("Si existe");
			System.out.println("Se repite " + contador + " veces");
			
		}
		
	}

}
