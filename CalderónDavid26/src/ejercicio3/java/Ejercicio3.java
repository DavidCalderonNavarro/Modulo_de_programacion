/*Descripción: Le pido al usuario su edad si es mayor de edad le pido su nombre y apellidos
 * Autor:David Calderón Navarro
 * Fecha:04/10/2025
 */

package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Le pido la edad para guardarla
		int edad;
		System.out.print("Dame tu edad: ");
		edad = datos.nextInt();
		datos.nextLine();
		
		
		//Compruebo que es mayor de edad con un condicional
		if (edad < 18) {
			
			System.out.println("No tiene la edad requerida para realizar estos estudios");
			
		}else {
			
			//Si lo es le pido su nombre y apellido
			String nombre;
			System.out.print("Dime tu nombre: ");
			nombre = datos.nextLine();
			
			String apellidos;
			System.out.print("Dime tu apellidos: ");
			apellidos = datos.nextLine();
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Edad: " + edad);
			System.out.println(" ");
			System.out.println("Usted ha sido admitido");
			
		}

	}

}
