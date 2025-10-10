package dowhile;

public class cuentaatras {

	public static void main(String[] args) {
		
		int num = 100;
		
		System.out.println("Cuenta atras desde 100 hasta 0, de 10 en 10.");
		do {
			
			System.out.print(" " + num);
			num = num - 10;
			
		}while (num >= 0);

	}

}
