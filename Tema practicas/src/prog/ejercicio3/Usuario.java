package prog.ejercicio3;

public class Usuario {
	String nombre;
	String email;
	static int contadorUsuarios;
	
	int Usuario(String nombre, String email){
		return contadorUsuarios += 1;
	}
	
	private static int getTotalUsuarios() {
		return contadorUsuarios;
	}
	
	void mostrarInfo() {
		System.out.println("el nombre es " + nombre + "y el email es " + email);
	}
}