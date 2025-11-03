/*Descripción: Programa que guarda del 1 al 100 y los copia de forma inversa en otro
 * Autor: David Calderón Navarro
 * Fecha: 03/11/2025
 */

package ejercicio11.java;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Hago una constante para evitar los literales
		final int NUMEROS_TOTAL = 100;
		
		//Declaro los dos arrays
		int[] arrays1 = new int[NUMEROS_TOTAL];
		int[] arrays2 = new int[NUMEROS_TOTAL];
		
		//Declaro otras variables
		int contador = 0, e = -1;
		
		//Meto del 1 al 100 en el primer arrays
		for(int i = 0; i < NUMEROS_TOTAL; i++) {
			
			contador++;
			arrays1[i] = contador;
			
			
		}
		
		//Meto los valores del 1 al 100 copiandolos del primero y de forma invertida
		for (int i = 99; i >= 0; i--) {
			
			e++; 
			arrays2[e] = arrays1[i];
			
			
		}
		
		//Muestro los dos arrays
		for (int i = 0; i < NUMEROS_TOTAL; i++) {
			
			System.out.print(arrays1[i] + " ");
			
		}
		
		System.out.println("");
		
		for (int i = 0; i < NUMEROS_TOTAL; i++) {
			
			System.out.print(arrays2[i] + " ");
			
		}
		
	}

}
