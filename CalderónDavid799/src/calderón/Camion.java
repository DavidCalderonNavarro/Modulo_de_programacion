package calderón;

import java.time.LocalDate;

public class Camion extends Vehiculos{

	//Atributos
	
	private float toneladas;
	
	//Constructor
	
	public Camion(float toneladasp) {
		
		super("AA-001", "abc-123", LocalDate.now(), true, 20);
		
		this.toneladas = toneladasp;
			
	}
	
	//Metodos
	
	public float CosteOperativo(int numDias) {
		
		float coste;
		
		coste = precioDia * numDias;
		
		if(this.toneladas > 10) {
			
			coste = coste * 1.2f;
			
		}
		
		return coste;
		
	}
	
	@Override
	public String toString() {
		
		return "\nIdentificador: " + this.identificador + "| Matricula: " + this.Matricula + "| Fecha de matriculacion: " + this.fechaMatriculacion
				+ "\n| ITV: " + this.ITV + "| Precio dia: " + this.precioDia +  "| Toneladas: " + this.toneladas;
		
	}
	
}
	

