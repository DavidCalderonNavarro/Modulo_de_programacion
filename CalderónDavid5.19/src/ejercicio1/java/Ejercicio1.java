/*Descripción: Programa que pide al usuario un entero y lanza excepcion si no introduce el valor correcto
 * Autor:David Calderón Navarro
 * Fecha:15/12/2025
 */

package ejercicio1.java;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variable
		int A;
		
		//Trato excepcion
		try {
			
			System.out.println("Dime un valor entero: ");
			A = datos.nextInt();
			
		}catch (InputMismatchException ex1) {
			
			
			System.out.println("Valor introducido incorrecto");
			
			//Muestro la pila de llamadas
			ex1.printStackTrace();
			
			
		}
		
		
		
	}

}
