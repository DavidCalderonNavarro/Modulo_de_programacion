package linea;

public class Punto {
	
    // Atributos
    private double x;
    private double y;

    // Constructor por defecto
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor con parámetros
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para mover el punto
    public void mover(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // Método para calcular la distancia al origen
    public double distanciaAlOrigen() {
        return Math.sqrt(x * x + y * y);
    }

    // Método toString
    @Override
    public String toString() {
        return "Punto (" + x + ", " + y + ")";
    }
}