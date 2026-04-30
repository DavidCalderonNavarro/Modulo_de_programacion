package ejercicio1;

public class Alumno {

	//Atributos
	
	String grupo;
    String nombre;
    int[] notas;
    
    //Constructor

    public Alumno(String grupo, String nombre, int[] notas) {
        this.grupo = grupo;
        this.nombre = nombre;
        this.notas = notas;
    }
    
    //Metodos
    
    public String toString() {
    	
    	return this.nombre;
    	
    }
    
    public String getNombre() {
    	
    	return this.nombre;
    	
    }
    
    public String getGrupo() {
    	
    	return this.grupo;
    	
    }
    
    public int[] getNotas(){
    	
    	return this.notas;
    	
    }
	
}
