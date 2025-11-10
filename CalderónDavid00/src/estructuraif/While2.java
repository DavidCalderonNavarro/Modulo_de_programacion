package estructuraif;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);
		
		int inicio, num;
		System.out.print("Dame el inicio: ");
		inicio = datos.nextInt();
		num = inicio;
		
		int fin;
		System.out.print("Dame el final: ");
		fin = datos.nextInt();

		
		if (inicio >= fin) {
			
			System.out.println("Secuencia de números desde " + inicio + " hasta " + fin);
			
			while (num > fin) {
				
				System.out.print(num + " ");
				num = num - 1;
			}
		}else
			
			System.out.println("Secuencia de números desde " + inicio + " hasta " + fin);
			
		while (num <= fin) {
			
			System.out.print(num + " ");
			num = num + 1;
			
			
		}
		
	}

}
