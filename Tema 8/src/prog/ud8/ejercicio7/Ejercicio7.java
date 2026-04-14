package prog.ud8.ejercicio7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio7 {
	public static void main(String[] args) {
		// 1. Crea un conjunto vacío de cadenas → Declara usando la interfaz
		Set<String> conjuntoCadenas = new HashSet<>();
		
		// 2. Agrega los nombres de varios alumnos al conjunto → Usa los métodos de la interfaz
		conjuntoCadenas.add("Ana");
		conjuntoCadenas.add("Luis");
		conjuntoCadenas.add("Marta");
		conjuntoCadenas.add("Carlos");
		conjuntoCadenas.add("Elena");
		
		// 3. Imprime el conjunto para ver su contenido → ¿imprime referencia o valor?
		System.out.println(conjuntoCadenas); // imprime el valor
		
		// 4. Añade un nombre repetido → ¿permite duplicados?
		conjuntoCadenas.add("Ana"); // no permite valores duplicados
		
		// 5. Añade un null → ¿permite nulos?
		conjuntoCadenas.add(null); // admite nulos
		
		// 6. Recorre el conjunto imprimiendo cada uno de sus elementos en orden
		Set<String> conjuntoOrdenado = new LinkedHashSet<>();
		conjuntoOrdenado.addAll(conjuntoCadenas);
		for (String alumno : conjuntoOrdenado) {

		    if (alumno != null) {
		        System.out.println("D. " + alumno);
		    } else {
		        System.out.println("null");
		    }

		}
	}
}
