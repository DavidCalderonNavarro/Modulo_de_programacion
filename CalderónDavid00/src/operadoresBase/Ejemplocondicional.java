/*
 * Descripción: Como funciona el operador condicioanl
 * Autor: David Calderón Navarro
 * Fecha: 26/09/2025
 */

package operadoresBase;

import java.util.Scanner;

public class Ejemplocondicional {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String nombre;
		System.out.print("Dime tu nombre: ");
		nombre = datos.nextLine();
		int longitud = nombre.length();
		System.out.println("Número de caracteres: " + longitud);
		
		String mayusculas;
		mayusculas = nombre.toUpperCase();
		System.out.println("Tu nombre en mayusculas: " + mayusculas);
		
		System.out.println("Tu nombre en minusculas: " + nombre.toLowerCase());
	

		boolean esPepe;
		nombre = nombre.toLowerCase();
		esPepe = nombre.equals("pepe");
		System.out.print(esPepe);

		/*
		int edad;
		System.out.print("Dime tu edad: ");
		edad = datos.nextInt();
		
		String mayorEdad;
		mayorEdad = (edad > 18) ? "Eres mayor de edad" : "Eres menor de edad" ;
		System.out.println(mayorEdad);
		
*/
	}

}
