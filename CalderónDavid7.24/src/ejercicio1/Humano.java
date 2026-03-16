/*Descripción: Creo la clase Humano y creo dos constructores, dos atributos y getters y setters
 * Autor:David Calderón Navarro
 * Fecha:12/02/2026
 */

package ejercicio1;

public class Humano {
	
	//Atributos
	
	protected String nombre;
	protected String apellido;
	
	//Constructores
	
	public Humano(String nombrep, String apellidop) throws IllegalArgumentException {
		
		if(nombrep == null || nombrep.isEmpty() || apellidop == null ||
				apellidop.isEmpty()) {
			
			throw new IllegalArgumentException("Parametro incorrecto");
			
		}
		
		this.nombre = nombrep;
		this.apellido = apellidop;
		
	}
	
	public Humano() {
		
		this("Juan", "Garcia");
		
	}
	
	//Metodos
	
	//Metodo que devuelve String
	public String getNombreCompleto() {
		
		return "(" + this.apellido + "," + this.nombre + ")";
		
	}
	
	//Metodo que cambia el nombre
	public void setNombre(String nombrep) {
		
		this.nombre = nombrep;
		
	}
	
	//Metodo que cambia el apellido
	public void setApellido(String apellidop) {
		
		this.apellido = apellidop;
		
	}
	
}
