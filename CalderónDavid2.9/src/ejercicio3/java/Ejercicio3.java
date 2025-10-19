/*Descripción: Programa que muestre los pares calculando que el resto de 0
 * Autor: David Calderón Navarro
 * Fecha: 17/10/2025
 */

package ejercicio3.java;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Hago un bucle para contar los numeros
		for(int contador = 0; contador <=200;contador++) {
			
			//Uso el condicional para mostrar los pares
			if(contador % 2 == 0) {
				
				System.out.print(contador + " ");
				
			}
			
			
		}
		
	}

}
