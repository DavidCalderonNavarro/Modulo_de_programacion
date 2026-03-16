package ejercicio2;

import java.time.LocalDate;

public class Gato extends Mascota{

	private String color;
    private String peloLargo;

    public Gato(String nombre, int edad, String estado, LocalDate fechaNacimiento,
                String color, String peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public void habla() {
        System.out.println(nombre + ": ¡Miau!");
    }

    @Override
    public void muestra() {
        System.out.println("GATO -> Nombre: " + nombre + ", Color: " + color +
                ", Pelo: " + peloLargo + ", Estado: " + estado);
    }
	
}
