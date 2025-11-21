/*Descripción: Programa que pida tres numeros y muestra el menor de los tres
 * Autor:David Calderón Navarro
 * Fecha:14/11/2025
 */

package ejercicio9.java;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int a, b, c, menor;
		
		//Pido los valores
		System.out.println("Dime el primer valor: ");
		a = datos.nextInt();
		System.out.println("Dime el segundo valor: ");
		b = datos.nextInt();
		System.out.println("Dime el tercer valor: ");
		c = datos.nextInt();
		
		//Llamo al metodo para saber cual es el menor
		menor = menornum(a, b);
		
		//Llamo otra vez para ahora comprobar el que me queda
		menor = menornum(menor, c);
		
		//Muestro el resultado
		System.out.println("El menor es: " + menor);
		
	}
	
	//Metodo para saber que numero es menor 
	public static int menornum(int a, int b) {
		
		int menor;
		
		if (a < b) {
			
			menor = a;
			
		}else {
			
			menor = b;
			
		}
		
		return menor;
		
		
	}

}
