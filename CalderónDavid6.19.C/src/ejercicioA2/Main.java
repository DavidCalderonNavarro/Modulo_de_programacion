/*Descripción: Instancio dos objetos y muestro los datos
 * Autor:David Calderón Navarro
 * Fecha:16/01/2026
 */

package ejercicioA2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Instancio dos objetos de la clase Persona
		
		Persona p1 = new Persona("08114685D", "David", "Calderon", 20);
		Persona p2 = new Persona("43819043L", "Pepe", "Garcia", 27);
		
		//Llamo al metodo para mostrar los datos
		
		mostrarMensaje(p1);
		mostrarMensaje(p2);
		
	}
	
	//Metodo para mostrar el mensaje de cada uno de ellos y no delvuelve nada
	public static void mostrarMensaje(Persona p) {
		
		if (p.edad >= 18) {
		
			System.out.println(p.nombre + " " + p.apellidos + " con DNI " + p.dni + " es mayor de edad");
		
		}else {
			
			System.out.println(p.nombre + " " + p.apellidos + " con DNI " + p.dni + " no es mayor de edad");
			
		}
		
	}
	

}
