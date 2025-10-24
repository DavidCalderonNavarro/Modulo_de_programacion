/*Descripción: Programa que te pide un numero real entre 0.0 y 1.0 y te da los iguales o superiores
 * Autor: David Calderón Navarro
 * Fecha: 24/10/2025
 */

package ejercicio8.java;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Hago una constante para evitar los literales
		final int NUMEROS_TOTAL = 100;
		
		//Declaro el arrays
		double[] arrays = new double[NUMEROS_TOTAL];
		
		//Creo bucle para darle valor random en todas las posiciones en el arrays
		for (int i = 0;i < NUMEROS_TOTAL;i++) {
			
			arrays[i] = (double) (Math.random()*1.0);
			
		}
		
		//Declaro la variable num donde ira el numero del usuario
		double num;
		System.out.print("Dame un valor real entre 0.0 hasta 1.0: ");
		num = datos.nextDouble();
		
		//Hago bucle para ir comparando elnumero del usuario con los random
		for (int contador = 0; contador < NUMEROS_TOTAL;contador++) {
			
			if (arrays[contador] > num || arrays[contador] == num) {
				
				System.out.println(arrays[contador]);
			
			}
			
		}
		
	}

}
