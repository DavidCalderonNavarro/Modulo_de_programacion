/*Descripción: Programa que mete en una matriz del 1 al 25 y lo muestra
 * Autor:David Calderón Navarro
 * Fecha:30/10/2025
 */

package ejercicio1.java;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Constante para el tamanyo
		final int FILAS = 5;
        final int COLUMNAS = 5;

        //Declaro la matriz
        int[][] num = new int[FILAS][COLUMNAS];

        int contador = 1;

        //Meto en la matriz del 1 al 25
        for (int e = 0; e < FILAS; e++) {
            for (int o = 0; o < COLUMNAS; o++) {
                num[e][o] = contador;
                contador++;
            }
        }

        //Muestro el contenido de la matriz
        for (int e = 0; e < FILAS; e++) {
            for (int o = 0; o < COLUMNAS; o++) {
                System.out.print(num[e][o] + "\t");
            }
            System.out.println();
        }
		
		
	}

}
