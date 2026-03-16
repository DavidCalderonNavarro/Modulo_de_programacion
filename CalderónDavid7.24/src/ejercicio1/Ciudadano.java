/*Descripción: Creo la clase Ciudadano y creo un constructor, un atributo y redefino un get
 * Autor:David Calderón Navarro
 * Fecha:12/02/2026
 */

package ejercicio1;

public class Ciudadano extends Humano{
	
	//Atributo
	
	protected String documento;
	
	//Constructor
	
	public Ciudadano(String nombrep, String apellidop, String documentop) {
		
		super(nombrep, apellidop);
		
		if(documentop == null || documentop.isEmpty()) {
			
			throw new IllegalArgumentException("Parametro incorrecto");
			
		}
		
		this.documento = documentop;
		
	}
	
	//Metodos
	
	@Override
	
	//Sobre escribo el metodo de la clase padre Humano para ahorrar codigo
	public 	String getNombreCompleto() {
		
		return super.getNombreCompleto() + "(" +  documento + ")";
		
	}
	
}
