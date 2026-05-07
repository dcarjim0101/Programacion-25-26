package examenUd8;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {
	public static void main(String[] args) {
		// Ejercicio 3
		Map<String, Integer> palabras = new HashMap<>();
		
		palabras.put("palabra1", 1);
		palabras.put("palabra1", 2);
		palabras.put("palabra2", 1);
		palabras.put("palabra2", 2);
		palabras.put("palabra2", 3);
		palabras.put("palabra3", 1);
		palabras.put("palabra3", 2);
		
		System.out.println(palabras);
		
		for (Integer conta : palabras) {
			if (conta == palabra1) {
				System.out.println("la palabra 1 aparece: ", conta, "veces");
			} else if(conta == palabra2) {
				System.out.println("la palabra 2 aparece: ", conta, "veces");
			} else {
				System.out.println("la palabra 3 aparece: ", conta, "veces");
			}
		}
	}
}
