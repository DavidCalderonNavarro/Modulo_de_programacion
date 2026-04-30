package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

		// Ejercicio1

		try {

			BufferedReader lector = new BufferedReader(new FileReader("notas1.txt"));
			String Linea;

			while ((Linea = lector.readLine()) != null) {

				Linea = Linea.trim();

				String[] datos = Linea.split(";");

				String grupo = datos[0];
				String nombre = datos[1];

				int[] notas = new int[5];

				for (int i = 0; i < 5; i++) {

					notas[i] = Integer.parseInt(datos[i + 2]);

				}

				Alumno alumno = new Alumno(grupo, nombre, notas);

				alumnos.add(alumno);
			}

			System.out.println("1. Añadiendo registros de notas1.txt a la lista...");

			lector.close();

		} catch (IOException e) {

			e.getMessage();

		}

		// Ejercicio2

		System.out.printf("2. Numero de registros añadidos a la lista: %d", alumnos.size());

		// Ejercicio3

		System.out.println("");
		System.out.println("3. Ordenamos la lista por grupo y nombre...");
		System.out.println("Guardamos la lista ordenada en: notasPorGrupoYNombre.txt");

		Collections.sort(alumnos, new ComparadorAlumno());

		try {

			BufferedWriter notasOrdenadas = new BufferedWriter(new FileWriter("notasPorGrupoYNombre.txt"));

			for (Alumno a : alumnos) {

				String linea = a.getGrupo() + ";" + a.getNombre();

				for (int nota : a.getNotas()) {

					linea = linea + ";" + nota;
				}

				notasOrdenadas.write(linea);
				notasOrdenadas.newLine();
			}

			notasOrdenadas.close();

		} catch (IOException e1) {

			e1.getMessage();

		}

		// Ejercicio4

		System.out.println("4. Añadimos el registro...");

		String nuevaLinea = "1º ESO D;López Muro, Rosario;3;3;4;4;3";

		String[] datos = nuevaLinea.split(";");

		String grupo = datos[0];
		String nombre = datos[1];

		int[] notas = new int[5];

		for (int i = 0; i < 5; i++) {

			notas[i] = Integer.parseInt(datos[i + 2]);

		}

		Alumno nuevo = new Alumno(grupo, nombre, notas);

		alumnos.add(nuevo);

		System.out.printf("Número de registros: %d", alumnos.size());
		System.out.println("");

		// Ejercicio5

		String nuevaLinea2 = "1º ESO B;Duarte Durán, Alba;2;3;4;1;3";

		String[] datos2 = nuevaLinea.split(";");

		String grupo2 = datos[0];
		String nombre2 = datos[1];

		int[] notas2 = new int[5];
		for (int i = 0; i < 5; i++) {

			notas[i] = Integer.parseInt(datos[i + 2]);

		}

		Alumno nuevo2 = new Alumno(grupo, nombre, notas);

		ComparadorAlumno comp = new ComparadorAlumno();
		int posicion = 0;

		while (posicion < alumnos.size() && comp.compare(alumnos.get(posicion), nuevo2) < 0) {

			posicion++;

		}

		alumnos.add(posicion, nuevo2);

		System.out.println("5. Añadimos un registro en mitad de la lista...");

		// Ejercicio6

		System.out.printf("6. Posición del nuevo alumno: %d", posicion);

		// Ejercicio7

		ArrayList<Alumno> auxiliar = new ArrayList<>();
		
		System.out.println("\n7. Añadiendo registros de notas2.txt a la lista mediante una lista \r\n" + "auxiliar...");
		System.out.printf("\nTotal registros antes de añadir: %d", alumnos.size());

		try {

			BufferedReader lector2 = new BufferedReader(new FileReader("notas2.txt"));
			String linea;

			while ((linea = lector2.readLine()) != null) {
				linea = linea.trim();

				String[] datos3 = linea.split(";");

				if (datos3.length < 7)
					continue;

				String grupo3 = datos3[0];
				String nombre3 = datos3[1];

				int[] notas3 = new int[5];

				for (int i = 0; i < 5; i++) {

					notas3[i] = Integer.parseInt(datos3[i + 2]);

				}

				Alumno alumno = new Alumno(grupo3, nombre3, notas3);

				auxiliar.add(alumno);

			}

			lector2.close();

		} catch (FileNotFoundException e) {

			System.out.println("Archivo no encontrado: " + e.getMessage());

		} catch (IOException e2) {

			System.out.println("Error de lectura: " + e2.getMessage());

		}

		alumnos.addAll(auxiliar);

		Collections.sort(alumnos, new ComparadorAlumno());

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("registroCompletoDeNotas.txt"))) {

			for (Alumno a : alumnos) {

				String linea = a.grupo + ";" + a.nombre;

				for (int nota : a.notas) {
					linea += ";" + nota;
				}

				bw.write(linea);
				bw.newLine();
			}

		} catch (IOException e) {
			
			System.out.println("Error al escribir: " + e.getMessage());
			
		}

		System.out.printf("\nTotal registros de la lista auxiliar: %d", auxiliar.size());
		System.out.printf("\nTotal registros despues de añadir: %d", alumnos.size());
		System.out.println("\nGuardamos la lista completa y ordenada en: registroCompletoDeNotas.txt");
		
	}

}
