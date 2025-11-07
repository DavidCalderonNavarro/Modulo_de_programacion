/*Descripción: Programa que lee y muestra las palabras de una cadena de caracteres
 * Autor:David Calderón Navarro
 * Fecha:07/11/2025
 */

package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro la variable cadena para guardala
		String cadena;
		System.out.print("Dame una cadena de caracteres: ");
		cadena = datos.nextLine();
		
		//Declaro el arrays palabras que tendra el tamanyo de la cadena
		String[] palabras = cadena.split(" ");
		
		//Hago un bucle para mostrar todas las palabras
		for (int i = 0; i < palabras.length; i++) {
		
		System.out.println(palabras[i]);
		
		}
	}

}
