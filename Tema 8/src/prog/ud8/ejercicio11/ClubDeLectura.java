package prog.ud8.ejercicio11;

import java.util.HashSet;
import java.util.Iterator;

public class ClubDeLectura {
	private String biblioteca;
	
	public ClubDeLectura{
		this.biblioteca = new HashSet<>();
	}
	
	public void agregarLibro(String libro) {
		biblioteca.add(libro);
	}
	
	public String mostrarBiblioteca() {
		Iterator<String> it = biblioteca.iterator();
		while(it.hasNext()) {
			String libro = it.next();
			System.out.println(it.next());
			
			if (libro.equals("El principito"))
				it.remove();
		}
	}
}
