package prog.ud6.ejercicio1;

public class Gato extends Animal implements Corredor{

	@Override
	public void hacerSonido() {
		System.out.println("miau");
	}
	
	public void moverse() {
		System.out.println("anda a cuatro patas");
	}
	
	public void mostrarInfo() {
		System.out.println("tiene cola");
	}
	
	public void correr() {
		System.out.println("corre");
	}
}
