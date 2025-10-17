package estructuraif;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num, suma, contador;
		System.out.print("Dime un número: ");
		num = datos.nextInt();
		contador = 1;
		suma = num;
		
		while (num != 0 && contador != 8) {
			System.out.print("Dime un número: ");
			num = datos.nextInt();
			contador = contador + 1; //contador++
			suma = suma + num;//acumulador
		}

		System.out.print("La suma es: " + suma);
		
	}

}
