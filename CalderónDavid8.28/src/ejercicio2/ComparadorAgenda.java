package ejercicio2;

import java.util.Comparator;

public class ComparadorAgenda implements Comparator<Agenda>{

	@Override
	public int compare(Agenda agenda1, Agenda agenda2) {
		
		return agenda1.getNombre().compareTo(agenda2.getNombre());
		
	}
	
}
