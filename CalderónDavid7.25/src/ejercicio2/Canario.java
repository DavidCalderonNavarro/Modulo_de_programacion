package ejercicio2;

import java.time.LocalDate;

public class Canario extends Ave{

	  private String color;
	    private boolean canta;

	    public Canario(String nombre, int edad, String estado, LocalDate fechaNacimiento,
	                   String pico, boolean vuela, String color, boolean canta) {
	        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
	        this.color = color;
	        this.canta = canta;
	    }

	    @Override
	    public void habla() {
	        if (canta)
	            System.out.println(nombre + ": ♪♪♪");
	    }

	    @Override
	    public void muestra() {
	        System.out.println("CANARIO -> Nombre: " + nombre + ", Color: " + color +
	                ", Estado: " + estado);
	    }
	
}
