package estructuraif;

import java.util.Scanner;

public class ejemplonota {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int nota;
		System.out.print("Dime tu nota: ");
		nota = datos.nextInt();
		
		
		if (nota < 0 || nota > 10) { 
			
			System.out.println("Tu eres tonto");
		
		} else if (nota >= 5) {
			
			System.out.println("Aprobado");
		}	
			
		 else {
			
			System.out.println("Suspenso");
			
		}

	}

}
