/*Descripción: Programa que pide 5 rutas al usuario y luego le muestra la media de 
 * Autor:David Calderón Navarro
 * Fecha:16/10/2025
 */

package ejercicio8.java;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String nombre, mayorciudad = "";
		System.out.print("Dime tu nombre: ");
		nombre = datos.nextLine();
		
		String apellidos;
		System.out.print("Dime tus apellidos: ");
		apellidos = datos.nextLine();
		
		int edad, numrutas, contador;
		double distultima, distancia = 0, suma = 0, mayordistancia = 0;
		
		do {
			
			System.out.print("Dime tu edad: ");
			edad = datos.nextInt();
			
			if (edad > 17 && edad < 45) {
				
				
			}else {
				
				System.out.println("Esa edad no es correcta");
				
			}
			
			
		}while (edad < 17 || edad > 45);
		
		System.out.print("Dime el numero de rutas realizadas: ");
		numrutas = datos.nextInt();
		
		System.out.print("Dime la distancia de la ultima ruta: ");
		distultima = datos.nextDouble();
		
		for (contador = 1; contador <=5; contador++) {
			
			System.out.println(" ");
			System.out.print("Dime la distancia de la ruta " + contador + " en km: ");
			distancia = datos.nextDouble();
			suma = suma + distancia;
			
			System.out.print("Dime el número de participantes: ");
			int numparticipantes = datos.nextInt();
			datos.nextLine();
			
			System.out.print("Dime la ciudad: ");
			String ciudad = datos.nextLine();
			
			if (distancia > mayordistancia) {
				
				mayordistancia = distancia;
				mayorciudad = ciudad;
				
			}
			
		}
		
		double media = suma / 5;
		
		System.out.println("---------------------------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Número de rutas realizadas: " + numrutas);
		System.out.println(" ");
		System.out.println("Distancia media(5 últimas rutas): " + media);
		System.out.println("Distancia más larga de las últimas 5 rutas: " + mayordistancia);
		System.out.println("Ciudad de la ruta más larga: " + mayorciudad);
		System.out.println("---------------------------------");
	}

}
