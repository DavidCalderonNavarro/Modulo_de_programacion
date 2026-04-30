package calderon;

import java.util.Objects;

public class Libro {
    private String isbn; // identificador único
    private String titulo;
    private String autor;
    private float precio;

    public Libro(String isbn, String titulo, String autor, float precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    public String getIsbm() {
    	
    	return this.isbn;
    	
    }
    
    public String getAutor() {
    	
    	return this.autor;
    	
    }
    
    public float getPrecio() {
    	
    	return this.precio;
    	
    }
    
    public String toString() {
    	
    	return this.isbn + ";" + this.titulo + ";" + this.autor + ";" + this.precio;
    	
    }

    
}
