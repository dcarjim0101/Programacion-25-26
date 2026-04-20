package prog.ud8.refuerzo.ejercicio11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		// 1. crear coleccion
		List<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        numeros.add(3); // repetido
        numeros.add(10);

        // 2. imprimir contenido
        System.out.println("Contenido de la lista:");
        System.out.println(numeros);

        // 3. eliminar impares
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 != 0) {
                numeros.remove(i);
            }
        }
        
        // añadir el 8 al principio
        numeros.add(0,8);
        
       // 4. crear una nueva coleccion y copiar la anterior
        Set<Integer> numerosSinRepetidos = new HashSet<>();
        
        numerosSinRepetidos.addAll(numeros);
	    
        System.out.println("Lista sin números repetidos:");
	    System.out.println(numerosSinRepetidos);
	    
	    // 5. imprimir contenido
	    for (Integer num : numerosSinRepetidos) {
	        System.out.println(num);
	    }
	    
	    // 6. crear nueva coleccion por orden natural
	    Set<Integer> numerosOrdenados = new TreeSet<>();
	    
	    for (Integer num : numerosSinRepetidos) {
	        numerosOrdenados.add(num);
	    }
	    
	    System.out.println("Números ordenados:");
	    for (Integer num : numerosOrdenados) {
	        System.out.println(num);
	    }
	    
	    // 7. imprimir contenido
	    System.out.println("Contenido de la colección ordenada:");

	    for (Integer num : numerosOrdenados) {
	        System.out.println(num);
	    }
	}
}
