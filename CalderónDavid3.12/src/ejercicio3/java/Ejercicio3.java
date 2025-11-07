/*Descripción: Programa que coge las 3 primeras letra de tu nombre y apellidos y los vuelve en mayuscula
 * Autor:David Calderón Navarro
 * Fecha:07/11/2025
 */

package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		String nombre, apellido1, apellido2;
		
		//Pido los datos al usuario
		System.out.print("Dime tu nombre: ");
		nombre = datos.nextLine();
		System.out.print("Dime tu primer apellido: ");
		apellido1 = datos.nextLine();
		System.out.print("Dime tu segundo apellido: ");
		apellido2 = datos.nextLine();
		
		//Muestro al usuario en mayuscula y las tres primeras letras
		nombre = nombre.toUpperCase();
		System.out.print(nombre.substring(0,3));
		
		apellido1 = apellido1.toUpperCase();
		System.out.print(apellido1.substring(0,3));
		
		apellido2 = apellido2.toUpperCase();
		System.out.print(apellido2.substring(0,3));
		
	}

}
