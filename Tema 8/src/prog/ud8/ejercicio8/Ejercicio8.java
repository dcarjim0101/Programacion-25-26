package prog.ud8.ejercicio8;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio8 {
	public static void main(String[] args) {
		// 1. Crea un conjunto implementado por un árbol binario
		Set<Integer> conjuntoArbol = new TreeSet<>();
		
		// 2. Añade tres números enteros en orden aleatorio 
		conjuntoArbol.add(30);
		conjuntoArbol.add(10);
		conjuntoArbol.add(20);
		
		// 3. Recorrelo e imprime su contenido ordenado de menor a mayor
		for (Integer numero : conjuntoArbol) {
		    System.out.println(numero);
		}
		
		// 4. Haz lo mismo utilizando nombres de alumnos
		Set<String> conjuntoArbolAlumnos = new TreeSet<>();

		conjuntoArbolAlumnos.add("Marta");
		conjuntoArbolAlumnos.add("Ana");
		conjuntoArbolAlumnos.add("Luis");
		
		for (String alumno : conjuntoArbolAlumnos) {
		    System.out.println(alumno);
		}
	}
}
