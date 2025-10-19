/*Descripción: Programa que pide 100 numeros y cuenta los positivos y negativos
 * Autor: David Calderón Navarro
 * Fecha: 18/10/2025
 */

package ejercicio7.java;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int num = 0, negativo = 0,contadorpos = 0, contadorneg = 0;
		
		//Hago un bucle for para contar los 100 numeros
		for (int contador = 0; contador < 100; contador++) {
			
			System.out.print("Dame un numero: ");
			num = datos.nextInt();
				
			//Uso el condicional para contar los positivos y negativos
				if (num>0) {
					
					contadorpos++;
					
				}else {
					
					contadorneg++;
					
				}
		}
		
		//Muestro por pantalla el resultado
		System.out.println("Has introducido " + contadorpos + " números positivos");
		System.out.println("Has introducido " + contadorneg + " números negativos");

	}

}
