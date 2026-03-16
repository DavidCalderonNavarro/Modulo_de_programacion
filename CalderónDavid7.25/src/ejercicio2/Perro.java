package ejercicio2;

import java.time.LocalDate;

public class Perro extends Mascota{

	 private String raza;
	    private boolean pulgas;

	    public Perro(String nombre, int edad, String estado, LocalDate fechaNacimiento,
	                 String raza, boolean pulgas) {
	        super(nombre, edad, estado, fechaNacimiento);
	        this.raza = raza;
	        this.pulgas = pulgas;
	    }

	    @Override
	    public void habla() {
	        System.out.println(nombre + ": ¡Guau!");
	    }

	    @Override
	    public void muestra() {
	        System.out.println("PERRO -> Nombre: " + nombre + ", Edad: " + edad +
	                ", Raza: " + raza + ", Pulgas: " + pulgas +
	                ", Estado: " + estado);
	    }
	
}
