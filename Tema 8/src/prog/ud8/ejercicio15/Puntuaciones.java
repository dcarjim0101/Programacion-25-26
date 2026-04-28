package prog.ud8.ejercicio15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Puntuaciones {
	public static void main(String[] args) {
		List<Integer> puntuaciones = new ArrayList<>();
		puntuaciones.add(450);
		puntuaciones.add(500);
		puntuaciones.add(550);
		puntuaciones.add(600);
		puntuaciones.add(650);
		puntuaciones.add(700);
		puntuaciones.add(750);
		
		puntuaciones.addAll(puntuaciones);
		
		// 2. 
		Collections.reverseOrder();
		System.out.println("lista ordenada (menor a mayor): ");
		System.out.println(puntuaciones);
		
		// 3. 
		int max = Collections.max(puntuaciones);
		int min = Collections.min(puntuaciones);
		
		System.out.println("puntuacion maxima: " + max);
		System.out.println("puntuacion minima: " + min);
		
		// 4. 
		Collections.shuffle(puntuaciones);
		System.out.println("lista desordenada (shuffle): ");
		System.out.println(puntuaciones);
	}
}
