/*Descripción: Programa que pide el tamanyo y el valor del arrays y lo muestra
 * Autor: David Calderón Navarro
 * Fecha: 23/10/2025
 */

package ejercicio6.java;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int N,M;
		
		System.out.println("Dime el tamaño del arrays: ");
		N = datos.nextInt();
		
		System.out.println("Dime el valor de las posciones del arrays: ");
		M = datos.nextInt();
		
		//Declaro el arrays con el tamanyo introducido
		int[] arrays = new int[N];
		
		//Uso bucle para que meta el valor m en todas las posiciones
		for (int i = 0; i < N; i++) {
			
			arrays[i] = M;
			System.out.println(M);
			
		}
		
	}

}
