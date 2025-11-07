/*Descripción: Programa que cuenta las vocales de la frase
 * Autor:David Calderón Navarro
 * Fecha:07/11/2025
 */

package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		String cadena;
		int A = 0, E = 0, I = 0, O = 0, U = 0;
		
		//Pido la frase al usuario
		System.out.print("Dime una frase: ");
		cadena = datos.nextLine();
		
		//Pongo toda la frase en minusculas
		cadena = cadena.toLowerCase();
		
		//Voy comprobando cuantas vocales hay en la frase
		for (int i = 0; i < cadena.length(); i++) {
			
			if (cadena.charAt(i) == 'a') {
				
				A++;
				
			}
			if(cadena.charAt(i) == 'e') {
				
				E++;
				
			}
			if(cadena.charAt(i) == 'i') {
				
				I++;
				
			}
			if(cadena.charAt(i) == 'o') {
				
				O++;
				
			}
			if(cadena.charAt(i) == 'u') {
				
				U++;
				
			}
			
			
		}
		
		//Muestro el numero de vocales que hay en la frase
		System.out.println("Nº de A's: " + A);
		System.out.println("Nº de E's: " + E);
		System.out.println("Nº de I's: " + I);
		System.out.println("Nº de O's: " + O);
		System.out.println("Nº de U's: " + U);
		
	}

}
