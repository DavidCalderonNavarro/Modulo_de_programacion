/*Descripción: Calcular la nota del usuario en base a sus pegruntas acertadas y falladas
 * Autor:David Calderón Navarro
 * Fecha:05/10/2025
 */

package ejercicioexamen.java;

import java.util.Scanner;

public class Ejercicioexamen {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);
		
		double acierto;
		System.out.print("Dime cuantas respuestas acertaste: ");
		acierto = datos.nextInt();
		
		double fallos;
		System.out.print("Dime cuantas respuestas fallastes: ");
		fallos = datos.nextInt();
				
		double nota;
		
	
		if (acierto + fallos > 20) {
			
			System.out.println("Datos erróneos");
			
		}else if (((acierto / 1) - (fallos * 0.5))/2 < 4){
			
			nota = ((acierto / 1) - (fallos * 0.5))/2;
			System.out.println("Nota insuficiente: " + nota);
			
		} else if (acierto - fallos <= 5) {
			
			nota = ((acierto / 1) - (fallos * 0.5))/2;
			System.out.println("Nota Aprobada: " + nota);
			
		}else if (acierto - fallos <= 6) {
			
			nota = ((acierto / 1) - (fallos * 0.5))/2;
			System.out.println("Nota buena: " + nota);
			
		}else if (acierto - fallos <= 7 | acierto - fallos <= 8) {
			
			nota = ((acierto / 1) - (fallos * 0.5))/2;
			System.out.println("Nota buena: " + nota);
			
		}else {
			
			nota = ((acierto / 1) - (fallos * 0.5))/2;
			System.out.println("Nota sobresaliente: " + nota);
			
		}
	}

}
