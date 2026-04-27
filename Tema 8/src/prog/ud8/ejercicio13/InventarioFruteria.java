package prog.ud8.ejercicio13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InventarioFruteria {
	public static void main(String[] args) {
		Map <String, Integer> fruta = new HashMap<>();
		
		fruta.put("Manzanas", 50);
		fruta.put("Platanos", 20);
		fruta.put("Naranjas", 35);
		fruta.put("Peras", 12);
		
		System.out.println(fruta.get("Naranjas"));
		
		fruta.put("Manzanas", 100);
		
		System.out.println("");
		
		if (fruta.containsKey("Mangos")) {
			System.out.println("Producto encontrado");
		} else {
			System.out.println("Producto no encontrado");
		}
		
		System.out.println("");
		
		System.out.println("imprimir el map");
		System.out.println(fruta);
		
		System.out.println("");
		
		System.out.println("imprimir el for each");
		
		Set<String> recorrido = fruta.keySet();
		for(String k: recorrido) {
			System.out.println(fruta.get(k));
		}
		
		// reflexion
		// 1. se sobreescribe la anterior porque lo que hace es meterle otra cantidad a la misma variable
		// 2. lo que pasaria es que se guardarian las frutas con el valor del int y lo que se mostrarian serian los nombres
		// 3. es mas eficiente porque busca directamente el valor sin hacer una busqueda secuencial y lenta
		
	}
}
