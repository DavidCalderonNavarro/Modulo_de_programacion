package buclefor;

import java.util.Scanner;

public class buclefor {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);
		
		int inicio;
		System.out.print("Dame un número: ");
		inicio = datos.nextInt();
		
		int fin;
		System.out.print("Dame un número: ");
		fin = datos.nextInt();
		
		
		
		for (int multiplo = inicio; multiplo <= fin; multiplo++) {
			
			if (multiplo % 5 == 0) {
			System.out.println(multiplo + " es múltiplo de 5");
			}
		}
	}

}
