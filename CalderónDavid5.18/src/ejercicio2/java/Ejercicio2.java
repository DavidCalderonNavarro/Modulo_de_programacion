/*Descripción: Programa que crea dos bombos y hace pruebas con uno
 * Autor:David Calderón Navarro
 * Fecha:15/12/2025
 */

package ejercicio2.java;

import libtarea3.Bombo;

public class Ejercicio2 {

	public static void main(String[] args) {

		// 1

		// 1.1

		// 1.1.1

		try {

			Bombo eje1 = new Bombo(Bombo.MINIMA_CAPACIDAD - 1);

		} catch (IllegalArgumentException ex1) {

			System.out.printf("Minima capacidad no permitida");
			System.out.println(" ");

		}

		// 1.1.2

		try {

			Bombo eje2 = new Bombo(Bombo.MAXIMA_CAPACIDAD + 1);

		} catch (IllegalArgumentException ex1) {

			System.out.printf("Maxima capacidad no permitida");
			System.out.println(" ");

		}

		// 1.2

		// 1.2.1

		Bombo b1 = new Bombo();

		// 1.2.2

		Bombo b2 = new Bombo(15);

		// 1.2.3

		// 1.2.3.1

		System.out.printf("Capacidad del bombo: %d", b2.getCapacidad());
		System.out.println(" ");

		// 1.2.3.2

		System.out.printf("Listado de bolas extraidas: %s", b2.getBolasExtraidas());
		System.out.println(" ");

		// 1.2.3.3

		System.out.printf("Cantidad de bolas extraidas: %d", b2.getCantidadBolasExtraidas());
		System.out.println(" ");

		// 1.2.3.4

		System.out.printf("Listado de bolas restantes: %s", b2.getBolasRestantes());
		System.out.println(" ");

		// 1.2.3.5

		System.out.printf("Cantidad de bolas restantes: %d", b2.getCantidadBolasRestantes());
		System.out.println(" ");

		// 2

		// 2.1

		int contador = 1;

		// 2.3

		int random = (int) (Math.random() * 4 + 10);

		while (contador != 4) {

			System.out.println("----------");
			System.out.println("Juego " + contador);
			System.out.println("----------");

			for (int i = 0; i < random; i++) {

				System.out.printf("Bola extraida: %d", b2.extraerBola());
				System.out.println(" ");

			}

			contador++;

			System.out.printf("Capacidad del bombo: %d", b2.getCapacidad());
			System.out.println(" ");

			System.out.printf("Listado de bolas extraidas: %s", b2.getBolasExtraidas());
			System.out.println(" ");

			System.out.printf("Cantidad de bolas extraidas: %d", b2.getCantidadBolasExtraidas());
			System.out.println(" ");

			System.out.printf("Listado de bolas restantes: %s", b2.getBolasRestantes());
			System.out.println(" ");

			System.out.printf("Cantidad de bolas restantes: %d", b2.getCantidadBolasRestantes());
			System.out.println(" ");

			// 2.2

			b2.reset();

		}

	}

}
