package examenUd8;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio2 {
	public static void main(String[] args) {
		// Ejercicio 2
		Set<Integer> codigos = new HashSet<>(); // HashSet es el que no permite duplicados
		
		codigos.add(1);
		codigos.add(4);
		codigos.add(1);
		codigos.add(3);
		codigos.add(2);
		
		System.out.println(codigos);
	}
}
