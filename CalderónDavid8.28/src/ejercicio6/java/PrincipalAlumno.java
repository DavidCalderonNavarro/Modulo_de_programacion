/*Descripción: Clase Alumno con 
 * Autor:David Calderón Navarro
 * Fecha:20/03/2026
 */

package ejercicio6.java;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import ejercicio5.java.Poblacion;

public class PrincipalAlumno {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		HashMap<Integer, Alumno> clase = new HashMap<Integer, Alumno>();

		String opcion = "";
		int llave = 0;

		do {

			System.out.println("");
			System.out.println("a) Incorporar un nuevo alumno");
			System.out.println("b) Mostrar un alumno por su cod de alumno");
			System.out.println("c) Dar de baja a un alumno");
			System.out.println("d) Modificar la direccion y/o telefono a partir del codigo del alumno");
			System.out.println("e) Solicitar cambio de carrera");
			System.out.println("f) Salir");
			System.out.println("");
			System.out.println("Elige una opcion: ");
			opcion = datos.next();

			if (opcion.equals("a")) {

				System.out.println("Dime el codigo del alumno: ");
				int codigoAlumno = datos.nextInt();

				System.out.println("Dime el nombre del alumno: ");
				String nombre = datos.next();

				System.out.println("Dime el apellidos del alumno: ");
				String apellidos = datos.nextLine();

				System.out.println("Dime la direccion del alumno: ");
				String direccion = datos.next();

				System.out.println("Dime el telefono del alumno: ");
				int telefono = datos.nextInt();

				System.out.println("Dime el codigo del ciclo del alumno: ");
				String codigoCiclo = datos.next();

				System.out.println("Dime la cantidad de cursos aprobados del alumno: ");
				int cursos = datos.nextInt();

				System.out.println("Dime la fecha de ingreso del alumno");
				System.out.println("Año: ");
				int anyo = datos.nextInt();
				System.out.println("Mes: ");
				int mes = datos.nextInt();
				System.out.println("Dia: ");
				int dia = datos.nextInt();

				LocalDate fecha = LocalDate.of(anyo, mes, dia);

				clase.put(1 + llave,
						new Alumno(codigoAlumno, nombre, apellidos, direccion, telefono, codigoCiclo, cursos, fecha));

				llave = llave + 1;

			} else if (opcion.equals("b")) {

			} else if (opcion.equals("c")) {

			} else if (opcion.equals("d")) {

			} else if (opcion.equals("e")) {

			}

		} while (!opcion.equalsIgnoreCase("f"));

	}

}
