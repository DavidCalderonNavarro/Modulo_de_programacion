/*Descripción: Programa que pide el dia de la semana y da la asginatura de la primera hora
 * Autor: David Calderón Navarro
 * Fecha: 20/10/2025
 */

package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String dia = "";
		System.out.print("Dime un dia de la semana: ");
		dia = datos.nextLine();
		
		if (dia.equalsIgnoreCase("Lunes")){
			
			System.out.print("A primera hora tienes Base de datos");
			
		}else if (dia.equalsIgnoreCase("Martes")) {
			
			System.out.print("A primera hora tienes IPE");
			
		}else if (dia.equalsIgnoreCase("Miercoles")) {
			
			System.out.print("A primera hora tienes Digitalizacion");
			
		}else if (dia.equalsIgnoreCase("Jueves")) {
			
			System.out.print("A primera hora tienes Programacion");
			
		}else if (dia.equalsIgnoreCase("Viernes")) {
			
			System.out.print("A primera hora tienes Sistemas Informaticos");
			
		}
		
	}

}
