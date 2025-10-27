/*Descripción: Programa que pide el numero de la semana y te devulve l dia de la semana
 * Autor: David Calderón Navarro
 * Fecha: 20/10/2025
 */

package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num;
		System.out.print("Dime el numero de la semana(del 1 al 7): ");
		num = datos.nextInt();
		
		String dia="";
		
		if (num > 7 || num < 1) {
			
			System.out.println("Valor no valido");
			
			
		}else {
		
		switch(num) {
		case 1:{
			
			dia = "Lunes";
			break;
			
		}
		case 2:{
			
			dia = "Martes";
			break;
			
		}
		case 3:{
			
			dia = "Miercoles";
			break;
			
		}
		case 4:{
			
			dia = "Jueves";
			break;
			
		}
		case 5:{
			
			dia = "Viernes";
			break;
			
		}
		case 6:{
			
			dia = "Sabado";
			break;
			
		}
		case 7:{
			
			dia = "Domingo";
			break;
			
		}
		
		
		}
		
		System.out.println("Estamos a " + dia);
		
		}
	}

}
