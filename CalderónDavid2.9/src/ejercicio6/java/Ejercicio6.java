/*Descripción: Programa que lee 100 numeros no nulos y muestra si se han metido negativos o no
 * Autor: David Calderón Navarro
 * Fecha: 17/10/2025
 */

package ejercicio6.java;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int num = 0, negativo = 0;
		
		//Hago un bucle for para contar los 100 numeros
		for (int contador = 0; contador < 100; contador++) {
			
			System.out.print("Dame un numero: ");
			num = datos.nextInt();
			
			//Uso condicional para guardar el numero negativo introducido en la variable negativo
			if (num < 0) {
				
				negativo = num;
				
			}
		}
		
		//Uso el condional para comprobar si negativo da menor que 0
		if( negativo < 0) {
			
			System.out.println("Has introducido un numero negativo");
			
		}else {
			
			System.out.println("No has introducido ningun numero negativo");
			
			
		}
		
	}

}
