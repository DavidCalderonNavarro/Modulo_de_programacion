package producto;

import java.time.LocalDate;

public abstract class Producto {
	
	//Atributos
	
	private static int contador = 1;
	
	protected String codigo_producto;
	protected String nombre;
	protected LocalDate fecha_caducidad;
	protected int numero_lote;
	
	public Producto (String codigo_productop, String nombrep, LocalDate fecha_caducidadp, int numero_lotep) {
	    
		if (nombrep.isEmpty() || fecha_caducidadp.isBefore(LocalDate.now()) || numero_lotep <= 0) {
			
			throw new IllegalArgumentException("Algun parametro es incorrecto");
			
		}
		
		this.codigo_producto = generarCodigo();
		this.nombre = nombrep;
		this.fecha_caducidad = fecha_caducidadp;
		this.numero_lote = numero_lotep;
		
	}
	
	private String generarCodigo() {
		
		if(contador > 9999) {
			
			throw new IllegalArgumentException("No caben mas productos");
			
		}
		
		String codigo = String.format("%04d", contador);
		contador++;
		
		return codigo;
		
	}
	
	
	

}
