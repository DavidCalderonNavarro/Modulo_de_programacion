/*Descripción: Programa que muestra una piramide con valores del usuario
 * Autor:David Calderón Navarro
 * Fecha:17/11/2025
 */

package ejercicio14.java;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro vairables
		String caracter;
		int num;
		
		//Le pido los valores
		System.out.print("Dime el numero de lineas de la piramide: ");
		num = datos.nextInt();
		System.out.print("Dime el caracter de la piramide: ");
		caracter = datos.next();
		
		//Llamo al metodo
		piramide(num, caracter);
		
	}
	
	//Metodo que muestra una piramide
	public static void piramide(int a, String b) {
		
		for (int i = 0; i < a; i++) {

	        for (int espacio = 0; espacio < a - i - 1; espacio++) {
	            System.out.print(" ");
	        }

	        for (int car = 0; car < 2 * i + 1; car++) {
	            System.out.print(b);
	        }

	        System.out.println();
	    }
		
		
	}

}
