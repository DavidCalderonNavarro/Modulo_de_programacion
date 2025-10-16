/*Descripción: Contar 10 numeros y hacer la media de los positivos, negativos y contar los 0 introducidos
 * Autor:David Calderón Navarro
 * Fecha:16/10/2025
 */

package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		
		//Declaro variables
		double suma = 0, sumamenos = 0, contadormas = 0, contadormenos = 0, ceros = 0;
		
		
		//Utilizo el bucle for porque se que solo va a contar 10 números exactos
		for (int contador = 0;contador < 10; contador++) {
			
			System.out.print("Dame un número: ");
			double num = datos.nextInt();
			
			//Utilizo el condicional if para contar bien los numeros introducidos
			if (num > 0) {
				
				suma = suma + num;
				contadormas++;
				
			}else if (num < 0){
				
				sumamenos = sumamenos+ num;
				contadormenos++;
				
			}else {
				
				ceros++;
					
			}
		}
		
		//Hago la media de la suma de ambos
		suma = suma / contadormas;
		sumamenos = sumamenos / contadormenos;
		
		//Muestro por pantalla el resultado
		System.out.println("La media de los números positivos es " + suma);
		System.out.println("La media de los números negativos es " + sumamenos);
		System.out.println("Los ceros introducidos son: " + ceros);


	}

}
