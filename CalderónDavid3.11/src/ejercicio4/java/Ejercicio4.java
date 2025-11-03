package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		final int ALUMNOS = 4;
		final int ASIG = 5;
		
		Scanner datos = new Scanner(System.in);
		
		int[][] matriz = new int[ALUMNOS][ASIG];
		int alumno1, alumno2, alumno3, alumno4, masalum = 0;
		
		for (int contador = 0; contador < ALUMNOS; contador++) {
		
			for (int i = 0; i < masalum; i++) {
				masalum++;
				for (int e = 0; e < 5; e++) {
				
					int nota;
					System.out.print("Dame tu nota: ");
					nota = datos.nextInt();
				
					matriz[i][e] = nota;
					
					
					

				
			}
			
		}
		}
		
		
		
		
	}

}
