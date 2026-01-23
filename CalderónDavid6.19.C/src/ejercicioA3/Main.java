/*Descripción: Instacia dos objetos y muestra su informacion
 * Autor:David Calderón Navarro
 * Fecha:19/01/2026
 */

package ejercicioA3;

public class Main {

	public static void main(String[] args) {
		
		//Instancio dos objetos de la clase Rectangulo
		
		Rectangulo r1 = new Rectangulo((byte)0, (byte)0, (byte)5, (byte)5);
		Rectangulo r2 = new Rectangulo((byte)7, (byte)9, (byte)2, (byte)3);
		
		//Muestro toda la informacion de cada rectangulo llamando a cada metodo
		
		System.out.println("Primer rectnagulo: ");
		mostrarCoordenadas(r1);
		System.out.println("Perimetro: " + calcularPerimetro(r1));
		System.out.println("Area: " + calcularArea(r1));
		System.out.println(" ");
		
		System.out.println("Segundo rectnagulo: ");
		mostrarCoordenadas(r2);
		System.out.println("Perimetro: " + calcularPerimetro(r2));
		System.out.println("Area: " + calcularArea(r2));
		
	}
	
	public static void mostrarCoordenadas(Rectangulo r) {
		
		System.out.println("(" + r.x1 + "," + r.y1 + ")" + "(" + r.x2 + "," + r.y2 + ")");
		
	}
	
	//Metodo que calcula el perimetro y devuelve un int
	public static int calcularPerimetro(Rectangulo r) {
		
		int ancho = Math.abs(r.x2 - r.x1);
		int alto = Math.abs(r.y2 - r.y1);
		
		int suma = 2 * (ancho + alto);
		
		return suma;
		
	}
	
	//Metodo que calcula el area y devuelve un int
	public static int calcularArea(Rectangulo r) {
		
		int ancho = Math.abs(r.x2 - r.x1);
		int alto = Math.abs(r.y2 - r.y1);
		
		int multiplicacion = ancho * alto;
		
		return multiplicacion;
		
	}

}
