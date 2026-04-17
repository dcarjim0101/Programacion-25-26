package prog.ud8.ejemplos;

import java.util.SortedSet;
import java.util.TreeSet;

import prog.ud8.ejercicio2.Persona;

public class ejemploComparar {

	public static void main(String[] args) {
		SortedSet<Persona> personas = new TreeSet<>();
		personas.add(new Persona("fran"));
		personas.add(new Persona("ana"));
		System.out.println(personas);
	}

}
