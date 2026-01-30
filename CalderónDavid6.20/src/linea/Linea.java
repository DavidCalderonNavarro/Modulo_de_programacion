/*Descripción: Declaro dos atributos, un constructor Linea y metodos getters y setters
 * Autor:David Calderón Navarro
 * Fecha:27/01/2026
 */

package linea;

public class Linea {

	// Atributos

	private static Punto puntoA;
	private static Punto puntoB;

	// Constructores

	public Linea(Punto puntoAp, Punto puntoBp) throws IllegalArgumentException {
		
		if (puntoAp == null || puntoBp == null) {
			
			throw new IllegalArgumentException("Numero incorrecto");
			
		}
		
		this.puntoA = puntoAp;
		this.puntoB = puntoBp;
		
	}
	
	public Linea() {

		Punto puntoA = new Punto(0, 0);
		Punto puntoB = new Punto(0, 0);

	}

	// Metodos
	
	public static void mueveDerecha(double x) {
		
		puntoA.setX(x + puntoA.getX());
		puntoB.setX(x + puntoB.getX());
		
	}
	
	
	public static void mueveIzquierda(double x) {
		
		puntoA.setX(puntoA.getX() - x);
		puntoB.setX(puntoB.getX() - x);
		
	}
	
	public static void mueveArriba(double y) {
		
		puntoA.setY(y + puntoA.getY());
		puntoB.setY(y + puntoB.getY());
		
	}
	
	
	public static void mueveAbajo(double y) {
		
		puntoA.setY(puntoA.getY() - y);
		puntoB.setY(puntoB.getY() - y);
		
	}
	
    public String toString() {
        return "Linea (" + puntoA + ", " + puntoB + ")";
    }
    
    
	
	
	

}
