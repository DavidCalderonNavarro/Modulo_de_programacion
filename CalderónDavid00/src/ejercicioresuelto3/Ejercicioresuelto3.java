/*
 * Descripción: Voy a hacer un ejercicio de medidas internacionales y anglosajona
 * Autor: David Calderón Navarro
 * Fecha: 26/09/2025
 */

package ejercicioresuelto3;

import java.util.Scanner;

public class Ejercicioresuelto3 {

	public static void main(String[] args) {

		Scanner medida = new Scanner(System.in);
		
		double num;
		System.out.print("Dame el número que quieras convertir: ");
		num = medida.nextDouble();
		
		double metros;
		metros = num;
		
		double decimetros;
		decimetros = num * 10;
		
		double centímetros;
		centímetros = num * 100;
		
		double milimetros;
		milimetros = num * 1000;
		
		double pulgadas;
		pulgadas = num * 100 /2.54;
		
		double pies;
		pies = pulgadas /12;
		
		double yardas;
		yardas = pies /3;
		
		
		
		System.out.println("RESULTADO");
		System.out.println("------");
		System.out.println(" ");
		System.out.println("SISTEMA INTERNACIONAL");
		System.out.println("---------------------");
		System.out.println("La medida " + metros + " en metros son:");
		System.out.println(decimetros + " decímetros");
		System.out.println(centímetros + " centímetros");
		System.out.println(milimetros + " milímetros");
		System.out.println(" ");
		System.out.println("SISTEMA ANGLOSAJÓN");
		System.out.println("------------------");
		System.out.println("La medida " + num + " en metros son:");
		System.out.println(pulgadas + " pulgadas");
		System.out.println(pies + " pies");
		System.out.println(yardas + " yardas");
		

	}

}
