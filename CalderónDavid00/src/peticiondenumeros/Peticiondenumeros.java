/*
 * Descripción: Pedir al usuario numeros para sumar
 * Autor: David Calderón Navarro
 * Fecha: 25/09/2025
 */

package peticiondenumeros;

import java.util.Scanner;

public class Peticiondenumeros {

	public static void main(String[] args) {
		
		Scanner num = new Scanner (System.in);
		
		int num1;
		System.out.print("Dame un primer número entero: ");
		num1 = num.nextInt();
		
		int num2;
		System.out.print("Dame un segundo número entero: ");
		num2 = num.nextInt();
		
		int suma;
		suma = num1 + num2;
		System.out.println("La suma de tus números es: " + suma);
		
		int num3;
		System.out.print("Dame un primer número entero: ");
		num3 = num.nextInt();
		
		int num4;
		System.out.print("Dame un segundo número entero: ");
		num4 = num.nextInt();
		
		int resta;
		resta = num3 - num4;
		System.out.println("La resta de tus números es: " + resta);
		
		double num5;
		System.out.print("Dame un primer número: ");
		num5 = num.nextDouble();
		
		double num6;
		System.out.print("Dame un segundo número: ");
		num6 = num.nextDouble();
		
		double division;
		division = num5 / num6;
		System.out.println("La división de tus números es: " + division);
		
	}

}
