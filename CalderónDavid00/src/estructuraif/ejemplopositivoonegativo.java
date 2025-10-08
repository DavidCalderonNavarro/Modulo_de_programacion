/*
 * Descripción: Decir al usuario si el número es negativo o positivo
 * Autor: David Calderón Navarro
 * Fecha: 03/10/2025
 */

package estructuraif;

import java.util.Scanner;

public class ejemplopositivoonegativo {

	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);
		
		int num1;
		System.out.print("Dame un número negativo o positivo: ");
		num1 = numeros.nextInt();

		if (num1 > 0) {//numero positivo
			
			System.out.println("Tu número es positivo");
			
			if (num1 > 50) {
			System.out.println("Tu número es mayor que 50");
			
			}
			
		} else {
			
			if (num1 == 0) {//numero 0
				System.out.println("Tu número es 0");		
		    } else {//numero negativo
		    	System.out.println("Tu número es negativo");	
		}
			
		}
	}

}
