	
	
package prog.ud8.ejercicio9;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		// 1. 
		SortedSet<Persona> personas = new TreeSet<>();
		
		// 2. 
		Persona fran = new Persona("Francisco");
		Persona pedro = new Persona("Pedro");
		Persona ana = new Persona("Ana");
		
		personas.add(new Persona("fran"));
		personas.add(new Persona("pedro"));
		personas.add(new Persona("ana"));
		
		fran.compareTo(ana);
		
		System.out.println(personas);
		
		// 4. 
		System.out.println("son iguales?: " + p1.equals(p2));

		System.out.println("Hash p1: " + p1.hashCode());
		System.out.println("Hash p2: " + p2.hashCode());
		
		// 5. 
		Set<Persona> personasInsercion = new LinkedHashSet<>();
		personasInsercion.addAll(personas);
		System.out.println("coleccion con orden de insercion:");
		System.out.println(personasInsercion);
	}
}
