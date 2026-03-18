package prog.ud6.ejercicio1;

public class Pez extends Animal implements Nadador{

	@Override
	public void hacerSonido() {
		System.out.println("glup");
	}
	
	public void moverse() {
		System.out.println("nada con aletas");
	}
	
	public void mostrarInfo() {
		System.out.println("tiene escamas");
	}
	
	public void nadar() {
		System.out.println("nada");
	}
}
