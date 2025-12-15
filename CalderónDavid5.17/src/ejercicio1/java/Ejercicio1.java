/*Descripción: Programa que crea tres dados, los lanza y saca un ganador
 * Autor:David Calderón Navarro
 * Fecha:10/12/2025
 */

package ejercicio1.java;

import libtarea3.Dado;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//1
		
		int nummax = (int) (Math.random()*30) + 30;
		
		
		//2
		
		Dado jugador1 = null;
		Dado jugador2 = null;
		Dado jugador3 = null;
		
		try {
		
			jugador1 = new Dado();
		
		} catch (IllegalArgumentException ex1) {
			
			System.out.println(ex1.getMessage());
			jugador1 = new Dado();
			
		}
		
		try {
			
			jugador2 = new Dado();
			
		} catch (IllegalArgumentException ex1) {
				
			System.out.println(ex1.getMessage());
			jugador2 = new Dado();
				
			}
		
		try {
			
			jugador3 = new Dado();
			
		} catch (IllegalArgumentException ex1) {
				
			System.out.println(ex1.getMessage());
			jugador3 = new Dado();
				
			}
		
		//3
		
		long puntuaciones;
		int contador = 0, contadorlanza = 1;
		
		System.out.println("\t \t DADO1\tDADO2\tDADO3\n");
		
		do {
			
			//3.1
			
			  String l1 = jugador1.lanzar();
			  String l2 = jugador2.lanzar();
			  String l3 = jugador3.lanzar();
			
			//3.2
			
			puntuaciones = jugador1.getSumaPuntuacionHistorica() + jugador2.getSumaPuntuacionHistorica() + jugador3.getSumaPuntuacionHistorica();
			
			System.out.printf("Lanzamiento nº %d  " ,contadorlanza);
			System.out.printf("%s\t%s\t%s\n", l1, l2, l3);
			
		
			contador++;
			contadorlanza++;
		
		}while (puntuaciones < nummax);
		
		long puntos1 = jugador1.getSumaPuntuacionHistorica();
		long puntos2 = jugador2.getSumaPuntuacionHistorica();
		long puntos3 = jugador3.getSumaPuntuacionHistorica();
		
		long ganador;
		
		if (puntos1 > puntos2) {
			
			ganador = 1;
			
		}else {
			
			ganador = 2;
			
		}
		
		if (puntos1 > puntos3) {
			
			ganador = 1;
			
		}else {
			
			ganador = 3;
			
		}
		
		if (puntos2 > puntos3) {
			
			ganador = 2;
			
		}else {
			
			ganador = 3;
			
		}
		
		
		
		
		//4
		
		//5
		
		//5.1
		System.out.printf("Numero maxima de puntos: %d" , nummax);
		System.out.println(" ");
		
		//5.3
		System.out.printf("Suma de puntos totales: %d" , puntuaciones);
		System.out.println(" ");
		
		//5.4
		
		
		
		//5.6
		System.out.printf("Numero de lanzamientos totales de todos los dados: %d " , Dado.getNumeroLanzamientosGlobal());
		System.out.println(" ");
		
		
	}

}
