/*
 * Objetivo: mostrar el desarrollo de las clases creadas
 * Fecha: 
 * Autor: 
 */
package calderón;

import java.time.LocalDate;

public class PrincipalViviendaTuristica {

	public static void main(String[] args) {
		
		
		// 1. Crea un apartamento con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println(" 1 ============");
		
		Apartamento apartamento1 = new Apartamento();
		
		
		//apartamento1.toString();
		
		//2. Calcula el precio para una estancia de 3 días.
		// Evidencia: el precio de la estancia.
		System.out.println(" 2 ============");
		
		apartamento1.calcularPrecioEstancia(20.0f, 3);
		

		//3. Crea un apartamento con precio por noche (valor solicitado al usuario) y distancia al centro (solicitado al usuario). Resto de valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println(" 3 ============");	
		
		try {
		
		Apartamento apartamento2 = new Apartamento(30, 300);
		
		}catch (NullPointerException ex2) {
			
			System.out.println("La fecha es nula");
			
			
		}
		
		//apartamento2.toString();
		
		//4. Calcula el precio para una estancia de 5 días.
		// Evidencia: el precio de la estancia.
		System.out.println(" 4 ============");
		
		//System.out.println(calcularPrecioEstancia(20, 5));
		
		
		//5. Crea una casa rural con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 5 ============");	
		
		try {
			
			CasaRural casarural1 = new CasaRural();
			
			casarural1.toString();
			
		}catch (NullPointerException ex3) {
			
			System.out.println("Los metros cuadrados son nulos");
			CasaRural casarural1 = new CasaRural();
			
		}
		
		
		//6. Crea una casa rural con precio por noche (valor solicitado al usuario) y el resto por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 6 ============");	

		try {
			
			CasaRural casarural2 = new CasaRural(40);
			casarural2.toString();
			
		}catch (NullPointerException ex4) {
			
			System.out.println("Los metros cuadrados son nulos");
			CasaRural casarural2;
			
		}
		
		// 7. Calcula el precio de una estancia de 10 días.
		// Evidencia: el precio de la estancia.
		System.out.println (" 7 ============");
		

		
		// 8. Modifica la fecha de construcción a 1/1/2023.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 8 ============");	

		

		// 9. Indica si la casa es pet friendly.
		// Evidencia. Indica si es "pet friendly".
		System.out.println (" 9 ============");	

		Hotel hotel1 = new Hotel();
		
		System.out.println(hotel1.toString());
		
		// 10. Crea un hotel con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 10 ============");

		
		// 11. Crea un hotel con todos los valores solicitados al usuario. (el objeto debe ser creado por un método)
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 11 ============");	

		
		//12. Calcula el precio de una estancia de 1 día.
		// Evidencia: el precio de la estancia.
		System.out.println (" 12 ============");	

		
		// 13. Modifica el valor de Spa a sí.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 13 ============");	

		
		// 14. Calcula el precio de una estancia de 1 día.
		// Evidencia: el precio de la estancia.
		System.out.println (" 14 ============");	

		
	
		// 15. Calcula el número de viviendas creadas.
		// Evidencia. El número de viviendas creadas.
		System.out.println (" 15 ============");	
		
		
	}

}
