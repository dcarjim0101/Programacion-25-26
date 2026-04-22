package prog.ud8.ejercicio10;

import java.util.Comparator;

public class comparadorPorApellido implements Comparator<Persona>{
	public int compare(Persona p1, Persona p2) {
		if (p1.getNombre().equals(p2.getNombre())) {
			return 0;
		} else {
			return -1;
		}
			
	}
}
