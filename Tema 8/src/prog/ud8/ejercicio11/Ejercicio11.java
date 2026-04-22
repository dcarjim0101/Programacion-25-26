package prog.ud8.ejercicio11;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		
		
		ClubDeLectura clubFranYAmigos = new ClubDeLectura();
		ClubDeLectura clubDavidYAmigos = new ClubDeLectura();
		
		clubDavidYAmigos.agregarLibro("El quijote");
		clubDavidYAmigos.agregarLibro("El principito");
		clubDavidYAmigos.agregarLibro("El niño");
		
		clubDavidYAmigos.mostrarBiblioteca();
	}

}
