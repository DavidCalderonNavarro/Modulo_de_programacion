/*Descripción: 
 * Autor:David Calderón Navarro
 * Fecha:09/01/2026
 */

package clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDateTime;

public class claseAlumno {
	
	
	//Atributos
	public static final byte MAX_NUM_ALUMNOS_CLASE = 30;
	public static final byte MIN_NUM_ALUMNOS_CLASE = 10;
	public static final short MAX_NUM_ALUMNOS_CENTRO = 1500;
	public static final LocalDate FECHANACP_DEFAULT = LocalDate.of(2000, 1, 1);
	public static final float PESOP_DEFAULT = 60.0f;
	public static final float ALTURAP_DEFAULT = 1.70f;
	public static final byte NUMHERMANOSP_DEFAULT = 0;
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNac;
	private float peso;
	private float altura;
	private byte numHermanos;			
	public static short numAlumMatriculados;
	public static final LocalTime HORA_MAX = LocalTime.of(21, 30);
	private LocalTime horamaxima;
	
	//Constructores
	public claseAlumno(String dniP, String nombreP, String apellidosP, LocalDate fechaNacP, 
			float pesoP, float alturaP, byte numHermanosP) throws IllegalArgumentException{
		
		if (dniP == null || nombreP == null || apellidosP == null || fechaNacP == null || pesoP <= 0 || alturaP <= 0 || numHermanosP < 0) {
		    throw new IllegalArgumentException("alguno de los parámetros de entrada es null");
		} else if (dniP.isEmpty() || nombreP.isEmpty() || apellidosP.isEmpty()) {
		    throw new IllegalArgumentException("alguno de los parámetros de entrada está vacío");
		} else if (!dnicorrecto(dniP)) {
		    throw new IllegalArgumentException("El DNI está mal");
		}
		
		 this.dni = dniP;
	     this.nombre = nombreP;
	     this.apellidos = apellidosP;
	     this.fechaNac = fechaNacP;
	     this.peso = pesoP;
	     this.altura = alturaP;
	     this.numHermanos = numHermanosP;
		
	}
	
	public claseAlumno(String dniP, String nombreP, String apellidosP) throws IllegalArgumentException{
		
		this(dniP, nombreP, apellidosP, FECHANACP_DEFAULT, PESOP_DEFAULT, ALTURAP_DEFAULT, NUMHERMANOSP_DEFAULT);
		
	}
	
	//Noes necesario el uso de this si el atributo se diferencia
	
	
	//Metodos
	public static boolean pesocorrecto(float a) {
		
		boolean correcto = false;
		
			if (a < 10 || a > 300) {
			
				correcto = true;
			
			}
		
		return correcto;
		
	}
	
	public static boolean alturacorrecta(float a) {
		
		boolean correcto = false;
		
			if (a < 0) {
			
				correcto = true;
			
			}
		
		return correcto;
		
	}
	
	public static boolean numhermanos(float a) {
		
		boolean correcto = false;
		
			if (a < 0) {
			
				correcto = true;
			
			}
		
		return correcto;
		
	}
	
	public static boolean mayordeedad(float a) {
		
		boolean correcto = false;
		
			if (a >= 18) {
			
				correcto = true;
			
			}
		
		return correcto;
		
	}
	
	public static boolean dnicorrecto(String a) {
		
		boolean correcto = false;

			Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");
				
			Matcher texto = patron.matcher(a);
				
			
				if (texto.matches()) {
					
					correcto = true;
					
				}else {
					
					correcto = false;
					
				}

		return correcto;

	}

}
