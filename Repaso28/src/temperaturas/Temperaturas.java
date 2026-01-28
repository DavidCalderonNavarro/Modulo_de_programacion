package temperaturas;

public class Temperaturas {

	    static final int DIAS = 7;
	    static final int HORAS = 6;

	    public static void main(String[] args) {

	        String[] dias = {
	            "Lunes", "Martes", "Miércoles",
	            "Jueves", "Viernes", "Sábado", "Domingo"
	        };

	        int[][] temperaturas = {
	            {12,14,16,13,17,21},
	            {11,13,15,17,16,14},
	            {10,12,14,16,15,13},
	            {13,15,17,19,18,16},
	            {14,16,18,20,19,17},
	            {15,17,19,21,20,18},
	            {13,15,17,19,18,16}
	        };

	        horamayorTemp(temperaturas, dias);
	        tempMaxima(temperaturas, dias);
	        tempMedia(temperaturas);
	        horamas18(temperaturas, dias);
	    }

	    public static void horamayorTemp(int[][] temp, String[] dias) {
	        System.out.println("\na) Hora con mayor temperatura por día");

	        for (int d = 0; d < DIAS; d++) {
	            int max = temp[d][0];
	            int horaMax = 0;

	            for (int h = 1; h < HORAS; h++) {
	                if (temp[d][h] > max) {
	                    max = temp[d][h];
	                    horaMax = h;
	                }
	            }
	            System.out.println(dias[d] + " → hora " + horaMax);
	        }
	    }

	    public static void tempMaxima(int[][] t, String[] dias) {
	        int max = t[0][0];
	        int diaMax = 0;

	        for (int d = 0; d < DIAS; d++) {
	            for (int h = 0; h < HORAS; h++) {
	                if (t[d][h] > max) {
	                    max = t[d][h];
	                    diaMax = d;
	                }
	            }
	        }

	        System.out.println("\nb) Día más caluroso: " + dias[diaMax] + " (" + max + "°C)");
	    }

	    public static void tempMedia(int[][] t) {
	        int suma = 0;

	        for (int d = 0; d < DIAS; d++) {
	            for (int h = 0; h < HORAS; h++) {
	                suma += t[d][h];
	            }
	        }

	        double media = (double) suma / (DIAS * HORAS);
	        System.out.println("\nc) Temperatura media semanal: " + media);
	    }

	    public static void horamas18(int[][] t, String[] dias) {
	        System.out.println("\nd) Primera hora con temperatura > 18");

	        for (int d = 0; d < DIAS; d++) {
	            boolean encontrada = false;

	            for (int h = 0; h < HORAS && !encontrada; h++) {
	                if (t[d][h] > 18) {
	                    System.out.println(dias[d] + ": hora " + h);
	                    encontrada = true;
	                }
	            }

	            if (!encontrada) {
	                System.out.println(dias[d] + ": ninguna");
	            }
	        }
	    }
	}