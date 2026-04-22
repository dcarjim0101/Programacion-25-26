package prog.ud8.ejemplos;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class EjemploListIterator {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
		l.add("a");
		l.add("c");
		l.add("b");

		// recorrer hacia delante
		ListIterator<String> lit = l.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		if (lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		// recorrer hacia atras
		ListIterator<String> lit2 = l.listIterator();
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
