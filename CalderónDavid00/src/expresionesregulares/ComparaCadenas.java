package expresionesregulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComparaCadenas {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String posibleDNI;
		
		//Generamos el patron
		Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");
		
		System.out.print("Dame tu dni: ");
		posibleDNI = datos.nextLine();
		
		
		Matcher texto = patron.matcher(posibleDNI);
		
		//Comprobamos que la info introducida tiene el formato del molde
		if (texto.matches()) {
			
			System.out.println("El dni tiene la forma correcta");
			
		}else {
			
			System.out.println("El dni no tiene la forma correcta");
			
		}
		
		
	}

}
