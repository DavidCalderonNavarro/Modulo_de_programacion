/*Descripción: Programa que suma los pares e impares por separado de 100 a 200
 * Autor: David Calderón Navarro
 * Fecha: 18/10/2025
 */

package ejercicio11.java;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Declaro variables
		int sumapar = 0, sumaimpar = 0;
		
		//Uso el bucle for para contar de 100 a 200
		for (int contador = 100; contador<200; contador++) {
			
			//Uso condional para separar los numeros 
			if (contador % 2 == 0) {
				
				sumapar = sumapar + contador;
				
			}else {
				
				sumaimpar = sumaimpar + contador;
				
			}
			
			
		}
		
		//Muestro la suma de los pares e impares
		System.out.println("La suma de los pares entre 100 y 200 es: " + sumapar);
		System.out.println("La suma de los impares entre 100 y 200 es: " + sumaimpar);
		
	}
	
}
