/*
 * Descripción: Voy a pedir al usurio sus datos para luego darselos
 * Autor: David Calderón Navarro
 * Fecha: 25/09/2025
 */

package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);//Ponemos el scanner para pedir datos
		
		//Pedimos los datos al usuario:
		String nombre;
		System.out.print("Dame tu nombre: ");
		nombre = datos.nextLine();
		
		String apellidos;
		System.out.print("Dame tus apellidos: ");
		apellidos = datos.nextLine();
		
		String direccion;
		System.out.println("Dame tu direccion: ");
		direccion = datos.nextLine();
		
		int edad;
		System.out.print("Dame tu edad: ");
		edad = datos.nextInt();
		
		double altura;
		System.out.print("Dame tu altura: ");
		altura = datos.nextDouble();
		
		double peso;
		System.out.print("Dame tu peso: ");
		peso = datos.nextDouble();
		
		//Damos al usuario una vista de los datos pedidos:
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("Dirección: " + direccion);
		System.out.println("Altura: " + altura + " cm");
		System.out.println("Peso: " + peso + " kgs");

	}

}
