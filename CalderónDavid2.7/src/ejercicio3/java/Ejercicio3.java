/*Descripción: Pedirle al usuario su nota e indicarle su calificacion
 * Autor:David Calderón Navarro
 * Fecha:09/10/2025
 */

package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Le pido la nota al usuario
		int nota;
		System.out.print("Dime tu nota: ");
		nota = datos.nextInt();
		
	
		//Difino el condicional switch
		switch (nota) {
		
		case 1,2,3,4: {
			System.out.println("Insuficiente");
			break;
		}
		
		case 5:{
			System.out.println("Aprobado");
			break;
		}
		case 6:{
			
			System.out.println("Bien");
			break;
			
		}
		case 7,8:{
			System.out.println("Notable");
			break;
			
		}
		case 9,10:{
			System.out.println("Sobresaliente");
			break;
		
		}default:{
			
			System.out.println("La nota introducida es errónea");
			
		}
		
		
		}

	}

}
