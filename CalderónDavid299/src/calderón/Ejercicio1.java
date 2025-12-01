/*Descripción: Programa que pide al usuario un inicio y un final y va comprobando si son multiplos de 3 y 5
 * Autor: David Calderón Navarro
 * Fecha: 12/11/2025
 */

package calderón;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int N, M, contador = 0;
		
		//Le pido los datos al usuario
		System.out.print("Dime el inicio: ");
		N = datos.nextInt();
		System.out.print("Dime el final: ");
		M = datos.nextInt();
		
		//Si el inicio es menor que el final pasa al bucle
		if (N < M) {
			
			//Uso el bucle for para ir pasando por todos los numeros entre el incio y el final
			for (int i = N; i <= M; i++) {
			
			//Si son multiplos de 3 y 5 se mostrara por pantalla
			if (i % 3 == 0 && i % 5 == 0) {
				
				System.out.println(i);
				contador++;
				
			}
			
			}
			
			//Si el contador esta en 0 significa que ninguna de los numeros era multiplo de 3 y 5
			if (contador == 0) {
				
				System.out.println("Ningun valor es primo de 3 y 5");
				
			}
			
		//Si no los valores son erroneos
		}else {
			
			System.out.println("Los valores intoducidos no son correctos");
			
		}
		
		
		
	}

}
