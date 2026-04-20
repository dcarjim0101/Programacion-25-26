package prog.ud8.ejercicio12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ejercicio12 {
	public static void main(String[] args) {
		// 1. declarar una lista de tipo arraylist con 10 numeros
		List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);
        numeros.add(70);
        numeros.add(80);
        numeros.add(90);
        numeros.add(100);
        
        // 2. recorrer la lista con listiterator
        System.out.println("recorrer con listIteratir hacia delante:");

        ListIterator<Integer> it = numeros.listIterator();

	    while (it.hasNext()) {
	        int numero = it.next();
	        System.out.println(numero);
	    }
	    
	    // 3. recorrer la lista en sentido inverso
	    System.out.println("recorrer con listIteratir a la inversa:");

	    while (it.hasPrevious()) {
	        int numero = it.previous();
	        System.out.println(numero);
	    }
	    
	    // 4.1. multiplicar por 2 todos los numeros mayores a 50
	    System.out.println("multiplicando numeros:");

	    while (it.hasNext()) {

	        int numero = it.next();

	        if (numero > 50) {
	            numero = numero * 2;
	            it.set(numero);
	        }

	        System.out.println(numero);
	    }
	    
	    // 4.2. actualizar los valores en la lista
	    System.out.println("actualizando valores:");

	    while (it.hasNext()) {

	        int numero = it.next();

	        if (numero > 50) {
	            it.set(numero * 2);
	        }
	    }
	    
	    // 4.3. mostrar la lista
	    System.out.println("lista actualizada:");

	    for (int i = 0; i < numeros.size(); i++) {
	        System.out.println(numeros.get(i));
	    }
	    
	    // 5.1. añadir un nuevo numero si un numero es menor que 30
		while (it.hasPrevious()) {
	
		    int numero = it.previous();
	
		    System.out.println(numero);

		    if (numero < 30) {
		        it.add(25);
		    }
		}
		
		// 5.2. mostrar la lista actualizada
		for (int i = 0; i < numeros.size(); i++) {
		    System.out.println(numeros.get(i));
		}
		
		// 6. mostrar el indice actual del iterador
		while (it.hasNext()) {

		    int numero = it.next();

		    int indice = it.nextIndex() - 1;

		    System.out.println("Índice: " + indice + " -> " + numero);
		}
	}
}
