/*Descripción: Le muestro al usuario sus datos obtenidos y la nota en formato palabra
 * Autor:David Calderón Navarro
 * Fecha:05/10/2025
 */

package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Le pido los datos al usuario
		String nombre;
		System.out.print("Dame tu nombre: ");
		nombre = datos.nextLine();
		
		String apellidos;
		System.out.print("Dame tus apellidos: ");
		apellidos = datos.nextLine();
		
		String ciclo;
		System.out.print("Dime tu ciclo formativo: ");
		ciclo = datos.nextLine();
		
		int nota;
		System.out.print("Dime tu nota académica sin decimales: ");
		nota = datos.nextInt();
		
		
		//Le muestro al usuario su nombre, apellidos, su ciclo y su nota
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Ciclo Formativo: " + ciclo);
		
		//Uso el condicional para saber que palabra pornerle en base a la nota que me da el usuario
		if (nota <= 4) {
			
			System.out.println("Nota académica: " + nota + " (Insuficiente)");
			
		 }else if (nota == 5){
			 
			 System.out.println("Nota académica: " + nota + " (Aprobado)");
			 
		 }else if (nota == 6) {
			 
			 System.out.println("Nota académica: " + nota + " (Bien)");
			 
		 }else if (nota == 7 || nota == 8) {
			 
			 System.out.println("Nota académica: " + nota + " (Notable)");
			 
		 }else {//Si no se da las anteriores, directamente debe ser un 9 o 10 lo que es sobresaliente
			 
			 System.out.println("Nota académica: " + nota + " (Sobresaliente)");
			 
		 }
			
			
			
			
		}

	}


