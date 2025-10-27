package ejercicio9.java;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num1, num2 = 0, num3 = 0, num, intermedio = 0;
		
		System.out.println("Dime un numero: ");
		num = datos.nextInt();
		num1 = num;
		
		System.out.println("Dime un numero: ");
		num = datos.nextInt();
		
		if (num < num1) {
			
			intermedio = num1;
			num1 = num;
			num2 = intermedio;
			
		}else {
			
			num2 = num;
			
		}
		
		System.out.println("Dime un numero: ");
		num = datos.nextInt();
		
		if (num < num1) {
			
			intermedio = num1;
			num1 = num;
			
		}else if (num < num2) {
			
			intermedio = num2;
			num2 = num;
			
			
		}else {
			
			num3 = num;
			
		}
		
		System.out.println(num1 + "" + num2 + "" + num3);
		
	}

}
