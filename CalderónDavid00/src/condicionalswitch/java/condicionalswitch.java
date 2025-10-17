package condicionalswitch.java;

import java.util.Scanner;

public class condicionalswitch {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Dame tu nota: ");
		int nota = datos.nextInt();
		
		String notaTexto;
		
		switch (nota) {
			case 1,2:{
				notaTexto = "Mal";
				break;
			}
			case 3: case 4:{
				notaTexto = "Insuficiente";
				break;		
			}
			case 5:{
				notaTexto = "Aprobado";
				break;
			}
			case 6:{
				notaTexto = "Bien";
				break;
			}
			case 7,8:{
				notaTexto = "Notable";
				break;
			}
			case 9,10:{
				notaTexto = "Sobresaliente";
				break;
			}
			default:{
				notaTexto = "Valor no válido";
			}
			if (notaTexto.equals("Valor no válido")) {
				
				System.out.println("La nota es errónea");
				
			}else {
				
				System.out.println("La nota es: " + notaTexto);
				
			}
			}

	}

}
