/*Descripción: Programa que pide dos cadenas y las compara
 * Autor:David Calderón Navarro
 * Fecha:07/11/2025
 */

package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro dos variables
		String cadena1, cadena2;
		
		//Pregunto por las dos cadena de caaracteres
		System.out.print("Dime la primera frase: ");
		cadena1 = datos.nextLine();
		System.out.print("Dime la segunda frase: ");
		cadena2 = datos.nextLine();
		
		//Comparo la cadena1 con la cadena2 para saber si son iguales aun con las mayusculas
		if (cadena1.equals(cadena2)) {
			
			System.out.println("Las dos cadenas son iguales");
			
		}else {
			
			System.out.println("Las dos cadenas no son iguales");
			
		}
		
		//Comparo pero ahora sin importar las mayusculas
		if(cadena1.equalsIgnoreCase(cadena2)) {
			
			System.out.println("Las dos cadenas son iguales sin diferenciar las mayusculas");
			
		}else {
			
			System.out.println("Las dos cadenas no son iguales ni sin diferenciar las muysculas");
			
		}
		
		
		
	}

}
