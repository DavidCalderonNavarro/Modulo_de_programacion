/*Descripción: Programa que suma los positivos y negativos por separado con un arrays
 * Autor: David Calderón Navarro
 * Fecha: 23/10/2025
 */

package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		//Hago constante para evitar los literales
		final int NUMEROS_TOTAL = 20;
		
		//Declaro la variable
		int num[] = new int[NUMEROS_TOTAL];
		int pos = 0, neg = 0;
		
		for (int contador = 0; contador < NUMEROS_TOTAL;contador++) {
			
			System.out.print("Dame un numero: ");
			num[contador] = datos.nextInt();
			
		}
		
		//Recorro el arrays para comparar
		for (int i = 0; i < NUMEROS_TOTAL; i++) {
		
			if (num[i] > 0) {
			
			pos = pos + num[i];
			
			}if (num[i] < 0) {
			
			
			neg = neg + num[i];
			
			}
		}
		
		//Le muestro la suma de los positivos y la de los negativos
		System.out.println("La suma de los positivos a sido: " + pos);
		System.out.println("La suma de los negativos a sido: " + neg);
		
		
	}

}
