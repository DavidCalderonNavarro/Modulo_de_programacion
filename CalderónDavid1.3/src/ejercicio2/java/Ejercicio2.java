/*
 * Descripción: Voy a hacer un conversor de euros a pesetas y viceversa
 * Autor: David Calderón Navarro
 * Fecha: 01/10/2025
 */

package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);
		
		double euros;//Conversor de euros a pesetas
		System.out.print("Dime la cantidad de euros que quieras pasar a pesetas: ");
		euros = numeros.nextDouble();
		euros = euros * 166.386;
		System.out.println("Tus euros a pesetas son " + euros);
		
		double pesetas;//Conversor de pesetas a euros
		System.out.print("Dime la cantidad de pesetas que quieres pasar a euros: ");
		pesetas = numeros.nextDouble();
		pesetas = pesetas / 166.386;
		
		System.out.println("Tus pesetas a euros son " + pesetas);
		

	}

}
