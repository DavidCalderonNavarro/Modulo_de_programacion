package ejercicio1.java;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//1
		CuentaBancaria cuentaPrivada;
		CuentaBancaria cuentaConjunta;
		CuentaBancaria cuentaFamiliar;
		
		//2
		//2.1
		try {
			
			LocalDate fechaerronea = LocalDate.of(2027, 9, 01);
			new CuentaBancaria(0, fechaerronea);
			
		} catch (IllegalArgumentException pasarse) {
			
			System.out.println("Fecha erronea");
			
		}
		
		//2.2
		try {
			
			new CuentaBancaria(-200000);
			
		} catch (IllegalArgumentException dinero) {
			
			System.out.println("Saldo de cuenta erroneo");
			
		}
		
		//2.3
		
		LocalDate fechavalida = LocalDate.of(2021, 7, 01);
		
		cuentaPrivada = new CuentaBancaria(1000, fechavalida, -200);
		
		//2.4
		LocalDate fechavalida2 = LocalDate.of(2021, 7, 01);
		
		cuentaConjunta = new CuentaBancaria(200, fechavalida2);
		
		//2.5
		
		cuentaFamiliar = new CuentaBancaria();
		
		//3
		cuentaPrivada.getId();
		cuentaPrivada.getFechaCreacion();
		cuentaPrivada.getLimiteDescubierto();
		cuentaPrivada.isEmbargada();
		cuentaPrivada.isDescubierta();
		cuentaPrivada.getDiasCuenta();
		
		//4
		cuentaFamiliar.ingresar(100);
		cuentaConjunta.extraer(100);
		cuentaPrivada.transferir(1100, cuentaFamiliar);
		
		//5
		cuentaPrivada.toString();
		
	}


}
