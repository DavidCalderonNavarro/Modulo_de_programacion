/*Descripción: 
 * Autor: David Calderón Navarro
 * Fecha: 22/10/2025
 */

package matrices;

public class Temperaturas {

	public static void main(String[] args) {
		
		final int TOTAL_MESES = 12; 
		final int TOTAL_DIAS = 30;
		
		int[][] temp = new int[TOTAL_MESES][TOTAL_DIAS];
		
		iniciartemp(temp);
		
		
		}
	
	public static int[][] iniciartemp (int[][] temp ) {
		
		final int TOTAL_MESES = 12; 
		final int TOTAL_DIAS = 30;
		
		temp = new int [12][30];
		
		for (int mes = 0; mes < TOTAL_MESES; mes++) {		//Inicializacion
			
			for (int dia = 0; dia < TOTAL_MESES; dia++) {
				
				temp[mes][dia]= (int) (Math.random()*40);
				
			}
			
		}
		return temp;

}
	
	public static int[][] mostrartemp (int[][] temp){
		
		final int TOTAL_MESES = 12; 
		final int TOTAL_DIAS = 30;
		
		for (int mes = 0; mes < TOTAL_MESES; mes++) {		//Mostrar la temperatura
			
			for (int dia = 0; dia < TOTAL_DIAS; dia++) {
				
				System.out.print(temp[mes][dia] + "\t");
				
			}
			
			System.out.println();
			
		}
		return temp;
		
		
		
	}
}
