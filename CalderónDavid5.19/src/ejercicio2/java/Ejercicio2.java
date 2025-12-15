/*Descripción: Programa que pide dos valores enteros y compureba con excepciones
 * Autor:David Calderón Navarro
 * Fecha:15/12/2025
 */

package ejercicio2.java;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		//Declaro variables
		int A = 0, B = 0;
		double resultado;
		
		//Trato excepcion
		try {

			System.out.println("Dime un numero entero: ");
			A = datos.nextInt();

		} catch (InputMismatchException ex1) {

			System.out.println("Valor introducido incorrecto");

			// Muestro la pila de llamadas
			ex1.printStackTrace();

		}
		
		//Trato excepcion
		try {

			System.out.println("Dime un numero entero: ");
			B = datos.nextInt();

		} catch (InputMismatchException ex2) {

			System.out.println("Valor introducido incorrecto");

			// Muestro la pila de llamadas
			ex2.printStackTrace();

		}
		
		//Trato excepcion
		try {
			
			resultado = division(A, B);
			System.out.printf("Resultado : %.2f" , resultado);
			
		}catch (ArithmeticException ex3) {
			
			System.out.println("Valor introducido incorrecto");
			
			//Muestro la pila de llamadas
			ex3.printStackTrace();
			
		}
		
		

	}
	//Metodo que calcula la division de dos enteros
	public static double division(int A, int B) {

		double calculo;

		calculo = A / B;

		return calculo;

	}

}
