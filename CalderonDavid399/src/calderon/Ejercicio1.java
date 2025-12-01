/*Descripción: Programa que pide nombre de producto,unidades y precio
 * Autor: David Calderón Navarro
 * Fecha: 26/11/2025
 */

package calderon;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Declaro variables
		String producto, terminar;
		int unidades, precio, numproductos = 0; 
		double calculodescuento, descuento = 0.05;
		terminar = "terminar";
		
		//Bucle dowhile para preguntar la primera vez
		do {
			
			//Pregunto el producto
			System.out.println("Dime el nombre del producto: ");
			producto = datos.nextLine();
			
			if (producto.equals(terminar)) {
				
				
			}else {
			
			do {
			
			//Pregunto por el numero de unidades
			System.out.println("Dime el numero de unidades a comprar: ");
			unidades = datos.nextInt();
			
			//Uso el condicional para saber que descuento se lleva
			if (unidades >= 1 && unidades <= 10) {
				
				descuento = 0.05;
				
			}else if (unidades >= 11 && unidades <=50) {
				
				descuento = 0.10;
				
			}else if (unidades >= 51 && unidades <=100) {
				
				descuento = 0.15;
				
			}else {
				
				//Si las unidades son erroneas se vuelve a preguntar
				System.out.println("El numero de unidades es erroneo");
				
			}
			
			//Mientras el numero de unidades sea menor que 1 y mayor que 100 se volvera a preguntar
			}while(unidades <1 || unidades>100);
			
			//Pregunto el precio por unidad
			System.out.print("Dime el precio por unidad:");
			precio = datos.nextInt();
			
			//Calculo el precio de la unidad con el descuento aplicado
			calculodescuento = precio * descuento;
			calculodescuento = precio - calculodescuento;
			calculodescuento = calculodescuento * unidades;
			
			//Muestro el resultado
			System.out.println("El nombre del producto es: " + producto);
			System.out.println("El numeros de unidades es: " + unidades);
			System.out.println("El porcentaje de descuento a aplicar en funcion de las unidades es: " + descuento);
			System.out.println("El total con el descuento aplicado es: " + calculodescuento);
			
			//Cuento los productos que va metiendo el usuario
			numproductos++;
			
			datos.nextLine();
			
			}
			
		}while(!producto.equals(terminar));
		
		//Muestro el numero de productos que el usuario a metido
		System.out.println("El numero de producto procesados a sido de: " + numproductos);
		
		
	}

}
