package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String cadena;
		System.out.print("Dame una cadena de caracteres: ");
		cadena = datos.nextLine();
		
		String[] palabras = cadena.split("\\s+");
		String segundapalabra, primerapalabra, tercerapalabra;
		
		int numpalabras = palabras.length;
		
		System.out.println("Numero de palabras: " + numpalabras);
		
		
	}

}
