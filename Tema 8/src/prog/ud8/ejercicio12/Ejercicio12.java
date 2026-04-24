package prog.ud8.ejercicio12;

import java.util.ListIterator;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		
		
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
		
		ListIterator<Integer> it = numeros.listIterator<>();
		while(it.hasNext()) {
			Integer num = it.next();
			if (num > 50) {
				it.set(num * 2);
			}
		}
		System.out.println(numeros);
		
		while(it.hasPrevious()) {
			Integer num = it.previous();
			if (num < 30) {
				it.add(25);
			}
		}
		System.out.println(num);
	}
	
}
