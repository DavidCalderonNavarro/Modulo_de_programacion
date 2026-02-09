package producto;

import java.time.LocalDate;

public class Frescos extends Producto{
	
	//Atributos
	
	private LocalDate fecha_envasado;
	private String pais;
	
	//Constructores
	
	public Frescos(String nombrep, String codigo_productop, LocalDate fecha_caducidadp, int numero_lotep, 
			LocalDate fecha_envasadop, String paisp) throws IllegalArgumentException {
		
		super(codigo_productop, nombrep, fecha_caducidadp, numero_lotep);
		
		if (fecha_envasado.isAfter(LocalDate.now()) || pais.isEmpty()) {
			
			throw new IllegalArgumentException("Algun parametro es incorrecto");
			
		}
		
		this.fecha_envasado = fecha_envasadop;
		this.pais = paisp;
		
	}
	
}
