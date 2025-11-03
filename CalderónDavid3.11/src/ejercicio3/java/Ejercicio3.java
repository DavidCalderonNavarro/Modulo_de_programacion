/*Descripción: Programa que pide el tamanyo de la matriz y los valores de dentro y luego muestras cuantos son positivos, negativos y ceros
 * Autor:David Calderón Navarro
 * Fecha:31/10/2025
 */

package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int fila, columna, mayor = 0, menor = 0, ceros = 0;
		
		//Le pido el tamanyo de la matriz
		System.out.println("Dime el valor de las filas: ");
		fila = datos.nextInt();
		
		System.out.println("Dime el valor de las columnas: ");
		columna = datos.nextInt();
		
		//Despues creo la matriz
		int [][] matriz = new int [fila][columna];
		
		//Voy metiendo los valores que me da
		for (int i = 0; i < fila; i++) {
			
			for (int e = 0; e < columna; e++) {
				
				int num;
				System.out.println("Dime el valor de la posicion: ");
				num = datos.nextInt();
				
				matriz[i][e] = num;
				
				//Aqui compruebo que numeros son positivos, negativos y ceros
				if (num > 0) {
					
					mayor++;
					
				}else if (num < 0) {
					
					menor++;
					
				}else {
					
					ceros++;
					
				}
				
			}
			
			
		}
		
		//Aqui le muestro los datos introducidos
		for (int i = 0; i < fila; i++) {
			
			for (int e = 0; e < columna; e++) {
				
				System.out.print(matriz[i][e] + " ");
				
			}
			
			
		}
		
		System.out.println("");
		
		//Aqui muestro cuantos son positivos, negativos y ceros
		System.out.println(mayor + " son positivos");
		System.out.println(menor + " son negativos");
		System.out.println(ceros + " son ceros");
		
	}

}
