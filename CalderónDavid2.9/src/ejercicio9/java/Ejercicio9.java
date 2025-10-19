/*Descripción: Programa que escribe la suma y el producto de los 10 primeros numeros
 * Autor: David Calderón Navarro
 * Fecha: 18/10/2025
 */

package ejercicio9.java;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Declaro variables
		int suma = 0, producto = 1;
		
		//Uso el bucle for para los 10 primeros numeros
		for (int contador = 0;contador <= 10;contador++) {
			
			
			suma = suma + contador;
			
			//Uso el condicional para multiplicar a partir de 1
			if (contador>0) {
				
				producto = producto*contador;
				
			}
			
			
		}
		
		//Muestro por pantalla el resultado
		System.out.println("La suma de los 10 primeros números naturales es: " + suma);
		System.out.println("El producto de los 10 primeros números naturales es: " + producto);
	}

}
