/*Descripción: Le muestro al usuario los numeros del 100 al 0 con dowhile
 * Autor:David Calderón Navarro
 * Fecha:15/10/2025
 */


package ejercicio3.java;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declaro las variables
		int inicio, fin;
				
		inicio = 100;
		fin = 1;
				
		//Utilizo el dowhile para hacer un bucle
		do {
					
			System.out.print(inicio + " ");
			inicio = inicio - 1;
								
		}while (inicio >= 0);
		
		
	}

}
