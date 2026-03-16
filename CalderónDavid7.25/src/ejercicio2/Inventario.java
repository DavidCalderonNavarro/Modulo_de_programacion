package ejercicio2;

public class Inventario {

	private Mascota[] animales;
	private int contador;

	public Inventario(int capacidad) {
		animales = new Mascota[capacidad];
		contador = 0;
	}

	public void insertar(Mascota m) {
		if (contador < animales.length) {
			animales[contador++] = m;
		}
	}

	public void listar() {
		for (int i = 0; i < contador; i++) {
			System.out.println(animales[i].getClass().getSimpleName() + " - " + animales[i].getNombre());
		}
	}

	public void mostrarAnimal(String nombre) {
		for (int i = 0; i < contador; i++) {
			if (animales[i].getNombre().equalsIgnoreCase(nombre)) {
				animales[i].muestra();
				return;
			}
		}
		System.out.println("No encontrado.");
	}

	public void mostrarTodos() {
		for (int i = 0; i < contador; i++) {
			animales[i].muestra();
		}
	}

	public void eliminar(String nombre) {
		
		for (int i = 0; i < contador; i++) {
			
			if (animales[i].getNombre().equalsIgnoreCase(nombre)) {
				
				animales[i] = animales[contador - 1];
				animales[contador - 1] = null;
				contador--;
				
				return;
				
			}
			
		}
		
	}

	public void vaciar() {
		animales = new Mascota[animales.length];
		contador = 0;
	}

}
