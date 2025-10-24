/*Descripción: Programa que suma 10 numeros alojados en un arrays
 * Autor: David Calderón Navarro
 * Fecha: 23/10/2025
 */

package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro la variable
		int num[] = new int[10];
		int suma = 0;
		
		for (int contador = 0; contador < 10;contador++) {
			
			System.out.print("Dame un numero: ");
			num[contador] = datos.nextInt();
			
		}
		
		for (int i = 0; i < 10; i++) {
			
			suma = suma + num[i];//Voy sumando numero por numero
			
		}
		//Muestro la suma
		System.out.println("La suma es: " + suma);
		
	}

}
