/*Descripción: Programa que pide una secuencia aritmetica al usuario y lo guarda en un arrays y luego muestra
 * Autor: David Calderón Navarro
 * Fecha: 04/11/2025
 */

package ejercicio13.java;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int valor, numvalor, incremento;
		
		//Recogo los datos del usuario
		System.out.print("Dime cuantos valores quieres poner por pantalla: ");
		numvalor = datos.nextInt();
		
		System.out.print("Dime en que valor quieres empezar: ");
		valor = datos.nextInt();
		
		System.out.print("Dime cuanto le quieres sumar: ");
		incremento = datos.nextInt();
		
		//Declaro el arrays
		int[] arrays = new int[numvalor];
		
		//Meto el valor y lo sumo con el incremento en el arrays
		for (int i = 0; i < numvalor; i++) {
			
			arrays[i] = valor;
			
			valor = valor + incremento;
			
		}
		
		//Muestro los valores del arrays
		for (int e = 0; e < numvalor; e++) {
			
			System.out.print(arrays[e] + " ");
			
		}
		
		
	}

}
