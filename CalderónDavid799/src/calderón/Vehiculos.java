package calderón;

import java.time.LocalDate;

public class Vehiculos {
	
	
	//Atributos
	
	protected String identificador;
	protected String Matricula;
	protected LocalDate fechaMatriculacion = LocalDate.of(2010, 01, 01);
	protected boolean ITV;
	protected int precioDia;
	
	protected static short contadorIdent = 1;
	
	//Constructor
	
	public Vehiculos(String identificadorp, String Matriculap, LocalDate fecha, boolean ITVp, int precioDiap) {
		
		this.precioDia = precioDiap;
		this.identificador = identificadorp;
		this.Matricula = Matriculap;
		this.ITV = ITVp;
		this.fechaMatriculacion = fecha;
		
	}
	
	//Metodos
	
	public static String generarIdent() {
		
		if(contadorIdent > 999) {
			
			
			
		}
		
		String codigo = String.format("%03d", contadorIdent);
		contadorIdent++;
		
		return codigo;
		
	}
	
	public String toString() {
		
		return "Identificador: " + this.identificador + "| Matricula: " + this.Matricula + "| Fecha de matriculacion: " + this.fechaMatriculacion
				+ "| ITV: " + this.ITV + "| Precio dia: " + this.precioDia;
		
	}

}
