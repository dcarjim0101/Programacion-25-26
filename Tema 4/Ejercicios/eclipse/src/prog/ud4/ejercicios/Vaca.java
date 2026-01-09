package prog.ud4.ejercicios;

public class Vaca {
	// Atributos
	String nombre;
	String color;
	boolean hambre = true;
		
	// Metodos
	void comer() {
		hambre = false;
	}
		
	void mugir() {
		System.out.println("Muuu!");
	}
}