/*Descripción: Programa que pide un numero y muestra su tabla de multiplicar
 * Autor:David Calderón Navarro
 * Fecha:14/11/2025
 */

package ejercicio11.java;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variable
		int multi, num;
		
		//Pido el numero
		System.out.print("Dime un numero: ");
		num = datos.nextInt();
		
		//Lamo al metodo para que me muestre por pantalla la tabla del numero
		tablaMultiplicar(num);
		
	}
	
	//Metodo que muestra la tabla de multiplicar de numero introducido
	public static void tablaMultiplicar(int a) {
		
		int multi;
		
		for (int i = 1; i <= 10; i++) {
			
			multi = a * i;
			System.out.println(a + " x " + i + " = " + multi);
		
		}
		
		
		
	}

}
