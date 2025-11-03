/*Descripción: Programa que mete en una matriz las tablas de multiplicar y las muestra
 * Autor:David Calderón Navarro
 * Fecha:30/10/2025
 */

package ejercicio2.java;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaro las constantes
		final int FILAS = 10;
		final int COLUMNAS = 10;
		
		//Declaro las variables
		int contador = 1;
		
		int[][] tabla = new int[FILAS][COLUMNAS];
		
		//Voy metiendo las tablas de multiplicar
		for (int i = 0; i < FILAS;i++) {
			for (int e = 1; e < COLUMNAS;e++) {
				
				tabla[i][e] = contador * e;
				
			}
			contador++;
			
		}
		//Muestro las tablas por filas
		for (int i = 0; i < COLUMNAS;i++) {
			for (int e = 0; e < FILAS;e++) {
				
				System.out.print(tabla[e][i] + "\t");
				
			}
			System.out.println();
			
		}
		
		
	}

}
