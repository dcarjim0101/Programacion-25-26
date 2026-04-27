package prog.ud8.ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploMap {
	public static void main(String[] args) {
		Map <Integer, String> m = new HashMap<>();
		
		m.put(123, "teclado");
		m.put(234, "monitor");
		m.put(345, "torre");
		m.put(123, "raton");
		
		m.remove(451);
		m.replace(234,  "pantalla");
		
		System.out.println(m);
		System.out.println(m.get(123));
		System.out.println(m.get(1));
		
		
		Set<Integer> claves = m.keySet();
		
		for(Integer k: claves) {
			System.out.println(m.get(k));
		}
	}
}
