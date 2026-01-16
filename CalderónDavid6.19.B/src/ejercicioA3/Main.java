package ejercicioA3;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo((byte)0, (byte)0, (byte)5, (byte)5);
		Rectangulo r2 = new Rectangulo((byte)7, (byte)9, (byte)2, (byte)3);
		
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
