/*Descripción: Programa que te dice el numero maximo y el minimo con un arrays
 * Autor: David Calderón Navarro
 * Fecha: 23/10/2025
 */

package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro la variable
		int num[] = new int[10];
		int maximo, minimo;
		
		for (int contador = 0; contador < 10;contador++) {
			
			System.out.print("Dame un numero: ");
			num[contador] = datos.nextInt();
			
			
			
		}
		
		//Leasigno valores reales a las variables
		maximo = num[0];
		minimo = num[0];
		
		//Recorro el arrays para comparar
		for (int i = 0; i < 10; i++) {
		
			if (num[i] > maximo) {
			
			maximo = num[i];
			
			}if (num[i] < minimo) {
			
			
			minimo = num[i];
			
			}
		}
		
		//Le muestro el maximo y el minimo
		System.out.println("El maximo a sido: " + maximo);
		System.out.println("El minimo a sido: " + minimo);
		
	}

}
