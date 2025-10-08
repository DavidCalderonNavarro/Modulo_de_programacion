/*
 * Descripción: Voy a hacer ejemplos de conversiones de tipos
 * Autor: David Calderón Navarro
 * Fecha: 01/10/2025
 */

package operadoresBase;

public class Conversiontipos {

	public static void main(String[] args) {
		
		byte monederoPequenyo = 10;
		int monederoMediano = 150;
		long monederoGrande = 100000000000l;
		
		monederoGrande = monederoMediano;//Conversión automática
		monederoMediano = monederoPequenyo;//Conversión automática
		
		monederoPequenyo = (byte) monederoMediano; //Cast
		
		System.out.println("Monedero pequeño: " + monederoPequenyo);
		System.out.println("Monedero mediano: " + monederoMediano);
		System.out.println("Monedero grande: " + monederoGrande);
		

	}

}
