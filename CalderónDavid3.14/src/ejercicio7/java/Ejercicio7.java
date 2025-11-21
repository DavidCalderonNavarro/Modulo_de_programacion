/*Descripción: Programa que pide el ancho y el alto de un rectangulo y le da el perimetro y el area
 * Autor:David Calderón Navarro
 * Fecha:13/11/2025
 */

package ejercicio7.java;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Decalro variables
		double resultado, base, altura, area;
		
		//Pregunto por los datos
		System.out.print("Dime la base del rectangulo: ");
		base = datos.nextDouble();
		System.out.print("Dime el alto del rectangulo: ");
		altura = datos.nextDouble();
		
		//Llamo a los metodos
		resultado = perimetroRectangulo(base, altura);
		area = areaRectangulo(base, altura);
		
		//Muestro los resultados
		System.out.println("El perimetro del rectangulo es: " + resultado);
		System.out.println("El area del rectangulo es: " + area);
		
	}
	
	//Metodo para calcular el perimetro del rectangulo
	public static double perimetroRectangulo(double ancho, double alto) {
		
		double resultado;
		
		resultado = ancho + ancho + alto + alto;
		
		return resultado;
		
	}
	
	//Metodo para calcular el area del rectangulo
	public static double areaRectangulo(double ancho, double alto) {
		
		double area;
		
		area = ancho * alto;
		
		return area;
		
		
	}

}
