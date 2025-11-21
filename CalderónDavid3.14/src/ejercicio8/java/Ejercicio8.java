/*Descripción: Programa que un valor y haze el sumatorio, producto e intermedio
 * Autor:David Calderón Navarro
 * Fecha:14/11/2025
 */

package ejercicio8.java;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		double resultado;
		int suma, producto, N;
		
		//Le pido el valor
		System.out.print("Dime un valor: ");
		N = datos.nextInt();
		
		//Llamo al metodo para el sumatorio
		suma = suma1aN(N);
		
		//Llamo al metedo para el producto
		producto = producto1aN(N);
		
		//Llamo al metodo para el intermedio
		resultado = intermedio1aN(N);
		
		//Muestro el resultado por pantalla
		System.out.println("La suma de 1 a tu valor es: " + suma);
		System.out.println("El producto de 1 a tu valor es: " + producto);
		System.out.println("El intermedio de 1 a tu valor es: " + resultado);
		
	}
	
	//Metodo que calcula la suma de los enteros de 1 a N
	public static int suma1aN(int n) {
		
		int suma = 0;
		
		for (int i = 1; i <= n; i++) {
			
			suma = suma + i;
			
		}
		
		return suma;
		
	}
	
	//Metodo que calcula el productos de los enteros de 1 a N
	public static int producto1aN(int n) {
		
		int producto = 1;
		
		for (int i = 1; i <= n; i++) {
			
			producto = producto * i;
			
		}
		
		return producto;
		
		
	}
	
	//Metodo que calcula el intermedio desde 1 a N
	public static double intermedio1aN(int n) {
		
		double resultado;
		
		resultado = n / 2.0;
		
		return resultado;
		
	}

}
