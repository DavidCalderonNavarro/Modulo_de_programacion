/*Descripción: Pedirle al usuario sus notas para calcularle la media y decirle si puede o no entrar a los estudios
 * Autor:David Calderón Navarro
 * Fecha:09/10/2025
 */

package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Le pido las notas al usurio
		double nota1;
		System.out.print("Dime la primera nota de la primera asignatura: ");
		nota1 = datos.nextDouble();
		
		double nota2;
		System.out.print("Dime la segunda nota de la segunda asignatura: ");
		nota2 = datos.nextDouble();
		
		double nota3;
		System.out.print("Dime la tercera nota de la tercera asignatura: ");
		nota3 = datos.nextDouble();
		
		double nota4;
		System.out.print("Dime la cuarta nota de la cuarta asignatura: ");
		nota4 = datos.nextDouble();
		
		//Hago la media de esas notas
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("Tu nota media es de: " + media);
		
		//Redondeo hacia arriba y hacia abajo
		double notarendondeadaarriba = Math.ceil(media);
		double notarendondeadaabajo = Math.floor(media);
		
		//Le muestro su nota media redondeada hacia arriba y hacia abajo
		System.out.println("Tu nota redondeada hacia arrbia es: " + notarendondeadaarriba);
		System.out.println("Tu nota redondeada hacia abajo es: " + notarendondeadaabajo);
		
		//Si supera la nota media 8 le muestro esta linea
		if (media > 8) {
			
			System.out.println("Puede acceder a los estudios superiores");
			
		//Si no esta otra
		}else {
			
			System.out.println("La nota media obtenida no es suficiente para acceder a los estudios que deseaba");
			
		}
		
		
		
		
	}

}
