package ejercicio2;

import java.time.LocalDate;
import java.util.LinkedList;

public class Agenda {
	
	//Atributos

	private String nombre;
	private int telefono;
	private String email;
	private LocalDate fecha_nacimiento;
	
	//Constructores
	
	public Agenda(String nombrep, int telefonop, String emailp, LocalDate fechap) {
		
		this.nombre = nombrep;
		this.telefono = telefonop;
		this.email = emailp;
		this.fecha_nacimiento = fechap;
		
	}
	
	//Metodos
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public void setTelefono(int telf) {
		
		this.telefono = telf;
		
	}
	
	public void setEmail(String email) {
		
		this.email = email;
		
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
		
		this.fecha_nacimiento = fecha;
		
	}
	
}
