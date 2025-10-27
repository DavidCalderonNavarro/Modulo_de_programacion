/*Descripción: Programa que hace un cuestionario tipo test d 10 preguntas y al fina te muestra la nota
 * Autor: David Calderón Navarro
 * Fecha: 22/10/2025
 */

package ejercicio8.java;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		int nota = 0;
		String respuesta;
		
		//Pregunto una a una
		System.out.println("1. ¿Cuál de las siguientes es una unidad de medida de la velocidad del procesador?");
		System.out.println("a)Byte");
		System.out.println("b)Hertz");
		System.out.println("c)Bit");
		System.out.println("d)Ohmio");
		respuesta = datos.nextLine();
		
		//Si es la correcta le sumara uno a la nota
		if (respuesta.equalsIgnoreCase("b")) {
			
			nota++;
			
		}
		
		System.out.println("2. ¿Qué tipo de memoria es volátil, es decir, pierde su contenido al apagar el equipo");
		System.out.println("a)ROM");
		System.out.println("b)Flash");
		System.out.println("c)RAM");
		System.out.println("d)SSD");
		respuesta = datos.nextLine();
		
		if (respuesta.equalsIgnoreCase("c")) {
			
			nota++;
			
		}
		
		System.out.println("3. ¿Cuál de los siguientes dispositivos es una unidad de entrada?");
		System.out.println("a)Monitor");
		System.out.println("b)Impresora");
		System.out.println("c)Teclado");
		System.out.println("d)Altavoz");
		respuesta = datos.nextLine();
		
		if (respuesta.equalsIgnoreCase("c")) {
			
			nota++;
			
		}
		
		System.out.println("4. ¿Qué función realiza el sistema operativo?");
		System.out.println("a)Ejecutar aplicaciones y gestionar recursos del sistema");
		System.out.println("b)Producir energía para los componentes");
		System.out.println("c)Convertir código fuente en binario");
		System.out.println("d)Almacenar permanentemente los datos");
		respuesta = datos.nextLine();
		
		if (respuesta.equalsIgnoreCase("a")) {
			
			nota++;
			
		}
		
		System.out.println("5. ¿Cuál de las siguientes NO es una interfaz de usuario?");
		System.out.println("a)CLI");
		System.out.println("b)GUI");
		System.out.println("c)API");
		System.out.println("d)BIOS");
		respuesta = datos.nextLine();
		
		if (respuesta.equalsIgnoreCase("d")) {
			
			nota++;
			
		}
		
		System.out.println("6. ¿Qué tipo de software es Microsoft Word?");
		System.out.println("a)SO");
		System.out.println("b)Software de aplicación");
		System.out.println("c)Software de desarrollo");
		System.out.println("d)Software de sistema");
		respuesta = datos.nextLine();
		
		if (respuesta.equalsIgnoreCase("b")) {
			
			nota++;
			
		}
		
		System.out.println("7. ¿Qué componente realiza las operaciones aritméticas y lógicas en un ordenador?");
		System.out.println("a)RAM");
		System.out.println("b)Unidad de Control");
		System.out.println("c)ALU");
		System.out.println("d)Disco duro");
		respuesta = datos.nextLine();
		
		if (respuesta.equalsIgnoreCase("c")) {
			
			nota++;
			
		}
		
		System.out.println("8. ¿Cuál de las siguientes opciones describe correctamente el concepto de periférico?");
		System.out.println("a)Parte interna del procesador");
		System.out.println("b)Dispositivo externo que permite entrada o salida de datos");
		System.out.println("c)Programa que gestiona recursos");
		System.out.println("d)Chip integrado en la placa base");
		respuesta = datos.nextLine();
		
		if (respuesta.equalsIgnoreCase("b")) {
			
			nota++;
			
		}
		
		System.out.println("9. ¿Qué tipo de licencia permite modificar y redistribuir libremente el software?");
		System.out.println("a)Propietaria");
		System.out.println("b)Shareware");
		System.out.println("c)Freeware");
		System.out.println("d)Software libre");
		respuesta = datos.nextLine();
		
		if (respuesta.equalsIgnoreCase("d")) {
			
			nota++;
			
		}
		
		System.out.println("10. ¿Qué tipo de red conecta equipos dentro de un área local, como una oficina o centro educativo");
		System.out.println("a)WAN");
		System.out.println("b)MAN");
		System.out.println("c)LAN");
		System.out.println("d)PAN");
		respuesta = datos.nextLine();
		
		if (respuesta.equalsIgnoreCase("c")) {
			
			nota++;
			
		}
		
		//Muestro la nota
		System.out.println("Tienes un " + nota + ".");
		
	}

}
