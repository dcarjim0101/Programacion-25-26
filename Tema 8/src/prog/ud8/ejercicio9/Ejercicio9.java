package prog.ud8.ejercicio9;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio9 {
	public static void main(String[] args) {
		SortedSet<Persona> personas = new TreeSet<>();
		
		Persona fran = new Persona("Francisco");
		Persona pedro = new Persona("Pedro");
		Persona ana = new Persona("Ana");
		
		personas.add(new Persona("fran"));
		personas.add(new Persona("pedro"));
		personas.add(new Persona("ana"));
		
		fran.compareTo(ana);
		
		System.out.println(personas);
	}
}
