package prog.ud8.ejercicio11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio11 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		// 1. almacenar nombres en un hashset
		Set<String> libros = new HashSet<>();

        libros.add("Don Quijote");
        libros.add("El Principito");
        libros.add("1984");
        libros.add("El Principito"); // duplicado
        libros.add("La Odisea");

        System.out.println("libros almacenados:");
        System.out.println(libros);
        
        // 2. permitir al usuario introducir libros
        System.out.println("introduce libros y escribe ya para terminar)");
        
        for (;;) {
        	String libro = sc.nextLine();
            if (libro.equalsIgnoreCase("ya")) {
                break;
            }

            libros.add(libro);
        }
        
        // 3. recorrer el conjunto
        Iterator<String> it = libros.iterator();

        // iterator
        while (it.hasNext()) {
            String libro = it.next();
            System.out.println(libro);
        }
        
        // for-each
        for (String libro : libros) {
            System.out.println(libro);
        }
        
        // pregunta 1: un hashset no garantiza el orden especifico porque no almacena los elementos en funcion de su posicion, si no que los organiza internamente.
        // pregunta 2: seria preferible usar un iterator cuando se necesita mas control sobre el recorrido de la coleccion.
        // pregunta 3: si se intenta modificar el set mientras se itera con un for-each puede ocurrir que se lance una excepcion.
	}
}