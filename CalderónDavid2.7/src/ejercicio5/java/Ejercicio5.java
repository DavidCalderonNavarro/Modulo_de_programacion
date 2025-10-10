/*Descripción: Pedirle al usuario dos numeros y que elija la opercación que quiera realizar
 * Autor:David Calderón Navarro
 * Fecha:10/10/2025
 */

package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Difno las variables y le pregunto por los numeros
		double num1;
		System.out.print("Introduzca el valor1: ");
		num1 = datos.nextInt();
		
		double num2;
		System.out.print("Introduzca el valor2: ");
		num2 = datos.nextInt();

		double operacion;
		System.out.println("Indique la operación que quiere realizar(Inserte un número): ");
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicación");
		System.out.println("(4) División");
		System.out.println("----------------");
		operacion = datos.nextInt();
		
		//Uso el condicional para saber que operacion quiere
		if (operacion == 1) {
			
			operacion = num1 + num2;
			System.out.println("La suma es: " + operacion);
		}else if (operacion == 2) {
			
			operacion = num1 - num2;
			System.out.println("La resta es: " + operacion);
			
		}else if (operacion == 3) {
			
			operacion = num1 * num2;
			System.out.println("La multiplicación es: " + operacion);
			
		}else if (operacion == 4) {
			
			operacion = num1 / num2;
			System.out.println("La división es: " + operacion);
			
		}else {//Si no introduce un numero del 1 al 4 dara error
			
			System.out.println("El número de opercación introducido es erróneo");
			
		}
		
	}

}
