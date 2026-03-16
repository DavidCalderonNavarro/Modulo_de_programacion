package ejercicio2;

import java.time.LocalDate;
import java.util.Scanner;

public class Principalanimales {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);

		Inventario inv = new Inventario(50);

		inv.insertar(new Perro("Bobby", 3, "Sano", LocalDate.now(), "Labrador", false));
		inv.insertar(new Gato("Misu", 2, "Sano", LocalDate.now(), "Negro", "Corto"));
		inv.insertar(new Loro("Pirata", 4, "Sano", LocalDate.now(), "Curvo", true, "Brasil", true));
		inv.insertar(new Canario("Piolin", 1, "Sano", LocalDate.now(), "Pequeño", true, "Amarillo", true));
		
		int op;

		do {
			System.out.println("\n1.Listar animales");
			System.out.println("2.Ver animal");
			System.out.println("3.Ver todos");
			System.out.println("4.Eliminar");
			System.out.println("5.Vaciar inventario");
			System.out.println("0.Salir");
			op = datos.nextInt();
			datos.nextLine();

			switch (op) {
			case 1 -> inv.listar();
			case 2 -> {
				System.out.print("Nombre: ");
				inv.mostrarAnimal(datos.nextLine());
			}
			case 3 -> inv.mostrarTodos();
			case 4 -> {
				System.out.print("Nombre: ");
				inv.eliminar(datos.nextLine());
			}
			case 5 -> inv.vaciar();
			}

		} while (op != 0);
	}

}
