package ejercicio4;

public abstract class Persona {

	// Atributos

	protected final String dni;
	protected String nombre;
	protected int edad;

	// Constructor

	public Persona(String dnip, String nombrep, int edadp) throws IllegalArgumentException {

		if (dnip == null || dnip.isEmpty()) {

			throw new IllegalArgumentException("El dni no puede ser nulo ni vacio");

		}

		if (nombrep == null) {

			throw new IllegalArgumentException("El nombre no puede ser nulo");

		}

		if (edadp < 16) {

			throw new IllegalArgumentException("La edad no puede estar por debajo de 16");

		}

		this.dni = dnip;
		this.nombre = nombrep;
		this.edad = edadp;

	}
	
	//Metodos
	
	public String getDni() {
		
		return this.dni;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public int getEdad() {
		
		return this.edad;
		
	}
	
	public String toString() {
		
		return "\nDni: " + this.dni + "| Nombre: " + this.nombre + "| Edad: " + this.edad;
		
	}

}
