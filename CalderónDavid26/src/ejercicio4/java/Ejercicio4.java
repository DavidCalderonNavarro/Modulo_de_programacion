/*Descripción: Comprobar si los clientes se han gastado mas de 300 euros en un mes y darles un descuento
 * Autor:David Calderón Navarro
 * Fecha:05/10/2025
 */

package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String nombre;
		System.out.print("Dime tu nombre: ");
		nombre = datos.nextLine();
		
		String apellidos;
		System.out.print("Dime tus apellidos: ");
		apellidos = datos.nextLine();
		
		int imp1;
		System.out.print("Dime tu primer importe: ");
		imp1 = datos.nextInt();
		
		int imp2;
		System.out.print("Dime tu segundo importe: ");
		imp2 = datos.nextInt();
		
		int imp3;
		System.out.print("Dime tu tercer importe: ");
		imp3 = datos.nextInt();
		
		int imp4;
		System.out.print("Dime tu cuarto importe: ");
		imp4 = datos.nextInt();
		
		int media;
		media = (imp1 + imp2 + imp3 + imp4)/4;
		
		//Muestro por pantalla al usuario su información:
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Importe Gastado1: " + imp1 + " euros");
		System.out.println("Importe Gastado2: " + imp2 + " euros");
		System.out.println("Importe Gastado3: " + imp3 + " euros");
		System.out.println("Importe Gastado4: " + imp4 + " euros");
		System.out.println(" ");
		System.out.println("Importe Medio: " + media + " euros");
		
		
		//Uso el condicional para comprobar si la suma de los importes superan los 300 euros:
		if (imp1 + imp2 + imp3 + imp4 >= 300){
			
			System.out.println(" ");
			System.out.println("Usted supera los 300 euros mesuales asi que tiene derecho a un vale de descuento de 50 euros.");
			
		//Si no le muestro el siguiente mensaje
		}else {
		
			System.out.println(" ");
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento.");
		
		}
	}

}
