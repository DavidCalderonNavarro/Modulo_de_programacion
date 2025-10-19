/*Descripción: Programa que cuenta desde 1 hasta numero introducido por el usuario
 * Autor: David Calderón Navarro
 * Fecha: 17/10/2025
 */

package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Pido datos al usuario
		System.out.print("Dime hasta cuanto quieres contar: ");
		int num = datos.nextInt();
		
		//Uso el bucle para contar
		for (int contador = 1; contador <= num; contador++) {
			
			//Muestro el resultado al usuario
			System.out.print(contador + " ");
			
		}
		
		
	}

}
