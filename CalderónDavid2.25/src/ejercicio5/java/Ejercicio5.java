/*Descripción: Programa que te dice tu horoscopo a partir de tu dia y mes de nacimiento
 * Autor: David Calderón Navarro
 * Fecha: 22/10/2025
 */

package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro la variable
		int dia;
		System.out.print("Dime el dia que naciste: ");//Pregunto su dia
		dia = datos.nextInt();
		datos.nextLine();
		
		//Declaro la variable
		String mes;
		System.out.print("Dime el mes que naciste: ");//Pregunto su mes
		mes = datos.nextLine();
		
		//Compruebo el dia y el mes con el condicional if
		if (mes.equalsIgnoreCase("enero")) {
			
			if (dia > 20) {
				
				System.out.println("Tu horoscopo es Acuario");
				
			}else {
				
				System.out.println("Tu horoscopo es Capricornio");
				
			}
			
		}else if (mes.equalsIgnoreCase("febrero")) {
			
			if (dia < 18) {
				System.out.println("Tu horoscopo es Acuario");
			}else {
				
				System.out.println("Tu horoscopo es Piscis");
				
			}
			
		}else if (mes.equalsIgnoreCase("marzo")) {
			
			if (dia < 20) {
				
				System.out.println("Tu horoscopo es Piscis");
				
			}else {
				
				System.out.println("Tu horoscopo es Aries");
				
			}
			
		}else if (mes.equalsIgnoreCase("abril")) {
			
			if (dia < 20) {
				
				System.out.println("Tu horoscopo es Aries");
				
			}else {
				
				System.out.println("Tu horoscopo es Tauro");
				
			}
			
		}else if (mes.equalsIgnoreCase("mayo")) {
			
			if (dia < 21) {
				
				System.out.println("Tu horoscopo es Tauro");
				
			}else {
				
				System.out.println("Tu horoscopo es Geminis");
				
			}
			
		}else if (mes.equalsIgnoreCase("junio")) {
			
			if (dia < 21) {
				
				System.out.println("Tu horoscopo es Geminis");
				
			}else {
				
				System.out.println("Tu horoscopo es Cancer");
				
			}
			
		}else if (mes.equalsIgnoreCase("julio")) {
			
			if (dia < 23) {
				
				System.out.println("Tu horoscopo es Cancer");
				
			}else {
				
				System.out.println("Tu horoscopo es Leo");
				
			}
			
		}else if (mes.equalsIgnoreCase("agosto")) {
			
			if (dia < 23) {
				
				System.out.println("Tu horoscopo es Leo");
				
			}else {
				
				System.out.println("Tu horoscopo es Virgo");
				
			}
			
		}else if (mes.equalsIgnoreCase("septiembre")) {
			
			if (dia < 23) {
				
				System.out.println("Tu horoscopo es Virgo");
				
			}else {
				
				System.out.println("Tu horoscopo es Libra");
				
			}
			
		}else if (mes.equalsIgnoreCase("octubre")) {
			
			if (dia < 23) {
				
				System.out.println("Tu horoscopo es Libra");
				
			}else {
				
				System.out.println("Tu horoscopo es Escorpio");
				
			}
			
		}else if (mes.equalsIgnoreCase("noviembre")) {
			
			if (dia < 21) {
				
				System.out.println("Tu horoscopo es Escorpio");
				
			}else {
				
				System.out.println("Tu horoscopo es Sagitario");
				
			}
			
		}else if (mes.equalsIgnoreCase("diciembre")) {
			
			if (dia < 22) {
				
				System.out.println("Tu horoscopo es Sagitario");
				
			}else {
				
				System.out.println("Tu horoscopo es Capricornio");
				
			}
			
		}

}
}
