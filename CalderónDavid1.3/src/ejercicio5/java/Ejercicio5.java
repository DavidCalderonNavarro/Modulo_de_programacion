/*
 * Descripción: Le muestro al usuario funciones math con sus números
 * Autor: David Calderón Navarro
 * Fecha: 03/10/2025
 */

package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		Scanner numeros = new Scanner(System.in);
		
		int num1;
		System.out.print("Dime el primer número: ");
		num1 = numeros.nextInt();
		
		int num2;
		System.out.print("Dime el segundo número: ");
		num2 = numeros.nextInt();
		
		
		//Delcaro las funciones math
		int nummenor = Math.min(num1, num2);
		int nummayor = Math.max(num1, num2);
		
		double numelevado = Math.pow(num1, num2);
		
		double numraiz = Math.sqrt(num1);
		
		double numrandom = Math.random();
		
		
		System.out.println("El número " + nummenor + " es menor que " + nummayor);
		System.out.println("Tu primer número elevado al segundo es " + numelevado);
		System.out.println("La raíz cuadrada del primer número es: " + numraiz);
		System.out.println("El número random del segundo es: " + numrandom);
		
		
	}

}
