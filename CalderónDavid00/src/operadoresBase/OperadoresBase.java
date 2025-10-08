/*
 * Descripción: Ejemplos de tipos de operadores
 * Autor: David Calderón Navarro
 * Fecha: 25/09/2025
 */

package operadoresBase;

public class OperadoresBase {

	public static void main(String[] args) {
		
		int dato1, dato3;
		double  dato2;
		
		dato1 = 5;
		dato2 = 4.0;
		dato3 = 5;
		
		int suma;
		suma = dato1 + dato3;
		System.out.println("La suma es: " + suma);
		
		int resta;
		resta = dato1 - dato3;
		System.out.println("La resta es: " + resta);
		
		int multi;
		multi = dato1 * dato3;
		System.out.println("La multiplicación es: " + multi);
		
		double division;
		division = dato1 / dato2;
		System.out.println("La división es: " + division);
		
		int resto;
		resto = dato1 % dato3;
		System.out.println("El resto es: " + resto);
		
		int dato1mas, dato1menos;
		dato1mas = dato1++; //Es igual que: dato1mas = dato1 + 1
		dato1menos = dato1--; //Es igual que: dato1menos = dato1 - 1
		System.out.println("Incremental prefija: " + ++dato1);

		
		boolean distinto = dato1 == dato3;
		System.out.println (distinto);
		
	}

}
