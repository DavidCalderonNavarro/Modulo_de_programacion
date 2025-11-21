/*Descripción: Programa que calcula si tu numero es primo o no
 * Autor:David Calderón Navarro
 * Fecha:21/11/2025
 */

package ejercicio17.java;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int num;
		boolean primo;
		
		//Utilizo bucle do while para seguir hasta que ponga 0
		do {
			
			//Pregunto por el numero
			System.out.println(" ");
			System.out.print("Dime un numero(0 para acabar): ");
			num = datos.nextInt();
			System.out.println(" ");
			
			//Llamo al metodo
			primo = numPrimo(num);
			
			//Si es primo mostrara el siguiente mensaje
			if (primo == true) {
				
				System.out.println("Tu numero es primo");
				
			//Si no mostrara lo siguiente
			}else {
				
				System.out.println("Tu numero no es primo");
				
			}
				
		//Si es 0 para el bucle
		}while(num != 0);
		
	}
	
	//Metodo para saber si es primo o no y devuelve un boolean
	public static boolean numPrimo(int num) {
		
		boolean primo;
		
		if (num <= 1) {
			
			primo = false;
			return primo;
			
		}else {
		
		for (int i = 2; i < num; i++) {
			
			if (num % i == 0) {
				
				primo = false;
				return primo;
				
			}
			
		}
		
	}
		
		primo = true;
		return primo;

}
}
