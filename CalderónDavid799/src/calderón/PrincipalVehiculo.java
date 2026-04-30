package calderón;

import java.time.LocalDate;
import java.util.Scanner;

public class PrincipalVehiculo {
    public static void main(String[] args) {

       Scanner datos = new Scanner(System.in);
       
       int mercancia;
       String refrigeracion, identificador, matricula;
       boolean ITV;
       int precioDia;
       float toneladas;
       

        // 1. Crear camión 20tn
    	
    	Camion camion1 = new Camion(20);
    	System.out.println(camion1.toString());
    	
        // 2. Calcular precio 3 días
       
    	System.out.println("Precio de camion1 por 3 dias es de: " + camion1.CosteOperativo(3));
    	
        // 3. Crear furgoneta con volumen máx. y refrigerado
        
    	System.out.println("Dime el volumen maximo permitido para la furgoneta: ");
    	mercancia = Entrada.entero();
    	
    	System.out.println("Dime si la furgoneta tiene refrigeracion(si o no): ");
    	refrigeracion = Entrada.cadena();
    	
    	Furgoneta furgo1 = new Furgoneta(mercancia, refrigeracion);
    	
        // 4. Calcular precio 5 días
        
    	

        // 5. Modificar ITV camión
        

        // 6. Calcular precio 3 días
        

        // 7. Indica si la furgoneta tiene refrigeración
        

        // 8. Modifica el valor del precio por día de la furgoneta
        

        // 9. Camión por método (el objeto debe ser vreado por un método
        
    	System.out.println("Dime el identificador: ");
    	identificador = datos.nextLine();
    	
    	System.out.println("Dime la matricula: ");
    	matricula = datos.next();
    	
    	System.out.println("Dime la ITV: ");
    	
    	
        // 10. Número total vehículos
        
    }
    
    //Metodos
    
    public void CrearCamion(String identificador, String Matricula, LocalDate fechaMatriculacion, boolean ITV,
			int precioDia, float toneladas) {
    	
    	
    	
    	
    }
    
}

