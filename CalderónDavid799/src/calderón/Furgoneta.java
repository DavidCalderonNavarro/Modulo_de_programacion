package calderón;

import java.time.LocalDate;

public class Furgoneta extends Vehiculos{

	//Atributos
	
	private int Mercancia;
	private String Refrigeracion;
	
	//Constructor
	
	public Furgoneta(int Mercanciap, String Refrigeracionp) {
		
		super("AA-002", "AAA-1234", LocalDate.now(), true, 32);
		
		this.Mercancia = Mercanciap;
		this.Refrigeracion = Refrigeracionp;
		
	}
	
	//Metodos
	
	public float CosteOperativoFurgo(int precioDia, int numDias) {
		
		float coste, multi;
		
		if(this.Refrigeracion.equalsIgnoreCase("si")) {
			
			precioDia += 25;
			
		}
		
		coste = precioDia * numDias;
		
		return coste;
		
	}
	
	
	
}
