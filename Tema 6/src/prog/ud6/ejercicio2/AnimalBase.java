package prog.ud6.ejercicio2;

abstract class AnimalBase implements Animal{
	protected String nombre;
	
	public AnimalBase(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarNombre() {
		System.out.println("nombre: " + nombre);
	}
	
	
}
