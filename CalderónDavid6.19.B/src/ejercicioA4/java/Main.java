package ejercicioA4.java;

public class Main {

	public static void main(String[] args) {
		
		Articulo a1 = new Articulo("Hola", 249.99, (byte)21, (short)5);
		Articulo a2 = new Articulo("Hola", 149.99, (byte)21, (short)2);
		
		double precioconiva = aplicarIva(a1.precio);
		double precioconiva2 = aplicarIva(a2.precio);
		
		mostrarMensaje(a1 , precioconiva);
		mostrarMensaje(a2 , precioconiva2);
		
	}
	
	public static void mostrarMensaje(Articulo a, double precioconiva) {
		
		System.out.println(a.nombre + " - Precio:" + a.precio + " - IVA:" + a.iva + "% - PVP:" + precioconiva + "€");
		
	}
	
	public static double aplicarIva(double precio) {
		
		double precioconiva;
		
		precioconiva = precio * 1.21;
		
		return precioconiva;
		
	}

}
