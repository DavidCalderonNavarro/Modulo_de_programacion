/*Descripción: Programa que hace un arrays de tamanyo 50 y suma sus valores y hace la media
 * Autor:David Calderón Navarro
 * Fecha:19/11/2025
 */

package ejercicio15.java;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		//Hago una constante para evitar literales
		final int NUMEROS_TOTAL = 50;
		
		//Declaro el arrays y variables
		int[] sumatorio = new int[NUMEROS_TOTAL];
		int suma;
		double media;
		
		//Llamo al metodo de sumar
		suma = sumaTotal(sumatorio);
		
		//Llamo al metodo para hacer la media
		media = mediaTotal(suma);
		
		//Muestro los valores
		System.out.println("La suma es: " + suma);
		System.out.println("La media es: " + media);
		
	}
	
	//Metodo que crea un arrays sumando sus valores
	public static int sumaTotal(int[] sumatorio) {
		
		final int NUMEROS_TOTAL = 50;
		
		sumatorio = new int[NUMEROS_TOTAL];
		int suma = 0;
		
		for (int i = 0; i < 50; i++) {
			
			sumatorio[i] = (int) (Math.random()*(99 - 50 + 1)) + 50;
			suma = suma + sumatorio[i];
			
		}
		
		return suma;
		
	}
	
	//Metodo que hace la media
	public static double mediaTotal(int a) {
		
		double media;
		
		media = a / 50.0;
		
		return media;
		
	}

}
