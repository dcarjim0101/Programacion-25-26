package prog.ud8.ejercicio11;

import java.util.HashSet;

public class ClubDeLectura {
	private String biblioteca;
	
	public ClubDeLectura{
		this.biblioteca = new HashSet<>();
	}
	
	public void agregarLibro(String libro) {
		biblioteca.add(libro);
	}
	
	public String mostrarBiblioteca() {
		return biblioteca;
	}
}
