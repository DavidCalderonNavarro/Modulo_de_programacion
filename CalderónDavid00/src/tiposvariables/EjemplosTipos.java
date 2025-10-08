/*
 * Descripción: ejemplos de tipos de variables
 * Autor: David Calderón Navarro
 * Fecha: 22/09/2025
 */

package tiposvariables;

public class EjemplosTipos {

	public static void main(String[] args) {
		int numAlumnos; // Declaramos la variable numAlumnos
		numAlumnos = 0;
		System.out.println("Valor de la variable: " + numAlumnos);
		
		numAlumnos = 12;
		System.out.println("Valor de la variable: " + numAlumnos);
		
		double alturaAlumnos = 1.75;
		System.out.println("Valor de la variable:\n " + alturaAlumnos + " cm");
		
		char letraDni;
		letraDni = 'd';
		
		String nombreAlumno = "\"David\"";
		System.out.println("Valor de la variable: " + nombreAlumno + " y su letra del dni es:" + letraDni);

		final int NUM_MAX_ALUMNOS = 25; //Declaramos una constante
		System.out.println("Valor de la constante: " + NUM_MAX_ALUMNOS);
		
		final String GRUPO = "daw1"; 
		System.out.println("Valor del grupo constante: " + GRUPO);
		
	}

}
