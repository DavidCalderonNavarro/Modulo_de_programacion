package ejercicioA2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		PedirNombre(p1);
		PedirApellidos(p1);
		PedirDni(p1);
		PedirEdad(p1);
		
		PedirNombre(p2);
		PedirApellidos(p2);
		PedirDni(p2);
		PedirEdad(p2);
		
		mostrarMensaje(p1);
		mostrarMensaje(p2);
		
	}
	
	public static String PedirNombre(Persona p) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		p.nombre = datos.next();
		
		return p.nombre;
		
	}
	
	public static String PedirApellidos(Persona p) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Dime tu apellidos: ");
		p.apellidos = datos.nextLine();
		
		return p.apellidos;
		
	}
	
	public static String PedirDni(Persona p) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Dime tu dni: ");
		p.dni = datos.next();
		
		return p.dni;
		
	}
	
	public static byte PedirEdad(Persona p) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Dime tu edad: ");
		p.edad = datos.nextByte();
		
		return p.edad;
		
	}
	
	public static void mostrarMensaje(Persona p) {
		
		if (p.edad >= 18) {
		
			System.out.println(p.nombre + " " + p.apellidos + " con DNI " + p.dni + " es mayor de edad");
		
		}else {
			
			System.out.println(p.nombre + " " + p.apellidos + " con DNI " + p.dni + " no es mayor de edad");
			
		}
		
	}
	

}
