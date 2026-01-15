package fechayhora;

import java.time.LocalDate;

import java.util.Scanner;

public class Fechanacimiento {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int anyo, mes, dia;
		
		System.out.print("Dime el año en que nacistes: ");
		anyo = datos.nextInt();
		System.out.println("Dime el mes en que nacistes: ");
		mes = datos.nextInt();
		System.out.println("Dime el dia en que nacistes: ");
		dia = datos.nextInt();
		
		try {
			
			LocalDate nacimiento = LocalDate.of(anyo, mes, dia);
			
		} catch (Exception ex1) {
			
			System.out.println("Tu mes de nacimiento es incorrecto");
			
		}
		
	}

}
