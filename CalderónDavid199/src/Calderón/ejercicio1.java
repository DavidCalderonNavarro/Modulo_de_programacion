/*Descripción: Programa que muestra una serie de datos de un empleado
 * Autor: David Calderón Navarro
 * Fecha: 29/10/2025
 */

package Calderón;

public class ejercicio1 {

	public static void main(String[] args) {
		
		//Declaro variables con sus respectivos valores
		int numempleado = 2055, edad = 35, horastrabajadas = 40;
		float salariohora = 15.50f, irpf = 12.0f;
		boolean jornadacompleta = horastrabajadas == 40;
		boolean elegibleParaBono;
		
		double salariobruto = horastrabajadas * salariohora;
		double irpfretenido = salariobruto / irpf;
		double salarioneto = salariobruto - irpfretenido;
		
		
		
		//Muestro al usuario los datos
		System.out.println("El numero de empleado es: " + numempleado + " y su edad es: " + edad);
		System.out.println("Su salario hora es de: " + salariohora);
		System.out.println("El salario bruto semanal es de: " + salariobruto);
		System.out.println("El importe de IRPF Retenido es de: " + irpfretenido);
		System.out.println("El salario neto es de: " + salarioneto);
		
	}

}
