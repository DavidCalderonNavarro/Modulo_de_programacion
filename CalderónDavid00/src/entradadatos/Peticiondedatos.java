package entradadatos;

import java.util.Scanner;

public class Peticiondedatos {

	public static void main(String[] args) {

		Scanner datos = new Scanner (System.in);
		
		int edadAlumno;
		System.out.print("Dame tu edad: ");
		edadAlumno = datos.nextInt();
		
		System.out.println("La edad es: " + edadAlumno);
		
		
		datos.nextLine();//Despues de pedir valor numerico y antes de pedir cadena de caracteres
		String nombreAlumno;
		System.out.print("Dame tu nombre: ");
		nombreAlumno = datos.nextLine();
		
		System.out.println("Tu nombre es: " + nombreAlumno);
		
		//Despues de pedir valor numerico y antes de pedir cadena de caracteres
		double pesoAlumno;
		System.out.print("Dame tu peso: ");
		pesoAlumno = datos.nextDouble();
		
		System.out.println("Tu peso es: " + pesoAlumno + " kgs");
		
	}

}
