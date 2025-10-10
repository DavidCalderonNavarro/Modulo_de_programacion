/*
 * Descripción: 
 * Autor:David Calderón Navarro
 * Fecha:24/09/2025
 */

package dowhile;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num, suma = 0, contador = 0;
		
		do {
			
			System.out.print("Dame un número: (0 para terminar)");
			num = datos.nextInt();
			suma = suma + num;
			
			if (num != 0) {
				
				contador = contador + 1;
			}
		} while (num != 0);
		
		System.out.println("La suma es: " + suma);
		System.out.println("Has introducido: " + contador + " números");

	}

}
