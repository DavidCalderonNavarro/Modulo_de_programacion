package calderón;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio2 {

	static final int NUM_CUENTAS = 9;
	
	public static void main(String[] args) {
		
		CuentaBancaria[] cuentas = new CuentaBancaria[NUM_CUENTAS];
		
		
		

	}
	
	public static int anyoAleatorio() {
		
		int anyo = 0;
		
		do {
		
		anyo = (int) (Math.random()* 2100);
		
		}while(anyo < 1800);
		
		return anyo;
		
	}
	
	public static void instanciarCuentas(CuentaBancaria[] cuentas) {
		
		int anyo = anyoAleatorio();
		
		final int NUM_CUENTAS = 9;
		
		for (int i = 0; i < NUM_CUENTAS; i++) {
			
			cuentas[i] = new CuentaBancaria(2000,LocalDate.of(anyo, 2, 2));
			
			System.out.println(cuentas[i]);
			
		}
		
	}
	
	
	

}
