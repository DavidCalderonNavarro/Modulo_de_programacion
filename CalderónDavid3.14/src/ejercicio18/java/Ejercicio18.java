/*Descripción: Programa que calcula tu letra de dni a partir de tus numeros
 * Autor:David Calderón Navarro
 * Fecha:21/11/2025
 */

package ejercicio18.java;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int dni;
		char letra;
		
		//Pido el dni
		System.out.print("Dime los numeros de tu dni: ");
		dni = datos.nextInt();
		
		//Llamo al metodo
		letra = letraDni(dni);
		
		System.out.println("Tu letra es: " + letra);
		
		
		
	}
	
	//Metodo que calcula la letra del dni y devuelve un caracter
	public static char letraDni(int dni) {
		
		char letra = 'a';
		int operacion;
		
		operacion = dni % 23;
		
		switch (operacion){
		 case 0: letra = 'T'; break;
	        case 1: 
	        	letra = 'R'; 
	        	break;
	        case 2: 
	        	letra = 'W'; 
	        	break;
	        case 3: 
	        	letra = 'A'; 
	        	break;
	        case 4: 
	        	letra = 'G'; 
	        	break;
	        case 5: 
	        	letra = 'M'; 
	        	break;
	        case 6: 
	        	letra = 'Y'; 
	        	break;
	        case 7: 
	        	letra = 'F'; 
	        	break;
	        case 8: 
	        	letra = 'P'; 
	        	break;
	        case 9: 
	        	letra = 'D'; 
	        	break;
	        case 10: 
	        	letra = 'X'; 
	        	break;
	        case 11: 
	        	letra = 'B'; 
	        	break;
	        case 12: 
	        	letra = 'N'; 
	        	break;
	        case 13: 
	        	letra = 'J'; 
	        	break;
	        case 14: 
	        	letra = 'Z'; 
	        	break;
	        case 15: 
	        	letra = 'S'; 
	        	break;
	        case 16: 
	        	letra = 'Q'; 
	        	break;
	        case 17: 
	        	letra = 'V'; 
	        	break;
	        case 18: 
	        	letra = 'H'; 
	        	break;
	        case 19: 
	        	letra = 'L'; 
	        	break;
	        case 20: 
	        	letra = 'C'; 
	        	break;
	        case 21: 
	        	letra = 'K'; 
	        	break;
	        case 22: 
	        	letra = 'E'; 
	        	break;
		}
		
		
		
		return letra;
		
	}

}
