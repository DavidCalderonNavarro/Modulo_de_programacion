/*Descripción: Programa que calcula el porcentaje de dos numeros
 * Autor:David Calderón Navarro
 * Fecha:14/11/2025
 */

package ejercicio13.java;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int porcentaje, preciosin, preciocon;
		
		//Pido los datos al usuario
		System.out.print("Dime el precio sin el descuento aplicado: ");
		preciosin = datos.nextInt();
		System.out.print("Dime el precio con el descuento aplicado: ");
		preciocon = datos.nextInt();
		
		//Llamo al metodo
		porcentaje = porcentajeDescuento(preciosin, preciocon);
		
		//Muestro el resultado
		System.out.println("El descuento a sido del " + porcentaje + "%");
		
	}
	
	//Metodo para calcular el porcentaje de dos numeros, uno sin descuento y otro con
	public static int porcentajeDescuento(int a, int b) {
		
		int porcentaje, resta;
		
		resta = a - b;
		
		porcentaje = (resta * 100) / a;
		
		return porcentaje;
		
		
	}

}
