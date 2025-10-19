/*Descripción: Programa que calcula un numero elevado a otro utilizando solo el bucle
 * Autor: David Calderón Navarro
 * Fecha: 18/10/2025
 */

package ejercicio12.java;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int A,B, resultado = 1;
		System.out.print("El primer numero sera la base: ");//Pido la base
		A = datos.nextInt();
		System.out.print("El segundo numero sera el exponente: ");//Pido el exponente
		B = datos.nextInt();
		
		//Uso el buclo for para contar hasta el exponente
		for (int contador=0; contador<B; contador++) {
			
			
			resultado = resultado * A;
			
		}
		
		//Muestro elresultado
		System.out.println(A + " elevado a " + B + " es " + resultado);

	}

}
