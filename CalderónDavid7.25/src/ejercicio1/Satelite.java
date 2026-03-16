package ejercicio1;

public class Satelite extends Astro{


    private Planeta planeta;

    public Satelite(String nombre, double masa, double diametroMedio,
                    double periodoRotacion, double periodoTraslacion,
                    double distanciaMedia, Planeta planeta) {

        super(nombre, masa, diametroMedio, periodoRotacion,
              periodoTraslacion, distanciaMedia);
        this.planeta = planeta;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    @Override
    public void muestra() {
        System.out.println("SATÉLITE: " + getNombre());
        System.out.println("Pertenece al planeta: " + planeta.getNombre());
        System.out.println("Masa: " + getMasa());
        System.out.println("Diámetro medio: " + getDiametroMedio());
        System.out.println("Período de rotación: " + getPeriodoRotacion());
        System.out.println("Período de traslación: " + getPeriodoTraslacion());
        System.out.println("Distancia media al planeta: " + getDistanciaMedia());
        System.out.println();
    }
    
}
