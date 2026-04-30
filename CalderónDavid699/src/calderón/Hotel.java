package calderón;

public class Hotel {

	//Atributos
	
	private byte estrellas;
	private int numeroHabitaciones;
	private boolean disponeSpa;
	
	//Variables
	final byte estrellasp = 4;
	final int numeroHabitacionesp = 10;
	
	//Constructores
	

	
	public Hotel() {
		
		this.estrellas = estrellasp;
		this.numeroHabitaciones = numeroHabitacionesp;
		this.disponeSpa = true;
		
	}
	
	//Metodos
	
	public String toString() {
		
		return "Estrellas: " + this.estrellas + "|Numero de habitaciones: " + this.numeroHabitaciones
				+ "|Dispone Spa: " + this.disponeSpa;
		
	}
	
}
