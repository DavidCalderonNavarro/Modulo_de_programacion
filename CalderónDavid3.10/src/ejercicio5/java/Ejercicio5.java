/*Descripción: Programa que hace la media de 20 numeros alojados en un arrays
 * Autor: David Calderón Navarro
 * Fecha: 23/10/2025
 */

package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		//Hago constante para evitar los literales
		final int NUMEROS_TOTAL = 20;
		
		//Declaro la variable
		int num[] = new int[NUMEROS_TOTAL];
		int suma = 0, media = 0;
		
		for (int contador = 0; contador < NUMEROS_TOTAL;contador++) {
			
			System.out.print("Dame un numero: ");
			num[contador] = datos.nextInt();
			
		}
		
		//Recorro el arrays para comparar
		for (int i = 0; i < NUMEROS_TOTAL; i++) {
		
			suma = suma + num[i];
			
		}
		
		media = suma / NUMEROS_TOTAL;
		
		//Le muestro la suma de los positivos y la de los negativos
		System.out.println("La media de tus numeros da: " + media);
		
		
		
	}

}
