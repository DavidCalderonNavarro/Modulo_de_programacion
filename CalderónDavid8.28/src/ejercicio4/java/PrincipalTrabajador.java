package ejercicio4.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import ejercicio2.Agenda;
import ejercicio2.ComparadorAgenda;

public class PrincipalTrabajador {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);

		HashSet<Trabajador> trabajadores = new HashSet<Trabajador>();

		int cantidad = ((int) (Math.random() * 11) + 20);
		
		int contadorHombre = 0;
		
		String opcion = "";

		for (int i = 0; i < cantidad; i++) {

			String nombre = "Trabajador" + (i + 1);
			int edad = ((int) (Math.random() * 30) + 18);

			String sexo;
			int numeroSexo = ((int) (Math.random() * 2));

			if (numeroSexo == 1) {

				sexo = "Masculino";

			} else {

				sexo = "Femenino";

			}
			
			String estado_civil;
			int numeroEstado= ((int) (Math.random() * 3));

			if (numeroEstado == 0) {

				estado_civil = "Casado/a";

			} else if(numeroEstado == 1){

				estado_civil = "Soltero/a";

			}else {
				
				estado_civil = "Divorciado/a";
				
			}
			
			double salario_base = Math.random()*800 + 1200;

			trabajadores.add(new Trabajador(nombre, edad, sexo, estado_civil, salario_base));

		}
		
		List<Trabajador> ListaTrabajadores = new ArrayList<Trabajador>(trabajadores);
		
		do {
			
			System.out.println("");
			System.out.println("a) Mostrar todos los trabajadores ordenados por sexo y estado civil");
			System.out.println("b) Cantidad de trabajadores del sexo masculino");
			System.out.println("c) Cantidad de trabajadoras casadas");
			System.out.println("d) Suma de todos los sueldos");
			System.out.println("e) salir");
			System.out.println("");
			System.out.println("Elige una opcion: ");
			opcion = datos.next();

			if (opcion.equals("a")) {
				
				Collections.sort(ListaTrabajadores, new ComparadorTrabajador());
				
				for (Trabajador i : ListaTrabajadores) {
					System.out.println(i.toString());
				}
				
			}else if(opcion.equals("b")) {
				
				for (Trabajador i: trabajadores) {
					
					if(i.getSexo().equals("Masculino")) {
						
						contadorHombre++;
						
					}
					
				}
				
				System.out.println("Hay " + contadorHombre + " trabajadores masculinos");
				
			}
			
		}while(!opcion.equalsIgnoreCase("e"));
		

	}

}
