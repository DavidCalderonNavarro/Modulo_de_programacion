/*Descripción: Programa que te pide la hora y te contesta
 * Autor: David Calderón Navarro
 * Fecha: 20/10/2025
 */

package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int hora;
		System.out.print("Dime la hora: ");
		hora = datos.nextInt();
		
		if (hora <= 12 && hora >= 6) {
			
			System.out.print("Buenos dias");
			
		}else if (hora <= 20 && hora >= 13) {
			
			System.out.print("Buenas tardes");
			
		}else if (hora <= 21 || hora<=5){
			
			System.out.print("Buenas noches");
			
		}
		
	}

}
