/*Descripción: Programa que pide a 5 alumnos sus notas y les dice la nota maxima, la minima y la media
 * Autor:David Calderón Navarro
 * Fecha:06/11/2025
 */

package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Creo dos constantes
		final int ALUMNOS = 4;
		final int ASIG = 5;
		
		//Declaro la matriz y las variables
		int[][] matriz = new int[ALUMNOS][ASIG];
		int contador = 0, contador2 = 0, nota, notamax = 0, notamin = 10, notamedia = 0, sumanotas = 0;
		
		//Meto las notas de los alumnos en la matriz
		for (int i = 0; i < ALUMNOS; i++) {
			
			contador++;
			
			for (int e = 0; e < ASIG; e++) {
				
				System.out.print("Dime tu nota alumno " + contador + " :");
				nota = datos.nextInt();
				
				matriz[i][e] = nota;
				
			}
			
		}
		
		//Compruebo cual es la nota maxima, minima y la media de cada alumno
		for (int i = 0; i < ALUMNOS; i++) {
			
			notamax = 0;
			notamin = 10;
			notamedia = 0;
			sumanotas = 0;
			contador2++;
			
			for (int e = 0; e < ASIG; e++) {
				
				
				//Nota maxima
				if (matriz[i][e] > notamax) {
					
					notamax = matriz[i][e];
				
				//Nota minima
				}else if (matriz[i][e] < notamin) {
					
					notamin = matriz[i][e];
				
				//Si no es ni maxima ni minima que no haga nada
				}else {}
			
				//Sumo las notas de cada alumno
				sumanotas = sumanotas + matriz[i][e];
				
			}
			
			//Hago la media de cada alumno
			notamedia = sumanotas / ASIG;
			
			//Le muestro el resultado a cada alumno
			System.out.println("Alumno " + contador2);
			System.out.println("La nota maxima a sido un " + notamax);
			System.out.println("La nota minima a sido un " + notamin);
			System.out.println("La media a sido un " + notamedia);
			
		}
		
		
		
		
	}

}
