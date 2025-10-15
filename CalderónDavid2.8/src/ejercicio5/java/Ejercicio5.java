package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int media;

		for (int contador = 1; contador <= 10; contador++) {
			
			System.out.print("Dame un número: ");
			int num = datos.nextInt();
			int suma = num;
			suma = num;
			
			if (num > 0) {
				
				
				media = suma + num;
				
			}else {
				
				media = suma + num;
				
				
			}
			System.out.println("La media de los números positivos es " + media);
			
		}


	}

}
