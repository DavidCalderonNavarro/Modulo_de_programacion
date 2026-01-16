package ejercicioA4.java;

public class Articulo {
	
	public final byte iva;
	
	public String nombre;
	public double precio;
	public short cuantosQuedan;
	
	public Articulo(String nombre, double precio, byte iva, short cuantosQuedanp) throws IllegalArgumentException{
		
		if (nombre == null || precio <= 0 || iva <= 0 || cuantosQuedan <= 0) {
			
			throw new IllegalArgumentException("Algun parametro es inválido");
			
		}
		
		if (nombre.isEmpty()) {
			
			throw new IllegalArgumentException("El nombre esta vacio");
			
		}
		
		this.nombre = nombre;
		this.precio = precio;
		this.iva = iva;
		this.cuantosQuedan = cuantosQuedanp;
		
	}
	
}
