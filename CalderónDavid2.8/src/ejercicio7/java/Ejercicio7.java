/*Descripción: Creo un juego que el usuario tiene que adivinar un numero del 0 al 50
 * Autor:David Calderón Navarro
 * Fecha:16/10/2025
 */

package ejercicio7.java;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro las variables
		int num, numrandom = (int) (Math.random()*51);
		
		//Le explico de que va el juego
		System.out.println("Adivina el numero");
		
		
		//Utilizo el bucle dowhile porque si o si se va a ejecutar una vez
		do {
			
			System.out.println("Dime un numero del 0 al 50: ");
			num = datos.nextInt();
			
			
			//Uso el condional para saber si el numero es mayor o menor
			if(num < numrandom) {
				
				System.out.println("Mayor");
				
			}else if (num > numrandom){
				
				System.out.println("Menor");
				
			}else {//Si es el numero, le digo la siguiente linea
				
				System.out.println("Felicidades acertaste");
				
			}
			
		}while (num != numrandom);
		
		

	}

}
