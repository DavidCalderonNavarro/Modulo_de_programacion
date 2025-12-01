/*Descripción: Programa que genera 40 numeros y los muestra en filas de 20
 * Autor: David Calderón Navarro
 * Fecha: 12/11/2025
 */

package calderón;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creo constante para evitar literales
		final int NUMEROS_TOTAL = 40;
		
		//Declaro el vector que tendra los 40 numeros y la variable media
		int[] numeros = new int[NUMEROS_TOTAL];
		int mediapar = 0, par = 0, contador = 0;
		
		//Meto los numeros random de 0 a 50 en todas las posiciones
		for (int i = 0; i < NUMEROS_TOTAL; i++) {
			
			numeros[i] = (int) (Math.random()*50);
			
		}
		
		//Muestro los numeros en dos filas de 20 numeros cada una
		for (int e = 0; e < NUMEROS_TOTAL; e++) {
			
			System.out.print(numeros[e] + " ");
			contador++;
			
			if (contador == 20) {
				
				System.out.println(" ");
				
			}
			
		}
		
		/*
		 * En este bucle calculo la media de los pares y muestro los valores 
		 * de los impares por debajo de la media
		 */
		for (int i = 0; i < NUMEROS_TOTAL;i++) {
			
			if (i % 2 == 0) {
				
				mediapar = mediapar + numeros[i];
				par++;
				
			}
			
		}
		
		mediapar = mediapar / par;
		
		System.out.println(" ");
		System.out.println(" ");
		
		//Muestro la media aritmetica  de los valores en posiciones pares
		System.out.println("La media aritmética de los valores en posiciones pares es: " + mediapar);
		System.out.println(" ");
		//Muestro los valores de las posiciones impares por debajo de la media
		System.out.println("Los valores de las posiciones impares cuyo valor esta por debajo de la media son: ");
		
		//Uso el bucle para saber que numeros son impares y estan debajo de la media
		for (int i = 0; i < NUMEROS_TOTAL;i++) {
			
			if (i % 2 == 0) {
				
			}else {
				
				if (i < mediapar) {
					
					System.out.print(i + " ");
					
				}
				
			}
			
		}
		
		
		
		
		
		
	}

}
