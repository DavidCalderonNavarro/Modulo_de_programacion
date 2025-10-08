/*Descripción: Voy a pedirle al usuario dos numeros y decirle si uno es mayor que otro o son iguales
 * Autor:David Calderón Navarro
 * Fecha:04/10/2025
 */

package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num1;
		System.out.print("Dime un número: ");//Le pido al usuario el primer número
		num1 = datos.nextInt();
		
		int num2;
		System.out.print("Dime otro número: ");//Le pido al usuario el segundo número
		num2 = datos.nextInt();
		
		
/*Declaro el condicional para 3 posibles resultados 
 * como que num1 es mayor que num2, que num2 es mayor
 * que num1 o que los dos son iguales
 */
		if (num1 > num2){
			
			System.out.println(num1 + " es mayor que " + num2);
			
		}else if (num1 == num2){
			
			System.out.println(num1 + " es igual que " +num2);
			
			
		}else {
		
		System.out.println(num2 + " es mayor que " +num1);
		}
	}

}
