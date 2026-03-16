/*Descripción: Creo la clase Coche y creo un constructor, dos atributos y getters, setters y toString
 * Autor:David Calderón Navarro
 * Fecha:12/02/2026
 */

package ejercicio2;

import java.time.LocalDate;

public class Coche {
	
	//Atributos
	
	private final LocalDate fecha_matriculacion = LocalDate.of(2003, 3, 12);
	
	protected String matricula;
	protected String nombre_propietario;
	protected int cilindrada;
	protected int potencia;
	
	//Constructores
	
	public Coche(int cilindradap, int potenciap) {
		
		if(cilindradap < 0 || potenciap < 0) {
			
			throw new IllegalArgumentException("Los valores no pueden ser negativos");
			
		}
		
	}
	
	
	
	
}
