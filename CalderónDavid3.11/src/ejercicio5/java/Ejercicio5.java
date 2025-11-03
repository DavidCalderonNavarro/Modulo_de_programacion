/*Descripción: Programa que pide un numero de empleados, su genero y la media de su salario
 * Autor:David Calderón Navarro
 * Fecha:31/10/2025
 */

package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int numpersonas, genero, salario, sumahombres = 0, sumamujeres = 0, mediahombres, mediamujeres, numhombres = 0, nummujeres = 0;
		
		System.out.print("Dime cuantas perosnas sois: ");
		numpersonas = datos.nextInt();
		
		int[][] matriz = new int[numpersonas][1];
		
		for (int i = 0; i < numpersonas; i++) {
			
			System.out.print("Dime el genero(0 para hombre)(1 para mujer): ");
			genero = datos.nextInt();
			
			if (genero == 0) {
				
				System.out.print("Dime el salario: ");
				salario = datos.nextInt();
				
				sumahombres = sumahombres + salario;
				numhombres++;
				
			}else if (genero == 1) {
				
				System.out.print("Dime el salario: ");
				salario = datos.nextInt();
				
				sumamujeres = sumamujeres + salario;
				nummujeres++;
				
			}
			
		}
		
		mediahombres = sumahombres / numhombres;
		mediamujeres = sumamujeres / nummujeres;
		
		System.out.println("La media de sueldo(s) de los hombre(s) es: " + mediahombres);
		System.out.println("La media de sueldo(s) de las mujere(s) es: " + mediamujeres);
		
		
	}

}
