/*Descripción: Preguntar al usuario datos y años trabajando para decirle si esta conratado o no
 * Autor:David Calderón Navarro
 * Fecha:09/10/2025
 */

package ejercicio2.java;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Le pido los datos al usuario
		String nombre;
		System.out.print("Dame tu nombre: ");
		nombre = datos.nextLine();
		
		String apellido;
		System.out.print("Dame tus apellidos: ");
		apellido = datos.nextLine();
		
		int edad;
		System.out.print("Dame tu edad: ");
		edad = datos.nextInt();
		
		int salariodeseado;
		System.out.print("Dime tu salario deseado: ");
		salariodeseado = datos.nextInt();
		
		if (salariodeseado > 30000 || edad > 45) {//Si los datos superan estos numeros, entonces se cortara aqui
			
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
			
		}else { //Si no lo supera se le pedira la siguiente informacion
			
			int años;
			System.out.print("Dime tus años de experiencia: ");
			años = datos.nextInt();
			
			int proyectos;
			System.out.print("Dime en cuantos proyectos has trabajados: ");
			proyectos = datos.nextInt();
			
			 if (años > 2 || proyectos > 3) {//Si tambien superan estos numeros se dira la siguiente linea y parara el programa
				
				System.out.println("Enhorabuena. Ha sido contratado");
				
				//Aniado que si supera los 5 anios y los 5 proyectos tendra un salario y si no otro
			  if (años > 5 || proyectos > 5) {
			 
			 System.out.println("Tiene un salario anual de 30000");
			 
			 }
			  else if (años < 5 || proyectos < 5){
				 
				 System.out.println("Tiene un salario anual de 25000");
				 
			 }}else {//Si no se cumple, se dira la siguiente linea
				
				System.out.println("Lo sentimos pero no cumple nuestro perfil");
				
			}
		
		}

	}

}
