/*
 * Descripción: Voy a pedir al usurio datos de un equipo de futbol
 * Autor: David Calderón Navarro
 * Fecha: 25/09/2025
 */

package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);//Ponemos el scanner para pedir datos
		
		//Le pido al usuario los datos del equipo
		String nombreequipo;
		System.out.print("Dame el nombre del equipo de fútbol: ");
		nombreequipo = datos.nextLine();
		
		int año;
		System.out.print("Dame el año de fundación del equipo: ");
		año = datos.nextInt();
		
		datos.nextLine();
		
		String nombreestadio;
		System.out.print("Dame el nombre del estadio: ");
		nombreestadio = datos.nextLine();
		
		
		String nombrecapitan;
		System.out.print("Dame el nombre del capitan del equipo: ");
		nombrecapitan = datos.nextLine();
		
		System.out.println("Nombre del Equipo: " + nombreequipo);
		System.out.println("Fundado en: " + año);
		System.out.println("Estadio: " + nombreestadio);
		System.out.println("Capitán: " + nombrecapitan);
		
	}

}
