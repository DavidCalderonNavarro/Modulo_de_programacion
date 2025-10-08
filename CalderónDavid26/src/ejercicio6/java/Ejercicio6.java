/*Descripción: Le pido al usuario sus datos y la nota y le muestro en formato palabra su nota y si no esta dentro del 0 al 10 le muestro error
 * Autor:David Calderón Navarro
 * Fecha:05/10/2025
 */

package ejercicio6.java;

import java.util.Scanner;

public class Ejercicio6 {

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
		if (nota < 0 || nota > 10) {
			//Si la nota es incorrecta, el programa deja de ejecutarse
			System.out.println("La nota académica indicada es incorrecta");
			
		}else if (nota <= 4) {
					
			System.out.println("Nota académica: " + nota + " (Insuficiente)");
					
		}else if (nota == 5){
					 
			 System.out.println("Nota académica: " + nota + " (Aprobado)");
					 
		}else if (nota == 6) {
					 
			 System.out.println("Nota académica: " + nota + " (Bien)");
					 
		}else if (nota == 7 || nota == 8) {
					 
			 System.out.println("Nota académica: " + nota + " (Notable)");
					 
		}else if (nota == 9){
					 
			 System.out.println("Nota académica: " + nota + " (Sobresaliente)");
					 
		}else {//Si no es ninguna de las anteriores, es un 10
			
			 System.out.println("Nota académica: " + nota + " (Matrícula de Honor)");
		}
		
	}

}
