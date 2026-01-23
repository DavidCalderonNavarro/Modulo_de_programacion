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
	
	public static void mueveArriba(double x) {
		
		puntoA.setY(x + puntoA.getY());
		puntoB.setY(x + puntoB.getY());
		
	}
	
	
	public static void mueveAbajo(double x) {
		
		puntoA.setY(puntoA.getY() - x);
		puntoB.setY(puntoB.getY() - x);
		
	}
	
    public String toString() {
        return "Linea (" + puntoA + ", " + puntoB + ")";
    }
	
	
	

}
