package calderón;

import java.time.LocalDate;

public class Apartamento {

	// Atributos

	public int numeroHabitaciones;
	public float distanciaCentro;
	public LocalDate fechaUltimaReforma;
	public float precioPorNoche;

	// Variables

	final int numerohabitaciones = 10;
	final float distanciacentro = 200;

	// Constructores

	public Apartamento(float precioPorNochep, float distanciaCentrop) throws IllegalArgumentException {

		if (fechaUltimaReforma.isAfter(LocalDate.now())) {

			throw new IllegalArgumentException("La fecha de reforma no puede ser posterior a la actual");

		}
		
		this.precioPorNoche = precioPorNochep;
		this.distanciaCentro = distanciaCentrop;
		this.numeroHabitaciones = numerohabitaciones;
		this.fechaUltimaReforma = LocalDate.of(2024, 01, 01);

	}

	public Apartamento() {

		

		this.numeroHabitaciones = numerohabitaciones;
		this.distanciaCentro = distanciacentro;
		this.fechaUltimaReforma = LocalDate.of(2024, 01, 01);

	}

	// Metodos

	public String toString() {
		
		return "Numero Habitaciones: " + this.numeroHabitaciones + "|Dsitancia Centro: " + this.distanciaCentro
				+ "Fecha de ultima reforma: " + this.fechaUltimaReforma;
		
	}

	public float calcularPrecioEstancia(float precio, int dias) {

		float precioTotal;
		float precioPorcentaje;
		float porcentaje = 0.15f;

		precioTotal = precio * dias;

		if (this.distanciaCentro < 2000) {

			precioPorcentaje = precioTotal * porcentaje;
			
			precioTotal = precioTotal + precioPorcentaje;

		}

		return precioTotal;

	}

}
