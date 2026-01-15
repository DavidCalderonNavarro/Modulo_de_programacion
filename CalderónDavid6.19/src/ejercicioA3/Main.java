package ejercicioA3;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();

		r1.x1 = 0;
		r1.y1 = 0;
		r1.x2 = 5;
		r1.y2 = 5;
		
		r2.x1 = 7;
		r2.y1 = 9;
		r2.x2 = 2;
		r2.y2 = 3;
		
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
	
	public static int calcularPerimetro(Rectangulo r) {
		
		int ancho = Math.abs(r.x2 - r.x1);
		int alto = Math.abs(r.y2 - r.y1);
		
		int suma = 2 * (ancho + alto);
		
		return suma;
		
	}
	
	public static int calcularArea(Rectangulo r) {
		
		int ancho = Math.abs(r.x2 - r.x1);
		int alto = Math.abs(r.y2 - r.y1);
		
		int multiplicacion = ancho * alto;
		
		return multiplicacion;
		
	}

}
