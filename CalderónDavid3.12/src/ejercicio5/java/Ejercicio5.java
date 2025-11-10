/*Descripción: Programa que comprueba si la frase es un palindromo o no
 * Autor:David Calderón Navarro
 * Fecha:10/11/2025
 */

package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		String cadena, cadena2 = "";
		//Pregunto al usuario por la frase
		System.out.print("Dime una frase palíndromo: ");
		cadena = datos.nextLine();
		cadena = cadena.toLowerCase();//Pongo todo en minuscula
		cadena = cadena.replace(" ", "");//Para cambiar un caracter por otro
		
		//Hago bucle para invertir la frase caracter a caracter
		for (int i = cadena.length() - 1; i >= 0; i--) {
			
			cadena2 = cadena2 + cadena.charAt(i);
			
		}
		
		//Uso el condicional para comparar si las frases son iguales
		if (cadena.equals(cadena2)) {
			
			System.out.println("La frase si es un palindromo");
			
		}else {
			
			System.out.println("La frase no es un palindromo");
			
		}
	}
}