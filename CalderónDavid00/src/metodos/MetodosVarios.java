package metodos;

public class MetodosVarios {

	public static void main(String[] args) {
		
		boolean par;
		
		par = esPar(7);
		
		System.out.println(par);
		
		boolean impar;
		
		impar = esImpar(7);
		
		System.out.println(impar);
		
	}
	
	//Metodo que calcula si el numero es par devolviendo un valor boolean
	public static boolean esPar (int numero) {
		
		boolean par;
		if (numero % 2 == 0) {
			
			par = true;
			
		}else {
			
			par = false;
			
		}
		
		return par;
		
	}
	
	public static boolean esImpar (int numero) {
		
		return !esPar(numero);
		
	}
	
}
