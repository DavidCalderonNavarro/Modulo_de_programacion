/*Descripción: Programa que lanza un menu para meter o mostrar valores indefinidamente hasta que el usuario meta c
 * Autor: David Calderón Navarro
 * Fecha: 03/11/2025
 */

package ejercicio12.java;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Hago una constante para evitar literales
		final int NUMEROS_TOTAL = 10;
		
		//Declaro variables
		String opcion;
		int num, posicion;
		int[] arrays = new int [NUMEROS_TOTAL];
		
		//Hago un do while por que puede meter las veces que el usuario quiera
		do {
			
			//Pregunto que opcion quiere
			System.out.println("\na. Mostrar valores. \nb. Introducir valor. \nc. Salir");
			opcion = datos.next();
			
			//Si es a mostrara los valores que tenga el arrays
			if (opcion.equalsIgnoreCase("a")) {
				
				for (int e = 0; e < NUMEROS_TOTAL; e++) {
					
					System.out.print(arrays[e]);
					System.out.print(" ");
					
				}
			
			//Si es b le pedira el valor y la posicion y lo metera
			}else if (opcion.equalsIgnoreCase("b")) {
				
				System.out.print("Dime un valor: ");
				num = datos.nextInt();
				
				System.out.print("Dime la posicion en la que lo guardaras: ");
				posicion = datos.nextInt();
				
				arrays[posicion] = num;
				
			//Si mete c se acabara el programa
			}else if (opcion.equalsIgnoreCase("c")) {
				
				
			}
		
		//Mientras la opcion no sea igual a "c", seguira ejecutandose
		}while(!opcion.equalsIgnoreCase("c"));
		
	}

}
