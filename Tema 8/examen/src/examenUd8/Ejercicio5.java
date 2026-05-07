package examenUd8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio5 {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		numeros.add(60);
		
		System.out.println(numeros);
		
		Iterator<Integer> it = numeros.iterator();
		while (it.hasNext()) {
			int numero = it.next();
			
			if (numero < 35) {
				it.remove();
			}
		}
		
		System.out.println(numeros);
	}
}
