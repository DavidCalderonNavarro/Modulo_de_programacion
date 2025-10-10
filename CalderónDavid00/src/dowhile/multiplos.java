package dowhile;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num1, multiplo;
		System.out.print("Dame tu primer número: ");
		num1 = datos.nextInt();

		int num2;
		System.out.print("Dame tu segundo número: ");
		num2 = datos.nextInt();
		
	do {
		
			multiplo = num1 % num2;
			System.out.print(" " + multiplo);
			
			
			
		}while (multiplo >= num2);
		
	}

}
