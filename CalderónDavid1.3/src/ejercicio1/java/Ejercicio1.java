/*
 * Descripción: Voy a calcular el salario neto del usuario con sus datos
 * Autor: David Calderón Navarro
 * Fecha: 01/10/2025
 */

package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String nombreusu;
		System.out.print("Dame tu nombre: ");
		nombreusu = datos.nextLine();
		
		String apellidosusu;
		System.out.print("Dame tus apellidos: ");
		apellidosusu = datos.nextLine();
		
		String fechanacimiento;
		System.out.print("Dame tu fecha de nacimiento: ");
		fechanacimiento = datos.nextLine();
				
		double salariobruto, salarioneto, salarioaumento, salariototal;
		System.out.print("Dime cuanto cobras: ");
		salariobruto = datos.nextDouble();
		salarioneto = salariobruto - salariobruto * 0.15;
		
		int annostrabajando;
		System.out.print("Dime los años que llevas trabajando: ");
		annostrabajando = datos.nextInt();
		salarioaumento = salariobruto * (annostrabajando * 0.02);
		salariototal = salarioneto + salarioaumento;
		
		System.out.println("Estimad@" + nombreusu + apellidosusu + ", su salario bruto es " + salariobruto + ", teniendo en cuenta un IRPF del 15% su salario neto es " + salarioneto + ".");
		System.out.println(" ");
		System.out.println("Debido a sus " + annostrabajando + " años trabajando en la empresa su salario se incrementará en un 2% por cada año. El aumento es de " + salarioaumento + " y el salario total es " + salariototal);
	}

}
