package producto;

import java.time.LocalDate;

public class Refrigerados extends Producto{
	
	private String codigo_organismo;
	private short temp_minima;
	private LocalDate fecha_consumo;
	
	//Constructores
	
		public Refrigerados(String nombrep, int codigo_productop, LocalDate fecha_caducidadp, int numero_lotep, 
				String codigo_organismop, short temp_minimap, LocalDate fecha_consumop) throws IllegalArgumentException {
			
			super(codigo_productop, nombrep, fecha_caducidadp, numero_lotep);
			
			this.codigo_organismo = codigo_organismop;
			this.temp_minima = temp_minimap;
			this.fecha_consumo = fecha_consumop;
			
		}

}
