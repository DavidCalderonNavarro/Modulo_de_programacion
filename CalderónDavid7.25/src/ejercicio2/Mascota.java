package ejercicio2;

import java.time.LocalDate;

public abstract class Mascota {

	protected String nombre;
    protected int edad;
    protected String estado;
    protected LocalDate fechaNacimiento;

    public Mascota(String nombre, int edad, String estado, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void cumpleanios() {
        edad++;
    }

    public void morir() {
        estado = "Fallecido";
    }

    public abstract void habla();
    public abstract void muestra();
	
}
