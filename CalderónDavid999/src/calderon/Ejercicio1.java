package calderon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println("1. Importar libros: ");
		System.out.println("");

		HashSet<Libro> libros = importarLibros("libros.txt");

		for (Libro i : libros) {

			System.out.println(i.toString());

		}

		System.out.println("");
		System.out.println("2. Crear un objeto: ");
		System.out.println("");

		Libro libro1 = new Libro("978-84-206-9999-0", "Alicia en el pais de las maravillas", "Lewis Carrol",
				(float) 9.90);

		libros.add(libro1);

		System.out.println(libro1.toString());
		System.out.println("Libros en la coleccion: " + libros.size());

		System.out.println("");
		System.out.println("3. Crear un objeto: ");
		System.out.println("");

		boolean existe = false;

		for (Libro i : libros) {

			if (i.getIsbm().equalsIgnoreCase("978-84-975-9220-8")) {

				existe = true;

			}

		}

		if (!existe) {

			Libro libro2 = new Libro("978-84-975-9220-8", "1984", "George Orwell", (float) 12.00);
			libros.add(libro2);
			System.out.println(libro2.toString());

		} else {

			System.out.println("El Isbm ya esta en la coleccion");
			System.out.println("");

		}

		System.out.println("Libros en la coleccion: " + libros.size());

		System.out.println("");
		System.out.println("4. Comprobar si el libro esta en el conjunto: ");
		System.out.println("");

		for (Libro i : libros) {

			if (i.getIsbm().equalsIgnoreCase("978-84-975-9220-8")) {

				System.out.println("");
				System.out.println("El libro se encuentra en el conjunto: ");
				System.out.println("Valores del libro: " + i.toString());

				break;

			}

		}

		System.out.println("");
		System.out.println("5. Cuantos libros tienen el autor George Orwell: ");
		System.out.println("");

		int contador = 0;

		for (Libro i : libros) {

			if (i.getAutor().equalsIgnoreCase("George Orwell")) {

				System.out.println(i.toString());
				contador++;

			}

		}

		System.out.println("");
		System.out.println("Libros con ese autor: " + contador);

		System.out.println("");
		System.out.println("6.Borrar un libro con un isbm: ");
		System.out.println("");
		
		Iterator<Libro> it = libros.iterator();
		
		boolean encontrado = false;

		while (!encontrado) {

			Libro l = it.next();

			if (l.getIsbm().equalsIgnoreCase("978-84-01-35283-6")) {
				
				it.remove();
				System.out.println("");
				System.out.println("El libro que se borrara: ");
				System.out.println(l.toString());
				encontrado = true;

			}

		}
		
		System.out.println("");
		System.out.println("Hay " + libros.size() + " objetos");
		
		System.out.println("");
		System.out.println("7. Metodo para calcular la media del precio de los libros: ");
		System.out.println("");
		
		System.out.println("La media del precio de los libros es: " + mediaPrecio(libros));

	}
	
	public static float mediaPrecio(HashSet<Libro> libros) {
		
		float suma = 0;
		
		for(Libro i: libros) {
			
			suma = suma + i.getPrecio();
			
		}
		
		return suma / libros.size();
		
	}

	public static HashSet<Libro> importarLibros(String Archivo) {

		HashSet<Libro> libros = new HashSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(Archivo))) {

			String linea;

			while (((linea = br.readLine()) != null)) {

				String[] datos = linea.split(";");
				String isbm = datos[0];
				String titulo = datos[1];
				String autor = datos[2];
				float precio = Float.valueOf(datos[3]);
				
				libros.add(new Libro(isbm, titulo, autor, precio));
					
			}

		} catch (IOException e) {

			System.out.println("Error al leer el archivo");

		}

		return libros;

	}

}
