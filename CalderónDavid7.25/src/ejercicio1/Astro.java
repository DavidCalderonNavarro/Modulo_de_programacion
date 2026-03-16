package ejercicio1;

public abstract class Astro {

	private double masa;
	private double diametroMedio;
	private double periodoRotacion;
	private double periodoTraslacion;
	private double distanciaMedia;
	private String nombre;

	// Constructor
	public Astro(String nombre, double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion,
			double distanciaMedia) {
		this.nombre = nombre;
		this.masa = masa;
		this.diametroMedio = diametroMedio;
		this.periodoRotacion = periodoRotacion;
		this.periodoTraslacion = periodoTraslacion;
		this.distanciaMedia = distanciaMedia;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getDiametroMedio() {
		return diametroMedio;
	}

	public void setDiametroMedio(double diametroMedio) {
		this.diametroMedio = diametroMedio;
	}

	public double getPeriodoRotacion() {
		return periodoRotacion;
	}

	public void setPeriodoRotacion(double periodoRotacion) {
		this.periodoRotacion = periodoRotacion;
	}

	public double getPeriodoTraslacion() {
		return periodoTraslacion;
	}

	public void setPeriodoTraslacion(double periodoTraslacion) {
		this.periodoTraslacion = periodoTraslacion;
	}

	public double getDistanciaMedia() {
		return distanciaMedia;
	}

	public void setDistanciaMedia(double distanciaMedia) {
		this.distanciaMedia = distanciaMedia;
	}

	// Método abstracto
	public abstract void muestra();

}
