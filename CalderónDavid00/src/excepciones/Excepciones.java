package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num;
		boolean correcto;
		
		
		do {
			
			System.out.print("Dame un numero entero: ");
			
		try {
			
			datos.close();
			num = datos.nextInt();
			correcto = true;
			
		} catch (InputMismatchException exTipoDiferente) {
			
			System.out.println("Error: formato incorrecto");
			correcto = false;
			
		} catch (IllegalStateException ex1) {
			
			correcto = false;
			System.out.println("No se puede acceder a la consola");
			
		}
		
		datos.nextLine();
		
		}while(correcto == false);
		
	}

}
