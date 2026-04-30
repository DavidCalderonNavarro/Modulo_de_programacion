package calderón;

import java.time.LocalDate;

public class CasaRural {

	// Atributos

	private int metrosCuadrados;
	private boolean admiteMascota;
	public float precioPorNoche;

	// Variables

	final int metroscuadrados = 80;

	// Constructores

	public CasaRural(float precioPorNochep) {

		if (metrosCuadrados < 0) {

			throw new IllegalArgumentException("Los metros cuadrados no pueden ser menor que 0");

		}

		this.metrosCuadrados = metroscuadrados;
		this.admiteMascota = true;

	}

	public CasaRural() {

		if (metrosCuadrados < 0) {

			throw new IllegalArgumentException("Los metros cuadrados no pueden ser menor que 0");

		}

		this.metrosCuadrados = metroscuadrados;
		this.admiteMascota = true;

	}

	// Metodos

	public String toString() {

		return "Metros Cuadrados: " + this.metrosCuadrados + "|Admite Mascota: " + this.admiteMascota;

	}

}
