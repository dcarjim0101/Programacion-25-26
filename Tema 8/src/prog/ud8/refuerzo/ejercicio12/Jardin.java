package prog.ud8.refuerzo.ejercicio12;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Jardin {
	public static void main(String[] args) {
		
		// 5. crear clase jardin y una coleccion
		Set<Arbol> arboles = new HashSet<>();
        
        // 6. añadir arboles
		arboles.add(new Arbol("Álamo", 4));
		arboles.add(new Arbol("Olivo", 3));
		arboles.add(new Arbol("Olivo", 4));
		arboles.add(new Arbol("Higuera", 2));
		arboles.add(new Arbol("Naranjo", 2));
		arboles.add(new Arbol("Naranjo", 2));
		arboles.add(new Arbol("Naranjo", 2));

	    // 8. crear coleccion que no repita arboles y se ordenen alfabeticamente
	    Set<Arbol> arbolesOrdenados = new TreeSet<>();
	    
	    System.out.println("Árboles ordenados:");
	    System.out.println(arbolesOrdenados);
	}
}
