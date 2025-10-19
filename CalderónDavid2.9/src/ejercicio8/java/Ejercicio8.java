/*Descripción: Programa que para cuando introduces 0 y te cuenta los positivos y negativos
 * Autor: David Calderón Navarro
 * Fecha: 18/10/2025
 */

package ejercicio8.java;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num = 0, numnegativo= 0, contadorpos = 0, contadorneg = 0;
		
		//Uso un bucle dowhile porque si o si pedire el primer numero
		do {
			
			System.out.print("Dime un número: ");
			num = datos.nextInt();
			
			//Uso el condicional para almacenar un numero negativo para decir que ha introducio un numero negativo
			if (num<0) {
				
				numnegativo = num;
				
			}
			
			//Uso el condional para contar los positivos y negativos
			if (num>0) {
				
				contadorpos++;
				
			}else if (num<0){
				
				contadorneg++;
				
			}
			
		//Si es 0 se para el bucle
		}while (num!=0);
		
		if (numnegativo<0) {
			
			//Muestro si ha introducido numeros negativos
			System.out.println("Has introducido uno o varios números negativos");
			
		}
		
		//Muestro por pantalla los numeros positivos y negativos
		System.out.println("Has introducido " + contadorpos + " números positivos");
		System.out.println("Has introducido " + contadorneg + " números negativos");
		

	}

}
