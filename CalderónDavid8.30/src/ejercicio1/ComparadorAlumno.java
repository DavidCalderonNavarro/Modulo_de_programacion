/*Descripción: Hago un compare para mostrar de forma ordenada por grupo y nombre
 * Autor:David Calderón Navarro
 * Fecha:18/03/2026
 */

package ejercicio1;

import java.util.Comparator;

public class ComparadorAlumno implements Comparator<Alumno> {

    @Override
    public int compare(Alumno a, Alumno b) {

        int comparaGrupo = a.getGrupo().compareTo(b.getGrupo());

        if (comparaGrupo != 0) {
        	
            return comparaGrupo;
            
        }

        return a.getNombre().compareTo(b.getNombre());
    }
}