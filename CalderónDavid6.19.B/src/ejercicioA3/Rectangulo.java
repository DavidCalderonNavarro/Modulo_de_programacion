/*Descripción: Declaro cuatro atributos y un constructor Rectangulo
 * Autor:David Calderón Navarro
 * Fecha:16/01/2026
 */

package ejercicioA3;

import java.time.LocalDate;

public class Rectangulo {
	
	public byte x1;
	public byte x2;
	public byte y1;
	public byte y2;
	
	public Rectangulo(byte x1, byte y1, byte x2, byte y2) throws IllegalArgumentException{
		
		if (x2 <= x1 || y2 <= y1) {
            throw new IllegalArgumentException("x2 debe ser mayor que x1 y y2 mayor que y1");
        }
		
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		
	}
	
}
