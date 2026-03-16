package ejercicio4;

public class Empleado{

	// Atributos

	private final String NOMBRE;
	private final String DNI;

	private float sueldoBrutoMensual;
	private short edad;
	private int telefono;
	private String direccion;

	// Constructores

	public Empleado(String nombrep, String dnip, float sueldoBrutoMensualp) {

		this.NOMBRE = nombrep;
		this.DNI = dnip;
		this.sueldoBrutoMensual = sueldoBrutoMensualp;
		this.edad = 20;
		this.telefono = 111111111;
		this.direccion = "";

	}

	// Metodos
	
	public String getNombre() {
		
		return this.NOMBRE;
		
	}
	
	public String getDni() {
		
		return this.DNI;
		
	}
	
	public float getSueldoBruto() {
		
		return this.sueldoBrutoMensual;
		
	}

	public String toString() {

		return "Nombre: " + this.NOMBRE + "|Dni: " + this.DNI + "|Sueldo Bruto Mensual: " + this.sueldoBrutoMensual
				+ "\n|Edad: " + this.edad + "|Telefono: " + this.telefono + "|Direccion: " + this.direccion;

	}

	public float calcularSueldoNeto(float sueldoMensualBruto) {

	    float sueldoAnualBruto = sueldoMensualBruto * 12;
	    float impuesto = 0;

	    if (sueldoAnualBruto < 12000) {

	        impuesto = sueldoAnualBruto * 0.20f;

	    } else if (sueldoAnualBruto >= 12000 | sueldoAnualBruto <= 25000) {

	        impuesto = sueldoAnualBruto * 0.30f;

	    } else if(sueldoAnualBruto > 25000){

	        impuesto = sueldoAnualBruto * 0.40f;
	    }

	    float sueldoNeto = sueldoAnualBruto - impuesto;
	    
	    return sueldoNeto;

	}
	
	

}
