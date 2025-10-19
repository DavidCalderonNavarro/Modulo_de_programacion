/*Descripción: Programa que se introduce notas y si hay un 10 que lo muestre
 * Autor: David Calderón Navarro
 * Fecha: 18/10/2025
 */

package ejercicio10.java;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int nota = 0, notadiez = 0;
		
		//Uso bucle dowhile para preguntar la primera vez
		do {
			
			System.out.print("Dime una nota(-1 para terminar): ");
			nota = datos.nextInt();
			
			//Uso condicional para saber si introduce un 10
			if (nota == 10) {
				
				notadiez = nota;
				
			}
			
		//Si se introduce un -1 se acaba el bucle
		}while(nota!=-1);
		
		//Uso el condional para comprobar si ha introducido algun 10
		if (notadiez==10) {
			
			System.out.print("Tienes alguna nota con un 10");
		
		//Si no, se muestra la siguiente linea
		}else {
			
			System.out.print("No tienes ninguna nota con un 10");
			
		}
		
	}

}
