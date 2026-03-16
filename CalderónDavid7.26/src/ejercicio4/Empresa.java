package ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;

public class Empresa {
	
	//Atributos
	private ArrayList<Empleado> empleados;
	
	protected final String NOMBRE;
	protected final String CIF;
	protected int telefono;
	protected String direccion;
	protected int numeroEmpleados;
	
	//Construtor
	
	public Empresa(String nombrep, String cifp) {
		
		this.NOMBRE = nombrep;
		this.CIF = cifp;
		this.telefono = 111111111;
		this.direccion = "";
		this.numeroEmpleados = 0;
		empleados = new ArrayList<>();
		
	}
	
	//Metodos
	
	public void añadirEmpleado(String nombre, String dni, float SueldoBruto) {
		
		Empleado e = new Empleado(nombre, dni, SueldoBruto);
		
		empleados.add(e);
		
	}
	
	public void eliminarEmpleado(String nombre) {
		
		Iterator<Empleado> it = empleados.iterator();
		
        while (it.hasNext()) {
        	
            Empleado e = it.next();
            if (e.getNombre() == nombre) {
            	
                it.remove();
                
            }
            
        }
		
	}
	
	
	
	
	
}
