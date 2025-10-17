/*Descripción: Programa que saca la secuencia de numero desde el inicio hasta el final
 * Autor:David Calderón Navarro
 * Fecha:16/10/2025
 */

package buclefor;

import java.util.Scanner;

public class Ejercicioresuletofor {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int inicio, fin, contador;
		System.out.print("Introduzca el inicio: ");
		inicio = datos.nextInt();
		System.out.print("Introduzca el fin: ");
		fin = datos.nextInt();
		
		System.out.println(" ");
		System.out.println("Secuencia de números desde " + inicio + " hasta " + fin);
		
		for (contador = inicio; contador <= fin; contador++) {
			
			System.out.print(contador + " ");
			
			
		}
		

	}

}
