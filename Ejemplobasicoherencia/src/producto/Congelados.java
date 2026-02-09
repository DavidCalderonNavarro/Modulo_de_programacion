package producto;

import java.time.LocalDate;

public class Congelados extends Producto{
	
	private short temp_congelacion;
	private short meses_conservacion;
	
	//Constructores
	
		public Congelados(String nombrep, int codigo_productop, LocalDate fecha_caducidadp, int numero_lotep, 
				short temp_congelacionp, short meses_conservacionp) throws IllegalArgumentException {
			
			super(codigo_productop, nombrep, fecha_caducidadp, numero_lotep);
			
			this.temp_congelacion = temp_congelacionp;
			this.meses_conservacion = meses_conservacionp;
			
		}

}
