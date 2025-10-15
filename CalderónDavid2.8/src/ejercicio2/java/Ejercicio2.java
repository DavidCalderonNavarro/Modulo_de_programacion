/*Descripción: Le muestro al usuario los numeros del 0 al 100 con dowhile
 * Autor:David Calderón Navarro
 * Fecha:15/10/2025
 */

package ejercicio2.java;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaro las variables
		int inicio, fin;
		
		inicio = 1;
		fin = 100;
		
		//Utilizo el dowhile para hacer un bucle
		do {
			
			System.out.print(inicio + " ");
			inicio = inicio + 1;
			
			
		}while (inicio <= 100);

	}

}
