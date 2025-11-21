/*Descripción: Programa que pide el dia, mes y anyo y comprueba si el formato de la fecha es correcto
 * Autor:David Calderón Navarro
 * Fecha:14/11/2025
 */

package ejercicio10.java;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int dia, mes, anyo;
		boolean fecha;
		
		//Le pido los valores
		System.out.print("Dime el dia: ");
		dia = datos.nextInt();
		System.out.print("Dime el mes: ");
		mes = datos.nextInt();
		System.out.print("Dime el anyo: ");
		anyo = datos.nextInt();
		
		//Llamo al metodo para saber si es correcta la fecha
		fecha = fechaCorrecta(dia, mes, anyo);
		
		//Si la fecha es correcta muestra el iguiente mensaje, si no el otro
		if (fecha == true) {
			
			System.out.println("La fecha es correcta");
			
		}else {
			
			System.out.println("La fecha es incorrecta");
			
		}
		
	}
	
	//Metodo que comprueba si la fecha es correcta
	public static boolean fechaCorrecta(int a, int b, int c) {
		
		boolean fecha, dia, mes, anyo;
		
		if (a <= 31 && a > 0) {
			
			dia = true;
			
		}else {
			
			dia = false;
			
		}
		
		if (b <= 12 && b > 0) {
			
			mes = true;
			
		}else {
			
			mes = false;
			
		}
		
		if (c <= 2025) {
			
			anyo = true;
			
		}else {
			
			anyo = false;
			
		}
		
		if (dia == true && mes == true && anyo == true) {
			
			fecha = true;
			
		}else {
			
			fecha = false;
			
		}
		
		return fecha;
		
	}

}
