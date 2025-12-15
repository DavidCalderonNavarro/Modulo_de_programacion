/*Descripción: Programa que cuenta los domingos del anyo introducido por el usuario
 * Autor:David Calderón Navarro
 * Fecha:15/12/2025
 */

package ejercicio3.java;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.DayOfWeek;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int anyo;
		
		//1
		
		do {
			
			try {
			
				System.out.println("Dime un anyo: (1900-2100)");
				anyo = datos.nextInt();
			
			} catch (InputMismatchException ex1) {
				
				System.out.println("Formato incorrecto; Porfavor introduzca un numero entero");
				anyo = 0;
				
			}
			
			datos.nextLine();
			
		}while (anyo < 1900 || anyo > 2100);
		
		//2
		
		int mes = 1, dia = 1, contadormes = 0, contadorglobal = 0;
		
		LocalDate fechacomp = LocalDate.of(anyo, mes, dia);
		
		System.out.println("------------------------------------");
		System.out.println("Cantidad de domingos en el anyo " + anyo);
		System.out.println("------------------------------------");
		
		for (int i = mes; i <= 12; i++) {
		
			fechacomp = LocalDate.of(anyo, i, dia);
		
			for(int contdia = dia; contdia <= fechacomp.getMonth().length(fechacomp.isLeapYear()); contdia++) {
				
				fechacomp = LocalDate.of(anyo, i, contdia);
				
				if (fechacomp.getDayOfWeek() == DayOfWeek.SUNDAY) {
					
					contadormes++;
					contadorglobal++;
					
				}
				
			}
			
			System.out.printf("Domigos de %s:  %d" , fechacomp.getMonth() , contadormes);
			System.out.println(" ");
			
			contadormes = 0;
		
		}
		
		//3
		
		System.out.printf("Domingos de todo el anyo: %d" , contadorglobal);
		
	}

}
