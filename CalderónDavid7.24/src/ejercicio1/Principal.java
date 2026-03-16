/*Descripción: Pongo a prueba las dos clases creando tres objetos y mostrando su contenido
 * Autor:David Calderón Navarro
 * Fecha:12/02/2026
 */

package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro dos variables
		
		String nombre, apellido;
		
		//Objeto de la clase Humano
		
		Humano humano1 = new Humano("Pepe", "Dominguez");
		Humano humano2 = new Humano();
		
		//Muestro la informacion del humano2 antes de cambiarla
		
		System.out.println("-----------------------");
		System.out.println("Antes del cambio");
		System.out.println(humano2.getNombreCompleto());
		System.out.println("-----------------------");
		
		//Objeto de la clase Ciudadano
		
		Ciudadano ciudadano1 = new Ciudadano("Mario", "Perez", "08114685D");
		Ciudadano ciudadano2 = new Ciudadano("David", "Calderon", "73829194H");
		
		System.out.println("Dame tu nombre humano2: ");
		nombre = datos.nextLine();
		
		System.out.println("Dame tu apellido humano2: ");
		apellido = datos.nextLine();
		
		humano2.setNombre(nombre);
		humano2.setApellido(apellido);
		
		//Muestro la informacion del humano2 despues de cambiarla
		System.out.println("-----------------------");
		System.out.println("Despues del cambio");
		System.out.println(humano2.getNombreCompleto());
		System.out.println("-----------------------");
		
		//Muestro la info de todos los objetos
		
		System.out.println(humano1.getNombreCompleto());
		System.out.println(ciudadano1.getNombreCompleto());
		System.out.println(ciudadano2.getNombreCompleto());
		
		
		
	}

}
