/*Descripción: Programa que cuenta las cifras del numero introducido
 * Autor:David Calderón Navarro
 * Fecha:16/10/2025
 */

package buclefor;

import java.util.Scanner;

public class contadordecifras {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num = 0, contadorcifra, contador = 0;
		System.out.print("Introduze un número para calcular su número de cifras: ");
		num = datos.nextInt();
		
		for (contadorcifra = num ; contadorcifra > 0; contadorcifra = contadorcifra / 10) {
		
			contador++;
		}
		
		System.out.println("El número de cifras de " + num + " es " + contador);

	}

}
