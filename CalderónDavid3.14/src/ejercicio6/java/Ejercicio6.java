/*Descripción: Programa que suma el 21 de iva a un precio
 * Autor:David Calderón Navarro
 * Fecha:13/11/2025
 */

package ejercicio6.java;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		double resultado, precio1, precio2, precio3, precio4, precio5;
		
		//Pido los 5 precios
		System.out.print("Dime el primer precio: ");
		precio1 = datos.nextDouble();
		System.out.print("Dime el segundo precio: ");
		precio2 = datos.nextDouble();
		System.out.print("Dime el tercer precio: ");
		precio3 = datos.nextDouble();
		System.out.print("Dime el cuarto precio: ");
		precio4 = datos.nextDouble();
		System.out.print("Dime el quinto precio: ");
		precio5 = datos.nextDouble();
		
		//Llamo al metedo y lo voy mostrando
		resultado = precioConIVA(precio1);
		System.out.println(resultado);
		resultado = precioConIVA(precio2);
		System.out.println(resultado);
		resultado = precioConIVA(precio3);
		System.out.println(resultado);
		resultado = precioConIVA(precio4);
		System.out.println(resultado);
		resultado = precioConIVA(precio5);
		System.out.println(resultado);
		
		
	}
	
	//Metodo que calcula el iva del precio y se lo suma
	public static double precioConIVA(double precio) {
		
		double iva = 0.21, resultado;
		
		
		resultado = precio * iva;
		
		resultado = precio - resultado;
		
		return resultado;
		
	}

}
