package dowhile;

import java.util.Scanner;

public class dowhile2 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int inicio, fin, contador;
		
		System.out.print("Dame el incio: ");
		inicio = datos.nextInt();
		
		System.out.print("Dame el final: ");
		fin = datos.nextInt();
	
		if (inicio <= fin) {
			System.out.println("Secuencia de números desde " + inicio + " hasta " + fin);
			contador = inicio;
		do {
		
			if (contador %3 == 0) {
			System.out.print(" " + contador);
			}
			contador++;
			
		} while (contador <= fin);
		
		}else {
			System.out.println("Secuencia de números desde " + inicio + " hasta " + fin);
			contador = inicio;
			do {
				if (contador %3 == 0) {
					System.out.print(" " + contador);
					}
				contador--;
				
				
			}while (contador >= inicio);
			
			
			
		}
		
		}
	}


