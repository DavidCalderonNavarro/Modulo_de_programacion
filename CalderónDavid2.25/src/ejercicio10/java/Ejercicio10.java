/*Descripción: Programa que dice si tu numero es par o divisible entre 5
 * Autor: David Calderón Navarro
 * Fecha: 22/10/2025
 */

package ejercicio10.java;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro la variable
		int num;
		System.out.print("Dime un numero: ");
		num = datos.nextInt();
		
		//Compruebo si es par
		if (num % 2 == 0) {
			
			System.out.println("Tu numero es par");
			
		}else {
			
			System.out.println("Tu numero es impar");
			
		}
		
		//Compruebo si es divisible entre 5
		if (num % 5 == 0) {
			
			System.out.println("Tu numero es divisible entre 5");
			
		}else {
			
			System.out.println("Tu numero no es divisible entre 5");
			
		}
		
	}

}
