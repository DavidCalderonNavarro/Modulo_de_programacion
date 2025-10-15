/*Descripción: Pedirle al usuario numeros positivos para sumarlos y mostrarle la cantidad que ha introducido
 * Autor:David Calderón Navarro
 * Fecha:15/10/2025
 */

package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro las variables
		int num = 0, suma, contador = 0;
		System.out.println("Dame un número positivo: ");
		num = datos.nextInt();
		suma = num;
		
		//Hago un bucle while porque a lo mejor no se necesita inicializar ni una vez
		while (num != 0) {
			System.out.println("Dame un número positivo: ");
			num = datos.nextInt();
			contador = contador + 1;
			suma = suma + num;
		
		}
		
		//Le muestro al usuario la suma y el contador
		System.out.println("La suma es: " + suma);
		System.out.println("La cantidad de números introducidos son: " + contador);
		
		
	}

}
