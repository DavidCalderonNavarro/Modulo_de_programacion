package estructuraif;

import java.util.Scanner;

public class Ejemplodia {

	public static void main(String[] args) {

		Scanner dia = new Scanner(System.in);
		
		String diasemana;
		System.out.print("Dime en que dia de la semana estamos: ");
		diasemana = dia.nextLine();
		
		boolean jueves = diasemana.equals("jueves");
		boolean JUEVES = diasemana.equals("JUEVES");
		
		if (jueves || JUEVES) {
			
			System.out.println("Bien, estamos a jueves");
			
		}else{
		System.out.println("Muy mal, estamos a jueves");
		}
	}

}
