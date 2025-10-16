/*Descripción: Darle al usuario el cuadrado del numero positivo introducido
 * Autor:David Calderón Navarro
 * Fecha:16/10/2025
 */

package ejercicio6.java;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro la variable
		int num;
		
		//Uso el bucle dowhile porque si o si se ejecutara una vez
		do {
			
			System.out.print("Dime un número positivo: ");
			num = datos.nextInt();
			
			
			//Uso el condicional para saber si es positivo o negativo
			if (num > 0) {
				
				System.out.println("El cuadrado de " + num + " es: " + (num*num));
				
				
			}else {
				
				System.out.println("El número introducido es erroneo");
				
			}
			
		//Mientras el numero sea mayor que 0, se seguira ejecutando	
		}while (num > 0); 
		
		
		
	}

}
