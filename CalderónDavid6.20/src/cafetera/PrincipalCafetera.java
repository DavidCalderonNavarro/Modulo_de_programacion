/*Descripción: Pongo en practica la clase Cafetera
 * Autor:David Calderón Navarro
 * Fecha:29/01/2026
 */

package cafetera;

public class PrincipalCafetera {

    public static void main(String[] args) {

        // 1️⃣ Cafetera vacía → llenar con 250cc → servir hasta agotarse
        System.out.println("----- CAFETERA 1 -----");

        Cafetera cafetera1 = new Cafetera(1000f);
        cafetera1.llenarCafetera(250f);

        while (cafetera1.getcantidadActual() > 0) {
            cafetera1.servirTaza(50f);
            System.out.println("Café restante: " + cafetera1.getcantidadActual() + " cc");
        }

        System.out.println("La cafetera quedó vacía.\n");

        System.out.println("----- CAFETERA 2 -----");

        Cafetera cafetera2 = new Cafetera(1000f);
        cafetera2.llenarCafetera(cafetera2.getcapacidadMaxima());

        for (int i = 1; i <= 50; i++) {

            if (cafetera2.getcantidadActual() < 50f) {
                System.out.println("No hay suficiente café. Llenando cafetera...");
                cafetera2.llenarCafetera(cafetera2.getcapacidadMaxima());
            }

            cafetera2.servirTaza(50f);
            System.out.println("Café servido #" + i +
                               " | Café restante: " + cafetera2.getcantidadActual() + " cc");
        }
    }
}