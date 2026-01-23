package linea;

public class PrincipalLinea {

	public static void main(String[] args) {
		
		Punto p1 = new Punto(0, 0);
	    Punto p2 = new Punto(0, 0);

	    
	    Linea linea1 = new Linea(p1, p2);

		linea1.mueveArriba(2.3);
		linea1.mueveDerecha(6.1);
		linea1.mueveAbajo(2.0);
		
		System.out.println(linea1.toString());
		
	}

}
