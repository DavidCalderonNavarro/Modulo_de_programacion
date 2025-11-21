/*Descripción: Programa que pide un entero y le dice si es positivo, negativo o igual a 0
 * Autor:David Calderón Navarro
 * Fecha:13/11/2025
 */

package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int signo, num;
		
		System.out.print("Dime un numero entero: ");
		num = datos.nextInt();
		
		signo = dimeSigno(num);
		
		if (signo == -1) {
			
			System.out.print("Tu numero es negativo");
			
		}else if (signo == 1) {
			
			System.out.print("Tu numero es positivo");
			
		}else {
			
			System.out.print("Tu numero es igual a 0");
			
		}
		
	}
	
	//Metodo para saber si el numero es positivo, negativo o igual a 0
	public static int dimeSigno(int a) {
		
		int signo;
		
		if (a < 0) {
			
			signo = -1;
			
		}else if (a > 0) {
			
			signo = 1;
			
		}else {
			
			signo = 0;
			
		}
		
		return signo;
		
	}

}
