package prog.ud8.ejercicio10;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio10{
	public static void main(String[] args) {
		SortedSet<Persona> personasPorEdad = new TreeSet<>(new CompararPersonas());
		
		personasPorEdad.add(new Persona("Ana", "García", 30));
		personasPorEdad.add(new Persona("Pedro", "López", 20));
		personasPorEdad.add(new Persona("Francisco", "Martín", 40));
		
		System.out.println("ordenadas por edad:");
		System.out.println(personasPorEdad);
		
		// 3. 
		SortedSet<Persona> personasCompleto =
		        new TreeSet<>(new PersonaCompletoComparator());
		personasCompleto.add(new Persona("Ana", "García", 30));
		personasCompleto.add(new Persona("Pedro", "García", 20));
		personasCompleto.add(new Persona("Ana", "García", 25));
		personasCompleto.add(new Persona("Francisco", "López", 40));
		System.out.println("orden completo:");
		System.out.println(personasCompleto);
	}
}
