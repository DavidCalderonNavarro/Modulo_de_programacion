/*Descripción: Programa que te pide un numero y te dice en que posicion del arrays se encuentra
 * Autor: David Calderón Navarro
 * Fecha: 24/10/2025
 */

package ejercicio9.java;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Hago una constante para evitar literales
		final int NUMEROS_TOTAL = 100;
		
		//Declaro el arrays
		int[] arrays = new int[NUMEROS_TOTAL];
		
		//Hago bucle para meterle los numeros random
		for (int i = 0;i < NUMEROS_TOTAL;i++) {
			
			arrays[i] = (int) (1 + Math.random()*10);
			
		}
		
		//Declaro variable para el numero
		int num, pos;
		System.out.print("Dame un valor entre 1 al 10: ");
		num = datos.nextInt();
		
		//Hago bucle para saber la posicion en que se encuentra
		for (int contador = 0;contador < NUMEROS_TOTAL;contador++) {
			
			if (arrays[contador] == num) {
				
				pos = contador;
				System.out.println("El numero " + num + " encuentra en la posicion: " + pos);
				
			}
			
		}
		
	}

}
