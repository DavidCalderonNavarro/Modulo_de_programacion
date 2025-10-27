/*Descripción: Programa que dado las horas trabajadas te da el salario semanal
 * Autor: David Calderón Navarro
 * Fecha: 20/10/2025
 */

package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Dlecaro las variables
		int horas, horasmayor = 0, dinero = 0, contador, contadorsuma = 0;
		System.out.print("Dime cuantas horas semanales hechas en el trabajo: ");
		horas = datos.nextInt();
		
		//Uso bucle for para contar los numeros que van desde el introducido hasta el 40
		for (contador = horas;contador>40; contador--) {
			
			contadorsuma++;
			
		}
		
		//Uso el condicional para saber si ha introducido mas o menos de 40
		if (horas <= 40 && horas > 0) {
			
			dinero = horas * 12;
			
		}else if (horas >=41) {
			
			horasmayor = contadorsuma * 16;
			horas = 40 * 12;
			horas = horas + horasmayor;
			
		}
		
		//Muestro el dinero que gana por semana
		System.out.println("Tu salario semanal es de: " + horas);
		
	}

}
