/*Descripción: Programa que crea un arrays del tamanyo del usuario y mete valores aleatorios
 * Autor:David Calderón Navarro
 * Fecha:20/11/2025
 */

package ejercicio16.java;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variable
		int tamanyo;
		
		//Pido datos al usuario
		System.out.print("Dime el tamanyo del arrays: ");
		tamanyo = datos.nextInt();
		
		//Declaro el arrays
		int[] numeros = new int[tamanyo];
		
		//Llamo al metodo para crear el arrays con valores aleatorios
		crearArrays(numeros, tamanyo);
		
	}
	
	//Metodo para crear un arrays con valores aleatorios
	public static int[] crearArrays(int[] numeros, int a) {
		
		numeros = new int[a];
		
		for (int i = 0; i < a; i++) {
			
			numeros[i] = (int) (Math.random()*100);
			
		}
		
		return numeros;
		
	}

}
