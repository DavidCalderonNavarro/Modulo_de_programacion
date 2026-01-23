/*Descripción: Instancio 3 objetos de la clase Punto y los muestro
 * Autor:David Calderón Navarro
 * Fecha:16/01/2026
 */

package ejercicioA1.java;

public class Main {

	public static void main(String[] args) {
		
		//Instancio tres objetos de la clase punto
		
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10, 10);
		Punto p3 = new Punto(3, 7);
		
		//Muestro las coordenadas de los puntos
		
		System.out.println("(" + p1.x + "," + p1.y + ")");
		System.out.println("(" + p2.x + "," + p2.y + ")");
		System.out.println("(" + p3.x + "," + p3.y + ")");
		
	}

}
