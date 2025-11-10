/*Descripción: Primer programa con arrays
 * Autor:David Calderón Navarro
 * Fecha:17/10/2025
 */

package vectores;

public class Ejemploarrrays1 {

	public static void main(String[] args) {
		
		final int TAMAYIO = 25;
		
		int[] numeros;//Declaramos array de enteros
		numeros = new int[TAMAYIO];//Instanciamos el array
		
		for (int posicion = 0; posicion < TAMAYIO; posicion++) {
			
			numeros[posicion] = (int)(Math.random()*50); //Inizializamos a 0 todas las posiciones
			
		}
		for (int posicion = 0;posicion < TAMAYIO; posicion++) {
			
			System.out.println("El valor de la posicion " + posicion + " es: " + numeros[posicion]);
			
			
		}

	}

}
