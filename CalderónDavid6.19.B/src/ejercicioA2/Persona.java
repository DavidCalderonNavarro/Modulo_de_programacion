/*Descripción: Declaro cuatro atributos y un constructor Persona
 * Autor:David Calderón Navarro
 * Fecha:16/01/2026
 */

package ejercicioA2;

public class Persona {
	
	public  String dni;
	public  String nombre;
	public String apellidos;
	public int edad;
	
	public Persona(String dnip, String nombrep, String apellidosp, int edadp) {
		
		this.dni = dnip;
		this.nombre = nombrep;
		this.apellidos = apellidosp;
		this.edad = edadp;
		
	}
	
}
