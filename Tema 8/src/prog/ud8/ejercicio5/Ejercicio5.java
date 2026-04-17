<<<<<<< HEAD
package prog.ud8.ejercicio5;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Ejercicio5 {
	public static void main(String[] args) {
		// 1. crear el conjunto vacio
		Set<Integer> numeros = new HashSet<>();
		
		// 2. agregar 5 numeros
		numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // 3. imprimir el conjunto
        System.out.println(numeros); // se imprime el valor
        
        // 4. agregar un numero repetido
        numeros.add(3);
        System.out.println(numeros); // no permite duplicados
        
        // 5. añadir nulos
        numeros.add(null);
        System.out.println(numeros); // solo se permite un null
        
        // 6. nuevo conjunto y comprobar si es un un subconjunto
        Set<Integer> primos = new HashSet<>();
        primos.add(2);
        primos.add(3);

        // comprobar
        boolean esSubconjunto = numeros.containsAll(primos);
        System.out.println("es un subconjunto: " + esSubconjunto);
        
        // 7. declarar lista con el modificador final
        final List<Integer> lista = new ArrayList<>(numeros);
        
        lista.add(6); // añadir
        lista.remove(1); // eliminar
        lista.set(0, 99); // modificar

        System.out.println(lista);
        // la lista no es inmutable
	}
=======
package prog.ud8.ejercicio5;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Ejercicio5 {
	public static void main(String[] args) {
		// 1. crear el conjunto vacio
		Set<Integer> numeros = new HashSet<>();
		
		// 2. agregar 5 numeros
		numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // 3. imprimir el conjunto
        System.out.println(numeros); // se imprime el valor
        
        // 4. agregar un numero repetido
        numeros.add(3);
        System.out.println(numeros); // no permite duplicados
        
        // 5. añadir nulos
        numeros.add(null);
        System.out.println(numeros); // solo se permite un null
        
        // 6. nuevo conjunto y comprobar si es un un subconjunto
        Set<Integer> primos = new HashSet<>();
        primos.add(2);
        primos.add(3);

        // comprobar
        boolean esSubconjunto = numeros.containsAll(primos);
        System.out.println("es un subconjunto: " + esSubconjunto);
        
        // 7. declarar lista con el modificador final
        final List<Integer> lista = new ArrayList<>(numeros);
        
        lista.add(6); // añadir
        lista.remove(1); // eliminar
        lista.set(0, 99); // modificar

        System.out.println(lista);
        // la lista no es inmutable
	}
>>>>>>> 2c53104314bc734b9ee76ccd19fbef58a5f278c0
}