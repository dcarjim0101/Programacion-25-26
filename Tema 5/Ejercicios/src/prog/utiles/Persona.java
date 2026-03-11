package prog.utiles;

public class Persona {
	// atributos
	public String nombre;
	public int edad;
	@Override
	
	// metodos
	public String toString() {
		return nombre + " " + edad;
	}
	
	public boolean equals(Object obj) {
		return this.nombre == ((Persona)obj).nombre && edad == ((Persona) obj).edad;
	}
	
	// constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
}
