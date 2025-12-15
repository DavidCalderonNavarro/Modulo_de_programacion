/*Descripción: Programa que crea tres bombillas con determinados parametros y los muestra
 * Autor:David Calderón Navarro
 * Fecha:12/12/2025
 */

package ejercicio1.java;

import java.time.format.DateTimeFormatter;
import libtarea3.Bombilla;
import libtarea3.Utilidades;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//1
		
		Bombilla b1;
		Bombilla b2;
		Bombilla b3;
		
		//2
		
		//2.1
		
		System.out.printf("Numero de bombillas creadas hasta ahora: %d" , Bombilla.getBombillasCreadas());
		System.out.println(" ");
		
		//2.2
		
		System.out.printf("Numeros de bombillas encendias: %d" , Bombilla.getBombillasEncendidas());
		System.out.println(" ");
		
		//3
		
		//3.1
		
		try {
			
			Bombilla fallida = new Bombilla(true , 250);
			
		}catch (IllegalArgumentException ex1) {
			
			System.out.printf("Mensaje de error: %s" , ex1.getMessage());
			System.out.println(" ");
			
		}
		
		//3.2
		
		try {
			
			Bombilla fallida2 = new Bombilla(5);
			
		}catch (IllegalArgumentException ex2) {
			
			System.out.printf("Mensaje de error: %s" , ex2.getMessage());
			System.out.println(" ");
			
		}
		
		//3.3
		
		b1 = new Bombilla(true, 100);
		
		//3.4
		
		b2 = new Bombilla(true);
		
		//3.5
		
		b3 = new Bombilla();
		
		//4
		
		//4.1
		
		try {
			
			b1.encender();
			
		}catch (IllegalStateException ex3) {
			
			System.out.printf("Mensaje de error: %s" , ex3.getMessage());
			System.out.println(" ");
			
		}
		
		//4.2
		
		for (int i = 1; i <= 6; i++) {
			
			b1.conmutar();
			Utilidades.esperar(1);
			
		}
		
		//4.3
		
		b2.apagar();
		
		//4.4
		
		b3.encender();
		
		//5
		
		System.out.println("-------------------------------");
		System.out.println("Datos de la primera bombilla");
		System.out.println("-------------------------------");
		
		//5.1
		
		System.out.printf("Potencia de la bombilla: %.2f" , b1.getPotencia());
		System.out.println(" ");
		
		//5.2
		
		System.out.printf("Estado de la bombilla: %s" , b1.getEstado());
		System.out.println(" ");
		
		//5.3
		
		DateTimeFormatter formatofecha = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		
		
		
		System.out.printf("Ultima vez que se encendia la bombilla: %s" , b1.getUltimaVezEncendida().format(formatofecha));
		System.out.println(" ");
		
		//5.4
		
		System.out.printf("Numero de veces encendia: %d" , b1.getVecesEncendida());
		System.out.println(" ");
		
		//5.5
		
		System.out.printf("Segundos que ha estado encendia: %.2f" , b1.getTiempoEncendida());
		System.out.println(" ");
		
		//5.6
		
		System.out.printf("Potencia consumida: %.2f" , b1.getPotenciaConsumida());
		System.out.println(" ");
		
		//6
		
		System.out.println("-------------------------------");
		System.out.println("Datos globales");
		System.out.println("-------------------------------");
		
		//6.1
		
		System.out.printf("Numero de bombillas creadas hasta ahora: %d" , Bombilla.getBombillasCreadas());
		System.out.println(" ");
		
		//6.2
		
		System.out.printf("Numeros de bombillas encendias: %d" , Bombilla.getBombillasEncendidas());
		System.out.println(" ");
		
	}

}
