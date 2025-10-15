/*Descripción: Le muestro al usuario los números del 1 al 100
 * Autor:David Calderón Navarro
 * Fecha:15/10/2025
 */

package ejercicio1.java;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Escribo las variables
		int inicio, fin;
		inicio = 1;
		fin = 100;
		
		//Utilizo el while para crear un bucle hasta llegar a 100
		while (inicio <= fin) {
			
			System.out.print(inicio + " ");
			inicio = inicio + 1;
			
		}

	}

}
