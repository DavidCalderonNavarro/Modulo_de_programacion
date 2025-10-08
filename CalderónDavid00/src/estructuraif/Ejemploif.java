/*
 * Descripción: Pedir la edad y mostrar si es mayor de edad
 * Autor: David Calderón Navarro
 * Fecha: 02/10/2025
 */

package estructuraif;

import java.util.Scanner;

public class Ejemploif {

	public static void main(String[] args) {
		
		Scanner edad = new Scanner(System.in);
		
		int numedad;
		System.out.print("Dime tu edad: ");
		numedad = edad.nextInt();
		
		if ( (numedad >=18) || (numedad <=30) ) {
			
			System.out.println("Eres joven");
			
		}

	}

}
