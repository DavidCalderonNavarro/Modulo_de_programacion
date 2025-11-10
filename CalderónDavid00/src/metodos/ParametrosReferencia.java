package metodos;

public class ParametrosReferencia {

	public static void main(String[] args) {
		
		int[] vectorOriginal = {1,2,3};
		int[] vectorfinal = new int[3];
		
		for (int i = 0; i < vectorOriginal.length; i++) {
			
			System.out.print(vectorOriginal[i] + " ");
			
		}
		System.out.println(" ");
		
		vectorfinal = cambiovector(vectorOriginal);
		
		for (int i = 0; i < vectorOriginal.length; i++) {
			
			System.out.print(vectorOriginal[i] + " ");
			
		}
		System.out.println(" ");
		
		for (int i = 0; i < vectorfinal.length; i++) {
			
			System.out.print(vectorfinal[i] + " ");
			
		}
		System.out.println(" ");
		
	}
	
	public static int[] cambiovector(int[] vector) {
		
		int[] vectorMetodo = new int[3];
		
		vector[0] = 5;
		vector[1] = 10;
		vectorMetodo[0] = vector[0] + 2;
		vectorMetodo[1] = vector[1] + 10;
		
		return vectorMetodo;
		
	}

}
