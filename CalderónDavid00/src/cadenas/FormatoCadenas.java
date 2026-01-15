package cadenas;

public class FormatoCadenas {

	public static void main(String[] args) {
		
		String nombre = "David";
		int edad = 20;
		double altura = 1.87;
		double peso = 75.4;
		double indice = 75.4 / (1.87 * 1.87);
		
		
		
		String cadena = String.format("Nombre: %s  //  Edad: %d ", nombre, edad);
		System.out.println(cadena);
		
		System.out.printf("Nombre: %s  //  Edad: %d  // Altura: %.1f  //  Indice de masa corporal: %.3f", nombre, edad, altura, indice);
		
		
	}

}
