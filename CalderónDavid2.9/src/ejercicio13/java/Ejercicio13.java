/*Descripción: Programa que intenta adivinar el numero del usuario daldole si el numero es mayor, menor o igual
 * Autor: David Calderón Navarro
 * Fecha: 19/10/2025
 */

package ejercicio13.java;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int num, minimo = 0, maximo = 100;
		String palabra = "";
		
		//Uso bucle dowhile para que muestre el primer numero
		do {
			
			
			/*Declaro variable del numero random que esta entre 0 y 100
			 * No lo multiplico por 100 porque estaria en el rango del 0 al 100 todo el rato
			 * Voy sumando y restando para achicar el rango
			 */
			int numrandom = (int) (Math.random() * (maximo - minimo)) + minimo;
			System.out.println("Tu numero es: " + numrandom);
			System.out.println("Dile si es Mayor,Menor o igual");
			palabra = datos.nextLine();
			
			//Si es menor le resto 1 al numero que dijo la maquina
			if (palabra.equalsIgnoreCase("menor")) {
				
				maximo = numrandom - 1;
				
			//Si es mayor le suma 1	
			}else if (palabra.equalsIgnoreCase("mayor")){
				
				minimo = numrandom + 1;
				
			}
			
			
		//Si el usuario mete igual se acaba el programa
		}while(!palabra.equalsIgnoreCase("igual"));

	}

}
