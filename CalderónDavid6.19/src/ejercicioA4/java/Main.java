package ejercicioA4.java;

public class Main {

	public static void main(String[] args) {
		
		Articulo a1 = new Articulo();
		
		a1.nombre = "Tarjeta Grafica RTX 5050";
		a1.precio = 249.99;
		a1.iva = 21;
		a1.cuantosQuedan = 5;
		
		double precioconiva = aplicarIva(a1.precio);
		
		mostrarMensaje(a1 , precioconiva);

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
