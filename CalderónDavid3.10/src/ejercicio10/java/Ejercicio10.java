/*Descripción: Programa que pide alturas, las guarda en un arrays bidimensional y muestra la media, la mayor y menor.
 * Autor: David Calderón Navarro
 * Fecha: 03/11/2025
 */

package ejercicio10.java;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int num, contador = 0, contador2 = 0;
		double altura = 0, suma = 0, media, maxima, minima;
		
		//Pregunto cuantas personas son 
		System.out.println("¿Cuantas alturas introduciras? ");
		num = datos.nextInt();
		
		//Declaro el arrays
		double[] arrays = new double[num];
		
		//Cojo todas las alturas
		for (int i = 0;i < num; i++) {
			
			contador++;
			System.out.println("Dime que altura tiene la persona " + contador + ":");
			altura = datos.nextDouble();
			arrays[i] = altura;
			suma = suma + altura;
			
		}
		
		maxima = altura;
		minima = altura;
		
		//Compruebo cual es la altura maxima y minima
		for (int i = 0;i < num; i++) {
			
			if (arrays[i] > maxima) {
				
				maxima = arrays[i];
				
			}else if (arrays[i] < minima) {
				
				minima = arrays[i];
				
				
			}
			
		}
		
		//Hago la media
		media = suma / num;
		
		//Muestro la media, la altura maxima y la altura minima
		System.out.println("La media da: " + media);
		System.out.println("La altura maxima es: " + maxima);
		System.out.println("La altura minima es: " + minima);
		
		//Compruebo si las alturas miden por encima de la media o no
		for (int i = 0; i < num; i++) {
			
			contador2++;
			
			if (arrays[i] >= media) {
				
				System.out.println("La persona " + contador2 + " esta por encima de la media");
				
			}else if(arrays[i] < media) {
				
				System.out.println("La persona " + contador2 + " esta por debajo de la media");
				
			}
			
			
		}
		
	}

}
