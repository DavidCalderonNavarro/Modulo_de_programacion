/*Descripción: Programa que crea un arrays a partir de los dos valores que se introducen por teclado
 * Autor: David Calderón Navarro
 * Fecha: 23/10/2025
 */

package ejercicio7.java;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int P,Q;
		
		//Pido los valores
		System.out.print("Dime el primer numero: ");
		P = datos.nextInt();
		
		System.out.print("Dime el segundo numero: ");
		Q = datos.nextInt();
		
		//Declaro el arrays con el tamanyo del segundo numero que sera el tope
		int [] arrays = new int[Q];
		
		/*Voy metiendo el valor del primero + 1
		 * para que sea un cuenta adelante hasta
		 * llegar al tope del segundo numero
		 */
		
		for (int i = P; i < Q; i++) {
			
			arrays[i] = P;
			P++;
			System.out.println(arrays[i]);
			
		}
		
	}

}
