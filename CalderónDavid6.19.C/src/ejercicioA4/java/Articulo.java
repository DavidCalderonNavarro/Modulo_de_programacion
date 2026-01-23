/*Descripción: Declaro cuatro atributos y un constructor Articulo
 * Autor:David Calderón Navarro
 * Fecha:16/01/2026
 */

package ejercicioA4.java;

public class Articulo {
	
	//Atributos
	
	public final byte iva;
	
	public String nombre;
	public double precio;
	public short cuantosQuedan;
	
	//Constructor
	
	public Articulo(String nombre, double precio, byte iva, short cuantosQuedanp) throws IllegalArgumentException{
		
		if (nombre == null || precio <= 0 || iva <= 0 || cuantosQuedanp <= 0) {
			
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
