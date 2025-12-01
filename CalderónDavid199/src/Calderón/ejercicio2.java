/*Descripción: Programa que te dice el siglo y los anyos que quedan, hanpasado o si es igual al 2025
 * Autor: David Calderón Navarro
 * Fecha: 29/10/2025
 */

package Calderón;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int anyo = 0,intentos = 0, anterior = 0, igual, posterior = 0, contador = 0;
		
		//Utilizo el dowhile porque si o si prguntare una vez el anyo
		do {
		
		if (intentos != 3) {
			
		//Pregunto el anyo
		System.out.print("Dime un anyo entre 1801 y 2100(-1 para finalizar): ");
		anyo = datos.nextInt();
		
		System.out.println(" ");
		System.out.println("RESULTADO");
		System.out.println("----------");
		
		//Si no esta en el rango le muestro un error
		if (anyo < 1801 || anyo > 2100) {
			
			/*Uso este condicional para que cunado el usuario quiera acabar el 
			 * programa no le salgo el mensaje de error
			 */
			
			if (anyo != -1) {
			System.out.println("El anyo no esta en ese rango");
			intentos++;
			}else {
				
			}
		}else {
			
			//En este if anidado comprueba de que siglo es el anyo introducido por el usuario
			if (anyo <1901 && anyo >= 1801) {
				
				System.out.println("Es el siglo XIX");
				
			}else if (anyo < 2000 && anyo >= 1901) {
				
				System.out.println("Es el siglo XX");
				
			}else {
				
				System.out.println("Es el siglo XXI");
				
			}
			
			/*
			 * En este otro if anidado compruebo si el anyo introducido es mayor,
			 * menor o igual que 2025 
			 */
			
			if (anyo > 2025) {
				
				//Uso el for para contar desde el 2025 al anyo introducido
				for (int i = 2025; i < anyo; i++) {
					
					contador++;
					posterior = contador;
					
				}
				//Le muestro el resultado por pantalla
				System.out.println("Han pasado " + posterior + " anyo(s) desde 2025");
				contador = 0;//Pongo el contador a 0 para que no me sume los anteriores
			}else if (anyo < 2025) {
				
				//Uso el for para contar desde el anyo del usuario hasta el 2025
				for (int i = anyo; i < 2025; i++) {
					
					
					contador++;
					anterior = contador;
					
				}
				//Le muestro el resultado por pantalla
				System.out.println("Faltan " + anterior + " anyo(s) para 2025");
				contador = 0;//Pongo el contador a 0 para que no me sume los anteriores
			}else {
				
				//Si es igual se lo muestro por pantalla
				System.out.println("El anyo introducido es igual al actual");
				
			}
			
			
			
			
			
		}
		}
		
		//Mientras el usuario no introduzca -1, el programa seguira ejecutandose
		}while(anyo != -1);
		
		
	}

}
