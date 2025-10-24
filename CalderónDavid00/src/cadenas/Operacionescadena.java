package cadenas;

import java.util.Scanner;

public class Operacionescadena {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String cadena;
		System.out.print("Dame una cadena de caracteres: ");
		cadena = datos.nextLine();
		
		//Mostrar la longitud de la cadena
		
		System.out.println("La cadena tiene: " + cadena.length());
		
		//Mostrar el primer caracter de la cadena
		
		System.out.println("El primer caracter de la cadena es " + cadena.charAt(0));
		
		//Mostar el ultimo caracter de la cadena
		
		System.out.println("El ultimo caracter de la cadena es " + cadena.charAt(cadena.length() - 1));
		
		//Mostar la segunda palabra de la cadena
		
		String[] palabras = cadena.split(" ");
		String segundapalabra;
		
		if (! palabras[1].isEmpty()) {
		segundapalabra = palabras[1];
		
		System.out.println("La segunda palabra es: " + segundapalabra);
		}else {
			
			System.out.println("No existe");
			
		}
		
		//Mostrar la cadena con la primera letra y la ultima en mayuscula
		String primletra = cadena.substring(0, 1);
		primletra = primletra.toUpperCase();
		String ultletra = cadena.substring(cadena.length() - 1);
		ultletra = ultletra.toUpperCase();
		
		System.out.println("La primera letra en mayuscula es: " + primletra + " y la ultima es: " + ultletra);
		
		//Mostrar la cadena que hay entre el principio al final
		
		String medio = cadena.substring(1 , cadena.length() - 1);

		System.out.println("La cadena del medio es: " + medio);
		
		System.out.println(primletra + medio + ultletra);
	}

}
