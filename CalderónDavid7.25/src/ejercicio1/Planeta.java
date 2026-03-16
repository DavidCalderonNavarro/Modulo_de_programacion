package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Planeta extends Astro{

	private List<Satelite> satelites;

    public Planeta(String nombre, double masa, double diametroMedio,
                   double periodoRotacion, double periodoTraslacion,
                   double distanciaMedia) {

        super(nombre, masa, diametroMedio, periodoRotacion,
              periodoTraslacion, distanciaMedia);
        satelites = new ArrayList<>();
    }

    public void agregarSatelite(Satelite s) {
        satelites.add(s);
    }

    public List<Satelite> getSatelites() {
        return satelites;
    }

    @Override
    public void muestra() {
        System.out.println("PLANETA: " + getNombre());
        System.out.println("Masa: " + getMasa());
        System.out.println("Diámetro medio: " + getDiametroMedio());
        System.out.println("Período de rotación: " + getPeriodoRotacion());
        System.out.println("Período de traslación: " + getPeriodoTraslacion());
        System.out.println("Distancia media al Sol: " + getDistanciaMedia());

        if (satelites.isEmpty()) {
            System.out.println("No tiene satélites.");
        } else {
            System.out.println("Satélites:");
            for (Satelite s : satelites) {
                System.out.println("   - " + s.getNombre());
            }
        }
        System.out.println();
    }
	
	
}
