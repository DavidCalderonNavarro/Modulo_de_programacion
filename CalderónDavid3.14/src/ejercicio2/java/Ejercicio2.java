/*Descripción: Programa que te dice si eres mayor de edad o no
 * Autor:David Calderón Navarro
 * Fecha:10/11/2025
 */

package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int edad;
		boolean mayor;
		
		//Pregunto la edad
		System.out.print("Dime tu edad: ");
		edad = datos.nextInt();
		
		//Hago el metodo de comprobar si es mayor de edad
		mayor = esMayorEdad(edad);
		
		//Si da true es mayor de edad, si no es menor de edad
		if (mayor == true) {
			
			System.out.println("Eres mayor de edad");
			
		}else {
			
			System.out.println("No eres mayor de edad");
			
		}
		
		
	}
	/*Metodo para saber si la edad introducida es mayor de edad o no 
	*devolviendo un valor boolean
	*/
	public static boolean esMayorEdad (int a) {
		
		boolean mayor;
		
		if (a >= 18) {
			
			mayor = true;
			
		}else {
			
			mayor = false;
			
		}
		
		return mayor;
		
	}

}
