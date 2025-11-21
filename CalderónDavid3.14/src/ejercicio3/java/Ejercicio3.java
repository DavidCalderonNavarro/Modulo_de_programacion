/*Descripción: Programa que pide dos valores y dice cual es el menor
 * Autor:David Calderón Navarro
 * Fecha:13/11/2025
 */

package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Decalro variables
		int resultado, valor1, valor2;
		
		//Pido los datos
		System.out.print("Dime un valor: ");
		valor1 = datos.nextInt();
		System.out.print("Dime el segundo valor: ");
		valor2 = datos.nextInt();
		
		//Llamo al metedo para calcular cual es el pequeño
		resultado = minimo(valor1, valor2);
		
		//Muestro el valor mas pequeño
		System.out.println("El valor mas pequeño es: " + resultado);
		
	}
	
	//Metedo para saber que valor es mas pequeño
	public static int minimo(int a, int b) {
		
		int resultado;
		
		if (a < b) {
			
			resultado = a;
			
		}else {
			
			resultado = b;
			
		}
		
		return resultado;
		
		
	}

}
