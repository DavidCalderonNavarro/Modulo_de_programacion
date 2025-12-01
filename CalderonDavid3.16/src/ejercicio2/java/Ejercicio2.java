/*Descripción: Programa que crea y lanza dados por sus caras
 * Autor:David Calderón Navarro
 * Fecha:01/12/2025
 */

package ejercicio2.java;

import libtarea3.Dado;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//1
		
		//1.1
		System.out.printf("Numero de dados creado hasta el momento: %d" ,Dado.getNumeroDadosCreados());
		System.out.println(" ");
		
		//1.2
		System.out.printf("Numero total de lanzamientos hasta el momento: %d" ,Dado.getNumeroLanzamientosGlobal());
		System.out.println(" ");
		
		//1.3
		
		System.out.printf("Numero de veces que ha salido la cara 1: %d" ,Dado.getNumeroVecesCaraGlobal(1));
		System.out.println(" ");
		System.out.printf("Numero de veces que ha salido la cara 2: %d" ,Dado.getNumeroVecesCaraGlobal(2));
		System.out.println(" ");
		System.out.printf("Numero de veces que ha salido la cara 3: %d" ,Dado.getNumeroVecesCaraGlobal(3));
		System.out.println(" ");
		System.out.printf("Numero de veces que ha salido la cara 4: %d" ,Dado.getNumeroVecesCaraGlobal(4));
		System.out.println(" ");
		
		//2
		
		//2.1
		
		Dado dados[];
		int caras;
		
		dados = new Dado[10];
		
		for(int i = 0; i < 10; i++) {
			
			try {
				
				dados[i] = new Dado((int) (Math.random()*8));
				
				//2.2
				caras = dados[i].getNumeroCaras();
				
				for(int a = 1;a <= caras; a++) {
					
					dados[i].lanzar();
					
				}
				
				if(caras == 0) {
					
				}else {
					
					//2.3
					
					System.out.printf("Numero de lanzamientos historico del dado: %s" ,dados[i].getSerieHistoricaLanzamientos());
					System.out.println(" ");
					System.out.printf("Numero de lanzamientos del dado: %d" ,dados[i].getNumeroLanzamientos());
					System.out.println(" ");
					
				}
				
			}catch (IllegalArgumentException error1) {
				
				System.out.printf("Numero de caras no valido");
				System.out.println(" ");
				
			}
			
		}
		
		//3
		
		System.out.println(" ");
		System.out.println("----------------------------------------------");
		System.out.printf("Numero de dados creado hasta el momento: %d" ,Dado.getNumeroDadosCreados());
		System.out.println(" ");
		
		System.out.printf("Numero total de lanzamientos hasta el momento: %d" ,Dado.getNumeroLanzamientosGlobal());
		System.out.println(" ");
		
		System.out.printf("Numero de veces que ha salido la cara 1: %d" ,Dado.getNumeroVecesCaraGlobal(1));
		System.out.println(" ");
		System.out.printf("Numero de veces que ha salido la cara 2: %d" ,Dado.getNumeroVecesCaraGlobal(2));
		System.out.println(" ");
		System.out.printf("Numero de veces que ha salido la cara 3: %d" ,Dado.getNumeroVecesCaraGlobal(3));
		System.out.println(" ");
		System.out.printf("Numero de veces que ha salido la cara 4: %d" ,Dado.getNumeroVecesCaraGlobal(4));
		System.out.println(" ");
		System.out.println("----------------------------------------------");
		
		
		
		
		
		
		
		
		
	}

}
