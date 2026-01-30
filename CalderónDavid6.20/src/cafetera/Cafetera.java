/*Descripción: Declaro dos atributos, tres constructores Cafetera y metodos getters y setters
 * Autor:David Calderón Navarro
 * Fecha:29/01/2026
 */

package cafetera;

public class Cafetera {

	// Atributos

	private float capacidadMaxima;
	private float cantidadActual;

	// Constructores

	public Cafetera(float capacidadMaximap, float cantidadActualp) {

		if (capacidadMaximap <= 0 || cantidadActualp < 0) {

			throw new IllegalArgumentException("Los valores no pueden ser menores que cero");

		}

		if (cantidadActualp > capacidadMaximap) {

			throw new IllegalArgumentException("La cantidad maxima no puede ser menor que la cantidad actual");

		}

		this.cantidadActual = cantidadActualp;
		this.capacidadMaxima = capacidadMaximap;

	}

	public Cafetera() {

		this((float) 1000, (float) 0);

	}

	public Cafetera(float capacidadMaximap) throws IllegalArgumentException {

		this.capacidadMaxima = capacidadMaximap;
		this.cantidadActual = 0;

	}

	// Metodos

	public void llenarCafetera(float cantidad) {

		if (this.cantidadActual + cantidad > this.capacidadMaxima) {
			
			System.out.println("La cantidad supera la capacidad máxima. Se llenó la cafetera.");
			this.cantidadActual = this.capacidadMaxima;
			
		} else {
			this.cantidadActual += cantidad;

			if (cantidad <= 0) {

				throw new IllegalArgumentException("La cantidad introducida no puede ser menor que cero");

			} else {

				this.cantidadActual += cantidad;

			}

		}

	}

	public void servirTaza(float tamanoTaza) {

		if (this.cantidadActual >= tamanoTaza) {

			this.cantidadActual -= tamanoTaza;
			System.out.println("Taza servida");

		} else {

			this.cantidadActual = 0;

		}
	}

	public void vaciarCafetera() {

		this.cantidadActual = 0;

	}

	public float getcantidadActual() {

		return this.cantidadActual;

	}

	public float getcapacidadMaxima() {

		return this.capacidadMaxima;

	}

	public void setcapacidadMaxima(float cantidad) {

		this.capacidadMaxima = cantidad;

	}

	public String toString() {

		return "La cafetera tiene una capcidad maxima de " + capacidadMaxima + "cc y actualmente tiene "
				+ cantidadActual + "cc";

	}

}
