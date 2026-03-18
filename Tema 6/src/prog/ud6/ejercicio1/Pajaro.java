package prog.ud6.ejercicio1;

public class Pajaro extends Animal implements Volador{

	@Override
	public void hacerSonido() {
		System.out.println("pio");
	}
	
	public void moverse() {
		System.out.println("vuela con las alas");
	}
	
	public void mostrarInfo() {
		System.out.println("tiene plumas");
	}
	
	public void volar() {
		System.out.println("vuela");
	}
}
