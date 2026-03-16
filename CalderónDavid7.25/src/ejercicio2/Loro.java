package ejercicio2;

import java.time.LocalDate;

public class Loro extends Ave{
	

    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, LocalDate fechaNacimiento,
                String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public void habla() {
        if (habla)
            System.out.println(nombre + ": ¡Hola hola!");
    }

    @Override
    public void muestra() {
        System.out.println("LORO -> Nombre: " + nombre + ", Origen: " + origen +
                ", Estado: " + estado);
    }
	
}
