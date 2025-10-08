/*Descripción: Le pido al usuario nombre, edad y nota y compruebo si cumple con la edad y la nota
 * Autor:David Calderón Navarro
 * Fecha:04/10/2025
 */

package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);

		
		//Le pido los datos al usuario y los guardo
		String nombre;
		System.out.print("Dime tu nombre: ");
		nombre = datos.next();
		
		int edad;
		System.out.print("Dime tu edad: ");
		edad = datos.nextInt();
		
		double nota;
		System.out.print("Dime tu nota: ");
		nota = datos.nextDouble();
		
		
		//Uso el condicional para comprobar los requisitos de edad y nota a la vez ya que tiene que cumplir las dos si o si
		if (edad >=18 && nota >= 7) {
			
			System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas.");
				
		}else {
			
			System.out.println(nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mímnimos");
			
		}
		
		
		
	}

}
