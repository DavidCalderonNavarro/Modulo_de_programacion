/*Descripción: Programa que pide 20 valores y los mete en dos arrays y los compara para ver si son iguales
 * Autor: David Calderón Navarro
 * Fecha: 06/11/2025
 */

package ejercicio17.java;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Creo constante para evitar literales
		final int NUMEROS_TOTAL = 10;
		
		//Declaro variables
		int num1, num2, contador = 0;
		
		//Declaro los arrays
		int[] arrays1 = new int[NUMEROS_TOTAL];
		int[] arrays2 = new int[NUMEROS_TOTAL];
		
		//Recojo 10 numeros en un arrays
		for (int i = 0; i < NUMEROS_TOTAL; i++) {
			
			System.out.print("Dame un numero: ");
			num1 = datos.nextInt();
			
			arrays1[i] = num1;
			
		}
		
		//Recojo otros 10 en otro
		for (int e = 0; e < NUMEROS_TOTAL; e++) {
			
			System.out.print("Dame un numero: ");
			num2 = datos.nextInt();
			
			arrays2[e] = num2;
			
		}
		
		//Comparo los arrays
		for (int a = 0; a < NUMEROS_TOTAL; a++) {
			
			if (arrays1[a] == arrays2[a]) {
				
				contador++;
				
			}
			
			
		}
		
		//Miro si son iguales y se lo muestro
		if (contador == 10) {
			
			System.out.println("Los arrays son iguales");
			
		}else {
			
			System.out.println("No son iguales");
			
		}
		
	}

}
