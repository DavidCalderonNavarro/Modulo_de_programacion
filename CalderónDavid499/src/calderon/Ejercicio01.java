/*Descripción: Programa que crea tres cuentas de referencia a objetos y las instancia metiendoles datos a mano
 * Autor:David Calderón Navarro
 * Fecha:17/12/2025
 */

package calderon;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio01 {

	public static void main(String[] args) {

		int limite = 0, descubierto1 = 0, descubierto2 = 0, descubierto3 = 0;

		// 2 Declaro 3 variables de tipo cuenta Bancaria

		CuentaBancaria Calderon_1;
		CuentaBancaria Calderon_2;
		CuentaBancaria Calderon_3;

		// 3 Instancio las 3 variables con los siguientes datos

		// 3.1 Creacion de la cuenta 1

		boolean creacion = true;

		do {

			try {

				descubierto1 = limiteAleatorio(limite);
				Calderon_1 = new CuentaBancaria(1000, LocalDate.now(), descubierto1);
				creacion = true;

			} catch (IllegalArgumentException ex1) {

				System.out.println("Error al crear la cuenta");
				creacion = false;
				Calderon_1 = new CuentaBancaria();

			}

		} while (creacion == false);

		System.out.println("Cuenta creada con exito");

		do {

			// 3.2 Creacion de la cuenta 2

			try {

				descubierto2 = limiteAleatorio(limite);
				Calderon_2 = new CuentaBancaria(2000, LocalDate.now(), descubierto2);
				creacion = true;

			} catch (IllegalArgumentException ex2) {

				System.out.println("Error al crear la cuenta");
				creacion = false;
				Calderon_2 = new CuentaBancaria();

			}

		} while (creacion == false);

		System.out.println("Cuenta creada con exito");

		do {

			// 3.2 Creacion de la cuenta3

			try {

				descubierto3 = limiteAleatorio(limite);
				Calderon_3 = new CuentaBancaria(3000, LocalDate.now(), descubierto3);
				creacion = true;

			} catch (IllegalArgumentException ex3) {

				System.out.println("Error al crear la cuenta");
				creacion = false;
				Calderon_3 = new CuentaBancaria();

			}

		} while (creacion == false);

		System.out.println("Cuenta creada con exito");

		System.out.println("Informacion de la cuenta Calderon_1:");
		System.out.printf("ID de la cuenta: %d\n", Calderon_1.getId());
		System.out.printf("Fecha de creacion de la cuenta: %s\n", Calderon_1.getFechaCreacion());
		System.out.printf("Saldo de la cuenta: %f\n", Calderon_1.getSaldo());
		System.out.println("");

		System.out.println("Informacion de la cuenta Calderon_2:");
		System.out.printf("ID de la cuenta: %d\n", Calderon_2.getId());
		System.out.printf("Fecha de creacion de la cuenta: %s\n", Calderon_2.getFechaCreacion());
		System.out.printf("Saldo de la cuenta: %f\n", Calderon_2.getSaldo());
		System.out.println("");

		System.out.println("Informacion de la cuenta Calderon_3:");
		System.out.printf("ID de la cuenta: %d\n", Calderon_3.getId());
		System.out.printf("Fecha de creacion de la cuenta: %s\n", Calderon_3.getFechaCreacion());
		System.out.printf("Saldo de la cuenta: %f\n", Calderon_3.getSaldo());
		System.out.println("");

		// 4 Calculo el menor limite descubierto con un metodo

		int menorlimite;

		// Llamo al metodo
		menorlimite = menorlimitedescubierto(descubierto1, descubierto2);
		menorlimite = menorlimitedescubierto(menorlimite, descubierto3);

		System.out.printf("La cuenta con menor limite descubierto es: ");

		// 5 Realizo 5 transferencia de la cuenta 1 a la cuenta 2

		for (int i = 0; i <= 5; i++) {

			try {

				Calderon_1.transferir(300, Calderon_2);
				System.out.printf("Saldo de la cuenta1: %f\n", Calderon_1.getSaldo());
				System.out.printf("Saldo de la cuenta2: %f\n", Calderon_2.getSaldo());

			} catch (IllegalStateException ex4) {

				System.out.println("No se ha podido realizar la transferencia. Sin dinero en la cuenta");

			}

		}

		// 6 Embargo el 50 de la cuenta 3 y muestro su informacion

		Calderon_3.embargar(50);
		System.out.println("Informacion de la cuenta Calderon_3:");
		System.out.printf("ID de la cuenta: %d\n", Calderon_3.getId());
		System.out.printf("Fecha de creacion de la cuenta: %s\n", Calderon_3.getFechaCreacion());
		System.out.printf("Saldo de la cuenta: %f\n", Calderon_3.getSaldo());
		System.out.println("");

		// 7 Muestro el saldo de las cuentas y cuantas estan embargadas

		System.out.printf("Saldo de la cuenta1: %f\n", Calderon_1.getSaldo());
		System.out.printf("Saldo de la cuenta2: %f\n", Calderon_2.getSaldo());
		System.out.printf("Saldo de la cuenta3: %f\n", Calderon_3.getSaldo());
		System.out.printf("Numero de cuentas embargadas: %d\n", CuentaBancaria.getNumCuentasEmbargadas());

	}

	// 1
	// Metodo que calcula un limite descubierto y devuelve un entero
	public static int limiteAleatorio(int limite) {

		int numrandom;

		numrandom = (int) (Math.random() * 4000 - 4000);

		return numrandom;

	}

	// Metodo que calcula que cuenta tiene el menor limite descubierto
	public static int menorlimitedescubierto(int a, int b) {

		int menorlimite;

		if (a > b) {

			menorlimite = a;

		} else {

			menorlimite = b;

		}

		return menorlimite;

	}

}
